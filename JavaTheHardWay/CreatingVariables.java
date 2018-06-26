public class CreatingVariables {
	public static void main (String[] args) {
		int x, y, age, weight;
		double seconds, e, checking, scale;
		String firstname, lastname, title, shop, car;

		x = 10;
		y = 400;
		age = 39;
		weight = 220;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		scale = 3.93;

		firstname = "Graham";
		lastname = "Mitchell";
		title = "Mr.";
		shop = "Costco";
		car = "Ford Pinto";

		System.out.println( "The variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y.");
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " +e);
		System.out.println( "Hopefully you have more than $" + checking + "!");
		System.out.println( "My name's " + title + " " + firstname + " " + lastname + "." );
		System.out.println( "I, " + title + " " + lastname + " weigh " + weight + " pounds.");
		System.out.println ( "I ate " + scale + " grams of chicken for dinner from " + shop + ".");
		System.out.println ( "I Drove in my " + car + " to get it." );

	}
}
