
public class Course {
	
	String courseDepartment;
	int courseNumber;
	double numberOfCredits;
	
	public Course(String courseDepartment, int courseNumber, double numberOfCredits) throws CourseException {
		if(courseDepartment.length() != 3) {
			throw new CourseException(courseDepartment + " does not consist of 3 letters");
		}
		else {
			this.courseDepartment = courseDepartment;
		}
		
		if(courseNumber < 100 || courseNumber > 499) {
			throw new CourseException(courseNumber + " is not between 100 and 499 inclusive");
		}
		else {
			this.courseNumber = courseNumber;
		}
		
		if(numberOfCredits < 0.5 || numberOfCredits > 6) {
			throw new CourseException(numberOfCredits + " is not between 0.5 and 6 inclusive");
		}
		else {
			this.numberOfCredits = numberOfCredits;
		}
	}
	
	public Course() {
		courseDepartment = null;
		courseNumber = 0;
		numberOfCredits = 0.0;
	}
	
	@Override
	public String toString() {
		String str = "Course Department: " + courseDepartment + "\nCourse Number: " + courseNumber + "\nNumber Of Credits: " + numberOfCredits;
		return str;
	}
}
