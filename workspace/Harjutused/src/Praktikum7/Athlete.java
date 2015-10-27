package Praktikum7;

public class Athlete extends Human {
	
	private Double result;
	
	public Athlete(String name, double result, int age)  {
		super(name, 10);
		this.age = age;
		this.setName(name);
		this.setResult(result);
	}
	
	@Override
	public String toString() {
		return String.format("Athlete %s, has a record of %.2f", getName(), getResult());
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
