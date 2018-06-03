package com.sf.service.impl;

import com.sf.dao.QueryMapper;
import com.sf.dao.UpdateMapper;
import com.sf.entity.OrderTableEntity;
import com.sf.entity.UserEntity;
import com.sf.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,timeout=1,isolation=Isolation.DEFAULT)
public class LoginServiceImpl implements LoginService {


	@Autowired
	private QueryMapper queryMapper;
	@Autowired
	private UpdateMapper updateMapper;
	
	@Override
	public boolean loginuser(String userName, String passWord) {
		/*int num=loginService.login(userName, passWord);
		if(num>0){
			return true;
		}
		return false;*/
		UserEntity user = queryMapper.queryUserByUserNameAndPassWord(userName, passWord);
		if (user != null){
			return true;
		}
		return false;
	}

	@Override
	public boolean paypassword(String userName, String pass) {
		/*int num  =  loginService.paypassword(userName, pass);
		if(num>0){
			return true;
		}
		return false;*/
		UserEntity user = queryMapper.queryUserByUserNameAndPayPassword(userName, pass);
		if (user != null){
			return true;
		}
		return false;
	}

	@Override
	public boolean updateRMB(String userRMB, String userName) {
		/*int num = loginService.updateRMB(userRMB, userName);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.updateRMB(userRMB, userName);
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean ordertable(OrderTableEntity ordertable) {
		/*int num = loginService.ordertable(ordertable);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.insertOrderTable(ordertable);
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Confirmorder(String orderID) {
		/*int num = loginService.Confirmorder(orderID);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			List<OrderTableEntity> orderList = queryMapper.queryOrderTableByOrderIdAndOrderState(orderID, "2");
			if (!orderList.isEmpty()){
				updateMapper.changeOrderStatus(orderID, "4");
			}
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Cancellationoforder(String orderID) {
		/*int num = loginService.Cancellationoforder(orderID);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.changeOrderStatus(orderID, "3");
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean delordertable(String orderID) {
		/*int num = loginService.delordertable(orderID);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.changeOrderStatus(orderID, "5");
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Delivergoods(String orderStat,String orderID) {
		/*int num = loginService.Delivergoods(OrderStat,orderID);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.changeOrderStatus(orderID, orderStat);
		}catch (Exception e){
			return false;
		}
		return true;
	}
}
