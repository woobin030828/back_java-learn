package arrayTest;

import java.util.Scanner;

public class ArrayTask02 {
	public static void main(String[] args) {
//      1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다. 배열에 담아야함
//      입력 예)안녕hI!!
//      출력 예)안녕Hi!!
		
//		스캐너 및 필요 변수(배열 등) 선언
		Scanner sc = new Scanner(System.in);
		String inputString1 = "", inputString2 = "", 
				resultString1 = "", resultString2 = "", 
				input1Message = "문자열을 입력하세요.(예: 안녕hI!!) : ", input2Message = "정수를 입력하세요. (예: 1024) : ",
				resultMessage = "결과는 %s 입니다.",
				hangle = "공일이삼사오육칠팔구";
		int changeInt = 0, asciiKey = 0;
		int[] changeArr = null;
		char intChar = 0;
		char[] stringChar = null, hangleChar = null;
		
		System.out.print(input1Message);
		inputString1 = sc.next();
		
//		for 스캐너로 받아온 문자열을 차례대로 배열에 담음
		stringChar = new char[inputString1.length()];
		for (int i = 0; i < stringChar.length; i++) {
			asciiKey = 'a' - 'A';
			stringChar[i] = inputString1.charAt(i);
//		if 소문자를 검사하여 대문자로 변경처리함
			if (stringChar[i] >= 'a' && stringChar[i] <= 'z') {
				stringChar[i] = (char)(stringChar[i] - asciiKey);
//		if 대문자를 검사하여 대문자로 변경처리함
			} else if (stringChar[i] >= 'A' && stringChar[i] <= 'Z') {
				stringChar[i] = (char)(stringChar[i] + asciiKey);
			} 
//		아무것도 아닌 경우 그냥 배열에 담긴채로 놔둠
		}
		
		System.out.print("[ ");
		for (int i = 0; i < stringChar.length; i++) {
			resultString1 += stringChar[i];
			if(i == stringChar.length - 1) {
				System.out.print(stringChar[i]);
			} else {
				System.out.print(stringChar[i] + ", ");
				
			}
		}
		System.out.println(" ]");
		System.out.printf(resultMessage, resultString1);
		System.out.println("");
      
//      2. 정수를 한글로 변경
		hangleChar = new char[hangle.length()];
//		한글을 배열에 담아줄 것
		for(int i = 0; i < hangleChar.length; i++) {
			hangleChar[i] = hangle.charAt(i);
		}
//		정수를 받음
		System.out.print(input2Message);
		inputString2 = sc.next();
		
		changeArr = new int[inputString2.length()];
		for(int i = 0; i < inputString2.length(); i++) {
			intChar = inputString2.charAt(i);
//			아스키코드로 변환될테니까 0의 아스키코드를 빼줘서 일반 숫자로 만듬
			changeInt = intChar - '0';
			changeArr[i] = changeInt;
//			만들어진 숫자로 한글 배열 인덱스에 접근해서 결과 문자열을 만듬
			resultString2 += hangleChar[changeArr[i]];
//			방식은 다르나, 동일한 역할을 하는 코드
//			resultString2 += hangle.charAt(changeInt);
			
		}
		System.out.printf(resultMessage, resultString2);
		sc.close();
//      입력 예) 1024
//      출력 예) 일공이사
	}
}
