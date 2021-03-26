
public class goalParserInterpretation {
	public static String interpret(String command) {
		StringBuilder str = new StringBuilder();
		for(int i=0; i<command.length(); i++) {
			if(command.charAt(i)=='(' && command.charAt(i+1) ==')') {
				str.append("o");
				i++;
			} else if(command.charAt(i)=='(' && command.charAt(i+1) =='a') {
				str.append("al");
				i = i+3;
			}
			else {
				str.append(command.charAt(i));
			}
		}
		return String.valueOf(str);
	}
	
	public static void main(String[] args) {
		String command = "G()()()()(al)";
		System.out.println(interpret(command));
		
	}
}
