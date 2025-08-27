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
			Product selectProduct = null;
			for(Product product: products) {			
				String productName = product.getName();
				if(productName.equals(input)) {
					
					selectProduct = product;
					break;
				} else {
					System.out.printf("%s님, 이름이 일치하는 상품이 없습니다.\n", user.getName());
				}
			}
			
			if(selectProduct != null) {
				int productCount = selectProduct.getCount();
				
				int productPrice = selectProduct.getPrice() * userCount;
				isCountMin = productCount >= userCount ? true : false;
				
//				System.out.println(user.getName());
//				System.out.printf("%b 결과",isCountMin);
				if (isCountMin) {
					if (user.getMoney() > productPrice) {
						int disCount = user instanceof MarketMember ? 30 : 5;
//							원래가격 - (원래가격 * (할인율 / 100))
						if(!giveCoupon(user)) { // 	아닐 때		
							int price = productPrice - (productPrice *(disCount / 100));
							int point = user instanceof MarketMember ? selectProduct.getPrice() *(10 / 100) : selectProduct.getPrice() *(10 / 100);
							insertPoint(user, point);
							user.setMoney(user.getMoney() - price);
						} 
						selectProduct.setCount(selectProduct.getCount() - userCount);
						System.out.printf("%s님이 %s을 구매 완료하였습니다. 잔액: %d \n",user.getName(), selectProduct.getName(), user.getMoney());
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				}
				if(!isCountMin) System.out.printf("%s님, 재고가 부족합니다. \n", user.getName());
			} else {
				System.out.printf("%s님, 상품이 없습니다. \n", user.getName());
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
