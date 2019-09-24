package com.alex.demo.mybatis.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.alex.demo.mybatis.mapper.EmployeeMapper;
import com.alex.demo.mybatis.model.Employee;

public class EmployeeImpl implements EmployeeMapper {

	private SqlSessionFactory sqlSessionFactory;

	public EmployeeImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public int insert(Employee record) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int result = -1;
		try {
			result = sqlSession.insert("com.alex.demo.mybatis.mapper.EmployeeMapper.insert", record);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return result;
	}

	@Override
	public List<Employee> selectAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<Employee> employees;
		try {
			employees = sqlSession.selectList("com.alex.demo.mybatis.mapper.EmployeeMapper.selectAll");
		} finally {
			sqlSession.close();
		}

		return employees;
	}

	@Override
	public Employee selectByPrimaryKey(Integer empNo) {
		Employee employee = null;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			employee = sqlSession.selectOne("com.alex.demo.mybatis.mapper.EmployeeMapper.selectByPrimaryKey",
					empNo);
		} finally {
			sqlSession.close();
		}
		return employee;
	}

	
	@Override
	public int updateByPrimaryKey(Employee record) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int result = -1;
		try {
			result = sqlSession.insert("com.alex.demo.mybatis.mapper.EmployeeMapper.updateByPrimaryKey", record);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return result;
	}
	
	@Override
	public int deleteByPrimaryKey(Integer empNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int result = -1;
		try {
			result = sqlSession.insert("com.alex.demo.mybatis.mapper.EmployeeMapper.deleteByPrimaryKey", empNo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return result;
	}
	
	@Override
	public List<Employee> findEmployees(Map params) {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<Employee> employees;
		try {
			employees = sqlSession.selectList("com.alex.demo.mybatis.mapper.EmployeeMapper.findEmployees", params);
		} finally {
			sqlSession.close();
		}
		return employees;
	}
	
}
