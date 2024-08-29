import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
		
		int [] studentIdNumbersArray = {5433, 3456, 4356, 7654, 3245, 6544, 6343, 2465};
		char [] studentLetterGrades = new char[8];
		
		for(int student = 0; student < studentIdNumbersArray.length; student++) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("Enter a letter grade for student number " + studentIdNumbersArray[student] + " >> ");
				studentLetterGrades[student] = input.nextLine().toUpperCase().charAt(0);
				if(!isGradeLetterValid(studentLetterGrades[student])) {
					throw new GradeException();
				}
			}
			catch(GradeException ge) {
				System.out.println("Error, input must enter a valid letter grade. Setting to the default grade I");
				studentLetterGrades[student] = 'I';
			}
		}
		
		System.out.println("\nDisplaying all student IDs and grades:\n");
		for(int student = 0; student < studentIdNumbersArray.length; student++) {
			System.out.println("Student ID: " + studentIdNumbersArray[student] + " | Grade: " + studentLetterGrades[student]);
		}
	}
	
	public static boolean isGradeLetterValid(char userLetter) {
		boolean isGradeValid = false;
		
		for(int gradeLetter = 0; gradeLetter < GradeException.validGradeLetterArray.length; gradeLetter++) {
			if(GradeException.validGradeLetterArray[gradeLetter] == userLetter) {
				isGradeValid = true;
				break;
			}
		}
		
		return isGradeValid;
	}
	

}
