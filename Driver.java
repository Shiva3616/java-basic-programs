package interfaces_com;

public class Driver {

	public static void main(String[] args) {
		Upi u = new Upi();
		u.pay(500);
		
		creditCard c = new creditCard();
		c.pay(100000);

	}

}
