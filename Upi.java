package interfaces_com;

public class Upi implements Payment {
	public void pay(double amount) {
		System.out.println("paid "+amount+" using upi method");
	}
}
