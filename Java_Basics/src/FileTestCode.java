import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileTestCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();    //Creating an object for property class
		FileInputStream fobj = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
		prop.load(fobj);   //load the file into properties class
		
		System.out.println(prop.getProperty("Marks"));   //To call any particular field from the object file
		System.out.println(System.getProperty("user.dir"));  //To get the path of system where the file is located;
	}

}