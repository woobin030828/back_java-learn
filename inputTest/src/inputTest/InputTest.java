package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		String massage = "이름을 입력하세요 : ";
		Scanner sc = new Scanner(System.in);
		System.out.print(massage);
		String name = sc.nextLine();

		System.out.printf("%S님 환영합니다", name);
	}
}
