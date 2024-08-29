import java.io.*;
import java.util.Scanner;

public class FilePrinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of the file: ");
		String fileName = input.nextLine();
		File userFile = new File(fileName);
		
		try {
			displayCountedFileLines(userFile);
		}
		catch(FileNotFoundException ex) {
			ex.getMessage();
		}
		finally {
			input.close();
		}
	}
	
	public static void displayCountedFileLines(File file) throws FileNotFoundException {
		Scanner fileToBeRead = new Scanner(file);
		
		int lineNum = 0;
		while(fileToBeRead.hasNext()) {
			lineNum++;
			System.out.println(lineNum + ": " + fileToBeRead.nextLine());
		}
		
		fileToBeRead.close();
	}

}
