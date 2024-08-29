import java.util.Scanner;

public class ThrowCourseException {

	public static void main(String[] args) {
		
		Course[] courseArray = new Course[2];
		String[] courseDepartmentNamesArray = new String[2];
		int[] courseNumbersArray = new int[2];
		double[] courseCreditsArray = new double[2];
		
		Scanner input = new Scanner(System.in);
		for(int field = 0; field < 2; field++) {
			System.out.println("Enter the department name: " );
			courseDepartmentNamesArray[field] = input.nextLine();
			
			boolean isAnInt = false;
			while(isAnInt == false) {
				System.out.println("Enter the course number: ");
				String courseNumber = input.nextLine();
				try {
					courseNumbersArray[field] = Integer.parseInt(courseNumber);
					isAnInt = true;
				}
				catch(NumberFormatException nfe) {
					System.out.println("Invalid input. Must be an int, try again");
				}
			}
			
			boolean isADouble = false;
			while(isADouble == false) {
				System.out.println("Enter the course credits: ");
				String courseCredits = input.nextLine();
				try {
					courseCreditsArray[field] = Double.parseDouble(courseCredits);
					isADouble = true;
				}
				catch(NumberFormatException nfe) {
					System.out.println("Invalid input. Must be a double, try again");
				}
			}
			System.out.println();
		}
		
		for(int course = 0; course < courseArray.length; course++) {
			try {
				courseArray[course] = new Course(courseDepartmentNamesArray[course], courseNumbersArray[course], courseCreditsArray[course]);
			}
			catch(CourseException ce) {
				System.out.println("Error, creating course with default values");
				courseArray[course] = new Course();
			}
		}
		
		for(int course = 0; course < courseArray.length; course++) {
			System.out.println(courseArray[course].toString());
		}

	}

}
