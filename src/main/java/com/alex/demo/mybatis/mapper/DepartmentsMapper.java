package com.alex.demo.mybatis.mapper;

import com.alex.demo.mybatis.model.Departments;
import java.util.List;

public interface DepartmentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    int insert(Departments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    List<Departments> selectAll();
}