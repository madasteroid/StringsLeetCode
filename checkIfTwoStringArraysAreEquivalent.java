
public class checkIfTwoStringArraysAreEquivalent {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(String word : word1) {
			sb1.append(word);
		}
		for(String word: word2) {
			sb2.append(word);
		}
		
		return String.valueOf(sb1).equals(String.valueOf(sb2));
		
	}
	
	
	public static void main(String[] args) {
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a","bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}

}
