import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
   
	public static void main(String args[]) {
		
		try {
		File obj = new File("Karnan.txt");
		Scanner toread = new Scanner(obj);
		
		while(toread.hasNextLine()) {
			String content = toread.next();
			System.out.println(content);	
			
		}
		toread.close();
		
}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
}}
	
	