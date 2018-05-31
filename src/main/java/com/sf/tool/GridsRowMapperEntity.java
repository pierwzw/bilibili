package com.sf.tool;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sf.entity.GridsEntity;
import org.springframework.jdbc.core.RowMapper;


//用户表
public class GridsRowMapperEntity implements RowMapper<GridsEntity>{

	@Override
	public GridsEntity mapRow(ResultSet arg0, int arg1) throws SQLException {
		GridsEntity grids = new GridsEntity();
		//user.setUseryinghangka(arg0.getString("useryinghangka"));
		grids.setGridsID(arg0.getString("gridsID"));
		
		grids.setGirdsName(arg0.getString("girdsName"));
		grids.setGirdsStorage(arg0.getInt("girdskucun"));
		grids.setGirdsPrice(arg0.getString("girdsjiage"));
		grids.setGirdsImg(arg0.getString("girdsimg"));
		return grids;
	}

	
	
}
