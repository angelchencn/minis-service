package com.alex.demo.mybatis.model;

import java.util.Date;

public class Salaries {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salaries.emp_no
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    private Integer empNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salaries.salary
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    private Integer salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salaries.from_date
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    private Date fromDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salaries.to_date
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    private Date toDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salaries.emp_no
     *
     * @return the value of salaries.emp_no
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salaries.emp_no
     *
     * @param empNo the value for salaries.emp_no
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salaries.salary
     *
     * @return the value of salaries.salary
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salaries.salary
     *
     * @param salary the value for salaries.salary
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salaries.from_date
     *
     * @return the value of salaries.from_date
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salaries.from_date
     *
     * @param fromDate the value for salaries.from_date
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salaries.to_date
     *
     * @return the value of salaries.to_date
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salaries.to_date
     *
     * @param toDate the value for salaries.to_date
     *
     * @mbg.generated Tue May 28 14:24:28 CST 2019
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}