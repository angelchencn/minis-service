package com.alex.demo.mybatis.mapper;

import com.alex.demo.mybatis.model.DeptManager;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("deptNo") String deptNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int insert(DeptManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    DeptManager selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("deptNo") String deptNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    List<DeptManager> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int updateByPrimaryKey(DeptManager record);
}