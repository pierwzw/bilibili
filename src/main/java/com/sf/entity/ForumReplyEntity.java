package com.sf.entity;


//回帖实体表
public class ForumReplyEntity {
	public String replyId;//回复ID
	public String replyContent;//回帖内容
	public String replyTime;//回帖时间
	public String replyHand;//回帖人头像
	public String replyTieziId;//回复帖子的ID
	public String replyName;//回复人的名字

	public String getReplyId() {
		return replyId;
	}

	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	public String getReplyHand() {
		return replyHand;
	}

	public void setReplyHand(String replyHand) {
		this.replyHand = replyHand;
	}

	public String getReplyTieziId() {
		return replyTieziId;
	}

	public void setReplyTieziId(String replyTieziId) {
		this.replyTieziId = replyTieziId;
	}

	public String getReplyName() {
		return replyName;
	}

	public void setReplyName(String replyName) {
		this.replyName = replyName;
	}
}
