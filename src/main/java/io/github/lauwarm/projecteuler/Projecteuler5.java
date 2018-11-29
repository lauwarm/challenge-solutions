package io.github.lauwarm.projecteuler;

public class Projecteuler5 {

	private final String input;
	private final String output;

	public Projecteuler5(String input, String output) {
		this.input = input;
		this.output = output;
	}

	public String getInput() {
		return input;
	}
	
	public String getOutput() {
		return output;
	}

	public static String solution(String input) {
		int smallest = 1;
		boolean a = true;
		
		while(a) {
			if(evenlyDivisible(smallest)) {
				a = false;
			}
			smallest += 1;
		}
		
		return Integer.toString(smallest-1);
	}
		
	public static boolean evenlyDivisible(int number) {
		if( (number % 1 == 0) && (number % 2 == 0) && (number % 3 == 0) &&
			(number % 4 == 0) && (number % 5 == 0) && (number % 6 == 0) &&
			(number % 7 == 0) && (number % 8 == 0) && (number % 9 == 0) &&
			(number % 10 == 0) && (number % 11 == 0) && (number % 12 == 0) &&
			(number % 13 == 0) && (number % 14 == 0) && (number % 15 == 0) &&
			(number % 16 == 0) && (number % 17 == 0) &&	(number % 18 == 0) &&
			(number % 19 == 0) && (number % 20 == 0)) {
			return true;
		}
		return false;
	}

}
