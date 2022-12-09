package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeCrudImpl implements EmployeeCrud{
	public static Scanner input = new Scanner(System.in);
		
	public void addEmployee() throws SQLException {
		
	     int rowsInserted=0;
   	 System.out.println("Add employee Form\r\n"
   	 		+ "------------------\r\n"
   	 		+ "");
   	 System.out.println("Enter ID:");
   	 int id=input.nextInt();
   	 System.out.println("Enter Last Name:");
   	 String lastName=input.next();
   	 System.out.println("Enter First Name:");
   	 String firstName=input.next();
   	 System.out.println("Enter Email:");
   	 String email=input.next();
   	 System.out.println("Enter Department:");
   	 String department=input.next();
   	 System.out.println("Enter Salary:");
   	 int salary=input.nextInt();
   	 
   	 
   	 String insertSqlQuery="INSERT INTO employees(id,last_name,first_name,email,department,salary) "
    			+ "values(?,?,?,?,?,?)";
   	 
      
		Connection con=JdbcAssignment.createConnection();
		PreparedStatement pstmt  = con.prepareStatement(insertSqlQuery);
    	pstmt.setInt(1,id);
    	pstmt.setString(2,lastName);
    	pstmt.setString(3,firstName);
    	pstmt.setString(4,email);
    	pstmt.setString(5,department);
    	pstmt.setInt(6,salary);
    	rowsInserted = pstmt.executeUpdate();
    	if(rowsInserted>0) {
   		System.out.println("The Company details inserted successfully");
    	}
   }

public List<Employee> showEmployees() throws SQLException{
	Connection con=JdbcAssignment.createConnection();
   	List<Employee> employeeList = new ArrayList<>();
   	try (con){
   	PreparedStatement pstmt = con.prepareStatement("select * from employees");
   	ResultSet rs = pstmt.executeQuery();
   	while(rs.next()) {
   		int id = rs.getInt("id");
   		String lastName = rs.getString("last_name");
   		String firstName = rs.getString("first_name");
   		String email = rs.getString("email");
   		String department = rs.getString("department");
   		int salary = rs.getInt("salary");
   		
   		Employee c = new Employee();
   		c.setId(id);
   		c.setLastName(lastName);
   		c.setFirstName(firstName);
   		c.setEmail(email);
   		c.setDepartment(department);
   		c.setSalary(salary);
   		employeeList.add(c);
   	}
   	}catch(Exception e) {
   		System.out.println("Exception occurs: "+e.getMessage());
   	}
   	return employeeList;
   }
public boolean deleteEmployee(int employeeID) throws SQLException {
	Connection con=JdbcAssignment.createConnection();
   	String deleteSql = "delete from employees where id=?";
		try (con){
			PreparedStatement pstmt = con.prepareStatement(deleteSql );
			pstmt.setInt(1, employeeID);
			int rowsDeleted  = pstmt.executeUpdate();
			if(rowsDeleted>0) {
				System.out.println("No.of rows deleted:"+rowsDeleted);
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
   	return false;
   }

public boolean updateEmployee(int id) throws SQLException {
	Connection con=JdbcAssignment.createConnection();
	String updateSql = "update employees set last_name=?,first_name=?,email=?,department=?,salary=? where id=?";
	
	try(con) {
		 System.out.println("Enter Details to be updated for the given ID:");
   	 System.out.println("Enter Last Name:");
   	 String lastName=input.next();
   	 System.out.println("Enter First Name:");
   	 String firstName=input.next();
   	 System.out.println("Enter Email:");
   	 String email=input.next();
   	 System.out.println("Enter Department:");
   	 String department=input.next();
   	 System.out.println("Enter Salary:");
   	 int salary=input.nextInt();
   	 
   	 PreparedStatement pstmt  = con.prepareStatement(updateSql);
	     	pstmt.setString(1,lastName);
	     	pstmt.setString(2,firstName);
	     	pstmt.setString(3,email);
	     	pstmt.setString(4,department);
	     	pstmt.setInt(5,salary);
	     	pstmt.setInt(6,id);
	     	int rowsUpdated = pstmt.executeUpdate();
	     	if(rowsUpdated>0) {
	    		System.out.println("Details updated successfully");
	    		return true;
	     	}
   return false;
}
}

}
