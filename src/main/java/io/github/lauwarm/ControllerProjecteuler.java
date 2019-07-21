package io.github.lauwarm;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.lauwarm.projecteuler.*;

@RestController
public class ControllerProjecteuler {
    
    @GetMapping(value = {"/projecteuler_1", "/projecteuler_1/{input}"})
    public Projecteuler1 projecteuler1(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler1(input.get(), Projecteuler1.solution(input.get()));
    	} else {
    		return new Projecteuler1("1000", Projecteuler1.solution("1000"));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_2", "/projecteuler_2/{input}"})
    public Projecteuler2 projecteuler2(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler2(input.get(), Projecteuler2.solution(input.get()));
    	} else {
    		return new Projecteuler2("", Projecteuler2.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_3", "/projecteuler_3/{input}"})
    public Projecteuler3 projecteuler3(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler3(input.get(), Projecteuler3.solution(input.get()));
    	} else {
    		return new Projecteuler3("", Projecteuler3.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_4", "/projecteuler_4/{input}"})
    public Projecteuler4 projecteuler4(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler4(input.get(), Projecteuler4.solution(input.get()));
    	} else {
    		return new Projecteuler4("", Projecteuler4.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_5", "/projecteuler_5/{input}"})
    public Projecteuler5 projecteuler5(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler5(input.get(), Projecteuler5.solution(input.get()));
    	} else {
    		return new Projecteuler5("", Projecteuler5.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_6", "/projecteuler_6/{input}"})
    public Projecteuler6 projecteuler6(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler6(input.get(), Projecteuler6.solution(input.get()));
    	} else {
    		return new Projecteuler6("", Projecteuler6.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_7", "/projecteuler_7/{input}"})
    public Projecteuler7 projecteuler7(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler7(input.get(), Projecteuler7.solution(input.get()));
    	} else {
    		return new Projecteuler7("", Projecteuler7.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_8", "/projecteuler_8/{input}"})
    public Projecteuler8 projecteuler8(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler8(input.get(), Projecteuler8.solution(input.get()));
    	} else {
    		return new Projecteuler8("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450", Projecteuler8.solution("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_9", "/projecteuler_9/{input}"})
    public Projecteuler9 projecteuler9(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler9(input.get(), Projecteuler9.solution(input.get()));
    	} else {
    		return new Projecteuler9("", Projecteuler9.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_10", "/projecteuler_10/{input}"})
    public Projecteuler10 projecteuler10(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler10(input.get(), Projecteuler10.solution(input.get()));
    	} else {
    		return new Projecteuler10("", Projecteuler10.solution(""));
    	}
    }
    
    @GetMapping(value = {"/projecteuler_11", "/projecteuler_11/{input}"})
    public Projecteuler11 projecteuler11(@PathVariable Optional <String> input) {
    	if (input.isPresent()) {
    		return new Projecteuler11(input.get(), Projecteuler11.solution(input.get()));
    	} else {
    		return new Projecteuler11("", Projecteuler11.solution(""));
    	}
    }
    
}
