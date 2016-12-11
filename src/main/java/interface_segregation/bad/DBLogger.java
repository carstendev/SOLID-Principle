/**
 * 
 */
package interface_segregation.bad;

/**
 * @author Carsten
 *
 */
public class DBLogger implements BadLogger {

	@Override
	public void log(String logMessage) {
		// log the message

	}

	@Override
	public void openConnection() {
		// Open db connection
	}

	@Override
	public void closeConnection() {
		// Close db connection
	}

}
