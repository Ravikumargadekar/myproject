import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandiling {
//checked exception
public static void main(String [] args) throws FileNotFoundException{
		
		try{
			FileInputStream fis = new FileInputStream("D:/TestFile.txt");			
		}catch (Exception e){
			System.out.println("File Not Found");
		}
			
			FileInputStream fis = new FileInputStream("D:/TestFile.txt");			
			
	}
 
}
	

