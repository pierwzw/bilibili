package com.sf.tool;

import com.sf.entity.ShoppingCart;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


//用户表
public class ShoppingCartRowMapperEntity implements RowMapper<ShoppingCart>{

	@Override
	public ShoppingCart mapRow(ResultSet arg0, int arg1) throws SQLException {
		//GridsEntity grids = new GridsEntity();
		//user.setUseryinghangka(arg0.getString("useryinghangka"));
		ShoppingCart shoopingCart = new ShoppingCart();
		shoopingCart.setCartId(arg0.getString("cartID"));
		shoopingCart.setShoppingId(arg0.getString("shoopingID"));
		shoopingCart.setShoppingImg(arg0.getString("shoopingImg"));
		shoopingCart.setShoppingPrice(arg0.getString("shoopingjiage"));
		shoopingCart.setShoppingName(arg0.getString("shoopingName"));
		shoopingCart.setUserName(arg0.getString("userName"));
		return shoopingCart;
	}

	
	
}
