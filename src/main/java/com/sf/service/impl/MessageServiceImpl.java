package com.sf.service.impl;

import com.sf.dao.QueryMapper;
import com.sf.dao.UpdateMapper;
import com.sf.entity.ForumEntity;
import com.sf.entity.ForumReplyEntity;
import com.sf.entity.MessageEntity;
import com.sf.entity.ShoppingCart;
import com.sf.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
	

	@Autowired
	private QueryMapper queryMapper;
	@Autowired
	private UpdateMapper updateMapper;
	
	@Override
	public boolean message(MessageEntity message) {
		/*int bl = messageImpl.message(message);
			if(bl>0){
				return true;
			}
		return false;*/
		try{
			updateMapper.insertMessage(message);
		}catch(Exception E){
			return false;
		}
		return true;
	}

	@Override
	public boolean Shoppingcart(ShoppingCart shoppingCart) {
		/*int bl = messageImpl.Shoppingcart(shoppingCart);
		if(bl>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.insertShoppingCart(shoppingCart);
		}catch(Exception E){
			return false;
		}
		return true;
	}

	@Override
	public boolean forumfuck(ForumEntity forument) {
		/*int bl = messageImpl.forumfuck(forument);
		if(bl>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.insertForum(forument);
		}catch(Exception E){
			return false;
		}
		return true;
	}

	@Override
	public boolean forumreply(ForumReplyEntity forumreply) {
		/*int bl = messageImpl.forumreply(forumreply);
		if(bl>0){
			return true;
		}
		return false;*/
		try{
			updateMapper.insertForumReply(forumreply);
		}catch(Exception E){
			return false;
		}
		return true;
	}

}
