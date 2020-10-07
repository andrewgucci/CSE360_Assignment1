

/**
 * @author Andrew Thomas
 * @version 2.0
 * CSE 360: Assignment 1
 * Javier Gonzalez-Sanchez
 * 10/7/20
 */

package cse360assignment02;


/**
 * public class AddingMachine which will allow integers to be added and subtracted together
 * as well as total and print their resulting values.
 */
public class AddingMachine 
{
	
	private int total;
	private String operationsPerformed;
	
	/**
	 * constructor which creates an AddingMachine object that has methods to print and manipulate a total of integers.
	 */
	public AddingMachine () 
	{
		
		total = 0;
		operationsPerformed = "0";
		
	}
  
	/**
	 * getTotal method which returns the total integer value of all integers added or subtracted.
	 * @return the total of all integers added and or subtracted.
	 */
	public int getTotal () 
	{
		
		return total;
		
	}
  
	/**
	 * add method which adds the integer parameter value to total and update operationsPerformed with the addition performed.
	 * @param value is the integer to be added to total and append to operationsPerformed.
	 */
	public void add (int value) 
	{
		
		total = total + value;
		operationsPerformed = operationsPerformed + " + " + value;
		
	}

	/**
	 * subtract method which subtracts the integer parameter value from total and update operationsPerformed with the subtraction performed.
	 * @param value is the integer to be subtracted from total and appended to operationsPerformed.
	 */
	public void subtract (int value) 
	{
		
		total = total - value;
		operationsPerformed = operationsPerformed + " - " + value;
		
	}

	/**
	 * toString method which returns operationsPerformed containing all the operations performed on the total.
	 * @return operationsPerformed the string containing all subtraction and addition operations performed.
	 */
	public String toString () 
	{
		
		return operationsPerformed;
		
  	}

	/**
	 * clear method which resets or, clears, the values of both total and operationsPerformed to 0.
	 */
	public void clear() 
	{
		
		total = 0;
		operationsPerformed = "0";
		
  	}
	
}

