package permutations;

public class permutations {
	
	public static void permutations(String input, int length) {
		permutations(input, length, "");
	}
	
	private static void permutations(String input, int length, String allPossible) {
		int inputLength = input.length();
		int lengthOfPossible = allPossible.length();
		if (lengthOfPossible == length) {
			System.out.println(allPossible);
		} else {
			for(int i = 0; i < inputLength; i++) {
				permutations(input.substring(0,i) + input.substring(i+1, inputLength), length, allPossible + input.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		permutations p = new permutations();
		p.permutations("0123456789", 5);
	}

	
}
