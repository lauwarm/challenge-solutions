package io.github.lauwarm;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.lauwarm.cryptopals.*;

@RestController
public class ControllerCryptopals {

    @GetMapping(value = {"/cryptopals_11", "/cryptopals_11/{input}"})
    public CryptopalsSet1Challenge1 cryptopals_0101(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new CryptopalsSet1Challenge1(input.get(), CryptopalsSet1Challenge1.solution(input.get()));
    	} else {
    		return new CryptopalsSet1Challenge1("49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d", CryptopalsSet1Challenge1.solution("49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d"));
    	}	
    }
    
    @GetMapping(value = {"/cryptopals_12", "/cryptopals_12/{input}"})
    public CryptopalsSet1Challenge2 cryptopals_0102(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new CryptopalsSet1Challenge2(input.get(), CryptopalsSet1Challenge2.solution(input.get()));
    	} else {
    		return new CryptopalsSet1Challenge2("", CryptopalsSet1Challenge1.solution(""));
    	}	
    }

}