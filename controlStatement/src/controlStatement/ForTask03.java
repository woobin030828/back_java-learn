package controlStatement;

public class ForTask03 {
	public static void main(String[] args) {
		int value = 0, result = 0, big = 0;
		char charValue = ' ';
		String resultString = "";
		for(int i = 0; i < 100; i++) {
			value = i + 1;
			if (value % 7 == 0) {
				result += value;
			}
		}
		System.out.println(result);
		
		for(int i = 'a'; i <= 'z'; i++) {
			big = i - 32;
			charValue = i % 2 == 0 ? (char)big : (char)i; 
			resultString += charValue;
		}
		System.out.println(resultString);
	}
}
