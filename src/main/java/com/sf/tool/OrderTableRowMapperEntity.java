package com.sf.tool;

import com.sf.entity.OrderTableEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//用户表
public class OrderTableRowMapperEntity implements RowMapper<OrderTableEntity> {

	@Override
	public OrderTableEntity mapRow(ResultSet arg0, int arg1) throws SQLException {
		OrderTableEntity ordertable = new OrderTableEntity();
		//user.setUseryinghangka(arg0.getString("useryinghangka"));
			  //grids.setGridsID(arg0.getString("gridsID"));
		ordertable.setOrderId(arg0.getString("orderID"));
		ordertable.setOrderGridsImg(arg0.getString("ordergridsImg"));
		ordertable.setOrderGridsName(arg0.getString("orderIgridsName"));
		ordertable.setOrderState(arg0.getString("orderStat"));
		ordertable.setOrderTime(arg0.getString("orderTime"));
		ordertable.setOrderUserName(arg0.getString("orderuserName"));
		ordertable.setOrderTotalPrice(arg0.getString("orderzongRMB"));
		ordertable.setOrderAddr(arg0.getString("orderAddr"));
		return ordertable;
	}

	
	
}
