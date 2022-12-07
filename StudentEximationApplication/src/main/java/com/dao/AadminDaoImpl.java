package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Admin;
import com.model.Questions;
import com.model.Student;

public class AadminDaoImpl implements AadminDao {

private JdbcTemplate jdbcTemplate;
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public int insertStudent(Student admin) {
		String query = "insert into student values(?,?,?,?)";
		int result = this.jdbcTemplate.update(query, admin.getSid(),admin.getUsername(),admin.getPassword(),admin.getName());
		return result;
	}

	public int updateStudent(Student admin) {
		String query = "update student set s_username=?,s_password=?,s_name=? where s_id=?";
		int result=this.jdbcTemplate.update(query,admin.getUsername(),admin.getPassword(),admin.getName(),admin.getSid());
		return result;
	}

	public int deleteStudent(Student admin) {
		String query="delete from student where s_id=?";
		int result = this.jdbcTemplate.update(query,admin.getSid());
		return result;
	}

	public Student getStudent(int id) {
		String query ="select * from student where s_id=?";
		RowMapper<Student> rowMapper= new StudentRowMapperImpl();
		Student std = this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return std;
	}

	public List<Student> getAllStudents() {
		String query ="select * from student";
		List<Student> std = this.jdbcTemplate.query(query, new StudentRowMapperImpl());
		return std;
	}


	public int insertQuestion(Questions que) {
		String query = "insert into question values(?,?,?,?,?,?,?)";
		int result = this.jdbcTemplate.update(query, que.getQ_id(),que.getQues(),que.getA(),que.getB(),que.getC(),que.getD(),que.getCorrect());
		return result;
	}

	public int updateQuestion(Questions que) {
		String query = "update question set ques=?,a=?,b=?,c=?,d=?,correct=? where q_id=?";
		int result = this.jdbcTemplate.update(query,que.getQues(),que.getA(),que.getB(),que.getC(),que.getD(),que.getCorrect(),que.getQ_id());
		return result;
	}

	public int deleteQuestion(Questions que) {
		String query="delete from question where q_id=?";
		int result = this.jdbcTemplate.update(query,que.getQ_id());
		return result;
	}


//	public int updateProduct(Product product) {
//		String query = "update product set prod_name=? where prod_id=?";
//		int result=this.jdbcTemplate.update(query,product.getProd_name(),product.getProd_id());
//		return result;
//	}
//
//	public int deleteProduct(Product product) {
//		String query="delete from product where prod_id=?";
//		int result = this.jdbcTemplate.update(query,product.getProd_id());
//		return result;
//	}
//
//	public Product getProduct(int prod_id) {
//		String query ="select * from product where prod_id=?";
//		RowMapper<Product> rowMapper= new RowMapperImpl();
//		Product product = this.jdbcTemplate.queryForObject(query, rowMapper,prod_id);
//		return product;
//	}
//
//	public List<Product> getAllProducts() {
//		String query ="select * from product";
//		List<Product> product = this.jdbcTemplate.query(query, new RowMapperImpl());
//		return product;
//	}

	
	
}
