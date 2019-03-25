package com.onlineclassroom.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.onlineclassroom.account.model.User;
import com.onlineclassroom.account.service.IAccountMgtService;

@RestController
public class AccountMgtController {
	
	 Gson gson=new Gson();
	 
	 @Autowired
	 private IAccountMgtService service;
	
//	===============================User Signup==========================================
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	
	public ResponseEntity<?> updateOnlineSignup(@RequestBody User payload, BindingResult bindingResult)throws Exception{
		
	     System.out.println("=========Rest Service Is Call============");
		
		ResponseEntity<String> responseResult = new ResponseEntity<String>("Good", HttpStatus.OK);
		
		if(bindingResult.hasErrors()) {
			responseResult=new ResponseEntity<String>("Oops Binding Issues",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			System.out.println(new ObjectMapper().writeValueAsString(payload));
				
			service.userSignup(payload);
		 }
		return responseResult;
	  }
	

}
