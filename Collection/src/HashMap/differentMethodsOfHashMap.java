package HashMap;

import java.util.HashMap;

public class differentMethodsOfHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Creating HashMap with default initial capacity and load factor
		HashMap<String, Integer> map1 = new HashMap<String, Integer> ();
		
        //2. Creating HashMap with some initial capacity
		HashMap<String,Integer> map2 = new HashMap<String,Integer> (30);
		
		//3. Creating HashMap with some initial capacity and some load factor
		HashMap<String, Integer> map3 = new HashMap<String, Integer> (30, .60f);
		
		//4. Creating HashMap by copying another HashMap
		HashMap<String, Integer> map4= new HashMap<String, Integer> (map1);
		
	}

}
