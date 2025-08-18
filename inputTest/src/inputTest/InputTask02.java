package inputTest;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//		변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		String str1 = "", str2 = "", str3 = "", message = "%d x %d x %d = %d";
		int num1 = 0, num2 = 0 , num3 = 0, result = 0;
//		정수 3개 입력 받기, 예시 표시
		System.out.println("정수를 3개 입력하시오. (ex: 3, 6, 9)");
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		sc.close();
//		입력 받은 문자열을 정수(int)로 형변환
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		num3 = Integer.parseInt(str3);
//		연산
		result = num1 * num2 * num3;
//		결과 출력
		System.out.printf(message, num1, num2, num3, result);
	}
}