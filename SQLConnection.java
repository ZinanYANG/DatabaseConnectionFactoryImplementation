package edu.depaul;

import java.sql.*;

public class SQLConnection implements DatabaseConnection{

	private String url;
    private String user;
    private String password ;
    private String port;
    
	/**
	 * @param url
	 * @param user
	 * @param password
	 * @param port
	 */
	public SQLConnection(String url, String user, String password,String port) {
		this.url = url;
		this.user = user;
		this.password = password;
		this.port = port;
	}

	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connected to SQL!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

}
