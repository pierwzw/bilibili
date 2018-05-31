package com.sf.entity;

//留言实体表
public class MessageEntity {
	
	private String messageId; //留言ID
	private String messageVideoId;//留言视频ID
	private String messageUserId;//留言用户ID
	private String messageUserName;//留言用户名字
	private String message;//留言内容
	private String messageTime;//留言时间
	private String messageHand;//用户头像

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageVideoId() {
		return messageVideoId;
	}

	public void setMessageVideoId(String messageVideoId) {
		this.messageVideoId = messageVideoId;
	}

	public String getMessageUserId() {
		return messageUserId;
	}

	public void setMessageUserId(String messageUserId) {
		this.messageUserId = messageUserId;
	}

	public String getMessageUserName() {
		return messageUserName;
	}

	public void setMessageUserName(String messageUserName) {
		this.messageUserName = messageUserName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}

	public String getMessageHand() {
		return messageHand;
	}

	public void setMessageHand(String messageHand) {
		this.messageHand = messageHand;
	}
}
