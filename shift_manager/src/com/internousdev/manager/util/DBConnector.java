package com.internousdev.manager.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private String driverName = "com.mysql.jdbc.Driver";

	private String url = "jdbc:mysql://localhost/shift?autoReconnect=true&useSSL=false";

	private String user = "root";

	private String password = "root";

	public Connection getConnection() {
		Connection con = null;

		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
