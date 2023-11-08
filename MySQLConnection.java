package edu.depaul;

import java.sql.*;

public class MySQLConnection implements DatabaseConnection {

	private String url;
	private String user;
	private String password;
	private String port;

	/**
	 * @param url
	 * @param user
	 * @param password
	 */
	public MySQLConnection(String url, String user, String password, String port) {
		this.url = url;
		this.user = user;
		this.password = password;
		this.port = port;
	}

	@Override
	public void connect() {
		Connection c;
		Statement st;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(url, user, password);
			st = c.createStatement();
			System.out.println("Successfully connected to the MySql database.");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error: MySQL JDBC Driver not found.");
			ex.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error connecting to the database.");
			e.printStackTrace();
		}

	}

}
