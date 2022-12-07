package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Admin;
import com.model.Questions;
//import com.model.Product;
import com.model.Student;

public class RowMapperImpl implements RowMapper<Questions> {

	public Questions mapRow(ResultSet rs, int rowNum) throws SQLException {
		Questions admin = new Questions();
		admin.setQ_id(rs.getInt(1));
		admin.setQues(rs.getString(2));
		admin.setA(rs.getString(3));
		admin.setB(rs.getString(4));
		admin.setC(rs.getString(5));
		admin.setD(rs.getString(6));
		admin.setCorrect(rs.getString(7));
		return admin;
	}

}
