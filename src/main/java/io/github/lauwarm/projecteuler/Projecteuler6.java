package io.github.lauwarm.projecteuler;

public class Projecteuler6 {

	private final String input;
	private final String output;

	public Projecteuler6(String input, String output) {
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
		int sumOfSquares = 0, squareOfSums = 0, difference = 0;
		
		for(int a = 1; a <= 100; a++) {
			sumOfSquares += a*a;
		}
		
		for(int a = 1; a <= 100; a++) {
			squareOfSums += a;
		}
		
		difference = squareOfSums*squareOfSums - sumOfSquares;
		
		return Integer.toString(difference);
	}
	
}
