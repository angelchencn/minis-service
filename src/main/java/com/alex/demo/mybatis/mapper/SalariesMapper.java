package com.alex.demo.mybatis.mapper;

import com.alex.demo.mybatis.model.Salaries;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalariesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("fromDate") Date fromDate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int insert(Salaries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    Salaries selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("fromDate") Date fromDate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    List<Salaries> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated Tue Sep 24 10:04:15 CST 2019
     */
    int updateByPrimaryKey(Salaries record);
}