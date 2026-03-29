package interfaces.com;

public class StaticAndNonStatic {
	//static methods and variables
	static int a = 10;
	static void Staticmethod() {
		System.out.println("I am static method");
	}
}

class StaticDriver {
	public static void main(String args[]) {
		System.out.println(StaticAndNonStatic.a);	
	}	
}
