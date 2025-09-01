package equalsTest;

public class EqualsTest {
	public static void main(String[] args) {
		String data1 = "abcd";
		String data2 = "abcd";
		String data3 = "abcd";
		String data4 = "abcd";
		String data5 = "abcd";
		String data6 = new String("abcd");			
		
		System.out.println(data5.equals(data6));
		
	}
}
