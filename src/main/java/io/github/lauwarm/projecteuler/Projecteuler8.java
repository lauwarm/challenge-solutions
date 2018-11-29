package io.github.lauwarm.projecteuler;

public class Projecteuler8 {

	private final String input;
	private final String output;

	public Projecteuler8(String input, String output) {
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
		String[] partitions = null;
		String[] validPartitions = null;
		long solution = 1;
		long tmpSolution = 1;
		int partitionLength = 13;
		int counter = 0;
		int b = 0;
				
		partitions = new String[input.length()-partitionLength+1];
		
		for(int a = 0; a <= input.length()-partitionLength; a++) {
			partitions[a] = input.substring(a, a+partitionLength);
			if(partitions[a].indexOf("0") == -1) {
				counter++;
			}
		}

		validPartitions = new String[counter+1];
		
				
		for(int a = 0; a <= input.length()-partitionLength; a++) {
			if(partitions[a].indexOf("0") == -1) {
				validPartitions[b] = partitions[a];
				b++;
			}
		}
		
		for(int a = 0; a < validPartitions.length-1; a++) {
			tmpSolution = 1;
			for(int c = 0; c < validPartitions[a].length(); c++) {
				tmpSolution *= Character.getNumericValue(validPartitions[a].charAt(c));
			}
			if(tmpSolution > solution) {
				solution = tmpSolution;
			}
		}
		
		return Long.toString(solution);
	}

}
