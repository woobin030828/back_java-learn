package threadTest;

public class ThreadTest {

	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
//		
//		thread1.start();
//		thread2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "★");
		Thread thread2 = new Thread(target2, "♥");
		
		thread1.start();
		thread2.start();
//		스레드의 우선순위를 변경
//		하지만 메인스레드보다 우선순위가 낮다
//		강제로 무조건 단일로 처리하듯 처리할 수 있게 된디ㅣ.
		thread2.setPriority(1);
		
		try {			
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드 동작");
		
	}
	
}
