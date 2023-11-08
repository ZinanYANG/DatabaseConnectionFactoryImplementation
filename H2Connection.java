package edu.depaul;

import java.sql.*;

public class H2Connection implements DatabaseConnection{
	
	private String url;
	private String user;
	private String password;
	private String port;

	/**
	 * @param url
	 * @param user
	 * @param password
	 */
	public H2Connection(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}

	@Override
	public void connect() {
//    	download H2 Database and H2 jdbc driver and add to build path 
//    	H2 Database official website.
//    	https://www.h2database.com/html/download.html
//    	create a database and set up h2 console
    	 try {
             // Load the H2 driver
             Class.forName("org.h2.Driver");
             Connection conn = DriverManager.getConnection(url, user, password); 
             System.out.println("Successfully connected to the H2 database.");
             conn.close();
         } catch (Exception e) {
             e.printStackTrace();
         }

	}

}
