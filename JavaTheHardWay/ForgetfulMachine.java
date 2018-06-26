import java.util.Scanner;

public class ForgetfulMachine {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What city is the capital of France?" );
		keyboard.next();

		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		//The 2nd question blows up when i type 91919191

		System.out.println( "Enter a number between 0.0 and 1.0." );
		keyboard.nextDouble();
		//The 3rd question blows up when i type pope because it is a string and not a double.

		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();
	}
}
