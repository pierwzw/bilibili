package com.sf.service.impl;

import com.sf.dao.QueryMapper;
import com.sf.entity.UserEntity;
import com.sf.service.Addservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Addserviceimpl implements Addservice {

	@Autowired
	private QueryMapper queryMapper;

	
	@Override
	public boolean login() {
		/*int num=login.login("1", "1");
		if(num>0){
			return true;
		}
		return false;*/
		UserEntity user = queryMapper.queryUserByUserNameAndPassWord("1", "1");
		if (user != null){
			return true;
		}
		return false;
	}

}
