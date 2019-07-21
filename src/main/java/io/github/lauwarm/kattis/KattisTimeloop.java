package io.github.lauwarm.kattis;

public class KattisTimeloop {
	
	private final String input;
	private final String output;
	
	public KattisTimeloop(String input, String output) {
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
		StringBuilder sb = new StringBuilder();
		int b = Integer.parseInt(input);

		for (int a = 0; a < b; a++) {
			sb.append(a+1 + " Abracadabra ");
		}
		
		return sb.toString();
	}

}
