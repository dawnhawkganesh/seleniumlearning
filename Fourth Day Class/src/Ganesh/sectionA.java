package Ganesh;

public class sectionA {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
				int i=10;
				
				String sa= String.valueOf(i);
				
				System.out.println(sa);
				
				System.out.println(sa + "+10" + " = 20");
				
				int j=Integer.parseInt(sa);
				
				System.out.println(j);
				
				double da=Double.parseDouble(sa);
				
				System.out.println(da);
				
				System.out.println(da*da);

				System.out.println(da*da+da);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
	}

}
