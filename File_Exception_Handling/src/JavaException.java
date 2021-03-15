

public class JavaException {
      
	public static void main(String args[]) {
		 
		try {
			
			//int[] arr = {1,2,3};
			//int a = 5/0;
			//String s = "ABC";
			String s= null;
			
			
			//System.out.println("print the array value:" +arr[7]);
			System.out.println(s.length());
			
		}
		
		
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		
		catch(Exception e) {
		System.out.println("Not printed: " +e);
		
	}
	
		
		finally {
			System.out.println("OK");
		}
	}
}
	

