package staticTest;
class Employee {
//  필드
//  회사의 돈(돈)
	static int componyMoney;
	String name;
	int age;
	int income;
//  이름(name), 나이(age), 수익(income)
//	기본 생성자
	public Employee() {;}
//	초기화 생성자
//	값을 알고 있을 때
	public Employee(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
		componyMoney += this.income;
	}
	
	void result() {
		System.out.println(componyMoney);
	}
}

public class StaticTask01 {
	
	public static void main(String[] args) {
		Employee ep = new Employee(); // 객체화
		new Employee("최우빈", 23, 5_000);
		// 생성자 - 추상화된 클래스를 메모리에 할당시켜 객체화하고 / 그렇게 생긴 주소값을 리턴해주는 역할
		new Employee("강준성", 23, 7_000);
		new Employee("김승훈", 23, 3_000);
		new Employee("김영우", 23, 2_000);
		new Employee("최준보", 23, 3_000);
		
		ep.result();
	}
//  회사원들이 벌어온 수익을 모두 회사의 돈(돈)에 합치고,
//  회사의 돈 출력
}
