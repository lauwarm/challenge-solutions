package io.github.lauwarm.kattis;

public class KattisCarrots {

	private final String input;
	private final String output;
	
	public KattisCarrots(String input, String output) {
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

		return input.split(" ")[1];
	}

}
