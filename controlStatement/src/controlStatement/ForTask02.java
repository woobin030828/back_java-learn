package controlStatement;

public class ForTask02 {
	public static void main(String[] args) {
		int result = 0, strInt = 0, evenCount = 0, total = 0, trueValue = 0, min = 0, max = 0;
		char strChar = ' ';
		String str = "abcd", resultString = "";
		boolean isEven = false;
		/*
		 * for(int i = 0; i < 10; i ++) { 
		 * 	result = 10 - i; 
		 * 	System.out.println(result); 
		 * }
		 */		
//		for(int i = 0; i < str.length(); i++) {
//			strInt = (int)str.charAt(i);
//			System.out.println(strInt); 
//		}
//		
//		for(int i = 0; i < str.length(); i++) {
//			strChar = str.charAt(i);
//			if (strChar != 'c'){
//				if (i == str.length()-1) {
//					resultString += strChar;					
//				} else {
//					resultString += strChar + " ";
//				}
//			}
//		}
//		System.out.println(resultString);
//		
//		resultString = "";
//		
////		1~30 짝수 출력
//		
//		for (int i = 0; i < 30; i++) {
//			trueValue = i + 1;
//			if (trueValue % 2 == 0) {
//				System.out.println(trueValue);
//			}
//		}
//		
//		System.out.println("=====");
//		
////		1~30 짝수 개수 출력
//		for (int i = 0; i < 30; i++) {
//			trueValue = i + 1;
//			if (trueValue % 2 == 0) {
//				evenCount++;
//			}
//		}
//		System.out.println(evenCount);
////		1~30까찌 짝수의 총합	구하기
//		for (int i = 0; i < 30; i++) {
//			trueValue = i + 1;
//			if (trueValue % 2 == 0) {
//				total += trueValue;
//			}
//		}
//		System.out.println(total);
//		1~30까지 짝수 중 7번째 숫자를 구하기
//		evenCount = 0;
//		for (int i = 0; i < 30; i++) {
//			trueValue = i + 1;
//			if (trueValue % 2 == 0) {
//				evenCount++;
//				if(evenCount == 7) {
//					System.out.println(trueValue);
//					
//					break;
//				}
//			}
//		}
		result = 0;
		evenCount = 0;
		
		for (int i = 0; i < 30; i++) {
			trueValue = i + 1;
			if (trueValue % 2 == 0) {
				evenCount++;
				if(evenCount == 1 || evenCount == 15) {
					result += trueValue;
				}
			}
		}
		System.out.println(result);
	}
}
