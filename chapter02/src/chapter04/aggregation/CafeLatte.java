package chapter04.aggregation;

public class CafeLatte {
	
	private String name = "CafeLatte";
	
	private Espresso espress;
	private Milk milk;
	
	public CafeLatte() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEspresso(Espresso espresso) {
		this.espress = espresso;
	}
	
	public void setMilk(Milk milk) {
		this.milk = milk;
	}
	
	public void display() {
		System.out.println(this.name + "(" + this.espress + "+" + this.milk + ")");
	}
	
	@Override
	public String toString() {
		return "CafeLatte";
	}
	
}
