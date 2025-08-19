package controlStatement;

import java.util.Scanner;

public class SwitchTask01 {
	public static void main(String[] args) {
//		계절을 맞추는 프로그램
//		겨울 12 1 2
//		봄 3 4 5
//		여름 6 7 8
//		가을 9 10 11
		Scanner sc = new Scanner(System.in);
		int month = 0, season = 0;
		
		System.out.print("현재 월을 입력해주세요 : ");
		month = sc.nextInt();
		String winter = "겨울", spring = "봄", summer = "여름", autumn = "가을", result = "", resultString = "현재 %d의 계절은 %s입니다.";
		
//		boolean isWinter = false, isSpring = false, isSummer = false, isAutumn = false;
		/* 
		 * isWinter = mouth > 0 && mouth < 3 || mouth == 12; 
		 * isSpring = mouth >= 3 && mouth <= 5; 
		 * isSummer = mouth >= 6 && mouth <= 8; 
		 * isAutumn = mouth >= 9 && mouth <= 11;
		 */
		if(month == 0 || month > 12) {
			System.out.println("값이 올바르지 않습니다.");
		} else {			
			season = month / 3 % 4;
			switch (season) {
			case 0:
				result = winter;
				break;
			case 1:
				result = spring;
				break;
			case 2:
				result = summer;
				break;
			case 3:
				result = autumn;
				break;
			default:
				break;
			}
			
			System.out.printf(resultString, month, result);
		}
		
	}
}
