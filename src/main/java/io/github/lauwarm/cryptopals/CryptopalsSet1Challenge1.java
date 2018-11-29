package io.github.lauwarm.cryptopals;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

public class CryptopalsSet1Challenge1 {

	private final String input;
	private final String output;

	public CryptopalsSet1Challenge1(String input, String output) {
		this.input = input;
		this.output = output;
	}
	
	public String getInput() {
		return input;
	}
	
	public String getOutput() {
		return output;
	}
	
	public static String solution(String s) {
    	String hexToString = "";
    	byte[] decodedHex = null;
    	String regex = "^[0-9a-fA-F]+$";
    	
    	if(s.length()%2 != 0) {
    		hexToString = "odd input";
    	} else if(s.matches(regex) == false) {
    		hexToString = "not a valid hex value";
    	} else {
			try {
				decodedHex = Hex.decodeHex(s);
			} catch (DecoderException e) {
				e.printStackTrace();
			}
        	hexToString = Base64.encodeBase64String(decodedHex);
    	}

    	return hexToString;
	}

}
