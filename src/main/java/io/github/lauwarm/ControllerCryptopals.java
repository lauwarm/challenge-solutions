package io.github.lauwarm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCryptopals {
    
    @GetMapping("/cryptopals_11")
    public String cryptopals_0101(@RequestParam(value="input", defaultValue="49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d") String s) {

    	return CryptopalsSet1Challenge1.solution(s);
    }

}