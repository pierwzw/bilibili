package com.sf.dao;

import com.sf.entity.*;
import org.springframework.core.Ordered;

import javax.swing.text.StyledEditorKit;
import java.util.List;

/**
 * @Auther zhongweiwu
 * @Date 2018/5/31 20:27
 */
public interface QueryMapper {
    UserEntity queryUserByUserNameAndPassWord(String userName, String passWord);
    UserEntity queryUserByUserNameAndEmail(String userName, String userEmail);
    UserEntity queryUserByUserNameAndPhone(String userName, String userPhone);
    UserEntity queryUserByUserNameAndPayPassword(String userName, String userPayPassword);
    UserEntity queryUserByUserNameAndUserHand(String userName, String userHand);
    List<UserEntity> queryUserByUserName(String userName);
    List<VideoEntity> queryVideoByCategory(String videoCategory);
    List<VideoEntity> queryVideoLimit(int limit);
    List<MessageEntity> queryMessageByMessagevideoId(String messagevideoId);
    List<UserEntity> queryUserPagination(int startPage);
    List<UserEntity> queryUserByUserMingzi(String userMoHu);
    List<UserEntity> queryUserByPhone(String userPhone);
    List<UserEntity> queryUserByUserId(String userId);
    List<UserEntity> queryUserByUserState(String userState);
    List<VideoEntity> queryVideoPagination(String videoCategory, int startPage, int numPerPage);
    int queryVideoNum();
    List<GridsEntity> queryGrids();
    List<GridsEntity> queryGridsByGridsId(String gridsId);
    List<ShoppingCart> queryShoppingCartByUserName(String userName);
    List<OrderTableEntity> queryOrderTableByUserName(String userName);
    List<OrderTableEntity> queryOrderTable();
    List<OrderTableEntity> queryOrderTableByOrderState(String orderState);
    List<OrderTableEntity> queryOrderTableByOrderIdAndOrderState(String orderId, String orderState);
    int queryOrderTableCount();
    List<ForumEntity> queryForumByForumLiebie(String forumLiebie);
    List<ForumEntity> queryForumByForumId(String forumId);
    int queryUserCount();
    List<ForumReplyEntity> queryForumReplyByForumReplyId(String replyTieziId);

}
