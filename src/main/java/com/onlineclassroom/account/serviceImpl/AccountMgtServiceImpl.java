package com.onlineclassroom.account.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclassroom.account.dao.IAccountMgtDao;
import com.onlineclassroom.account.model.User;

import com.onlineclassroom.account.service.IAccountMgtService;

@Service
public class AccountMgtServiceImpl implements IAccountMgtService {
	
	@Autowired
	private IAccountMgtDao accDao;

	@Override
	public void userSignup(User payload) {
		
		accDao.userSignup(payload);	
	}
	
   
}
