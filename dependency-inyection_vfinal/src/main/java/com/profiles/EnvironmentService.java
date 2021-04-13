package com.profiles;

import org.springframework.stereotype.Component;

@Component
public interface EnvironmentService {
	public String getEnvironment();
	
}
