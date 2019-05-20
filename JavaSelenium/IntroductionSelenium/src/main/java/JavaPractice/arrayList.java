package JavaPractice;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sandesh");
		a.add("Poonam");
		a.add("manu");
		a.add(2, "manu");
		a.add("Chintu");
		System.out.println(a);
		a.add(3, "Love");
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.remove("Chintu");
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains("Poonam"));
		System.out.println(a.indexOf("Sandesh"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
