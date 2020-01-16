package chapter06.dependency;

public class Espresso {

	private String name = "Espresso";
	
	public Espresso() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Espresso";
	}
}
