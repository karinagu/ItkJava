package Praktikum7;

public class Human {
	public String name;
	public int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human(){
		
	}
	
	public void greet() {
		if (this.age < 4) {
			System.out.println("Buubuu");
		} else {
			System.out.format("Tere, minu nimi on %s, olen %d -aastane. \n", this.name, this.age);
			// TODO
		}
	}
}
