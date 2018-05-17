package strings;

public class Assignment3 {
	public static void main(String[] args) {
		String one = "abc";
		String two = new String ("abc");
		
		if(one.equals(two))
			System.out.println("equal");
		else
			System.out.println("not equal");
		if(one == two)
			System.out.println("equal");
		else
			System.out.println("not equal");
			
	}
}	
