package com.sf.service.impl;

import com.sf.dao.QueryMapper;
import com.sf.dao.UpdateMapper;
import com.sf.entity.*;
import com.sf.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,timeout=1,isolation=Isolation.DEFAULT)
public class UserListServiceImpl implements UserListService {

	@Autowired
	private QueryMapper queryMapper;
	@Autowired
	private UpdateMapper updateMapper;
	
	@Override
	public UserEntity userlist(String userName) {
		//UserEntity user=userListDaoImpl.userlist(userName);
		List<UserEntity> userList = queryMapper.queryUserByUserName(userName);
		return userList.get(0);
	}

	@Override
	public List<VideoEntity> videolist(String videocAtegory) {
		//List<VideoEntity> list=userListDaoImpl.videolist(videocAtegory);
		List<VideoEntity> list = queryMapper.queryVideoByCategory(videocAtegory);
		return list;
	}

	@Override
	public List<VideoEntity> videolistimit7() {
		//List<VideoEntity> list = userListDaoImpl.videolistimit7();
		List<VideoEntity> list = queryMapper.queryVideoLimit(7);
		return list;
	}

	@Override
	public List<VideoEntity> videolistimit5MAD() {
		//List<VideoEntity> list = userListDaoImpl.videolistimit5MAD();
		List<VideoEntity> list = queryMapper.queryVideoLimit(5);
		return list;
	}

	@Override
	public List<MessageEntity> messagelist(String videoId) {
		List<MessageEntity>  list= queryMapper.queryMessageByMessageVideoId(videoId);
		//list=userListDaoImpl.messagelist(videoId);
		return list;
	}

	@Override
	public List<UserEntity> userlistpage(int pageInt) {
		List<UserEntity>  list= queryMapper.queryUserPagination(pageInt);
		//list = userListDaoImpl.userlistpage(pageInt);
		return list;
	}

	@Override
	public List<UserEntity> listmohu(String usermohu) {
		//List<UserEntity> list = userListDaoImpl.listmohu(usermohu);
		List<UserEntity> list = queryMapper.queryUserByUserMingzi(usermohu);
		return list;
	}

	@Override
	public List<UserEntity> userPhone(String userPhone) {
		//List<UserEntity> list = userListDaoImpl.userPhone(userPhone);
		List<UserEntity> list = queryMapper.queryUserByPhone(userPhone);
		return list;
	}

	@Override
	public List<UserEntity> userID(String userID) {
		
		//List<UserEntity> list = userListDaoImpl.userID(userID);
		List<UserEntity> list = queryMapper.queryUserByUserId(userID);
		return list;
	}

	@Override
	public List<UserEntity> xiaoheiwu(String userStat) {
		//List<UserEntity> user=userListDaoImpl.xiaoheiwu(userStat);
		List<UserEntity> list = queryMapper.queryUserByUserState(userStat);
		return list;
	}

	@Override
	public List<VideoEntity> Pagevideolist(String state, int dangqianye,int meiyexianshiduoshaoge) {
		//List<VideoEntity> list = userListDaoImpl.Pagevideolist(state, dangqianye,meiyexianshiduoshaoge);
		List<VideoEntity> list = queryMapper.queryVideoPagination(state, dangqianye, meiyexianshiduoshaoge);
		return list;
	}

	@Override
	public int videocoun(String countvideo) {
		//int num = userListDaoImpl.videocoun(countvideo);
		int num = queryMapper.queryVideoNum();
		return num;
	}

	@Override
	public List<GridsEntity> gridslist() {
		//List<GridsEntity> gridslist = userListDaoImpl.gridslist();
		List<GridsEntity> gridslist = queryMapper.queryGrids();
		return gridslist;
	}

	@Override
	public GridsEntity gridsIDlist(String gridsID) {
		//GridsEntity gridslist = userListDaoImpl.gridsIDlist(gridsID);
		GridsEntity gridsEntity = queryMapper.queryGridsByGridsId(gridsID);
		return gridsEntity;
	}

	@Override
	public List<UserEntity> userlistUserName(String userName) {
		//List<UserEntity> user = userListDaoImpl.userlistUserName(userName);
		List<UserEntity> user = queryMapper.queryUserByUserName(userName);
		return user;
	}

	@Override
	public List<ShoppingCart> shoppingcart(String userName) {
		//List<ShoppingCart> user = userListDaoImpl.shoppingcart(userName);
		List<ShoppingCart> user = queryMapper.queryShoppingCartByUserName(userName);
		return user;
	}

	@Override
	public List<VideoEntity> videolistimit6MAD() {
		//List<VideoEntity> list = userListDaoImpl.videolistimit6MAD();
		List<VideoEntity> list = queryMapper.queryVideoLimit(6);
		return list;
	}

	@Override
	public List<OrderTableEntity> ordertable(String userName) {
		//List<OrderTableEntity> ordertable = userListDaoImpl.ordertable(userName);
		List<OrderTableEntity> ordertable = queryMapper.queryOrderTableByUserName(userName);
		return ordertable;
	}

	@Override
	public List<OrderTableEntity> ordertablelist() {
		//List<OrderTableEntity> ordertable = userListDaoImpl.ordertablelist();
		List<OrderTableEntity> ordertable = queryMapper.queryOrderTable();
		return ordertable;
	}

	@Override
	public List<OrderTableEntity> orderStat(String orderStat) {
		//List<OrderTableEntity> ordertable = userListDaoImpl.orderStat(orderStat);
		List<OrderTableEntity> ordertable = queryMapper.queryOrderTableByOrderState(orderStat);
		return ordertable;
	}

	@Override
	public int countordertable() {
		//int count = userListDaoImpl.countordertable();
		int count = queryMapper.queryOrderTableCount();
		return count;
	}

	@Override
	public List<ForumEntity> forumEnt(String forumliebie) {
	//List<ForumEntity>	forumEnt =  userListDaoImpl.forumEnt(forumliebie);
		List<ForumEntity> forumEnt = queryMapper.queryForumByForumLiebie(forumliebie);
		return forumEnt;
	}

	@Override
	public ForumEntity forumentitymmp(String forumID) {
		//ForumEntity user =	userListDaoImpl.forumentitymmp(forumID);
		ForumEntity forum = queryMapper.queryForumByForumId(forumID);
		return forum;
	}

	@Override
	public int counttable(String tableName) {
		//int num  =  userListDaoImpl.counttable(tableName);
		int num = queryMapper.queryUserCount();
		return num;
	}

	@Override
	public List<ForumReplyEntity> forumreply(String forumreplyID) {
		//List<ForumReplyEntity> forumre =userListDaoImpl.forumreply(forumreplyID);
		List<ForumReplyEntity> forumre = queryMapper.queryForumReplyByForumReplyId(forumreplyID);
		return forumre;
	}


}
