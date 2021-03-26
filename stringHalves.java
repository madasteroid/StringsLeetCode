import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stringHalves {
	public static boolean halvesAreAlike(String s) {
		boolean halvesAlike = false;
		
		char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
		Set<Character> set = new HashSet<>();
		for(int i =0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		int count1 =0;
		int count2 =0;
		for(int i=0; i<s.length()/2; i++) {
			if(set.contains(s.charAt(i))) {
				count1++;
			}
		}
		
		for(int i = s.length()/2; i<s.length(); i++) {
			if(set.contains(s.charAt(i))) {
				count2++;
			}
		}
		if(count1==count2) 
			halvesAlike = true;
		return halvesAlike;
		
	}
	
	public static void main(String[] args) {
		
		String s = "textbook";
		
		System.out.println(halvesAreAlike(s));
		
	}

}
