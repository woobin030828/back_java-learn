package lambdaNormal;

import java.util.Random;

public class LambdaNomal {
	public static void main(String[] args) {
		NormalInter normalInter = (int[] intArr) -> {
			int randomIndex1 = 0, randomIndex2 = 0, result = 0, resultNum1 = 0, resultNum2 = 0;
			Random random = new Random();
			boolean isRandom = false;
			
			while(!(result > 0 && result % 2 == 0)) {		
				isRandom = true;
				while(isRandom) {
					randomIndex1 = random.nextInt(0, intArr.length - 1);
					randomIndex2 = random.nextInt(0, intArr.length - 1);								
					if(randomIndex1 != randomIndex2) isRandom = false;
				}
				
				resultNum1 = intArr[randomIndex1];
				resultNum2 = intArr[randomIndex2];
				result = resultNum1 + resultNum2;
			}
			System.out.printf("%d + %d, 결과: %d \n", resultNum1, resultNum2, result);
			
		};
		
		Random random = new Random();
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1, 500);
		}
		normalInter.getRandomEven(arr);
	}
}