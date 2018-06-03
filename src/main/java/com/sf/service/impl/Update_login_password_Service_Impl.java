package com.sf.service.impl;

import com.sf.dao.QueryMapper;
import com.sf.dao.UpdateMapper;
import com.sf.entity.UserEntity;
import com.sf.service.Update_login_password_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhongweiwu
 */
@Service
//@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,timeout=1,isolation=Isolation.DEFAULT)
public class Update_login_password_Service_Impl implements Update_login_password_Service {


	@Autowired
	private QueryMapper queryMapper;
	@Autowired
	private UpdateMapper updateMapper;
		
	@Override
	public boolean Update_login_password(String userName, String passWord, String newpassWord) {
		/*int num=update_login_password_Impl.Update_login_password(userName, passWord, newpassWord);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			UserEntity user = queryMapper.queryUserByUserNameAndPassWord(userName, passWord);
			if (user != null){
				updateMapper.updatePassword(userName, passWord);
			}
		}catch (Exception e){
			return false;
		}
		return true;
	}
	
	@Override
	public boolean Update_login_Emial(String userName, String email, String newemial) {
		
		/*int num=update_login_password_Impl.Update_login_Emial(userName, email, newemial);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			UserEntity user = queryMapper.queryUserByUserNameAndEmail(userName, email);
			if (user != null){
				updateMapper.updateEmail(userName, newemial);
			}
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Update_login_Phone(String userName, String userPhone, String newuserPhone) {
		/*int num = update_login_password_Impl.Update_login_Phone(userName, userPhone, newuserPhone);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			UserEntity user = queryMapper.queryUserByUserNameAndPhone(userName, userPhone);
			if (user != null){
				updateMapper.updatePhone(userName, userPhone);
			}
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Update_login_payPassword(String userName, String paypassword, String newpaypassword) {
		/*int num = update_login_password_Impl.Update_login_payPassword(userName, paypassword, newpaypassword);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			UserEntity user = queryMapper.queryUserByUserNameAndPayPassword(userName, paypassword);
			if (user != null){
				updateMapper.updatePayPassword(userName, newpaypassword);
			}
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Update_login_hand(String userName, String userHand, String newuserHand) {
		/*int num = update_login_password_Impl.Update_login_hand(userName, userHand, newuserHand);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			UserEntity user = queryMapper.queryUserByUserNameAndUserHand(userName, userHand);
			if (user != null){
				updateMapper.updateUserHand(userName, userHand);
			}
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Update_user(UserEntity user) {
		/*int num = update_login_password_Impl.Update_user(user);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.updateUserInfo(user);
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean Update_Addred(String sessionName, String dizhi, String xingming, String phone) {
			/*int i = update_login_password_Impl.Update_Addred(sessionName, dizhi, xingming, phone);
				if(i>0){
					return true;
				}
		return false;*/
		try{
			UserEntity user = new UserEntity();
			user.setUserMingzi(sessionName);
			user.setUserAddress(dizhi);
			user.setUserName(xingming);
			user.setUserPhone(phone);
			updateMapper.updateUserPartInfo(user);
		}catch (Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean delectcartID(String cartID) {
		/*int num = update_login_password_Impl.delectcartID(cartID);
		if(num>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.deleteShoppingCart(cartID);
		}catch (Exception e){
			return false;
		}
		return true;
	}

}
