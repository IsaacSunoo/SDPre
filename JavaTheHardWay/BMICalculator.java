import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double ft, in, lb, bmi, pre;

		System.out.print( "Your height in ft: " );
		ft = keyboard.nextInt();

		System.out.print( "Your height in in: " );
		in = keyboard.nextDouble();

		System.out.print( "Your weight in lb: " );
		lb = keyboard.nextDouble();

		pre = ft * 12 + in;
		bmi = lb / (pre*pre) * 703;

		System.out.println ( "Your BMI is " + bmi );
	}
}
