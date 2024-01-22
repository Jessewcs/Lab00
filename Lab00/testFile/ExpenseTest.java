/******
 * Name: Jesse Wojtanowicz
 * Assignment: 5004 Lab 0: Getting Started
 * 1/14/24
 * Notes: Expense test
 ******/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Expense class.
 */

public class ExpenseTest {
	
	private Expense newExpense;
	
	@Before
	public void setUp() {
		
		// Initiate newExpense object
		newExpense = new Expense("shirt", "clothing", 25.99f);
	}
	
	// Test getters
	@Test
	public void testName() {
		assertEquals("shirt", newExpense.getName());
	}
	
	@Test
	public void testCategory() {
		assertEquals("clothing", newExpense.getCategory());
	}
	
	@Test
	public void testPrice() {
		assertEquals(25.99f, newExpense.getPrice(), 0.01f);
	}
}
