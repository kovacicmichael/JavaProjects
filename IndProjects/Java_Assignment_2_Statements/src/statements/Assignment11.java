package statements;

public class Assignment11 {
	public static void main(String[] args) {
		int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < numberArray.length; i++) {
			for(int j = 1; j < 11; j++) {
				System.out.println(numberArray[i] + " * " + j + " = " + (numberArray[i] * j));
			}
		}
	}
}
