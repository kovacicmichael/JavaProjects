package strings;

public class Assignment2 {
	public static void main(String[] args) {
		String one = "abc";
		String two = "ABC";
		if(one == two)
			System.out.println("== says equal");
		else
			System.out.println("== says not equal");
		if(one.equals(two.toLowerCase()))
			System.out.println("method says equals");
		else
			System.out.println("method says not equal");
	}
}
