
public class maximumNestingDepthOfTheParenthesis {
	public static int maxDepth(String s) {
		int count =0;
		int sum=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				sum = sum+1;
			} else if(s.charAt(i)==')') {
				sum = sum-1;
			}
			count = Math.max(count, sum);
			
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s = "(1)+((2))+(((3)))";
		System.out.println(maxDepth(s));
	}
}
