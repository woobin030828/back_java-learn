package exceptTask;

import java.util.Scanner;

public class ExceptionTask {
//	5의 정수만 입력 받기
//- 무한 입력 상태로 구현하기
//-	Q 입력 시 나가기
//- 각 정수는 배열에 담기
//- if문은 한번만 사용하기
	
	
	public static void main(String[] args) {
		String inputMessage = "정수 5개를 순서대로 입력하세요 : ", expression = "", exampleMessage = "번 째 정수";
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arData = new int[5];
		
		while(true) {
			
			try {
				count++;
				if (count > 5) throw new ArrayIndexOutOfBoundsException();
				System.out.print(inputMessage);
				expression = sc.nextLine().trim();
				
				if(expression.equals("q")) {
					break;
				}
				arData[count - 1] = Integer.parseInt(expression);
				System.out.println(count + exampleMessage);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("모든 배열 공간이 가득 차 종료합니다.");
				for(int data: arData) {
					System.out.println(data + " ");
				}
				break;
			} catch (Exception e) {
				System.out.println("알 수 없는 예외 발생");
				e.printStackTrace();
			}
			
		}
		
	}
}
