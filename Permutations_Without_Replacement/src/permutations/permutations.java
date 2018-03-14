package permutations;

/**
 * This class can be used to generate all possible permutations.
 * Enter a string and determine how many characters should be chosen from the string.
 *
 * @author Jiayi Zheng
 */
public class permutations {
	private static int countTotal = 0;
	private static int count = 0;
	
    /**
     * public method (recursion)
     *
     * @param input: a given string
     * @param length: the number of characters chosen from given string
     */
    public static void permutations(String input, int length) {
        permutations(input, length, "");
    }
    
    /**
     * private method (recursion)
     * print out all possible permutations
     *
     * @param input: a given string
     * @param length: the number of characters chosen from given string
     * @param allPossible: possible permutation
     */
    private static void permutations(String input, int length, String allPossible) {
        int inputLength = input.length();
        int lengthOfPossible = allPossible.length();
        if (lengthOfPossible == length) {
            System.out.println(allPossible);
            countTotal += 1;
        } else {
            for(int i = 0; i < inputLength; i++) {
                permutations(input.substring(0,i) + input.substring(i+1, inputLength), length, allPossible + input.charAt(i));
            }
        }
    }
    
    /**
     * This method used to calculate the total number of all possibles
     * 
     * @param strLength: the length of the given string
     * @param length: the number of characters chosen from given string
     * @return the total number of all possibles
     */
    private static int numOfPermutations(int strLength, int length) {
    	int result = 1;
    	if (count == length ) {
    		return result;
    	} else {
    		count += 1;
    		result = result * strLength * numOfPermutations(strLength - 1, length);
    	}
    	return result;
    }
    
    public static void main(String[] args) {
        permutations p = new permutations();
        p.permutations("012345678", 8);
        System.out.println("theoretical number is " + numOfPermutations("012345678".length(), 8));
        System.out.println("count number is " + countTotal);
    }
    
    
}

