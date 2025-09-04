package com.tnsif.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	@RequestMapping("/hello")
	public String show()
	{
		return "Welcome";
	}

}
