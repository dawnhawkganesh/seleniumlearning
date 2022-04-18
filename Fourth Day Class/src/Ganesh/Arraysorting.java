package Ganesh;

import java.util.Arrays;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int [] {-21, 45, 23, 32, 98, -456};
		
		for (int i =0; i <arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					int tmp = 0;
					tmp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = tmp;
				
				}
			}
		
			System.out.println(arr[i]);
		
		}
		
		
		
		
}
}

/*
 0      1     2
-23 -54 -21

numbers[0] = -23

Iteration #1
0 =-23
1 =-54



-23 > -54?

Iteration #2
0 =-23
1 =-53
2 =-21

-53 > -21?

0 = -23
1 = -21
2 = -53

*/