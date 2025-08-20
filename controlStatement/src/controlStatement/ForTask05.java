package controlStatement;

import java.util.Scanner;

public class ForTask05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "", value = "", result = "", countString = "", inputMessage = "영어와 숫자를 입력하세요. ex)a1b3d3c4 : ", outputMessage = "결과 : %s", line = " ========================== ";
		int count = 0, trueCount = 0, intResult = 0;
		char valueChar = ' ', textChar = ' ';
		boolean isNumber = false;
		
//		1번 문제
		for (int i = 0; i <= 25; i++) {
			valueChar = (char)(i + 65);
			if (i % 2 == 0) result += valueChar;
		}
		
		System.out.printf("1번 문제 결과 : %s \n", result);
		System.out.println(line);
		
		result = "";
		valueChar = ' ';
		
//		2번 문제
		System.out.print("숫자를 입력하세요 (ex. 6) : ");
		count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			trueCount = i + 1;
			intResult += trueCount;
		}
		System.out.printf("2번 문제 결과: %d \n", intResult);
		System.out.println(line);
		count = 0;
		
//		3번 문제
		for (int i = 0; i < 10; i++) {
			valueChar = (char)(count + 48);
			result += valueChar;
			count++;
			if(count == 5) count = 0;
		}
		
		System.out.printf("3번 문제 결과 : %s \n", result);
		System.out.println(line);
		valueChar = ' ';
		count = 0;
		result = "";
		
//		4번문제
		System.out.print(inputMessage);
		input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			valueChar = input.charAt(i);
			isNumber = valueChar >= 48 && valueChar <= 57;
			if (isNumber) {
				countString += valueChar;
				if (i == input.length() - 1) {
					count = Integer.parseInt(countString);
					for (int j = 0; j < count; j++) {
						result += textChar;
					}
				}
			} else {
				if (countString != "") {					
					count = Integer.parseInt(countString);
					for (int j = 0; j < count; j++) {
						result += textChar;
					}
					countString = "";
				}
				textChar = valueChar;
			}
			
		}
//		a78b121c62
		
		System.out.printf(outputMessage, result);
		
	}
}
