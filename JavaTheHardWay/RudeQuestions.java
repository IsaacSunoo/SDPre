import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args) {
		String name;
		int age;
		double weight, income, height;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		//If a double or int is entered it does not affect the program.

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		/*If a double is input instead of an integer, the program will blow up,
      because an integer does not contain decimal points.*/

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		//If you enter a string the program will blow up.

		System.out.println( "How tall are you in cm?");
		height = keyboard.nextInt();
		System.out.print( "Your awfully heavy to only be " + height + " cm tall and ");

		System.out.println( weight + "lbs! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		//If a string is entered the program will blow up because it requires numeric input.
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + ".");
	}
}
