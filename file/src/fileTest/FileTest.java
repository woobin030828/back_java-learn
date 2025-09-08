package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException, FileNotFoundException {
////		new FileWriter("경로", "이어쓰기 여부)
//		try {
////			이클립스에서는 현재 작업 중인 폴더가 프로젝트 기준으로 상대 경로를 잡고 있음
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//			bufferedWriter.write("String");
////			flush의 역할을 함께 해줌
//			bufferedWriter.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
			BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.err.println(line);
			}
			bufferedReader.close();
	}
}
