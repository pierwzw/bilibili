package com.sf.service.impl;

import com.sf.dao.QueryMapper;
import com.sf.dao.UpdateMapper;
import com.sf.entity.UserEntity;
import com.sf.service.RegisterService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhongweiwu
 */
@Service
public class RegisterServiceImpl implements RegisterService {

	private static final Logger logger = Logger.getLogger(RegisterServiceImpl.class);

	@Autowired
	private QueryMapper queryMapper;
	@Autowired
	private UpdateMapper updateMapper;
	
	public boolean RegisterService(UserEntity user) {
		/*int num=registerImpl.Register(user);
		if(num>0){
			//注册成功
			return true;
		}
		return false;*/
		try{
			List<UserEntity> userList = queryMapper.queryUserByUserName(user.getUserName());
			if (!userList.isEmpty()){
				logger.info("此用户被注册, username:" + user.getUserName());
			}else{
				updateMapper.registerUser(user);
			}
		}catch (Exception e){
			return false;
		}
		return true;
	}

}
