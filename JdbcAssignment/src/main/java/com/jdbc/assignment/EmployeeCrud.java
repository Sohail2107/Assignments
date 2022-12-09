package com.jdbc.assignment;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeCrud {
	
	public void addEmployee() throws SQLException;
	public List<Employee> showEmployees() throws SQLException;
	public boolean deleteEmployee(int employeeID) throws SQLException;
	public boolean updateEmployee(int id) throws SQLException;

}
