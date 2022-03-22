import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Author {
	// Write Your Code Here..
	String firstName;
	String lastName;

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void getLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}
}

class Book {
	// Write Your Code Here..
	String author;
	String title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + title + '\'' + ", author=" + author + '}';
	}
}

class BookImplementation {
	// Write Your Code Here..
	Author a;

	public List<String> firstNameOfAuthors(Author... authors) {
		List<String> firstList = new ArrayList<String>();
		String s = a.getFirstName();
		firstList = firstNameOfAuthors(authors).stream().map(x -> )
				return firstList;

	}

	public List<String> titlesOf(Book... books) {
		return null;
	}
}

public class streamprac1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Author jB = new Author("j", "B");
		Author bG = new Author("b", "G");
		Author bB = new Author("b", "B");
		BookImplementation bookImplementation = new BookImplementation();
		System.out.println(bookImplementation.firstNameOfAuthors(jB, bG, bB));

	}
}

/* Enter your code here. Read input from STDIN. Print output to STDOUT */
