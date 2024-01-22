/******
 * Name: Jesse Wojtanowicz
 * Assignment: 5004 Lab 0: Getting Started
 * 1/14/24
 * Notes: Person test
 ******/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;

  @Before
  public void setUp() {
	  
	// Initiate Person object
    john = new Person("john", "doe", 1989);
  }

  @Test
  public void testFirst() {
    assertEquals("john", john.getFirstName());

  }

  @Test
  public void testSecond() {
    assertEquals("doe", john.getLastName());
  }

  @Test
  public void testYearOfBirth() {
    assertEquals(1989, john.getYearOfBirth());
  }

}
