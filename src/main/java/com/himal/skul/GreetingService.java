package com.himal.skul;

import java.util.List;

public interface GreetingService {

	public List<Greeting> getAllGreeting();

	public Greeting saveGreeting(Greeting greeting);
}
