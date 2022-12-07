package com.testdb;


		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;

public class ConnClass {

	
		static Connection con;
		public static Connection createCP() throws ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try {
		con=DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		System.out.println("Connected");
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}

			return con;

		}


}
		
	


