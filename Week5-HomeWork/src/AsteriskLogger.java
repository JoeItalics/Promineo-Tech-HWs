
class AsteriskLogger implements Logger {
	
	private String inputString;
	
	public AsteriskLogger(String inputString) {
		this.inputString = inputString;
		
	}
	
	@Override
	public void Log() {
		// TODO Auto-generated method stub
		System.out.println("***" + inputString + "***");
	}

	@Override
	public void Error() {
		// TODO Auto-generated method stub
		System.out.println("****************");
		System.out.println("***"+"ERROR: " + inputString + "***");
		System.out.println("****************");
	}

}
