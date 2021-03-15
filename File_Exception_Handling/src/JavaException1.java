import java.io.*;
import java.io.File;
import java.io.FileInputStream;


public class JavaException1 {
	
	public static void findFile() throws IOException{
		
		File f1 = new File("Karnan1.txt");
		FileInputStream s1 = new FileInputStream(f1);
	}
      
	
	public static void main(String args[]) {
		
		try {
			findFile();
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
