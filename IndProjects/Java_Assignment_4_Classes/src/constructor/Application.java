package constructor;

public class Application {
	public static void main(String[] args) {
		
		Person employeeOne = new Person();
		
		employeeOne.setName("William");
		employeeOne.setAge(25);
		System.out.println("Name: " + employeeOne.getName() + " - Age: " + employeeOne.getAge());
		employeeOne.talk();
	}
}
