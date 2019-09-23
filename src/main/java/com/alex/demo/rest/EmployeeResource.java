package com.alex.demo.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.alex.demo.rest.param.EmployeeQuery;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.alex.demo.mybatis.impl.EmployeesImpl;
import com.alex.demo.mybatis.mapper.EmployeesMapper;
import com.alex.demo.mybatis.model.Employee;

@Singleton
@Component
@RestController
@Path("/employees")
public class EmployeeResource {
	
	//@Autowired
	//private static UserResource resource;
	
	private EmployeesMapper employeesMapper;

	public EmployeeResource() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		employeesMapper = new EmployeesImpl(sqlSessionFactory);
	}
	
	@GET
	@Path("/{id}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Employee findEmployeeById(@PathParam("id") int id) {
		return employeesMapper.findEmployeeById(id);
	}
	
	@GET
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> findEmployees(@BeanParam EmployeeQuery emp) {
		return employeesMapper.findEmployees(emp.buildParams());
	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Employee insertEmployee(Employee emp) {
		return employeesMapper.insertEmployee(emp);
	}
	
	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Employee putEmployee(Employee emp) {
		return employeesMapper.updateEmployee(emp);
	}
	
	@PATCH
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Employee patchEmployee(Employee emp) {
		return employeesMapper.updateEmployee(emp);
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteEmployeeById(@PathParam("id") int id) {
		employeesMapper.deleteEmployeeById(id);
	}
	
	public static void main(String[] args) throws IOException {
		//UserResource user = new UserResource();
		//user.getAllUsers();
		EmployeeResource resource = new EmployeeResource();
//		List<Employee> empList = resource.getAllUsers();
//		System.out.println("==" + empList.size());
//
//		Employee emp = resource.findUserById(10005);
//		System.out.println("emp==" + emp.getFirstName());
//
//		empList = resource.findUserByName("Alex");
//		System.out.println("empList==" + empList.size());
//
//		if (empList.size()>0) {
//			resource.deleteEmployeeById(1122334455);
//		}
//		empList = resource.findUserByName("Alex");
//		System.out.println("empList1==" + empList.size());
//
//		Employee alex = new Employee();
//		alex.setEmpNo(1122334455);
//		alex.setBirthDate(new Date());
//		alex.setFirstName("Alex");
//		alex.setGender("M");
//		alex.setLastName("Chen");
//		alex.setHireDate(new Date());
//		alex = resource.insertEmployee(alex);
//		System.out.println("Alex id==" + alex.getEmpNo());
//		empList = resource.findUserByName("Alex");
//		System.out.println("empList2==" + empList.size());
//		Employee alex1 = empList.get(0);
//		alex1.setFirstName("Alex1");
//		resource.updateEmployee(alex1);
//
//		empList = resource.findUserByName("Alex");
//		System.out.println("empList3==" + empList.size());
		
		//http://localhost:9090/rest/user/findUserById??emp_no=10002
		//http://localhost:9090/rest/user/getAllUsers

	}

}
