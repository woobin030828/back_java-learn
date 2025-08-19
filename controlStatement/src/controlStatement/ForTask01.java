package controlStatement;

import java.util.Scanner;

public class ForTask01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intResult = 0, intTemp = 0;
		String str = "", strResult = "", strTemp = "", inputMessage = "문자열을 입력하세요 : ", outputMessage = "문자열 : %s, 연산: %d";
		char strChar = ' ';
		boolean isNumber = false;
		System.out.print(inputMessage);
		str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			strChar = str.charAt(i);
			isNumber = strChar >= 48 && strChar <= 57;
			if (isNumber) {
				intResult += (int)strChar;
			} else {
				strResult += strChar;
			}
		}
		System.out.printf(outputMessage, strResult, intResult);
	}
}
