package methodTest;

public class MethodTask02 {
//	이름을 10번 출력하는 메서드
	void printNameTenTimes(String name) {
//		for 10번 반복
		for(int i = 0; i < 10; i++) {
//			출력
			System.out.println(name);
		}
		System.out.printf("이름이 총 %d번 반복되었습니다. \n", 10);
	}
//	이름을 지정 횟수만큼 출력하는 메서드
	void printNameNTimes(String name, int repeact) {
//		for, repeact만큼 반복
		for(int i = 0; i < repeact; i++) {
//			출력
			System.out.println(name);
		}
		System.out.printf("이름이 총 %d번 반복되었습니다. \n", repeact);
	}
	
	public static void main(String[] args) {
//		사용 준비
		MethodTask02 mt02 = new MethodTask02();
		
//		사용
		mt02.printNameTenTimes("최우빈");
		mt02.printNameNTimes("최우빈", 3);
	}
}
