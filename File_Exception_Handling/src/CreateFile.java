import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
      
		
	try {
	
	   File f = new File("Yoga.txt");
	
	      if(f.createNewFile()) {
		System.out.println("File created successfully:" +f.getName());
	}
	      else {
		System.out.println("File already exists");
		}
}
		
	catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	
}
}


