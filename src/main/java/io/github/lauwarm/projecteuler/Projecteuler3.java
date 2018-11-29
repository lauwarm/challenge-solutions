package io.github.lauwarm.projecteuler;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Projecteuler3 {

	private final String input;
	private final String output;

	public Projecteuler3(String input, String output) {
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
		double target = 600851475143.0;
		double target_square = Math.sqrt(target);
		List<Integer> primeNumbers = sieveOfEratosthenes((int) target_square);
		
		for(int a = primeNumbers.size(); a > 0; a--) {
			if(target % primeNumbers.get(a-2) == 0) {
				return Integer.toString(primeNumbers.get(a-2));
			}
		}
		
		return null;
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
