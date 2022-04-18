package Class;

public class Drawsun implements DrawingAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Drawsun sun = new Drawsun ();
     sun.pen();
     sun.pencil();
     sun.sketch();
     	
		
	}

	@Override
	public void pencil() {
		// TODO Auto-generated method stub
		
		System.out.println("draw using pencil");
		
	}

	@Override
	public void pen() {
		// TODO Auto-generated method stub
		System.out.println("draw using pen"); 
		
	}

	@Override
	public void sketch() {
		// TODO Auto-generated method stub
		System.out.println("draw using sketch");  
	}

	
	
}
