package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. 입력을 하는 동안 동시에 메세지를 읽어올 수 없다.
// 2. 서버는 접속한 웹 소켓을 모두 가지고 있어야한다.


public class Server03 {

   public static void main(String[] args) {
      List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());
      ServerSocket serverSocket = null;
      
      try {
         serverSocket = new ServerSocket(7777);
         System.out.println("[서버 실행: 클라이언트 대기중]");
         
//         서버에 입력을 처리하는 쓰레드
         ServerInputThread serverInputThread = new ServerInputThread(outputList);
         serverInputThread.start();
         
         while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("[접속: " + clientSocket + "]");
            
            ServerThread serverThread = new ServerThread(clientSocket, outputList);
            serverThread.start();
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if(serverSocket != null) {
               serverSocket.close();
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      
   }
}

// 서버에서 직접 메세지를 입력받아서 클라이언트들에게 전송
class ServerInputThread extends Thread {
   private final List<PrintWriter> outputList;
   
   public ServerInputThread(List<PrintWriter> outputList) {
      this.outputList = outputList;
   }
   
   @Override
   public void run() {
      try(
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
      ){
         String message = null;
         while((message = bufferedReader.readLine()) != null) {
            System.out.println("서버: " + message);
            synchronized (outputList) {
               for(PrintWriter out :outputList) {
                  out.write("서버: " + message + "\n");
               }
            }
         }
         
      } catch (IOException e) {
         System.err.println("ServerInputThread run 오류");
         e.printStackTrace();
      }
      
   }
}

class ServerThread extends Thread {
   private final Socket socket;
   private final List<PrintWriter> outputList;
   private PrintWriter output;
   private BufferedReader input;
   
   public ServerThread(Socket socket, List<PrintWriter> outputList) {
      this.socket = socket;
      this.outputList = outputList;
      
      try {
         output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
         input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         
         synchronized (outputList) {
            outputList.add(output);
         }
         
      } catch (IOException e) {
         e.printStackTrace();
         closeResources();
      }
      
   }
   
   @Override
   public void run() {
      String message = null;
      try {
         
         while((message = input.readLine()) != null) {
            System.out.println(message);
            for(PrintWriter out: outputList) {
               out.println(message);
            }
         }
         
      } catch (IOException e) {
         e.printStackTrace();
         closeResources();
      }
      
   }
   
   private void closeResources() {
      try {
         if(input != null) {
            input.close();
         }
         
         if(output != null) {
            output.close();
         }
         
         if(socket != null) {
            socket.close();
         }
      } catch (IOException e) {
         System.out.println("자원 해제중 오류 발생!");
      }
   }
   
   
   
}












