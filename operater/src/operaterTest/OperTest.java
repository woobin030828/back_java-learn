package operaterTest;

public class OperTest {
	public static void main(String[] args) {
		boolean isTrue = 10 != 11; // false
		
		System.out.println(isTrue); // false
		System.out.println(!isTrue || 10 != 11);
	}
}
