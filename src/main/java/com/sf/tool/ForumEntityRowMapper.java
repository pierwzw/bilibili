package com.sf.tool;

import com.sf.entity.ForumEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: pier
 * @date: 2018/6/1 0:44
 * @desc:
 */

//论坛表实体
public class ForumEntityRowMapper implements RowMapper<ForumEntity> {

    @Override
    public ForumEntity mapRow(ResultSet arg0, int arg1) throws SQLException {
        ForumEntity forumEntity = new ForumEntity();
        //user.setUseryinghangka(arg0.getString("useryinghangka"));
		/*grids.setGridsID(arg0.getString("gridsID"));*/
        forumEntity.setForumId(arg0.getString("forumID"));
        forumEntity.setForumAmount(arg0.getString("forumAmount"));
        forumEntity.setForumBt(arg0.getString("forumBT"));
        forumEntity.setForumLiebie(arg0.getString("forumliebie"));
        forumEntity.setForumMessage(arg0.getString("forummessage"));
        forumEntity.setForumTime(arg0.getString("forumTime"));
        forumEntity.setForumUserName(arg0.getString("forumuserName"));
        forumEntity.setForumHand(arg0.getString("firumhand"));

        return forumEntity;
    }

}
