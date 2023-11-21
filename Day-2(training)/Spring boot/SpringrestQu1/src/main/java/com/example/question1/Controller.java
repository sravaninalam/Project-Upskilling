package com.example.question1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
		@RequestMapping("/hello")
		public String sayHi() {
			return "<h1> Hi World</h1>";
		}
	}

