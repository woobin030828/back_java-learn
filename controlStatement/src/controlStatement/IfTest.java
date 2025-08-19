package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "점심메뉴를 입력하세요. ex)베스트 메뉴! : ", menu = null;
		
		menu = sc.next();
//		문자열끼리 비교하면, 주소로 비교할 수도 있으니, equals로 서로 '값'을 비교하는 역할
		if(menu.equals("백반")) {
			System.out.println("완벽하네요!");
		} else if(menu.equals("돈까스")){
			System.out.println("다시 다른 답을 적어보세요.");
		} else {
			System.out.println("다시 한번 생각해보세요.");
		}
	}
}
