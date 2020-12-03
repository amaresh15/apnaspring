package com.example.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.service.RootService;

@RestController
public class RootController {
	
	@Autowired
	RootService service;
	
	@RequestMapping("/")
	public String root() {
		System.out.println("Me yaha hoo");
		return service.root();
	}

}
