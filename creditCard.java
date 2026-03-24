package interfaces_com;

public class creditCard implements Payment{
	public void pay(double amount) {
		System.out.println("paid "+amount+" using credit card");
	}
}
