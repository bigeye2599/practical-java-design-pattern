package section02_����_realization;

public class Client {

	public static void main(String[] args) {
		
		ICoffee espresso = new Espresso();
		
		System.out.println(espresso.getName());
		
		espresso.display();
	}

}
