package randomTest;

import java.util.Random;

class LottoNumber {	
	Random random = new Random();	
	public LottoNumber() {;}
	int[] lotto() {
		int[] returnArr = new int[6];
		for (int i = 0; i < returnArr.length; i++) {
			returnArr[i] = random.nextInt(46);
		}
		return returnArr;
	}
}


public class RandomTask01{
	public static void main(String[] args) {
		LottoNumber ln = new LottoNumber();
		int[] lotto = ln.lotto();
		String result = "";
		for(int i = 0; i < lotto.length; i++) {
			result += i == lotto.length - 1 ? lotto[i] : lotto[i] + ", ";
		} 
		System.out.printf("[ %s ]", result);
	}
}
