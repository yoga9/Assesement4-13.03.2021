import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args) {
		
		try {
			
		FileWriter towrite = new FileWriter("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assesement4\\FileHandling\\Karnan.txt");
		towrite.write("Hi I'm Karnan :)");
		towrite.close();
		System.out.println("File Written Successfully");
		}
		
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		}
	}


