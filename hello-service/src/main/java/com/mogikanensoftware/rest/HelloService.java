package com.mogikanensoftware.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable(name="name",required=true) String name){
		return String.format("Hello, %s.",name);
	}
}
