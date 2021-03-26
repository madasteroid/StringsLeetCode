import java.util.HashSet;
import java.util.Set;

public class uniqueMorseCodeWords {
	public static int uniqueMorseRepresentations(String[] words) {
		 Set<String> set = new HashSet<>();
			String[] str ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
					for(String word : words) {
						StringBuilder code = new StringBuilder();
						for(char c: word.toCharArray()) {
							code.append(str[c - 'a']);
						}
						set.add(code.toString());
				
			}
					return set.size();
	
	}
	
	public static void main(String[] args) {
		String [] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
	
}
