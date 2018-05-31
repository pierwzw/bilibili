package com.sf.entity;

//帖子实体表
public class ForumEntity {
	public String forumId;//文章ID
	public String forumBt;//文章标题
	public String forumMessage;//文章内容
	public String forumUserName;//发布人名字
	public String forumTime;//发布时间
	public String forumLiebie;//发布类别
	public String forumAmount;//帖子浏览量
	public String forumHand;//头像

	public String getForumId() {
		return forumId;
	}

	public void setForumId(String forumId) {
		this.forumId = forumId;
	}

	public String getForumBt() {
		return forumBt;
	}

	public void setForumBt(String forumBt) {
		this.forumBt = forumBt;
	}

	public String getForumMessage() {
		return forumMessage;
	}

	public void setForumMessage(String forumMessage) {
		this.forumMessage = forumMessage;
	}

	public String getForumUserName() {
		return forumUserName;
	}

	public void setForumUserName(String forumUserName) {
		this.forumUserName = forumUserName;
	}

	public String getForumTime() {
		return forumTime;
	}

	public void setForumTime(String forumTime) {
		this.forumTime = forumTime;
	}

	public String getForumLiebie() {
		return forumLiebie;
	}

	public void setForumLiebie(String forumLiebie) {
		this.forumLiebie = forumLiebie;
	}

	public String getForumAmount() {
		return forumAmount;
	}

	public void setForumAmount(String forumAmount) {
		this.forumAmount = forumAmount;
	}

	public String getForumHand() {
		return forumHand;
	}

	public void setForumHand(String forumHand) {
		this.forumHand = forumHand;
	}
}
