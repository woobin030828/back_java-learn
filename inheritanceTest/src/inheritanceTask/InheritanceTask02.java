package inheritanceTask;
//  PersonTask
//  이름, 나이, 주소, 핸드폰
//  각 메서드 출력
//  work 일을 한다
//  sleep 잠을 잔다
//  eat 세 끼를 먹는다
//  
//  StudentTask
//  인스타아이디
//  각 메서드 출력
//  work 아르바이트를 한다
//  sleep 수업 시간에 잠을 잔다
//  eat 아침을 거른다
//  
//  EmployeeTask
//  비상금
//  각 메서드 출력
//  work 하루 종일 일을 한다
//  sleep 잠을 설친다
//  eat 야식을 먹는다
//  
//  InhertanceTask에서
//  사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask02 {
	public static void main(String[] args) {
		PersonTask ps = new PersonTask("우빈", 23, "서울시 암사동", "010-7255-7854");
		StudentTask st = new StudentTask("우빈", 23, "서울시 암사동", "010-7255-7854", "pz_cwb");
		EmpolyeeTask et = new EmpolyeeTask("우빈", 23, "서울시 암사동", "010-7255-7854", 23000);
		
		ps.work();
		ps.sleep();
		ps.eat();
		
		st.work();
		st.sleep();
		st.eat();
		
		et.work();
		et.sleep();
		et.eat();
		
	}

}
