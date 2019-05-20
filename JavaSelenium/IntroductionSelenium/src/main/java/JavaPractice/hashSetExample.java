package JavaPractice;

import java.util.HashSet;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("India");
		hs.add("Europe");
		hs.add("America");
		System.out.println(hs);
		hs.add("Japan");
		hs.add("Japan");
		System.out.println(hs);
		hs.remove("Europe");
		hs.size();
		System.out.println(hs.size());
	}

}
