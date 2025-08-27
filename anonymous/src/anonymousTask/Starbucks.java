package anonymousTask;

import java.util.Scanner;

//	

public class Starbucks {
	public static void main(String[] args) {
		String[] arg = {"자바칩 프라푸치노", "아이스 아메리카노", "뜨거운 아이스 아메리카노"};
		String  trueMessage = "판매 완료", falseMessage = "상품 준비 중",
				completeMessage ="상품 등록 중",displayMessage = "현재 메뉴 출력" , inputMessage = "구매 할 메뉴를 선택해주세요 \n(예, 자바칩_프라푸치노) : ", inputString = "";
		Scanner sc = new Scanner(System.in);
		Form form = new Form() {
			private String[] menus;
			public String[] getMenus() {
				return menus;
			}
			public void setMenus(String[] menus) {
				this.menus = menus;
			}
			
			@Override
			public void registerMenus(String[] menu) {
				this.setMenus(menus);
				System.out.println("상품 등록 완료");
			}
			@Override
			public void showMenus() {			
				for(String menu: this.getMenus()) {
					System.out.println(menu);
				}
			}
//			해당 메뉴를 판매하는 메서드
//			메뉴를 받아서 현재 판매 중인 메뉴라면, "판매 완료", 아니라면 "판매 준비중"
			@Override
			public void sell(String buyMenu) {
				boolean isCheck = false;
				String result = "";
//				빠른 for 일치 메뉴 판단
				for(String menu: this.getMenus()) {
					if(menu.equals(buyMenu)) {
						isCheck = true;
						break;
					} else {
						isCheck = false;
					}
				}
//				삼항식으로 출력 텍스트 결정
				result = isCheck ? trueMessage : falseMessage;
				System.out.println(result);
			}
		};
		
		System.out.println(completeMessage);
		form.registerMenus(arg);
		
		System.out.println(displayMessage);
		form.showMenus();
		
		System.out.print(inputMessage);
		inputString = sc.nextLine();
		form.sell(inputString);
		sc.close();
	}
}
