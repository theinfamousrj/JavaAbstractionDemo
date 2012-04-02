package edu.westga.abstraction.unittests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.westga.abstraction.model.Greeter;

public abstract class GreeterTests {

	protected static final String THE_NAME = "Irma";
	private Greeter theGreeter;

	public GreeterTests() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * Test method for 
	 * {@link edu.westga.abstraction.model.
	 * 			CheerfulGreeter#CheerfulGreeter(java.lang.String)}
	 * and 
	 * {@link edu.westga.abstraction.model.CheerfulGreeter#getName()}
	 */
	@Test
	public void shouldGetNameToTHE_NAMEWhenCreated() {
		assertEquals(THE_NAME, this.theGreeter.getName());
	}

	/**
	 * Test method for {@link 
	 * edu.westga.abstraction.model.CheerfulGreeter#getGreeting()}.
	 */
	@Test
	public void shouldGetTHE_NAMEplusGREETINGWhenGetGreeting() {
		assertEquals(THE_NAME + Greeter.GREETING, 
				     this.theGreeter.getGreeting());
	}

	/**
	 * Test method for {@link 
	 * edu.westga.abstraction.model.CheerfulGreeter#getFarewell()}.
	 */
	@Test
	public void shouldGetFAREWELLplusTHE_NAMEWhenGetFarewell() {
		assertEquals(Greeter.FAREWELL + THE_NAME + "!",
				     this.theGreeter.getFarewell());
	}
	
	public void setGreeter(Greeter aGreeter) {
		this.theGreeter = aGreeter;
	}

}