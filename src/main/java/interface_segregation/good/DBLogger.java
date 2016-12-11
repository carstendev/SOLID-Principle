package interface_segregation.good;

/**
 * Logger implementation thats provides database based logging.
 * 
 * @author Carsten
 *
 */
public class DBLogger implements Logger, DBConnectionHandler {

	@Override
	public void openConnection() {
		// open connection
	}

	@Override
	public void closeConnection() {
		// close connection
	}

	@Override
	public void log(String logMessage) {
		// log to db
	}

}
