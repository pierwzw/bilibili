package com.sf.tool;

import com.sf.entity.VideoEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//视频ID区
public class VideoRowMapperEntity  implements RowMapper<VideoEntity>{

	@Override
	public VideoEntity mapRow(ResultSet arg0, int arg1) throws SQLException {
		VideoEntity video = new VideoEntity();
		 	
		 	video.setVideoAddress(arg0.getString("videoAddress"));
		 	video.setVideoCollection(arg0.getString("videoCollection"));
		 	video.setvideoId(arg0.getString("videoId"));
		 	video.setVideoImage(arg0.getString("videoImage"));
		 	video.setVideoLeaving(arg0.getString("videoLeaving"));
		 	video.setVideoName(arg0.getString("videoName"));
		 	video.setvideoLookTime(arg0.getString("videoLookTime"));
		 	video.setVideoState(arg0.getString("videoState"));
		 	video.setVideoTime(arg0.getString("videoTime"));
		 	
		return video;
	}

}
