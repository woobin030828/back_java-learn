package controlStatement;

import java.util.Scanner;

public class IfTask01 {
	public static void main(String[] args) {
//		두 수의 크기 비교
//		10, 20
//		변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, min = 0, max = 0;
		String inputMessage = "두 수를 입력하시오. ((ex)3, 5) : ", outputMessage = "큰 값: %d, 작은 값: %d";
		boolean isSameNum = false, isNum1Max = false, isNum2Max = false;
				
		System.out.println(inputMessage);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		isSameNum = num1 == num2;
		isNum1Max = num1 > num2;
		isNum2Max = num1 < num2;
//		주소를 사용해야하는 이유
		
		if (isSameNum) {
			max = num1;
			min = num1;
		} else if (isNum1Max) {
			max = num1;
			min = num2;
		} else if (isNum2Max) {
			max = num2;
			min = num1;
		} else {
			outputMessage = "입력 값: %d, %d 예외 발생";
		}
		
		System.out.printf(outputMessage, max, min);
		
	}
}
