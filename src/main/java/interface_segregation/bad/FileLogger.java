package interface_segregation.bad;

public class FileLogger implements BadLogger {

	@Override
	public void log(String logMessage) {
		// log message to file
	}

	@Override
	public void openConnection() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void closeConnection() {
		throw new UnsupportedOperationException();
	}

}
