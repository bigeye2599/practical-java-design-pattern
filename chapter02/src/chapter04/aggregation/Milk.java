package chapter04.aggregation;

public class Milk {

	private String name = "Milk";
	
	public Milk() {
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
		return "Milk";
	}
}
