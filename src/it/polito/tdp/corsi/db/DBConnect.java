package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?user=root&password=password";
		Connection conn;
		try 
		{
			conn = DriverManager.getConnection(jdbcURL);
		} 
		catch (SQLException e) 
		{
			System.err.println("Errore connessione al db");
			throw new RuntimeException(e);
		}
		return conn;
	}

}
