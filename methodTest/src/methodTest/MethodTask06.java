package methodTest;

import java.util.Scanner;

// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드

public class MethodTask06 {

	int getLetterInWord(String str, char target) {
//		합계 변수 선언
		int result = 0, temp = 0;;
//		for 문자열의 길이만큼 반복하며 문자열에서 target과 동일한 문자를 발견 시 result의 합계 증가
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i) == target ? 1 : 0;
			result += temp;
		}
//		반환
		return result;
	}
	
	public static void main(String[] args) {
//		스캐너 선언 및 필요 변수 선언
		Scanner sc = new Scanner(System.in);
		MethodTask06 mt06 = new MethodTask06();
		String inputMessage1 = "문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드 \n문자열 및 구하고자하는 문자를 입력하세요 ex)aabbbcccccccdddddeeeffff b : ",
				outputMessage = "문자의 개수 : %d",
				inputString = "";
		char inputChar = ' ';
		int result = 0;
//		문자열 및 문자 입력 받기
		System.out.print(inputMessage1);
		inputString = sc.next();
		inputChar = sc.next().charAt(0);
//		메서드 사용으로 값 구하기
		result = mt06.getLetterInWord(inputString, inputChar);
//		출력
		System.out.printf(outputMessage, result);
		sc.close();
	}
}
