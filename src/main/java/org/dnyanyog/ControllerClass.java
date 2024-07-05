package org.dnyanyog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/")
	public String hello() {
		return "Hello Students!!";
	}
	
	@GetMapping("/hello")
	public String helloStudents() {
		return "Hello Students from path /hello";
	}
	
	@PostMapping("/hello")
	public String helloForPost(@RequestBody String data) {
		return "Server: Receive data from you => "+data;
	}
}
