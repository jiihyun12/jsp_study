package com.app.dao;

import java.util.Optional;

import java.util.List;
import com.app.dto.StudentDTO;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.StudentVO;

public class StudentDAO {
	public SqlSession sqlSession;
	
	public StudentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(StudentVO studentVO) {
		sqlSession.insert("student.insert", studentVO);
	}
	
	public StudentDTO select(Long id) {
		return sqlSession.selectOne("student.select", id);
	}
	
	public List<StudentDTO> selectAll() {
	    return sqlSession.selectList("student.selectAll");
	}
	
	public void update(StudentVO studentVO) {
		sqlSession.update("student.update", studentVO);
	}
	
	public void delete(Long id) {
		sqlSession.delete("student.delete", id);
	}
	
	
}
