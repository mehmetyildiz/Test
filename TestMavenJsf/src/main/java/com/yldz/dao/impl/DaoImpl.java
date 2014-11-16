package com.yldz.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.yldz.dao.Dao;

public class DaoImpl implements Dao {
	
	private DataSource ds;

	@Override
	public void getConnection() {

		try {
			Context ctx = new InitialContext();
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/MYDataSourceDerby");
			Connection conn = ds.getConnection();
			conn.close();

		}
		catch (NamingException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
