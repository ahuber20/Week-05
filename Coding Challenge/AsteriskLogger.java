package week5Challenge;

public class AsteriskLogger implements Logger{

	@Override
	//creates method that generates a log message.
	public void log(String log) {
		//gives the length of the log an int to give ease of access to the length.
		int l = log.length();
		//prints a line before the first set of asterisks appears
		System.out.println("\n");
		//prints an amount of asterisks equal to the length of the message plus 6 to give enough space to border the message in.
		for (int i = -6; i < l; i++) {
			System.out.print("*");
		}
		//prints a new line with 3 asterisks at the front for a border
		System.out.print("\n" + "***");
		//prints the log message
		System.out.print(log);
		//prints 3 more asterisks with a line placed at the end.
		System.out.print("***" + "\n");
		//fills the bottom border with asterisks.
		for (int i = -6; i < l; i++) {
			System.out.print("*");
		}
	}

	@Override
	//creates a method that generates an error message. The error message is bordered in asterisks in the same way that the above message is.
	public void error(String error) {
		
		String er = "ERROR: ";
		
		int e = error.length() + er.length();
		
		System.out.println("\n");
		for (int i = -6; i < e; i++) {
			System.out.print("*");
		}
		System.out.print("\n" + "***" + er);
		System.out.print(error);
		System.out.print("***" + "\n");
		for (int i = -6; i < e; i++) {
			System.out.print("*");
		}
		
	}

}
