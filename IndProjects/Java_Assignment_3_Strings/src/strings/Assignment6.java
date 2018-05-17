package strings;

public class Assignment6 {
	public static void main(String[] args) {
		
		String sentence = ("Hello My Name is Java");
		int index = sentence.indexOf(" ", sentence.indexOf(" ") + 1);
		System.out.println(index);	
	}
}
