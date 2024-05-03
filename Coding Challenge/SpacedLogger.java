package week5Challenge;

public class SpacedLogger implements Logger {

	@Override
	//creates a method that generates a log message.
	public void log(String log) {
		//loops the log message to input a space between each character
		for (int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}
	}

	@Override
	//creates a method that generates an error message.
	public void error(String error) {
		//Moves down a line then prints ERROR: before printing the rest of the message.
		System.out.print("\n" + "ERROR: ");
		//Loops the error message to input a space between each character.
		for (int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i) + " ");
		}
		
	}

}
