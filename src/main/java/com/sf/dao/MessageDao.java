package com.sf.dao;

import com.sf.entity.ForumEntity;
import com.sf.entity.ForumReplyEntity;
import com.sf.entity.MessageEntity;
import com.sf.entity.ShoppingCart;

public interface MessageDao {
	/**
	 * 	直接保存用户留言信息到留言表
	 * @param message
	 * @return
	 */
	public int message(MessageEntity message);
	
	
	
	public int Shoppingcart(ShoppingCart shoppingCart);
	
	
	/**
	 * 直接保存论坛帖子
	 * @param forument
	 * @return
	 */
	public int forumfuck(ForumEntity forument);
	
	/**
	 * 直接保存回复的帖子内容
	 * @param forumreply
	 * @return
	 */
	public int forumreply(ForumReplyEntity forumreply);

	
}
