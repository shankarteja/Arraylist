package arraylist;
import java.util.HashMap;

public class Exhashmap {
	public static void main(String[] args) {
		HashMap<String, String> h= new HashMap<>();
		h.put("1","aaa");
		h.put("2","bbb");
		h.put("3","ccc");
		h.put("4","ddd");
		h.put("5","eee");
		h.put("6","fff");
		h.put("1","ggg");
		//	System.out.println(h.entrySet());// to avoid duplicate values
	//			System.out.println(h.get("3"));// Value assign d ccc
	//			System.out.println(h.get("1"));
		System.out.println(h.containsKey("1"));
	//	System.out.println(h.isEmpty());


	}

}
