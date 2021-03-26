
public class splitaStringInBalancedStrings {
	public static int balancedString(String s) {
		int count =0;
		int sum =0;
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == 'R') {
				sum = sum+1;
			}
			else {
				sum = sum-1;
			}
			if(sum==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s = "RLRRRLLRRLL";
		System.out.println(balancedString(s));
		
	}

}
