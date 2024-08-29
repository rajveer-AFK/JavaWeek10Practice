import java.util.Scanner;
import java.lang.Math;

public class SqrtException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userNum;
		
		try {
			System.out.println("Enter an integer >> ");
			String userInteger = input.nextLine();
			userNum = Integer.parseInt(userInteger);
		}
		catch(Exception e) {
			System.out.println("Error, must be an integer. Setting to default value of 0");
			userNum = 0;
		}
		
		try {
			if(userNum < 0) {
				throw new ArithmeticException();
			}
			else {
				System.out.println(Math.sqrt(userNum));
			}
		}
		catch(ArithmeticException ae) {
			System.out.println("Error, cannot take the square root of a negative number");
		}
	}
}
