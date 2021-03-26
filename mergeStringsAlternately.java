
public class mergeStringsAlternately {
	public static String mergeAlternatly(String word1, String word2) {
		int length = Math.max(word1.length(), word2.length());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<length; i++) {
			if(i<word1.length()) 
				sb.append(word1.charAt(i));
			if(i<word2.length()){
				sb.append(word2.charAt(i));
			}
		}
		return sb.toString();
		
		
		
	}
	
	public static void main(String[] args) {
		String word1 = "abcd";
		String word2 = "pqrstq";
		
		System.out.println(mergeAlternatly(word1, word2));
	}

}
