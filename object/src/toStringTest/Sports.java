package toStringTest;

public class Sports {
//	1. 모든 필드에 priavate
	private String type;
	private int total;
	
//	2. 기본 생성자, 초기화 생성자
	public Sports() {;}
	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}

//	3. getter, setter를 정의한다.
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
//	4. toString 오버라이드
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		sports.setType("축구");
		sports.setTotal(11);
		System.out.println(sports);
		
	}
}
