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
		admin.setQ_id(rs.getInt("q_id"));
		admin.setQues(rs.getString("ques"));
		admin.setA(rs.getString("a"));
		admin.setB(rs.getString("b"));
		admin.setC(rs.getString("c"));
		admin.setD(rs.getString("d"));
		admin.setCorrect(rs.getString("correct"));
		return admin;
	} 

}
