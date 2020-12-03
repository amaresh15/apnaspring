package com.example.restservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.restservice.model.RootModel;

@Component
public class RootDao {

	@Autowired
	public RootModel rootModel;
}
