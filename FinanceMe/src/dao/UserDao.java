package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.Jdbc;
import entity.User;

public class UserDao {
	
	public User search (String id) throws ClassNotFoundException,SQLException, IOException{
		
		// DBへコネクトをオンに
		Connection con = Jdbc.connect();
		
		Statement sta = null;
		ResultSet rs = null;
		String sql = null;
		
		sta =(Statement)con.createStatement();
		
		User user = new User();
		
		sql ="select * from user where id ='" + id + "'";
		rs =(ResultSet)sta.executeQuery(sql);
		
		
		while(rs.next()) {
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));

		}
		
		if(rs != null) {
			rs.close();
		}
		Jdbc.close(sta, con);
		
		return user;
	}
	
	
}
