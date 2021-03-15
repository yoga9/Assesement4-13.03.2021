import java.io.File;
public class DeleteFile {
	
	public static void main(String[] args) {
		
		File obj = new File("Yoga.txt");
		
		if(obj.delete()) {
			System.out.println("File has been deleted Successfully:" +obj.getName());
			
		}
		else {
			System.out.println("Error");
		}
	}

}
