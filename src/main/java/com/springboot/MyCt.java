package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MySts01")

public class MyCt {
	@GetMapping
	public String returnValue() {
		return " Hi, Welcome to My application";
	}

}
