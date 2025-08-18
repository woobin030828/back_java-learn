package formatTest;

public class FormatTest {
	public static void main(String[] args) {
//		이름
//		나이
//		키
//		String name = "";
//		int age = 0;
//		double height = 0.0;
//		
//		name = "최우빈";
//		age = 23;
//		height = 173.3;
		
		String name = "최우빈";
		int age = 23;
		double height = 173.3;
		
		System.out.printf("저의 이름은 %s입니다.", name);
		System.out.printf("저의 이름은 %s이고, 나이는 %d, 키는 %.1fcm 입니다.", name, age, height);
	}
}
