package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Admin;

public class AdminRowMapperImpl implements RowMapper<Admin> {


		public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
			Admin student = new Admin();
			
			student.setUsername(rs.getString(1));
			student.setPassword(rs.getString(2));
			
			
			return student;
		}
	
}
