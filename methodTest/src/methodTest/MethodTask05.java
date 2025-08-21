package methodTest;

import java.util.Scanner;

public class MethodTask05 {
	int addOneToNumber(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += (i + 1);
		}
		return result;
	}
	String isEvenOrOdd(String str) {
		String result = "";
		int number = 0;
		boolean isNumber = false;
		for(int i = 0; i < str.length(); i++) {
			isNumber = str.charAt(i) >= '0' && str.charAt(i) <= '9' ? true : false ;
		}
		if (isNumber) {
			number = Integer.parseInt(str);			
			result = number % 2 == 0 ? "짝수" : "홀수";
		} else {
			result = "문자열";
		}
		
		return result;
	}
	void changeBigger(String str) {
		String result = "";
		int asciiKey = 'a' - 'A';
		char changedChar = ' ';
		
		for(int i = 0; i < str.length(); i++) {
			changedChar = (char)(str.charAt(i) - asciiKey);
			result += str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ? changedChar : str.charAt(i);
		}
		
		System.out.println(result);
	}
	void reverseString(String str) {
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			result += str.charAt((str.length() - 1) - i);
		}
		
		System.out.println(result);
	}
	public static void main(String[] args) {
		MethodTask05 mt05 = new MethodTask05();
		Scanner sc = new Scanner(System.in);
		int input1 = 0;
		String input2 = "", input3 = "", input4 = "",
				input1Message = "문제 1번, 1~n까지의 합을 구해서 결과를 반환해주는 메서드 \n정수를 입력하세요! ex)32 : ",
				input2Message = "문제 2번, 어떤 값을 전달하면, 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드 \n값을 입력하세요! : ",
				input3Message = "문제 3번, 문자열을 입력하면, 모두 대문자로 바꿔서 출력해주는 메서드 \n문자열을 입력하세요! ex)abcd : ",
				input4Message = "문제 4번, 어떤 문자열을 전달하면 반대로 출력해주는 메서드 \n문자열을 입력하세요! ex) 안녕하세요 : "; 
		
		System.out.print(input1Message);
		input1 = Integer.parseInt(sc.next());
		System.out.print("문제 1번, ");
		System.out.println(mt05.addOneToNumber(input1));
		
		System.out.print(input2Message);
		input2 = sc.next();
		System.out.print("문제 2번, ");
		System.out.println(mt05.isEvenOrOdd(input2));
		
		System.out.print(input3Message);
		input3 = sc.next();
		System.out.print("문제 3번, ");
		mt05.changeBigger(input3);
		
		System.out.print(input4Message);
		input4 = sc.next();
		System.out.print("문제 4번, ");
		mt05.reverseString(input4);
		
		sc.close();
	}
}
