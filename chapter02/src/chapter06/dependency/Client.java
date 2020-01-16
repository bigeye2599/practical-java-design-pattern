package chapter06.dependency;

public class Client {

	public static void main(String[] args) {
		
		Barista barista = new Barista();
		
		EspressoMachine espressoMachine = new EspressoMachine();
		
		barista.setEspressoMachine(espressoMachine);
		
		Espresso espresso = barista.makeEspresso();
		System.out.println(espresso);
		
		CafeLatte cafeLatte = barista.makeCafeLatte();
		
		cafeLatte.display();
	}
	
}
