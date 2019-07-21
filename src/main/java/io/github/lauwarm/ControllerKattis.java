package io.github.lauwarm;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.lauwarm.kattis.*;

@RestController
public class ControllerKattis {

    @GetMapping(value = {"/kattis_hello", "/kattis_hello/{input}"})
    public KattisHello kattisHello(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new KattisHello(input.get(), KattisHello.solution(input.get()));
    	} else {
    		return new KattisHello("Hello World!", KattisHello.solution("Hello World!"));
    	}
    }
    
    @GetMapping(value = {"/kattis_twostones", "/kattis_twostones/{input}"})
    public KattisTwoStones kattisTwoStones(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new KattisTwoStones(input.get(), KattisTwoStones.solution(input.get()));
    	} else {
    		return new KattisTwoStones("1", KattisTwoStones.solution("1"));
    	}
    }

    @GetMapping(value = {"/kattis_timeloop", "/kattis_timeloop/{input}"})
    public KattisTimeloop kattisTimeloop(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new KattisTimeloop(input.get(), KattisTimeloop.solution(input.get()));
    	} else {
    		return new KattisTimeloop("1", KattisTimeloop.solution("1"));
    	}
    }
    
    @GetMapping(value = {"/kattis_carrots", "/kattis_carrots/{input}"})
    public KattisCarrots kattisCarrots(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new KattisCarrots(input.get(), KattisCarrots.solution(input.get()));
    	} else {
    		return new KattisCarrots("1 5", KattisCarrots.solution("1 5"));
    	}
    }
    
    @GetMapping(value = {"/kattis_r2", "/kattis_r2/{input}"})
    public KattisR2 kattisR2(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new KattisR2(input.get(), KattisR2.solution(input.get()));
    	} else {
    		return new KattisR2("11 15", KattisR2.solution("11 15"));
    	}
    }
}
