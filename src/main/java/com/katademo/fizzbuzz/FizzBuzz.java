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

	public String convertWithContains(int number) {
		boolean isFizz = (number % 3 == 0) || String.valueOf(number).contains("3");
		boolean isBuzz = (number % 5 == 0) || String.valueOf(number).contains("5");
		if (isFizz && isBuzz) {
			return "FizzBuzzBuzz";
		} else if (isFizz) {
			return "Fizz";
		} else if (isBuzz) {
			return "Buzz";
		} else {
			return String.valueOf(number);
		}
	}
}
