package io.github.lauwarm.projecteuler;

public class Projecteuler2 {

	private final String input;
	private final String output;

	public Projecteuler2(String input, String output) {
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
		double a = 1, b = 2, y = 0, z = 2;
		
		while (y < 4000000) {
			y = a+b;
			a = b;
			b = y;
			
			if (y % 2 == 0) {
				z += y;
			}
		}
		
		return Double.toString(z);
	}

}
