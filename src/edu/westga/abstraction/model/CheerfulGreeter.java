package edu.westga.abstraction.model;

/**
 * CheerfulGreeter issues positive greeting and farewell messages.
 * 
 * @author RJ Hill
 *
 */
public class CheerfulGreeter extends Greeter {
	
	public static final String C_GREETING = "!! How have you been? It's so great to see you!";
	/**
	 * Creates a new CheerfulGreeter object that will use the
	 * given name in greetings and farewells.
	 * <p>
	 * Requires: aName != null
	 * <p>
	 * Ensures: getName == aName
	 * 
	 * @param aName	the name to use
	 */
	public CheerfulGreeter(String aName) {
		super(aName);
	}
	
	/**
	 * Returns a cheerful acknowledgment message.
	 * <p>
	 * Requires: nothing
	 * 
	 * @return	the farewell
	 */

	public String getAcknowledgment() {
		return this.getName() + C_GREETING;
	}
}
