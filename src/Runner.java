import java.util.Scanner;

/**
 * @author Drew Rife
 * 
 * A Runner that runs the state machine by getting the user input
 */
public class Runner {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number :");
		String input = scanner.nextLine();
		
		ConvertingMachine convertingMachine = new ConvertingMachine();
		System.out.println(convertingMachine.parse(input));
	}
}
