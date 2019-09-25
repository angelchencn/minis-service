package com.alex.demo.rest;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.alex.demo.mybatis.impl.DepartmentImpl;
import com.alex.demo.mybatis.mapper.DepartmentMapper;
import com.alex.demo.mybatis.model.Department;
import com.alex.demo.mybatis.model.Employee;
import com.alex.demo.rest.param.DepartmentQuery;

@Singleton
@Component
@RestController
@Path("/departments")
public class DepartmentResource {

	// @Autowired
	// private static UserResource resource;
	private DepartmentMapper departmentMapper;

	public DepartmentResource() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		departmentMapper = new DepartmentImpl(sqlSessionFactory);
	}

	@GET
	@Path("/{id}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Department findEmployeeById(@PathParam("id") String id) {
		return departmentMapper.selectByPrimaryKey(id);
	}

	@GET
	@Path("/findDepartments")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> findEmployees(@BeanParam DepartmentQuery emp) {
		return departmentMapper.findDepartments(emp.buildParams());
	}
	
	//**Both Method Are the same
	@GET
	@Path("/{id}/employees")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> findDepartments(@PathParam("id") String id) {
		return departmentMapper.findEmployeesByDeptNo(id);
	}
	
	@GET
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> findDepartments(@QueryParam("deptNo") String deptNo, @QueryParam("deptName") String deptName) {
		return departmentMapper.findDepartments(DepartmentQuery.buildParams(deptNo, deptName));
	}

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public int insertEmployee(Department dept) {
		return departmentMapper.insert(dept);
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public int putEmployee(Department dept) {
		return departmentMapper.updateByPrimaryKey(dept);
	}

	@PATCH
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public int patchEmployee(Department dept) {
		return departmentMapper.updateByPrimaryKey(dept);
	}

	@DELETE
	@Path("/{id}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteEmployeeById(@PathParam("id") String id) {
		departmentMapper.deleteByPrimaryKey(id);
	}
}