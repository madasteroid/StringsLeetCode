import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class destinationCity {
	public static String destCity(List<List<String>> paths) {
		Set<String> set = new HashSet<>();
		
		for(List<String> arrays: paths) {
			set.add(arrays.get(1));
		}
		for(List<String> arrays: paths) {
			set.remove(arrays.get(0));
		}
		
		return set.iterator().next();
		
		
		
	}
	
	
	public static void main(String[] args) {
		List<List<String>> list1 = new ArrayList<List<String>>();
		
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		
		list2.add("London");
		list2.add("Missouri");
		
		list3.add("London");
		list3.add("Nola");
		
		list4.add("UBC");
		list4.add("Jersey");
		
		
		list1.add(list2);
		list1.add(list3);
		list1.add(list4);
		
		
		System.out.println(destCity(list1));
		
	}

}
