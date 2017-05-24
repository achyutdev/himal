package com.himal.skul;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	@Autowired
	GreetingRepository greetingRepository;
	
	public List<Greeting> getAllGreeting(){
		
		return (List<Greeting>) greetingRepository.findAll();
	}

	@Override
	public Greeting saveGreeting(Greeting greeting) {
		
		return greetingRepository.save(greeting);
	}
}
