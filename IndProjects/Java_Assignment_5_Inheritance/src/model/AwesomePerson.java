package model;

public class AwesomePerson extends Person {
	public AwesomePerson() {
		this.name = "William";
		this.age = 25;
		
		System.out.println("inside AP constructor..");
	}

	public void talk() {
		System.out.println("Hello, my name is " + this.name + " i am " + this.age + " years old.");
		
	}
}
