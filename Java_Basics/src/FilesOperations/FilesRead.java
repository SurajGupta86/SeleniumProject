package FilesOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FilesRead {


		public static void main(String[] args) throws IOException {
			int a=1;
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the name to be filled in file: ");
//			String name = sc.nextLine();
//			sc.close();
			String text="";      // Initially taking empty string
			//Stream Connectivity
			File file = new File("C:\\Users\\Suraj Gupta\\Documents\\Suraj Gupta Automation Course\\Automation Course\\TextFile\\myText.txt");
			
			FileReader fr = new FileReader(file);  //This command allows to read the texts from the given file
		
			//Chaining Buffered reader to read the text from the file
			BufferedReader br = new BufferedReader(fr);
			
			String line=null;  //Take a string variable to store the values from text file
			
			for(int i=0; i<10;i++) {
				if(i==8) {          //To print a specific line using for loop condition
					text=br.readLine();         //store the particular line value to the text string
					
				}
				else {
					br.readLine();
				}
			}
			System.out.println(text);
			
			//System.out.println(br.readLine());  //Will print the first line from the file 
			
			//read inside the file
//			while((line=br.readLine())!=null) {
//			
//				System.out.println(line);           //Prints all the line from the file 
//			}
			//Close the stream
			br.close();
			
			System.out.println("File successfully read");
		}

}
