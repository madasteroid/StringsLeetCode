
public class defangingAnIpAddress {
	public static String defangIpAddress(String address) {
		StringBuilder str = new StringBuilder();
		for(int i =0; i<address.length(); i++) {
			if(address.charAt(i)=='.') {
				str.append("[.]");
			}
			else {
				str.append(address.charAt(i));
			}
		}
		return String.valueOf(str);
	}
	
	public static void main(String[] args) {
		String s = "192.168.1.0";
		System.out.println(defangIpAddress(s));
	}

}
