package com.shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.shop.model.Product;

public class ProductDisplay {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		List<Product> list = getAllProducts();
		System.out.println(list);
	}
	
	public static List<Product>getAllProducts() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ProductInfo");
			while(rs.next()) {
				Product obj = new Product();
				obj.setProd_id(rs.getInt(1));
				obj.setProd_name(rs.getString(2));
				obj.setProd_price(rs.getFloat(3));
				obj.setProd_cat(rs.getString(4));
				list1.add(obj);
			}
			
			return list1;
		
		}

	
	
	public List<Product> getDescByCategory(String Desc) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			PreparedStatement pstmt = con.prepareStatement("select * from ProductInfo where prod_cat=?");
			pstmt.setString(1, Desc);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product obj = new Product();
				obj.setProd_id(rs.getInt(1));
				obj.setProd_name(rs.getString(2));
				obj.setProd_price(rs.getFloat(3));
				obj.setProd_cat(rs.getString(4));
				list1.add(obj);
			}
			return list1;
		
	}
	
	public List<Product> getDesc(int pID) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			PreparedStatement pstmt = con.prepareStatement("select * from ProductInfo where prod_id=?");
			pstmt.setInt(1, pID);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product obj = new Product();
				obj.setProd_id(rs.getInt(1));
				obj.setProd_name(rs.getString(2));
				obj.setProd_price(rs.getFloat(3));
				obj.setProd_cat(rs.getString(4));
				list1.add(obj);
			}
			return list1;
		
	}
	
	public void updateProductBypID(int pID,String pname,String pctg,float pprice) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			PreparedStatement pstmt = con.prepareStatement("update ProductInfo set prod_price=?,prod_name=?,prod_cat=? where prod_id=?");
			pstmt.setFloat(1, pprice);
			pstmt.setString(2, pname);
			pstmt.setString(3,pctg);
			pstmt.setInt(4,pID);
			pstmt.executeUpdate();
		
	}
	
	public void deleteProductBypID(int pID) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			PreparedStatement pstmt = con.prepareStatement("delete from ProductInfo where prod_id=?");
			pstmt.setInt(1, pID);
	
			pstmt.executeUpdate();
			
		
	}
	
	public List<Product> getLaptop() throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ProductInfo");
			while(rs.next()) {
				Product obj = new Product();
				obj.setProd_id(rs.getInt(1));
				obj.setProd_name(rs.getString(2));
				obj.setProd_price(rs.getFloat(3));
				obj.setProd_cat(rs.getString(4));
				list1.add(obj);
			}
			
			return list1;
		
	}

	public List<Product> getFurniture() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ProductInfo");
			while(rs.next()) {
				Product obj = new Product();
				obj.setProd_id(rs.getInt(1));
				obj.setProd_name(rs.getString(2));
				obj.setProd_price(rs.getFloat(3));
				obj.setProd_cat(rs.getString(4));
				list1.add(obj);
			}
			
			return list1;
		
	}

	public void insertProductBypID(int pID, String pname,String pctg, float poprice) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con;
		
			con = DriverManager.getConnection("jdbc:sqlserver://IMCUBCP237-BLL\\SQLEXPRESS;databaseName=divya;user=sa;password=password_123");
		
			List<Product> list1 = new ArrayList<Product>();
			PreparedStatement pstmt = con.prepareStatement("insert into ProductInfo values(?,?,?,?)");
			pstmt.setInt(1, pID);
			pstmt.setString(2, pname);
			pstmt.setFloat(3,poprice);
			pstmt.setString(4,pctg);
			pstmt.executeUpdate();
		
	}
	
	

}
