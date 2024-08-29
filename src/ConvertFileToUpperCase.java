import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConvertFileToUpperCase {

	public static void main(String[] args) {
		
		String fileToConvertName = JOptionPane.showInputDialog(null, "Enter the name of the file you want to convert to uppercase");
		File fileToConvert = new File(fileToConvertName);
		
		String conversionOutputFileName = JOptionPane.showInputDialog(null, "Enter the name of the file to store the uppercase conversion to") + ".txt";
		File conversionOutputFile = new File(conversionOutputFileName);
		
		try {
			convertFileToUppercase(fileToConvert, conversionOutputFile);
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static void convertFileToUppercase(File inputFile, File outputFile) throws IOException {
		// Opens the file to convert to upper case for reading
		Scanner fileToConvert = new Scanner(inputFile);
		// Opens the file that will store the upper case conversion for writing
		PrintWriter upperCaseFile = new PrintWriter(outputFile);
		
		while(fileToConvert.hasNext()) {
			String upperCaseLine = fileToConvert.nextLine().toUpperCase();
			upperCaseFile.println(upperCaseLine);
		}
		JOptionPane.showMessageDialog(null, "File converted to uppercase");
		// Closing the files
		fileToConvert.close();
		upperCaseFile.close();
	}
	
}
