package com.sf.dao;

import com.sf.entity.*;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther zhongweiwu
 * @Date 2018/5/31 20:28
 */
public interface UpdateMapper {
    void updateRMB(@Param("userName") String userName, @Param("updateRMB") String updateRMB);
    void insertOrderTable(OrderTableEntity OrderTableEntity);
    void changeOrderStatus(@Param("orderId") String orderId, @Param("orderStat") String orderStat);
    void insertMessage(MessageEntity MessageEntity);
    void insertShoppingCart(ShoppingCart shoppingCart);
    void insertForum(ForumEntity ForumEntity);
    void insertForumReply(ForumReplyEntity ForumReplyEntity);
    void registerUser(UserEntity user);
    void updatePassword(@Param("userName") String userName, @Param("passWord") String passWord);
    void updateEmail(@Param("userName") String userName, @Param("userEmail") String userEmail);
    void updatePhone(@Param("userName") String userName, @Param("userPhone") String userPhone);
    void updatePayPassword(@Param("userName") String userName, @Param("userPayPassword") String userPaypassword);
    void updateUserHand(@Param("userName") String userName,@Param("userHand") String userHand);
    void updateUserInfo(UserEntity user);
    void updateUserPartInfo(UserEntity user);
    void deleteShoppingCart(String cardId);


}
