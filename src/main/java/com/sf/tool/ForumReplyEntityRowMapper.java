package com.sf.tool;

import com.sf.entity.ForumReplyEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: pier
 * @date: 2018/6/1 0:45
 * @desc:
 */

public class ForumReplyEntityRowMapper implements RowMapper<ForumReplyEntity> {

    @Override
    public ForumReplyEntity mapRow(ResultSet arg0, int arg1) throws SQLException {
        // TODO Auto-generated method stub
        ForumReplyEntity u = new ForumReplyEntity();
        u.setReplyHand(arg0.getString("replyhand"));
        u.setReplyId(arg0.getString("replyid"));
        u.setReplyContent(arg0.getString("replyneirong"));
        u.setReplyTieziId(arg0.getString("replytieziid"));
        u.setReplyTime(arg0.getString("replytime"));
        u.setReplyName(arg0.getString("replyname"));
        return u;
    }

}
