package constructor;

public class Person {
		private String name;
		private int age;
		
		public Person() {
			this.name = "John Doe";
			this.age = 35;
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public void talk() {
			System.out.println("Hello, my name is " + this.name);
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		

}
