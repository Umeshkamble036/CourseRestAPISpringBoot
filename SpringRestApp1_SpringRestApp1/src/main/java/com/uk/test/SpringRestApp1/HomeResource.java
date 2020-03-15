package com.uk.test.SpringRestApp1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@RequestMapping("/")
	private String homePage() {
		return "Hi This is a home page.";
	}
}
