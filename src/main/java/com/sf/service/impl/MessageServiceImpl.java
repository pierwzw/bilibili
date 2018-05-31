package com.sf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.impl.MessageImpl;
import com.sf.entity.ShoppingCart;
import com.sf.entity.ForumEntity;
import com.sf.entity.ForumReplyEntity;
import com.sf.entity.MessageEntity;
import com.sf.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	MessageImpl messageImpl;
	
	public boolean message(MessageEntity message) {
		int bl = messageImpl.message(message);
			if(bl>0){
				return true;
			}
		return false;
	}

	@Override
	public boolean Shoppingcart(ShoppingCart shoppingCart) {
		int bl = messageImpl.Shoppingcart(shoppingCart);
		if(bl>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean forumfuck(ForumEntity forument) {
		int bl = messageImpl.forumfuck(forument);
		if(bl>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean forumreply(ForumReplyEntity forumreply) {
		int bl = messageImpl.forumreply(forumreply);
		if(bl>0){
			return true;
		}
		return false;
	}

}
