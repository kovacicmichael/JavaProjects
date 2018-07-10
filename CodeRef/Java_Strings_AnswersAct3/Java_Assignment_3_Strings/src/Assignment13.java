
public class Assignment13 {

	public static void main(String[] args) {
		String one = "";
		String two = "";
	
		//check if strings are exactly the same
		if (one.equals(two)) {
			System.out.println("The strings are equal and not anagrams");
			System.exit(0);
		}
		if (one.length() != two.length()){
			System.out.println("The strings are different lengths");
			System.exit(0);
		}
		
		one = one.toUpperCase();
		two = two.toUpperCase();

		char[] oneArray = one.toCharArray();
		char[] twoArray = two.toCharArray();

		Arrays.sort(oneArray);
		Arrays.sort(twoArray);

		if(oneArray.equals(two)){
			System.out.println("The two strings are Anagrams")
		}






		
		int[] map = new int[one.length()];
		//initialize array to -1 values
		for (int i = 0; i < map.length; i++){
			map[i] = -1;
			System.out.println("map array: " + map[i]);
		}
		
		
		//loop through letters of 1st and check if they are in the 2nd
		for (int i = 0; i < one.length(); i++){
			char c = one.charAt(i); //H
			System.out.println("Character: " + c);
			
			int index = two.indexOf(c); //0
			System.out .println("index: " + index);
			System.out.println("map array outerLoop top: " + map[i]);
			//if index is -1 the letter is not in the first
			if (index == -1){
				System.out.println("The strings are not anagrams");
				System.exit(0);
			}
			
			//loop through array if present, if so, update by one and try again
			for (int j = 0; j < map.length; j++){ //values of map = -1
				System.out.println("map j: " + map[j]);
				System.out.println("map i " + map[i]);
				System.out.println("innerloop index: " + index);
				//check if duplicate letter
				if (map[j] == index){
					index = two.indexOf(c, index + 1);
					System.out.println("index inner loop conditional: " + index);
					
					
					
					if (index == -1){
						System.out.println("the strings are not anagrams");
						System.exit(0);
					}
					
					continue;
				}
				System.out.println("end of loop inside --------------------------");
				
				
			}
			
			//store current index in map
			map[i] = index;
			System.out.println("map array for loop bottom: " + map[i]);
			System.out.println("end of loop outside --------------------------");
		}
		
		System.out.println("The strings are anagrams!");
	}
}
