package com.katademo.fizzbuzz;

/**
 * @author : Satheeshkumar
 * @date : 26-04-2023
 *
 */

public class FizzBuzz {

	public String convert(int number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(number);
		}
	}
	
}
