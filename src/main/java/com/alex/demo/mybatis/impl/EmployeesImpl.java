package com.alex.demo.mybatis.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.alex.demo.mybatis.mapper.EmployeesMapper;
import com.alex.demo.mybatis.model.Employee;

public class EmployeesImpl implements EmployeesMapper {

	private SqlSessionFactory sqlSessionFactory;

	public EmployeesImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public Employee insertEmployee(Employee record) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			sqlSession.insert("com.alex.demo.mybatis.mapper.EmployeesMapper.insertEmployee", record);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return record;
	}

	@Override
	public List<Employee> selectAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<Employee> employees;
		try {
			employees = sqlSession.selectList("com.alex.demo.mybatis.mapper.EmployeesMapper.selectAll");
		} finally {
			sqlSession.close();
		}

		return employees;
	}

	@Override
	public Employee findEmployeeById(int empNo) {
		Employee employee = null;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			employee = sqlSession.selectOne("com.alex.demo.mybatis.mapper.EmployeesMapper.findEmployeeById",
					new Integer(empNo));
		} finally {
			sqlSession.close();
		}
		return employee;
	}

	@Override
	public List<Employee> findEmployees(Map params) {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<Employee> employees;
		try {
			employees = sqlSession.selectList("com.alex.demo.mybatis.mapper.EmployeesMapper.findEmployees", params);
		} finally {
			sqlSession.close();
		}
		return employees;
	}

	@Override
	public Employee updateEmployee(Employee record) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			sqlSession.insert("com.alex.demo.mybatis.mapper.EmployeesMapper.updateEmployee", record);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return record;
	}
	
	@Override
	public void deleteEmployeeById(int empNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			sqlSession.insert("com.alex.demo.mybatis.mapper.EmployeesMapper.deleteEmployeeById", empNo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		
	}

}
