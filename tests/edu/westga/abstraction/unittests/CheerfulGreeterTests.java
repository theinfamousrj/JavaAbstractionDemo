package edu.westga.abstraction.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.abstraction.model.CheerfulGreeter;

/**
 * Unit test class for CheerfulGreeter.
 * 
 * @author CS 3211, Spring 2009
 *
 */
public class CheerfulGreeterTests extends GreeterTests {

	private CheerfulGreeter theCheerfulGreeter;
	
	@Override
	@Before
	public void setUp() throws Exception {
		this.theCheerfulGreeter = new CheerfulGreeter(THE_NAME);
		this.setGreeter(theCheerfulGreeter);
	}
	
	/**
	 * Test method for {@link 
	 * edu.westga.abstraction.model.CheerfulGreeter#getFarewell()}.
	 */
	@Test
	public void shouldGetACKNOWLEDGEMENTplusTHE_NAMEWhenGetAcknowledgement() {
		assertEquals(THE_NAME + CheerfulGreeter.C_GREETING,
				     this.theCheerfulGreeter.getAcknowledgment());
	}

}
