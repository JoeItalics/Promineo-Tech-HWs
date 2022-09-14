package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import project.exception.DbException;

public class DbConnection {
	private static final String SCHEMA = "projects";
	private static final String USER = "root";
	private static final String PASSWORD = "password"; // I need help setting up a different connection besides my root. 
	private static final String HOST = "localhost";
	private static final int PORT = 3306;

	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSLL=false"
				, HOST, PORT, SCHEMA, USER, PASSWORD);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Connection to schema " + SCHEMA + " is successful.");
			return conn;
			
		} catch (SQLException e) {
			throw new DbException(e);
		}
	}

}
