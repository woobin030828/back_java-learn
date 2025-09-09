package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
//		서버 소켓
		ServerSocket serverSocket = null;
//		클라이언트 소켓
		Socket socket = null;
//		입력 스트림을 읽기 위한 버퍼를 거치게 함
		BufferedReader reader = null;
		String message = "";
		
		try {
			serverSocket = new ServerSocket(1100);
			System.out.println("서버가 실행되었습니다. 클라이언트를 기다리는 중");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			message = reader.readLine();
			System.out.println("클라이언트로부터 받은 메시지");
			System.out.println(message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) serverSocket.close();
				if(socket != null) socket.close();
				if(reader != null) reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
