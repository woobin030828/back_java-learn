package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask03 {
	
	public void removeProductForName(ArrayList<Product> products,String name) {
		Product removeProduct = null;
		for(Product prod: products) {
			if(prod.getName().equals(name)) {
				removeProduct = prod;
			}
		}
		if (removeProduct != null) products.remove(removeProduct);
	}
	
	public void removeProductForNames(ArrayList<Product> products, String[] names) {
		for (String name: names) {
			removeProductForName(products, name);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		ArrayList<Product> newProducts = new ArrayList<Product>();
		
//		? 반복되는 코드?
		Product[] productTemp = {
			new Product(1L, "컴퓨터", 800000, 260), 
			new Product(2L, "책상", 30000, 100), 
			new Product(3L, "키보드", 50000, 20), 
			new Product(4L, "모니터", 300000, 200), 
			new Product(5L, "마우스", 50000, 20), 
		};
		
//		그러니까 반복문 돌려서 넣어버려야지
		for (Product prod: productTemp) {
			products.add(prod);
		}
		
//		재고가 100개 이상인 상품만 출력
		
//		for (Product prod: products) {
//			if(prod.getCount() >= 100) {
//				System.out.println(prod);
//			}
//			
////			마우스 가격을 100000 으로 변경
//		}
//		
//		Product foundProduct = null;
//		for(Product prod: products) {
//			if(prod.getName().equals("마우스")) {
//				foundProduct = prod;
//			}
//		}
//		foundProduct.setPrice(100000);
//		
//		if(products.contains(foundProduct)) {
//			products.set(products.indexOf(foundProduct), foundProduct);
//		}
//		
//		System.out.println(products);
//		
//		try {
//			for(Product prod: products) {
//				if(prod.getCount() > 100) {
//					newProducts.add(prod);
//				}
//			} 
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		products = newProducts;

//		상품 이름이 "마우스"인 상품을 삭제

		ArrayListTask03 alt02 = new ArrayListTask03();
		alt02.removeProductForName(products, "마우스");
		
		System.out.println(products);
		
	}
	
}
