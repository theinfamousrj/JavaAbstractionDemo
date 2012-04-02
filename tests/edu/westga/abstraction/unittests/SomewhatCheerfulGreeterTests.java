package edu.westga.abstraction.unittests;

import org.junit.Before;

import edu.westga.abstraction.model.SomewhatCheerfulGreeter;

/**
 * Unit test class for SomewhatCheerfulGreeter.
 * 
 * @author CS 3211, Spring 2009
 *
 */
public class SomewhatCheerfulGreeterTests extends GreeterTests {

	private SomewhatCheerfulGreeter theSomewhatCheerfulGreeter;
	
	@Override
	@Before
	public void setUp() throws Exception {
		this.theSomewhatCheerfulGreeter = new SomewhatCheerfulGreeter(THE_NAME);
		this.setGreeter(theSomewhatCheerfulGreeter);
	}
}
