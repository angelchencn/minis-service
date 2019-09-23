package com.alex.demo.rest.param;

import javax.ws.rs.QueryParam;
import java.util.HashMap;
import java.util.Map;

public class EmployeeQuery {

    @QueryParam("empNo")
    private Integer empNo;

    @QueryParam("firstName")
    private String firstName;

    @QueryParam("lastName")
    private String lastName;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Object> buildParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("empNo", empNo);
        params.put("firstName", firstName);
        params.put("lastName", lastName);
        return params;
    }
}
