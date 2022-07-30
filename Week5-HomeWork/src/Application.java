
public class Application {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger("Joseph");
		logger.Log();
		logger.Error();
		
		Logger spaced = new SpacedLogger("Hello");
		spaced.Log();
		spaced.Error();
		

	}

}
