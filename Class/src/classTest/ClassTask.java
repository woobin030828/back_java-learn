package classTest;

//동물(classTask)

public class ClassTask {
//	필드 생성 - 추상화의 과정
	String name;
	int age;
	String feed;
//	오버로딩, 
//	생성자의 오버로딩
//	기본 생성자
	public ClassTask() {;}	
//	초기화 생성자
	public ClassTask(String name, int age, String feed) {
		super(); // ??
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	public static void main(String[] args) {
//		표시형식 선언
		String result = "{ 이름: %s, 나이: %d, 먹이: %s } \n";
//		객체화
		ClassTask rabbit = new ClassTask("토끼", 5, "당근");
		ClassTask dog = new ClassTask("바둑이", 2, "사료");
		ClassTask cat = new ClassTask("야옹이", 4, "생선");
//		출력
		System.out.printf(result, rabbit.name, rabbit.age, rabbit.feed);
		System.out.printf(result, dog.name, dog.age, dog.feed);
		System.out.printf(result, cat.name, cat.age, cat.feed);
		
	}
}