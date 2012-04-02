package edu.westga.abstraction.model;

/**
 * Greeter issues greeting and farewell messages.
 * 
 * @author RJ Hill
 *
 */
public abstract class Greeter {

	public static final String GREETING = "! Good to see you!";
	public static final String FAREWELL = "Have a good one, ";
	private String name;

	public Greeter(String aName) {
		super();
		this.name = aName;
	}

	/**
	 * Returns a cheerful greeting message.
	 * <p>
	 * Requires: nothing
	 * 
	 * @return	the greeting
	 */
	public String getGreeting() {
		return this.name + GREETING;
	}

	/**
	 * Returns a cheerful farewell message.
	 * <p>
	 * Requires: nothing
	 * 
	 * @return	the farewell
	 */
	public String getFarewell() {
		return FAREWELL + this.name + "!";
	}

	/**
	 * Returns the name used in the greeting and farewell messages.
	 * <p>
	 * Requires: nothing
	 * 
	 * @return	the name 
	 */
	public String getName() {
		return this.name;
	}

}