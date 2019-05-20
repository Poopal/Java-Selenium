package HashMap;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String> ();
		hm1.put(101, "Nisha");
		hm1.put(102, "Kushboo");
		hm1.put(103, "Sandesh");
		hm1.put(104, "Poonam");
		
		System.out.println(hm1);
		
		//Creating another HashMap
		HashMap<Integer, String> hm2 = new HashMap<Integer, String> ();
		hm2.put(105, "Iva");
		hm2.put(106, "Chintu");
		
		//Inserting key-value pairs to anotherMap using putAll() method
		hm2.putAll(hm1);
		
		System.out.println(hm2);
		
		// add given key-value pair to HashMap if and only if it is not present in the HashMap
		hm2.putIfAbsent(107, "Pintu");
		
		System.out.println(hm2);
		
		//Retrieving a value associated with key
		   String str = hm1.get(101);
		   
		   System.out.println(str);
	}

}
