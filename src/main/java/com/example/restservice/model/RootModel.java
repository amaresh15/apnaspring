package com.example.restservice.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RootModel {

	@Value("Hum Papa Hain!")
	public String welcomeMsg;

	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}
}
