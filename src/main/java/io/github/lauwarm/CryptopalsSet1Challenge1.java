package io.github.lauwarm;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

public class CryptopalsSet1Challenge1 {

	public CryptopalsSet1Challenge1() {
		
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
