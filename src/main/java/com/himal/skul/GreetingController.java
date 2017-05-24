package com.himal.skul;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	GreetingService greetingService;
	
    @RequestMapping("/greeting")
    public List<Greeting> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingService.getAllGreeting();
    }
    
    @RequestMapping(value="/greeting",method = RequestMethod.POST)
    public Greeting saveGreeting(@RequestBody Greeting greeting ){
//    	
//    	Greeting greeting = new Greeting();
//    	greeting.setContent("Hello, Achyut");
    	return greetingService.saveGreeting(greeting);
    }
}
