package castingTask04;



class User {
	private String name, phoneNumber;
	private static Market market = new Market("이마트");
	private int money, point, coupon;
	public User() {;}
	public User(String name, String phoneNumber, int money, int point, int coupon) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}
	void buy(String productName, int count) {
		market.sell(this, productName, count);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
	
	
}
