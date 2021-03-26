
public class countTHeNUmberOFConsistentStrigns {
	public static int countConsistentStrings(String allowed, String[] words) {
		int count =0;
		for(String s : words) {
			boolean contains = true;
				for(char c: s.toCharArray()) {
					if(!allowed.contains(String.valueOf(c))) {
						contains = false;
					}
				}
				if(contains)  count++;	
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String allowed = "abc";
		String[] strings = {"a","b","c","ab","ac","bc","abc"};
		
		System.out.println(countConsistentStrings(allowed, strings));
	}
	

}
