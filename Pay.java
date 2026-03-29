package interfaces.com;

public class Pay implements Payment {

	@Override
	public void GooglePay() {
		System.out.println("I am google pay");
		
	}

	@Override
	public void PhonePay() {
		System.out.println("I am phonePay");
		
	}

	@Override
	public void paytem() {
		System.out.println("I am paytem");
		
	}
	
}
