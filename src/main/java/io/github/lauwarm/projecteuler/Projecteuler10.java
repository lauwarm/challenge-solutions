package io.github.lauwarm.projecteuler;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedList;

public class Projecteuler10 {

	private final String input;
	private final String output;

	public Projecteuler10(String input, String output) {
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
		double target = 2000000.0;
		
		List<Double> primeNumbers = sieveOfEratosthenes(target);
		
		return Double.toString(primeNumbers.stream().collect(Collectors.summingDouble(Double::doubleValue)));	
	}
	
	public static List<Double> sieveOfEratosthenes(double n) {
		boolean primes[] = new boolean[(int) (n+1)];
		Arrays.fill(primes, true);
		
		for (int p = 2; p*p <= n; p++) {
			if(primes[p]) {
				for(int i = p*2; i <= n; i += p) {
					primes[i] = false;
				}
			}
		}
		
		List<Double> primeNumbers = new LinkedList<>();
		for(int i = 2; i <= n ; i++) {
			if(primes[i]) {
				primeNumbers.add((double) i);
			}
		}
		
		return primeNumbers;
	}

}
