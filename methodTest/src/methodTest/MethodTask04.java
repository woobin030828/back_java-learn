package methodTest;

import java.util.Scanner;

public class MethodTask04 {
	void printNameNTimes(String name, int repeact) {
//		for, repeact만큼 반복
		for(int i = 0; i < repeact; i++) {
//			출력
			System.out.println(name);
		}
		System.out.printf("%s이 총 %d번 반복되었습니다. \n", name, repeact);
	}
	public static void main(String[] args) {
		MethodTask04 mt04 = new MethodTask04();
		Scanner sc = new Scanner(System.in);
		String inputString = "", inputMessage = "이름과 횟수를 입력하세요 \nex) 최우빈 5 : ";
		int inputInt = 0;
		System.out.printf(inputMessage);
		inputString = sc.next();
		inputInt = sc.nextInt();
		
		mt04.printNameNTimes(inputString, inputInt);
	}
}
