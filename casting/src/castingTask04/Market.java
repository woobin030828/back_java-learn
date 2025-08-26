package castingTask04;

public class Market {
	String name;
	private static Product[] products = {
		new Product("막대사탕", 200, 5),
		new Product("에어컨", 300_000_000, 1),
		new Product("컨디션", 2300, 2),
		new Product("어선", 0, 0),
	};
	
	public Market() {;}
	public Market(String name) {
		super();
		this.name = name;
	}
	public void sell(User user, String input, int userCount) {
		boolean isNameSame = false;
		boolean isCountMin = false;
		if (products.length == 0 ) {
			System.out.println("판매할 상품이 없습니다.");
		} else {
			for(Product product1: products) {
				String productName = product1.getName();
				int productCount = product1.getCount();
				int productPrice = product1.getPrice() * userCount;
				if(productName.equals(input)) {
					if (!productName.equals(input)){
						if(!isNameSame) isNameSame = false;
					} else {
						isNameSame = true;
					}
					if (productCount > userCount) {
						if(!isCountMin) isCountMin = false;
					} else if(productCount == 0) {
						isCountMin = false;
					} else {
						isCountMin = true;
					}
					if (isNameSame && isCountMin) {
						if (user.getMoney() > productPrice) {
							int disCount = user instanceof MarketMember ? 30 : 5;
//							원래가격 - (원래가격 * (할인율 / 100))
							if(!giveCoupon(user)) { // 	아닐 때		
								int price = productPrice - (productPrice *(disCount / 100));
								int point = user instanceof MarketMember ? product1.getPrice() *(10 / 100) : product1.getPrice() *(10 / 100);
								insertPoint(user, point);
								user.setMoney(user.getMoney() - price);
							} 
							product1.setCount(product1.getCount() - userCount);
							System.out.printf("%s님이 %s을 구매 완료하였습니다. 잔액: %d",user.getName(), product1.getName(), user.getMoney());
						} else {
							System.out.println("잔액이 부족합니다.");
						}
					}					
					
					if (!isNameSame) System.out.printf("%s님, 이름이 일치하는 상품이 없습니다.\n", user.getName());
					if (!isCountMin) System.out.printf("%s님, 남은 수량이 부족합니다.\n", user.getName());
				}
				
			}
		}
	}
	private void insertProduct(String name, int price, int firstCount) {
		boolean isSame = false;
		if (products.length == 5) {
			System.out.println("상품을 등록 할 수 없습니다.");
		} else {
			for (Product product: products) {
				if(!product.getName().equals(name)) {
					isSame = false;
				} else {
					isSame = true;
					System.out.println("같은 이름의 상품은 등록 할 수 없습니다.");
				}
			}
			if(!isSame) {
				new Product(name, price, firstCount);
			}
		}
	}
	private void insertPoint(User user, int point) {
		
		user.setPoint(point);
	}
	private boolean giveCoupon(User user) {
		if (user.getCoupon() == 10) {
			user.setCoupon(0);
			return true;
		} else {
			user.setCoupon(user.getCoupon() + 1);
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static Product[] getProducts() {
		return products;
	}
	public static void setProducts(Product[] products) {
		Market.products = products;
	}
	
	
	
}
