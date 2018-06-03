package com.sf.service.impl;

import com.sf.dao.QueryMapper;
import com.sf.dao.UpdateMapper;
import com.sf.entity.UserEntity;
import com.sf.service.RegisterService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhongweiwu
 */
@Service
//@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,timeout=1,isolation=Isolation.DEFAULT)
public class RegisterServiceImpl implements RegisterService {

	private static final Logger logger = Logger.getLogger(RegisterServiceImpl.class);

	@Autowired
	private QueryMapper queryMapper;
	@Autowired
	private UpdateMapper updateMapper;
	
	@Override
	public boolean RegisterService(UserEntity user)  {
		/*int num=registerImpl.Register(user);
		if(num>0){
			//注册成功
			return true;
		}
		return false;*/
		/*try{
			List<UserEntity> userList = queryMapper.queryUserByUserName(user.getUserName());
			if (!userList.isEmpty()){
				logger.info("此用户被注册, username:" + user.getUserName());
				return false;
			}else{
				updateMapper.registerUser(user);
			}
		}catch (Exception e){
			return false;
		}
		return true;*/
			updateMapper.registerUser(user);
			List<UserEntity> userList = queryMapper.queryUserByUserName(user.getUserName());
			if (!userList.isEmpty()){
				logger.info("此用户被注册, username:" + user.getUserName());
				throw new RuntimeException("test");
			}else{
				updateMapper.registerUser(user);
			}
		return false;
	}

}
