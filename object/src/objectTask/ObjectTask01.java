package objectTask;

// 상품 클래스를 만들고,
// toString, hashCode, Equals를 재정의하고
// 같은 상품인지 비교하기
// 1번 상품
// 이름(name) : 파인애플, 가격(price) : 20000, 재고(stock) : 15, 원산지(mou) : 필리핀

public class ObjectTask01 {
	public static void main(String[] args) {
		Fruit pineApple = new Fruit("파인애플", "필리핀", 20000, 15);
		Fruit pineApple2 = new Fruit("파인애플", "필리핀", 20000, 15);
		Fruit Apple = new Fruit("사과", "국내산", 10000, 15);
		
		if(pineApple.equals(Apple)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
		if(pineApple.equals(pineApple2)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
	}
}
