package com.chenxx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {

	@Autowired
	Z  y;

	public void sayHi(){
		y.hello();
	}




}
