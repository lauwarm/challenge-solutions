package io.github.lauwarm.projecteuler;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Projecteuler1 {
	
	private final String input;
	private final String output;

	public Projecteuler1(String input, String output) {
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
		IntPredicate cond1 = n -> n % 3 == 0;
		IntPredicate cond2 = n -> n % 5 == 0;
			
		return Integer.toString(IntStream.range(1, Integer.parseInt(input)).filter(cond1.or(cond2)).sum());
	}

}
