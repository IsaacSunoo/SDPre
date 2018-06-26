public class PrintingChoicesEscapes {
	public static void main( String[] args ) {
		//This exercise demonstrates escape sequences & comments (like these).
		System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
		System.out.print( "\tLearn Java the \"Hard\" Way! \n" );
		//System.out.frimp( "Learn Java the Hard Way" );
		System.out.print( "Hello\n" ); //This line prints Hello.
		System.out.print( "Jello\by\n" ); //This line prints Jelly.
		/* The quick brown fox jumped over a lazy dog.
			Quick wafting zephyrs vex bold Jim. */
		System.out.println ( "Hard to believe, eh?" );
		System.out.print( "Surprised? /* abcde */ Or what did you expect?\n" );
		System.out.print( "\\ // -=- \\ //\n" );
		System.out.print( "\\\\ \\\\\\ \\\\\\\\" ); // It takes 2 to make 1
		System.out.print( "I hope you understand \"escape sequences\" now. \n" );
		// and comments.
	}
}
/*If a comment is added before println it compiles, but if it is added
between print and ln it does not.*/
