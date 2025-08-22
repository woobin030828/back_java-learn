package classTest;
// 추상되어진 결과물 = 클래스
// 현재 추상화가 되었다.
public class ClassTest {
	
//  필드
	String name = "";
	int age = 0;
	
// 생성자 - 추상화된 클래스를 메모리에 할당시켜 객체화하고 주소값을 리턴해주는 역할
// 기본 생성자
  public ClassTest () {;}
// 초기화 생성자
	public ClassTest (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//		객체화
		ClassTest ct1 = new ClassTest("최우빈", 23); // new는 heap에 올려달라는 주소만 알려주는 역할
//		ct - 객체
		System.out.println(ct1.name);
	}
}