package com.example.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer 
  extends AbstractSecurityWebApplicationInitializer {
	//Registers the DelegatingFilterProxy to use the springSecurityFilterChain before any other registered Filter
}
