package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.model.Student;

public class StudentRowMapperImpl implements RowMapper<Student> {


		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setSid(rs.getInt(1));
			student.setUsername(rs.getString(2));
			student.setPassword(rs.getString(3));
			student.setName(rs.getString(4));
			
			return student;
		}
}
