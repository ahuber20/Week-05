package week5Challenge;

public class LogApplication {

	public static void main(String[] args) {
		
		Logger logger = new SpacedLogger();
		Logger logger2 = new AsteriskLogger();
		
		logger.log("Hello!");
		logger.error("This is an Error");
		
		logger2.log("Aye mate");
		logger2.error("Thats no good");
		
		

	}

}
