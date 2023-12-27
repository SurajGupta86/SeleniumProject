package FilesOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesWrite {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to be filled in file: ");
		String name = sc.nextLine();
		sc.close();
		
		//Stream Connectivity
		
		//output stream to select directory
		File file = new File("C:\\Users\\Suraj Gupta\\Documents\\Suraj Gupta Automation Course\\Automation Course\\TextFile\\myText.txt");
		
		//FileWriter fw = new FileWriter(file);  //If we use this command then we cannot upate the texts in existing file it will overwrite the existing texts 
		//output stream to write files, and chaining to previous step
		FileWriter fw = new FileWriter(file, true);  //This command allows to update the texts with existing ones
	
		//Chaining Buffered writer to write in the text file
		BufferedWriter bw = new BufferedWriter(fw);
		
		//String name ="Suru";
		
		String surname ="Singh";
		String para = " Once upon a time there was a king, simba, who is " +
				"taken care by 'Timon' and 'pumba'";
		//int a=6;
		bw.write(name);   //Taking user input and passing it in the file
		bw.newLine();  //creating a new line using method of BufferedWriter
		bw.write(surname);
		bw.newLine();
		bw.write(para);
		bw.newLine();
		//bw.write(a);
		
		//closing the last stream
		bw.close();
		
		//end of the process for our acknowledge
		System.out.println("file has been created");
		
	}

}
