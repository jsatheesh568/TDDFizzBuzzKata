package com.katademo.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author : Satheeshkumar
 * @date : 26-04-2023
 *
 */
public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz = new FizzBuzz(); 

	@Test
    public void shouldReturnNumber() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void shouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
    
    @Test
    public void shouldReturnNumberForOthers() {
        assertEquals("7", fizzBuzz.convert(7));
    }

    @Test
    public void shouldPrintFizzBuzzFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
    
}
