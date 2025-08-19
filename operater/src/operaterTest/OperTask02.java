package operaterTest;

import java.util.Scanner;

public class OperTask02 {
	public static void main(String[] args) {
//		변수 정의 및 선언
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, resultNum = 0, bestNum = 0, westNum = 0;
		boolean isNum1Best = false, isNum2Best = false, isNum3Best = false, 
				isNum1Midde = false, isNum2Midde = false, isNum3Midde = false, 
				isNum1west = false, isNum2west = false, isNum3west = false;
		String inputMessage = "3개의 값을 입력하세요(띄어쓰기 구분) (예: 3, 6 ,2) : ", outputMessage = "중간값: %d";
		System.out.print(inputMessage);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
//		3개의 값 비교
//		큰 값 찾기
		isNum1Best = num1 >= num2 && num1 >= num3;
		isNum2Best = num2 >= num1 && num2 >= num3;
		isNum3Best = num3 >= num1 && num3 >= num2;
		bestNum = isNum1Best ? num1 : isNum2Best ? num2 : isNum3Best ? num3 : 0;		
//		작은 값 찾기
		isNum1west = num1 <= num2 && num1 <= num3;
		isNum2west = num2 <= num1 && num2 <= num3;
		isNum3west = num3 <= num1 && num3 <= num2;
		westNum = isNum1west ? num1 : isNum2west ? num2 : isNum3west ? num3 : 0;
//		중간 값 찾기		
		isNum1Midde = bestNum > num1 && num1 > westNum;
		isNum2Midde = bestNum > num2 && num2 > westNum;
		isNum3Midde = bestNum > num3 && num3 > westNum;
		resultNum = isNum1Midde ? num1 : isNum2Midde ? num2 : isNum3Midde ? num3 : 0;
//		값의 처리가 모두 끝났기 때문에, 스캐너 닫기
		sc.close();
		System.out.printf(outputMessage, resultNum);
		
	}	
}
