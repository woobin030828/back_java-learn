package classTest;

import java.util.Scanner;

public class SuperCar {
//	필드
//	브랜드
	String brand;
//	색상
	String color;
//	가격
	long price;
//	엔진
	boolean engine;
//	비밀번호
	String password;
//	비밀번호 오류 횟수
	int errorCount;
	
//	기본 생성자
	public SuperCar() {;}

//	스태틱 블록 - 클래스가 실행될 때 무조건 실행되는
	static {
		System.out.printf("출고 되었습니다. 감사합니다. \n");		
	}
//	초기화 블록 - 필드의 초기화를 위해 쓰이는 블록
	{
		this.password = "0000";
	}
	
//	초기화 생성자
	public SuperCar(String brand, String color, long price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
		
		
	}
	
//	초기화 생성자의 오버로딩 --- 객체지향 언어의 특징, 오버로딩 / 오버라이딩
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}	
	
	public void engineStart() {
		this.engine = true;
	}
	public void engineStop() {
		this.engine = false;
	}
	
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("ferrari", "red", 700_000_000);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String password = null;
		
		while(true) {
			System.out.println("1.시동 켜기\n2.시동 끄기");
			choice = sc.nextInt();

			if (choice == 1) {
				if (!ferrari.engine) {
					System.out.println("비밀번호를 입력해주세요 : ");
					password = sc.next();
					if(ferrari.checkPassword(password)) {
						ferrari.errorCount = 0;
						ferrari.engineStart();
						System.out.println(ferrari.brand + "시동이 켜졌습니다.");
					} else {
						System.out.println("비밀번호가 틀립니다.");
						ferrari.errorCount++;
						if (ferrari.errorCount >= 3) System.out.println("경찰 출동!");
					}
				} else {
					System.out.println(ferrari.brand + " 시동이 이미 켜져있습니다.");
				}
			} else if (choice == 2) {
				if(ferrari.engine) {
					ferrari.engineStop();
					System.out.println(ferrari.brand + " 시동이 꺼졌습니다.");
				} else {
					System.out.println("이미 꺼져있습니다.");
				}
			} else {
				System.out.println("올바른 값을 입력해주세요.");
			}
			
		}
		
	}
}
