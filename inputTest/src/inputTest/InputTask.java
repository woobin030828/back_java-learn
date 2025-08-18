package inputTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
//		변수 선언 및 초기화
//		스캐너 선언
		Scanner sc = new Scanner(System.in);
		String message = "", num1Message = "", num2Message = "", resultMessage = "";
		int num1 = 0, num2 = 0, result = 0;
//		메시지 문자열 값 삽입
		message = "정수를 입력하시오";
		num1Message = "첫번째 값을 입력하세요 : ";
		num2Message = "두번째 값을 입력하세요 : ";
		resultMessage = "%d + %d = %d";
//		사용 편의를 위해 확인 메시지 추가 및 콘솔 출력
		System.out.println(message);	
//		첫번째 값 받기
		System.out.print(num1Message);
		num1 = Integer.parseInt(sc.next());
//		두번째 값 받기
		System.out.print(num2Message);
		num2 = Integer.parseInt(sc.next());
//		받은 값 연산
		result = num1 + num2;
//		출력
		System.out.printf(resultMessage, num1, num2, result);
	}
}
