package io.github.lauwarm.kattis;

public class KattisTwoStones {

	private final String input;
	private final String output;
	
	public KattisTwoStones(String input, String output) {
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
			
		if(Integer.parseInt(input) % 2 == 0) {
			return "Bob";
		} else {
			return "Alice";
		}
	}
	
}
