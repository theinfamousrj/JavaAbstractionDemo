package edu.westga.abstraction.model;

/**
 * SomewhatCheerfulGreeter issues somewhat positive greeting and farewell messages.
 * 
 * @author RJ Hill
 *
 */
public class SomewhatCheerfulGreeter extends Greeter {

	public static final String SC_GREETING = "Oh, hey ";
	/**
	 * Creates a new SomewhatCheerfulGreeter object that will use the
	 * given name in greetings and farewells.
	 * <p>
	 * Requires: aName != null
	 * <p>
	 * Ensures: getName == aName
	 * 
	 * @param aName	the name to use
	 */
	public SomewhatCheerfulGreeter(String aName) {
		super(aName);
	}
	
	/**
	 * Returns a somewhat cheerful acknowledgment message.
	 * <p>
	 * Requires: nothing
	 * 
	 * @return	the acknowledgment
	 */

	public String getSomewhatCheerfulGreeting() {
		return SC_GREETING + this.getName() + "...";
	}
}
