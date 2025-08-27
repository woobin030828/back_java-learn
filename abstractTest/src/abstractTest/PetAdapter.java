package abstractTest;

public abstract class PetAdapter implements Pet {
//	강제성을 없애기 위한 목적
//	필요할 때, 필요한 애들만 가져와서 재정의하는 역할
//	어댑터가 그렇게까지 필요한 순간이 그리 많이 오진 않는다.
	@Override
	public void waitNow() {}
	@Override
	public void sitDown() {}
	@Override
	public void poop() {}
}
