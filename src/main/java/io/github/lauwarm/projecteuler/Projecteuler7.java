package io.github.lauwarm.projecteuler;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Projecteuler7 {

	private final String input;
	private final String output;

	public Projecteuler7(String input, String output) {
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
		List<Integer> temp;

		temp = sieveOfEratosthenes(2000000);

		return Integer.toString(temp.get(10000));
	}
	
	public static List<Integer> sieveOfEratosthenes(int n) {
		boolean primes[] = new boolean[n+1];
		Arrays.fill(primes, true);
		
		for (int p = 2; p*p <= n; p++) {
			if(primes[p]) {
				for(int i = p*2; i <= n; i += p) {
					primes[i] = false;
				}
			}
		}
		
		List<Integer> primeNumbers = new LinkedList<>();
		for(int i = 2; i <= n ; i++) {
			if(primes[i]) {
				primeNumbers.add(i);
			}
		}
		
		return primeNumbers;
	}

}
