package notYourAverageProgram;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		calculations(scan);
	}
	public static void calculations(Scanner scan) {
		int numTests = (askInt("If known, enter the amount of tests completed this semester, if not, enter 0", scan));
		if(numTests == 0) {
			//ask for all values, while loop with break for special case. error message if weird percent
		} else if(numTests>0) {
			//divide numTest many values by numTest
		} else {
			System.out.println("Invalid number, restart program.");
		}
	}
	public static int askInt(String question, Scanner scan){
		say(question, scan);
		return scan.nextInt();
	}
	public static void say(String statement, Scanner scan) {
		System.out.println(statement);
	}
}
