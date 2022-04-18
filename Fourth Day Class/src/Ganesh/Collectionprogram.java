package packageone;

import java.util.ArrayList;
import java.util.HashSet;

public class Collectionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arraylist
		String[] arr= new String[3];
		arr[0]="add";
		
		//add(insertion order maintain),duplicate values
		ArrayList<String>  str = new ArrayList<String>();
		str.add("testone");
		str.add("testtwo");
		str.add("testthree");
		str.add(1,"testtwo");
		
		
		str.get(2);//random access
		//retrieve
		for(String s:str) {
			System.out.println(s);
				}
		
		
		
		//non,synchronised
		//objects
		ArrayList<Integer> sas= new ArrayList<Integer>();
		sas.add(2);
		
		String s=null;
		int a=0;
		
		//insertion order-no, unique values
		HashSet<String> hset= new HashSet<String>();
		hset.add("onetest");
		hset.add("twotest");
		hset.add("threetest");
		hset.add("threetest");
		hset.add(null);
	
		
		
		for(String sa:hset) {
			System.out.println(sa);
		}
		
		//chinna---
		
		
		
	}

}
