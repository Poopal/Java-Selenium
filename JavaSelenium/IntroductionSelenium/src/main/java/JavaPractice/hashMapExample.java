package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Green");
		hm.put(1, "Yellow");
		hm.put(2, "Green");
		System.out.println(hm.get(5));
		hm.remove(2);
		System.out.println(hm);
		
		//convert HashMap to Set 
		
		Set sn=hm.entrySet();
		
		Iterator it=sn.iterator();
		
		while (it.hasNext())
			
		{
			Map.Entry mp =(Map.Entry)it.next();
			
			//key seperatly
			//Value Seperatly
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		}
		
	}

