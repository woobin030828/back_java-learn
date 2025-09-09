package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
		Socket socket = null;
		PrintWriter writer = null;
		String serverIP = "192.168.161.20", message = "";
		
		try {
			socket = new Socket(serverIP ,1100);
			System.out.println("서버에 연결되었습니다.");
			writer = new PrintWriter(socket.getOutputStream(), true);
			message = "안녕!";
			writer.println(message);
			System.out.println("서버로 메시지를 전송했습니다: " + message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 외부 장치와 연결하는 코드에서는 반드시 외부 장치를 닫아주는 메서드를 사용해야만한다
			try {
				if(writer != null) writer.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
