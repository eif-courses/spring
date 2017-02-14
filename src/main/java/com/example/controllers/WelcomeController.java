package com.example.controllers;

import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {


	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		return "index";
	}

}