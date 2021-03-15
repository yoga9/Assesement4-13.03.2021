
public class NestedTryEx {
        
	public static void main(String[] args) {
		
		try {
			
			try {
			int a = 5/0;
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			try {
				int a[] = new int[5];
			    a[6] = 10;
			}
		   
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		
			
		catch(Exception e) {
			System.out.println(e);
			e.getStackTrace();
		}
			
		
	}}


