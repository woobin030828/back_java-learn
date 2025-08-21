package methodTest;

public class MethodTest {
	int subtract (int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	void printName (String firstName, String lastName) {
		if (firstName == "" || lastName == "") {
			System.out.println("값이 잘못 입력되었습니다");
		} else {
			System.out.println(firstName + lastName);			
		}
	}
	public static void main(String[] args) {
//		getName("최", "우빈");
		MethodTest mt = new MethodTest(); // JAVA의 개발자의 Keep 영역에 올려 사용할 준비를 한다.
		mt.printName("우빈", "최");
	}
}
