package com.form.db.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.db.entity.FormEntity;
import com.form.db.service.ServiceImpl;

@Controller
public class FormController {
	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping("/create/student/information")
public String foerm1() {
		return "form";
	}
	
	
	@PostMapping("/create/save")
	public String postMethodName( FormEntity formEntity) {
		//TODO: process POST request
		serviceImpl.create(formEntity);
		return "form";
	}


}
