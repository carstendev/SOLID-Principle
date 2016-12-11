package interface_segregation.good;

/**
 * Logger that provides file based logging.
 * 
 * @author Carsten
 *
 */
public class FileLogger implements Logger {

	@Override
	public void log(String logMessage) {
		// log to file
	}

}
