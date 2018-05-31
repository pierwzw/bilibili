package com.sf.dao.impl;

import com.sf.dao.MessageDao;
import com.sf.db.Data_jdbcTemplate;
import com.sf.entity.ForumEntity;
import com.sf.entity.ForumReplyEntity;
import com.sf.entity.MessageEntity;
import com.sf.entity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessageImpl implements MessageDao {

    @Autowired
    Data_jdbcTemplate jdbcTemplate;//得到模板


    public int message(MessageEntity message) {
        //String chaxunSql="insert into user(userID,userName,passWord,userPhone,userState,userEmial,userHand,userPaypassword) values(?,?,?,?,?,?,?,?)";

        String sql = "insert into message(messageID,messagevideoId,"
                + "messageuserID,messageuserName,message,"
                + "messageTime,messageHand) values(?,?,?,?,?,?,?)";
        int num = jdbcTemplate.getJdbcTemplate().update(sql, new Object[]{message.getMessageId(),
                message.getMessagevideoId(), message.getMessageUserId()
                , message.getMessageUserName(),
                message.getMessage(), message.getMessageTime(), message.getMessageHand()});


        return num;
    }


    @Override
    public int Shoppingcart(ShoppingCart shoppingCart) {
        String sql = "insert into shoppingcart(cartID,userName,shoopingID,shoopingName,shoopingImg,shoopingjiage) values (?,?,?,?,?,?)";
        int num = jdbcTemplate.getJdbcTemplate().update(sql, new Object[]{shoppingCart.getCartId(), shoppingCart.getUserName(), shoppingCart.getShoppingId(), shoppingCart.getShoppingName(), shoppingCart.getShoppingImg(), shoppingCart.getShoppingPrice()});
        return num;
    }


    @Override
    public int forumfuck(ForumEntity forument) {
        String sql = "insert into forum(forumID,forumBT,forummessage,forumuserName,forumTime,forumliebie,forumAmount,firumhand) values (?,?,?,?,?,?,?,?)";
        int num = jdbcTemplate.getJdbcTemplate().update(sql, new Object[]{forument.getForumId(), forument.getForumBt(), forument.getForumMessage(), forument.getForumUserName(), forument.getForumTime(), forument.getForumLiebie(), forument.getForumAmount(), forument.getForumHand()});
        return num;
    }


    @Override
    public int forumreply(ForumReplyEntity forumreply) {/*
        public String replyid;//回复ID
		public String replyneirong;//回帖内容
		public String replytime;//回帖时间
		public String replyhand;//回帖人头像
		public String replytieziid;//回复帖子的ID
		*/
        String sql = "insert into forumreply (replyid,replyneirong,replytime,replyhand,replytieziid,replyname) values (?,?,?,?,?,?)";

        int num = jdbcTemplate.getJdbcTemplate().update(sql, new Object[]{forumreply.getReplyId(), forumreply.getReplyContent(), forumreply.getReplyTime(), forumreply.getReplyHand(), forumreply.getReplyTieziId(), forumreply.getReplyName()});
        return num;
    }


}
