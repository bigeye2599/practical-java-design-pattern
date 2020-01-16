package chapter06.dependency;

public class CoffeeBeans {

	private String countryOfOrigin = "Colombia";
	
	public CoffeeBeans() {
		super();
	}
	
	@Override
	public String toString() {
		return "CoffeBeans [" + this.countryOfOrigin + "]";
	}
	
}
