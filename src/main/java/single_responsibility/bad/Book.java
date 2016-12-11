package single_responsibility.bad;

public class Book {

	public String getTitle() {
		return "title";
	}

	public String getAuthor() {
		return "John Doe";
	}

	public void turnPage() {
		// point to next page
	}

	/**
	 * Violates the single responsibility principle. Presentation logic should not be mixed with business-logic.
	 */
	public void printCurrentPage() {
		// print page
	}

}
