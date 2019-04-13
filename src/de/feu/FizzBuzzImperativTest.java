package de.feu;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

class FizzBuzzImperativTest {
	private FizzBuzzImperativ testee;

	@Before
	public void setUp() throws Exception {
		testee = new FizzBuzzImperativ();
	}

	@Test
	public void shouldSayFizz() {
		assertThat(testee.determineWord(3), is("Fizz"));
	}

}
