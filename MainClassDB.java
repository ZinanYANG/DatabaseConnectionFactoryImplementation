package edu.depaul;

import test2.Prodoct;
import test2.ProductFactory;

public class MainClassDB {

	public static void main(String[] args) {
		
//		MySql  test
//		Connector/J 8.1.0 added in build path
		String user_mysql = "rfamro";
        String pw_mysql = "";
        String port_mysql = "4497";
        String url_mysql = "jdbc:mysql://mysql-rfam-public.ebi.ac.uk:" + port_mysql + "/Rfam";
        
        
		DatabaseConnection MySql = DatabaseConnectionFactory.getDatabaseConnection("MySql", url_mysql, user_mysql, pw_mysql, port_mysql);
        MySql.connect();
        
//		H2  test
//		H2 jdbc driver added to build path
        
        String user_H2 = "sa";
        String pw_H2 = "999310";
        String url_H2 = "jdbc:h2:~/test";
        
		DatabaseConnection h2 = DatabaseConnectionFactory.getDatabaseConnection("H2", url_H2, user_H2, pw_H2, null);
        h2.connect();
        
	}

}
