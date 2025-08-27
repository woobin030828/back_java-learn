package anonymousTask;

public interface Form {
//	판매 상품을 받아서 판매 메뉴를 보여주는 메서드
	public void registerMenus(String[] menus);
	
	public void showMenus();
	
//	해당 메뉴를 판매하는 메서드
//	메뉴를 받아서 현재 판매 중인 메뉴라면, "판매 완료", 아니라면 "판매 준비중"
	public void sell(String Menu);
//	
}
