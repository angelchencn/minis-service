package com.alex.demo.mybatis.mapper;

import com.alex.demo.mybatis.model.DeptEmp;
import java.util.List;

public interface DeptEmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    int insert(DeptEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    List<DeptEmp> selectAll();
}