package io.github.lauwarm.projecteuler;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Projecteuler4 {

	private final String input;
	private final String output;

	public Projecteuler4(String input, String output) {
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
		List<Integer> palindromes = new LinkedList<Integer>();
		
		for(int a = 999; a > 0; a--) {
			for(int b = 999; b > 0; b--) {
				if(isPalindrome(a*b)) {
					palindromes.add(a*b);
				}
			}
		}
		
		return Integer.toString((Collections.max(palindromes)));
	}

	public static boolean isPalindrome(int integer) {
	    String intStr = String.valueOf(integer); 
	    return intStr.equals(new StringBuilder(intStr).reverse().toString());
	}

}
