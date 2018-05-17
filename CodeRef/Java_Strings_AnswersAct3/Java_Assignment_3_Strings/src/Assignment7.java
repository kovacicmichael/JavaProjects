
public class Assignment7 {

	public static void main(String[] args) {
		String str = "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
		
		String token = str.substring(str.indexOf("=") + 1);
		
		System.out.println(token);
	}
}
