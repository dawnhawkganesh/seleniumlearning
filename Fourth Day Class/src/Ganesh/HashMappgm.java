package packageone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMappgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "one");
		hmap.put(2, "two");
		hmap.put(3, "three");
		hmap.put(3, "asasdasd");

		
		//hashmap---keyset(key),values(value),entryset(key and value
		
		// froeach
		for (Map.Entry<Integer, String> s : hmap.entrySet()) {
			
			System.out.println(s.getKey()+ " "+s.getValue());
			
		}
		
		for(Integer i:hmap.keySet()) {
			System.out.println(i);
		}
		
		
		for(String sa:hmap.values()) {
			System.out.println(sa);
		}
		

	}

}
