package controlStatement;

import java.util.Scanner;

public class ForTask04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "", value = "", result = "", countString = "", inputMessage = "영어와 숫자를 입력하세요. ex)a1b3d3c4 : ", outputMessage = "결과 : %s";
		int count = 0;
		char valueChar = ' ', textChar = ' ';
		boolean isNumber = false;

		System.out.print(inputMessage);
		input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			valueChar = input.charAt(i);
			isNumber = valueChar >= 48 && valueChar <= 57;
			if (isNumber) {
				countString += valueChar;
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
		
		
		System.out.printf(outputMessage, result);
	}
}


//		for (int i = 0; i < input.length(); i++) {
//			valueChar = input.charAt(i);
//			isNumber = valueChar >= 48 && valueChar <= 57;
//			if (isNumber) {
//				count = (int)valueChar - 48;
//				for (int j = 0; j < count; j++) {
//					result += textChar;
//				}
//			} else {
//				textChar = valueChar;
//			}
//		}