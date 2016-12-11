package single_responsibility.good;

public class PlainPrintManager implements PrintManager {

	@Override
	public void print(Book book) {
		// plain text based printing
	}

}
