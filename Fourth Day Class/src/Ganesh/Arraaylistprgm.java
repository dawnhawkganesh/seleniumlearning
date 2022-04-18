package Ganesh;

import java.util.ArrayList;
import java.util.HashSet;

public class Arraaylistprgm {
	
	public static void main (String[] args) {
	
	String [] arr = new String[3];
	arr[0] = "add";
		
	ArrayList<String> str = new ArrayList<String>();
	
  str.add("[0]testone");
  str.add("[1]test two");
  str.add("[2]test three");
  str.add("[3]test four");
  str.add(2, "this is after the seceond place");
 
  for (String s : str) {
	  System.out.println(s);
  }
	 HashSet<String> hset = new HashSet<String>();
	 
	 hset.add("onetest"); hset.add("twoset"); hset.add("threeset");  hset.add("onetest");	
	 
	for (String sa : hset) {
		System.out.println(sa);
		
	}
		
	}
   
	}

