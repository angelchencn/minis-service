package com.alex.demo.mybatis.mapper;

import com.alex.demo.mybatis.model.Employee;
import java.util.List;
import java.util.Map;

public interface EmployeesMapper {

    Employee insertEmployee(Employee record);

    List<Employee> selectAll();
    
    Employee findEmployeeById(int empNo);
    
    List<Employee> findEmployees(Map params);

    Employee updateEmployee(Employee record);
    
    void deleteEmployeeById(int empNo);

}