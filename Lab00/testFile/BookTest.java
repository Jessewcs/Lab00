/******
 * Name: Jesse Wojtanowicz
 * Assignment: 5004 Lab 0: Getting Started
 * 1/14/24
 * Notes: Book test
 ******/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Book class.
 */
public class BookTest {
	
	private Book myBook;
	private Person john;
	
	@Before
	public void setUp() {
		
		// Initiate myBook Object
		myBook = new Book("Dracula", john, 19.99f);
	}
	
	// Test getters
	@Test
	public void testTitle() {
		assertEquals("Dracula", myBook.getTitle());
	}
	
	@Test
	public void testPrice() {
		assertEquals(19.99f, myBook.getPrice(), 0.01f);
	}
	
	@Test 
	public void testAuthor() {
		assertEquals(john, myBook.getAuthor());
	}
}
