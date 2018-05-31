package com.sf.tool;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sf.entity.MessageEntity;
import org.springframework.jdbc.core.RowMapper;

//留言表
public class RowMapperVideoEntity implements RowMapper<MessageEntity>{

	@Override
	public MessageEntity mapRow(ResultSet arg0, int arg1) throws SQLException {
		MessageEntity message = new MessageEntity();
		message.setMessage(arg0.getString("message"));
		message.setMessageId(arg0.getString("messageID"));
		message.setMessageTime(arg0.getString("messageTime"));
		message.setMessageUserId(arg0.getString("messageuserID"));
		message.setMessageUserName(arg0.getString("messageuserName"));
		message.setMessagevideoId(arg0.getString("messagevideoId"));
		message.setMessageHand(arg0.getString("messageHand"));
		return message;
	}

}
