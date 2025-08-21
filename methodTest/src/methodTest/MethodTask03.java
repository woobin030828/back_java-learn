package methodTest;

public class MethodTask03 {
	
	void printToNumber (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(i + 1);
		}
	}
	String printToNumberString (int num) {
		String resultString = "";
		for (int i = 0; i < num; i++) {
			resultString += i == num -1 ? (i + 1) + "" : (i + 1) + ", ";
		}
		return resultString;
	}
	
	public static void main(String[] args) {
		MethodTask03 mt03 = new MethodTask03();
		mt03.printToNumber(10);
		System.out.println(mt03.printToNumberString(10));
	}
}
