package anonymousTask;

public interface MathTask {
//	1+1(두개의 정수를 더해주는 메서드)
//	2개의 문자열을 연결시켜주는 메서드
//	두 수를 전달하면 사칙연산의 결과를 전달해주는 메서드
//	이름을 전달하면 이름을 출력하는 메서드
	
	public int add(int num1, int num2);
	public String concat(String text1, String text2); 
	public CalcResult calc(int num1, int num2);
	public void setName(String name);
}
