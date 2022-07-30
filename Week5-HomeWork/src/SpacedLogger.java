
 class SpacedLogger implements Logger {
	
	private String inputString;
	
	public SpacedLogger(String inputString) {
		this.inputString = inputString;
	}

	@Override
	public void Log() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < inputString.length(); i++) {
			builder.append(inputString.charAt(i));
			builder.append(" ");
		}
		System.out.println(builder);
	}

	@Override
	public void Error() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < inputString.length(); i++) {
			builder.append(inputString.charAt(i));
			builder.append(" ");
		}
		System.out.println("ERROR " + builder);
		
	}
	
	
	
}
