package interface_segregation.bad;

/**
 * Violates the Interface Segregation Principle.
 * 
 * @author Carsten
 *
 */
public interface BadLogger {

	public void log(String logMessage);

	public void openConnection();

	public void closeConnection();

}
