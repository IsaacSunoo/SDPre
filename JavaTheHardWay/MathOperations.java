public class MathOperations {
	public static void main ( String[] args) {
		int a, b, c, d, e, f, g, h, i;
		double x, y, z, j, k;
		String one, two, both, three, four, five, six, seven, all;

		a = 10;
		b = 27;
		h = 88;
    i = 12;
		System.out.println( "a is " + a + ", b is " + b );

		c = a + b;
		System.out.println( "a+b is " + c);
		d = a - b;
		System.out.println( "a-b is " + d );
		e = a+b*3;
		System.out.println( "a+b*3 is " + e);
		f = b / 2;
		System.out.println("b/2 is " + f);
		g = b % 10;
		System.out.println( "b%10 is " + g);

		x = 1.1;
		System.out.println ("\nx is " + x);
		y = x*x;
		System.out.println ("x*x is " + y);
		z = b/2;
		System.out.println( "b/2 is " + z);
		System.out.println();

		j = 3.14*h;
		System.out.println( "3.14*h is " + j);
    k = j/i;
    System.out.println("j/12 is " + k);



		three = "Where";
		four = " are";
		five = " we";
		six = " landing?";
		one= "dog";
		two= "house";
		all= three + four + five + six;
		both= one + two;
		System.out.println( all );
		System.out.println ( both );
	}
}
