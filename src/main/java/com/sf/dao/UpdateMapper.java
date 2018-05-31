package com.sf.dao;

import com.sf.entity.*;

/**
 * @Auther zhongweiwu
 * @Date 2018/5/31 20:28
 */
public interface UpdateMapper {
    void updateRMB(String userName, String updateRMB);
    void insertOrderTable(OrderTableEntity OrdertableEntity);
    void changeOrderStatus(int orderId, int orderStat);
    void insertMessage(MessageEntity messageEntity);
    void insertShoppingCart(ShoppingCart shoppingCart);
    void insertForum(ForumEntity forumEntity);
    void insertForumReply(ForumReplyEntity forumreplyEntity);
    void registerUser(UserEntity user);
    void updatePassword(String userName, String passWord);
    void updateEmail(String userName, String userEmail);
    void updatePhone(String userName, String userPhone);
    void updatePayPassword(String userName, String userPaypassword);
    void updateUserHand(String userName, String userHand);
    void updateUserInfo(UserEntity user);
    void updateUserPartInfo(UserEntity user);
    void deleteShoppingCart(int cardId);


}
