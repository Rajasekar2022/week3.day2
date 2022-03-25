package week3.day2;

public class MyBank extends SBI{

	public static void main(String[] args) {
		SBI b = new SBI();

		b.openAccount();
		b.provideDebitCard();
		b.provideCreditCard();

		RBI b1 = new SBI();
		b1.openAccount();
		b1.provideDebitCard();
	}
}
