package model;

public class ReallyAwesomePerson extends AwesomePerson{
	public ReallyAwesomePerson() {
		System.out.println("inside RAP constructor.. ");
	}
	
	public void talk(String message) {
		System.out.println(message);
	}
}
