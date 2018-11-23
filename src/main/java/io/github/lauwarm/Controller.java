package io.github.lauwarm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    
    @GetMapping("/error")
    public String error() {
    	return "error";
    }

}