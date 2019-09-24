package com.alex.demo.mybatis.mapper;

import com.alex.demo.mybatis.model.Department;
import java.util.List;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int deleteByPrimaryKey(String deptNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    Department selectByPrimaryKey(String deptNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    List<Department> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departments
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int updateByPrimaryKey(Department record);
}