import java.util.HashSet;
import java.util.Set;

public class decryptStringFromAlphabetToIntegerMapping {
	
	public static String freqAlphabets(String s) {
		//96 is the numeric character position of lowercase letters
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i + 2 < s.length() && s.charAt(i + 2) == '#'){
				char c = (char) (Integer.parseInt(Character.toString(s.charAt(i)) +
						s.charAt(i + 1)) + 96);
				sb.append(c);
				i += 2;
			}
			else {
				char c = (char) (Integer.parseInt(Character.toString(s.charAt(i))) + 96);
				sb.append(c);
			}
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		String s = "1326#";
		System.out.println(freqAlphabets(s));
	}
}
