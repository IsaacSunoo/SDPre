import java.util.Scanner;

public class EnterPIN {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password;


		pin = 12345;

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.println("ENTER YOUR PASSWORD: ");
		password = keyboard.next();

		while( ! password.equals("javacoding") ){
			System.out.println("\bINCORRECT PASSWORD. TRY AGAIN.");
			System.out.println("ENTER YOUR PASSWORD: ");
			password = keyboard.next();
		}
		if (password.equals("javacoding"));
		System.out.println("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();


		while ( entry != pin) {
			System.out.println("\bINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS 425.17");
	}
}
