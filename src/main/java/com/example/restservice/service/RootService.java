package com.example.restservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.dao.RootDao;

@Service
public class RootService {

	@Autowired
	RootDao rootDao;
	
	public String root() {
		System.out.println("Me service hoo!");
		
		return rootDao.rootModel.welcomeMsg;
	}
}
