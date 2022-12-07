package com.divya.dao;

		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;

public class Demo1 {


		public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try {
		Connection con=DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		System.out.println("Connected");
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}



		}


}
		
	


