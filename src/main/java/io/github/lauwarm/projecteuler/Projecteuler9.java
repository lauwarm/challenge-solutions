package io.github.lauwarm.projecteuler;

public class Projecteuler9 {

	private final String input;
	private final String output;

	public Projecteuler9(String input, String output) {
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
		int solution=0;
		boolean sem=true;
		
		int a=1, b=2, c=0, c_tmp=0;
		
		while (sem) {
			c_tmp=a*a+b*b;
			c = (int) Math.sqrt(c_tmp);
			
			if(a<b && b<c) {
				if(a+b+c==1000) {
					if((double) c == Math.sqrt(c_tmp)) {
						solution=a*b*c;
						sem=false;
					}

				}
			}
			
			if(a<b) {
				a++;
			}
			else {
				b++;
				a=1;
			}
			
		}
		
		return Integer.toString(solution);
	}

}
