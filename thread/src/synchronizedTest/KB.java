package synchronizedTest;

public class KB {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread taehee = new Thread(atm, "태희");
		Thread hanmin = new Thread(atm, "한민");

		taehee.start();
		hanmin.start();
	}
}
