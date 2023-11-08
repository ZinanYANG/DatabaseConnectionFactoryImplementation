package edu.depaul;

public class DatabaseConnectionFactory {

	public static DatabaseConnection getDatabaseConnection(String type, String url, String user, String password,String port) {
		if(type.equalsIgnoreCase("Oracle")) {
			return new OracleConnection(url, user, password,port);
		} else if(type.equalsIgnoreCase("MySql")) {
			return new MySQLConnection(url, user, password,port);
		} else if(type.equalsIgnoreCase("SQL")) {
			return new SQLConnection(url, user, password,port);
		} else if(type.equalsIgnoreCase("H2")) {
			return new H2Connection(url, user, password);
		} else {
			 throw new IllegalArgumentException("Database type " + type + " is not supported.");
		}
	}
}
