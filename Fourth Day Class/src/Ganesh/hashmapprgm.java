package Ganesh;

import java.util.HashMap;
import java.util.Map;

public class hashmapprgm {
	public static void main (String[] args ) {
		
	
HashMap<Integer, String> hmap = new HashMap<Integer, String>();

hmap.put(1, "one");
hmap.put(2, "two");
hmap.put(3, "three");

for(Map.Entry<Integer, String> s: hmap.entrySet()) {
	System.out.println(s.getValue() + " " + s.getKey());
	
}

}
}
