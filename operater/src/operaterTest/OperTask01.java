package operaterTest;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
//		변수 선언 및 정의
		Scanner sc = new Scanner(System.in);
		String num1 = "", resultString = "", result = "";
		double num2 = 0.0;
		boolean isInteger = false;
		System.out.print("값을 입력하세요. ex) 6.3, 32, 34 : ");
//		입력값 받기 및 변수에 담기(type String)
		num1 = sc.next();
//		입력 닫기
		sc.close();
		result = "입력 결과) %S\n출력 결과) %S";
		num2 = Double.parseDouble(num1);
//		정수 실수 여부판단(1로 나누었을 때, 나머지 여부) 및 문자열 반환 (Boolean > String)
		isInteger = (num2 % 1 == 0);
		resultString = isInteger ? "정수" : "실수";
//		결과 출력 (String , String)
		System.out.printf(result, num1, resultString);
	}
}
