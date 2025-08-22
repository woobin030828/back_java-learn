package classTask;

class Market {
// 상품명, 상품 가격, 상품 재고
// 판매 sell 메서드	
//	판매를 할 때 매개변수르 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까 - 유저 커스터머 클래스.
//	필드 생성
	String itemName;
	int price, count;
//	기본 생성자
	public Market() {;}
//	초기화 생성자
	public Market(String itemName, int price, int count) {
		this.itemName = itemName;
		this.price = price;
		this.count = count;
	}
//	판매 메서드
//	원래 가격 × (1 - (할인율 / 100))
	void sell(Customer customer) {
		if (customer.money < this.price) {
			System.out.println("잔액부족");
		} else {
			customer.money -= customer.sale > 0 ? this.price * (1 - (customer.sale / 100)) : this.price;
			this.count--;
			System.out.printf("%s 상품의 재고 : %d, %s 님의 남은 금액 %d", this.itemName, this.count, customer.name, customer.money);
		}
	}
	
}
class Customer {
// 이름, 휴대전화 번호, 돈, 할인율	
// 필드 생성
	String name;
	String phoneNumer;
	int money;
	double sale;
//	기본 생성자
	public Customer() {;}
//	돈과 할인율이 아예 엾는 신규 가입자의 경우
	public Customer(String name, String phoneNumer) {
		this.name = name;
		this.phoneNumer = phoneNumer;
	}
//	초기화 생성자
	public Customer(String name, String phoneNumer, int money, double sale) {
		this.name = name;
		this.phoneNumer = phoneNumer;
		this.money = money;
		this.sale = sale;
//		생성시, 고객 정보 출력
		System.out.printf("고객정보 \n이름: %s\n전화번호: %s\n잔액: %d\n할인율: %.1f \n", this.name, this.phoneNumer, this.money, this.sale);
	}
}
public class ClassTask02 {
//	마켓, 소비자를 객체화 시키고,
//	소비자에게 마켓의 물건을 판매
//	마켓의 상품 재고와. 소비자의 남은 금액을 출력
	public static void main(String[] args) {
		Customer user1 = new Customer("우빈", "010-7255-7854", 30_000, 32.3);
		Market items1 = new Market("이어폰", 3_000, 5);	
		items1.sell(user1);
	}	
}
