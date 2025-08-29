package anonymousTask02;

import java.util.Scanner;

public class AnonymousTask02 {
	public static void main(String[] args) {
		String inputMessage = "영문자를 입력하세요 (ex.abadcdCDswdWDQS01242DWSDsdsa) : ", inputString = "", outputMessage = "결과 : %s", outputString = "";
		Scanner sc = new Scanner(System.in);
		MyInter myInter = new MyInter() {
//			람다식 문법
			@Override
			public void deleteC(String str) {
				String result = "";
				for(int i = 0; i < str.length(); i++) {
					if (i != 2) result += str.charAt(i);	
				}
				System.out.println(result);
			}
//			public void deleteC(String str) {
//				String result = "";
//				for(int i = 0; i < str.length(); i++) {
//					if (str.charAt(i) != 'C') result += str.charAt(i);	
//				}
//				System.out.println(result);
//			}			
			@Override
			public String changeLetter(String str) {
				boolean isBigger = false;
				boolean isLetter = false;
				String result = "";
				String resultChar = "";
				
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
						isBigger = true;
						isLetter = true;
					} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
						isBigger = false;
						isLetter = true;
					} else {
						isLetter = false;
					}
					
					if (isLetter) {						
						if(isBigger) {
							resultChar = String.valueOf(str.charAt(i)).toUpperCase();
						} else {
							resultChar = String.valueOf(str.charAt(i)).toLowerCase();
						}
					} else {
						resultChar = String.valueOf(str.charAt(i));
					}
					
					result += resultChar;
				}
				return result;
			}
		};
		myInter.deleteC("ABCD");
		
		System.out.println(inputMessage);
		inputString = sc.next();
		
		outputString = myInter.changeLetter(inputString);
		System.out.printf(outputMessage, outputString);
	}
}
