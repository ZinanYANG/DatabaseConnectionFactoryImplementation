package edu.depaul;

import java.sql.*;


// oracle connection 
public class OracleConnection implements DatabaseConnection{
	
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
	public OracleConnection(String url, String user, String password,String port) {
		this.url = url;
		this.user = user;
		this.password = password;
		this.port = port;
	}
	@Override
	public void connect() {
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to Oracle!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
