package com.katademo.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author : Satheeshkumar
 * @date : 26-04-2023
 *
 */
public class FizzBuzzTest {

	@Test
	public void testFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.convert(1));
		assertEquals("2", fizzBuzz.convert(2));
		assertEquals("3", fizzBuzz.convert(3));
	}
}
