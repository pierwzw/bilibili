package com.sf.service;

import com.sf.entity.ShoppingCart;
import com.sf.entity.ForumEntity;
import com.sf.entity.ForumReplyEntity;
import com.sf.entity.MessageEntity;

public interface MessageService {
	
	
	
	/**
	 * 	直接保存用户留言信息到留言表
	 * @param message
	 * @return
	 */
	public boolean message(MessageEntity message);
	
	
	/**
	 * 直接保存
	 * @param shoppingCart
	 * @return
	 */
	public boolean Shoppingcart(ShoppingCart shoppingCart);
	
	
	/**
	 * 直接保存论坛帖子
	 * @param forument
	 * @return
	 */
	public boolean forumfuck(ForumEntity forument);
	
	
	
	/**
	 * 直接保存回复的帖子内容
	 * @param forument
	 * @return
	 */
	public boolean forumreply(ForumReplyEntity forumreply);
}
