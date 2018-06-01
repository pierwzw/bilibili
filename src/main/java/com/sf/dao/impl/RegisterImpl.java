/*
package com.sf.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sf.dao.RegisterDao;
import com.sf.db.Data_jdbcTemplate;
import com.sf.entity.UserEntity;

@Component
public class RegisterImpl implements RegisterDao {

	@Autowired
	Data_jdbcTemplate jdbcTemplate;
	
	
	
	public int Register(UserEntity user) {
		//默认为0
		int register=0;
		//SELECT count(*) FROM user WHERE userName="admin" and `passWord`="123321aaa";
		//先根据用户名查询
		String sql = "SELECT count(*) FROM user WHERE userName = ?";  
		int num=jdbcTemplate.getJdbcTemplate().queryForObject(sql, new Object[] {user.getUserName()},Integer.class);
			if(num>0){
				System.out.println("此用户被注册");
			}else{
				//开始注册
				String chaxunSql="insert into user(userID,userName,passWord,userPhone,userState,userEmail,userHand,userPaypassword) values(?,?,?,?,?,?,?,?)";
				register=jdbcTemplate.getJdbcTemplate().update(chaxunSql,new Object[]{user.getUserId(),user.getUserName(),user.getPassWord(),user.getUserPhone(),user.getUserState(),user.getuserEmail(),user.getUserHand(),user.getUserPayPassword()});
				
			}
		return register;
	}

}
*/
