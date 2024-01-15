/******
 * Name: Jesse Wojtanowicz
 * Assignment: 5004 Lab 0: Getting Started
 * 1/14/24
 * Notes: Expense class
 ******/
package CS5004;
/**
 * This class represents an expense. The expense has a name, category, and expense price.
 */
public class Expense {
	private String name;
	private String category;
	private float price;
	
	/**
	 * 
	 * @param name the name of the expense
	 * @param category the category of the expense
	 * @param price the price of the expense
	 */
	
	public Expense(String name, String category, float price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	/**
	 * Return the expense name
	 * @return expense name
	 */

	public String getName() {
		return this.name;
	}
	
	/**
	 * Return the expense category 
	 * @return the expense category
	 */
	
	public String getCategory() {
		return this.category;
	}
	
	/**
	 * Return the expense price
	 * @return the expense price
	 */
	
	public float getPrice() {
		return this.price;
	}
}
