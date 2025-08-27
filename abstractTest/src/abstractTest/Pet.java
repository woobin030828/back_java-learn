package abstractTest;

//	추상 클래스를 조금 더 고급화 시킴
//	인터페이스는 추상 메서드와 상수(final)만 가질 수 있다.
public interface Pet {
	int num = 20; // 컴파일러에서 자동으로 번역함 // public static final int num = 20;

	public void sitDown();
	public void waitNow();
	public void poop();
}
