package classTask;

import java.util.Scanner;

class Student {
//	필드
	String name;
	int age, korean, english, math, total;
	double avg;
//	기본 생성자
	public Student() {;}
//	초기화 생성자
//	학생이 입력을 하지 않았을 때를 상정한 오버로딩 (여러 학생 객체 생성을 고려하기도 함)
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, int korean, int english, int math) {
		this.name = name;
		this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public Student(String name, int age, int[] scores) {
		this.name = name;
		this.age = age;
		this.korean = scores[0];
		this.english = scores[1];
		this.math = scores[2];
	}
//	생성될 때 total 및 avg를 연산하면, 차후에 값이 변동 될 때(수정 또는 삭제), 반영이 되지 않으므로, 메서드로 만들어서 반환 시킴.
//	합계 
	int total () {
		return this.korean + this.english + this.math;
	}
//	평균  
	double avg() {
		return this.total() / 3.0;
	}	
}
public class ClassTask01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int korean = 0, english = 0, math = 0;
		String inputMessage = "국어, 영어, 수학 점수를 입력하세요 : ";
		System.out.print(inputMessage);
		korean = sc.nextInt();
		english = sc.nextInt();
		math = sc.nextInt();
		Student student1 = new Student("최우빈", 23, korean, english, math);
		
		sc.close();
		System.out.printf("%s 학생(%d)의 총점은 %d, 평균은 %.2f 입니다.", student1.name, student1.age, student1.total() ,student1.avg());
	}
//	해보고싶은거, 여러개의 학생 객체를 만들어서 그 객체들 중 평균값이 제일 높은 학생을 뽑아 출력하기, 학생 이름, 비밀번호로 로그인해서 만약 학생 이름이 등록되지 않았다면, 학생 이름으로 새로 객체를 생성하는 것
}
