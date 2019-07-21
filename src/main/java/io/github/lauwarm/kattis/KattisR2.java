package io.github.lauwarm.kattis;

public class KattisR2 {

	private final String input;
	private final String output;
	
	public KattisR2(String input, String output) {
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
		int s=0, r1=0, r2=0;
		
		r1 = Integer.parseInt(input.split(" ")[0]);
		s = Integer.parseInt(input.split(" ")[1]);
		
		r2 = (s*2)-(r1);
		
		return String.valueOf(r2);
	}

}
