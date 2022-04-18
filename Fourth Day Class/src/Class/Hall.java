package Class;

public class Hall {

	//to create an object to call a method from kitchen
	
	public static void main (String [] args) {
		
		Kitchen kit = new Kitchen();
		
		kit.methodone();
		
		System.out.println(kit.drinks);
		
		kit.snacks="cake";
		
		System.out.println(kit.snacks);
		
		Kitchen.ganesh(); 
				
	}
	
	
	
	
}
