package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JdbcAssignment {
	
	public static Scanner input = new Scanner(System.in);
    public static Connection con=null;
    
    /**
     * Method to create sql connection
     * @return connection object
     * @throws SQLException
     */
	public static Connection createConnection() throws SQLException{

		Connection myConn = null;	
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root" , "DataGuard432$");
			
			System.out.println("Database connection successful!\n");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		return myConn;
	}
	
	
	public static void main(String[] args) throws SQLException {
		con=createConnection();
		EmployeeCrudImpl crudImpl = new EmployeeCrudImpl();
		
		System.out.println("welcome admin:\r\n"
				+ "1. add a new Employee,\r\n"
				+ "2. see all employee,\r\n"
				+ "3. search an employee,\r\n"
				+ "4. delete an employee,\r\n"
				+ "5. update an employee\r\n");
     System.out.println("Select an option:");
     Scanner input = new Scanner(System.in);
     int option=input.nextInt();
    
     //1. Add a new Employee
     if(option==1) {
    	 crudImpl.addEmployee();
    	 closeConnection();
     }
     
     //2.see all Employees
     else if(option==2) {
    	 List<Employee> employees=crudImpl.showEmployees();
    	 System.out.println("-----------List of Employees-----------");
    	 Iterator<Employee> it =employees.iterator();
    	 while(it.hasNext()) {
    		 System.out.println(it.next());
    	 }
    	 closeConnection();
     }
     //3.Search an Employee
     else if(option==3) {
    	 System.out.println("-----Search an Employee--------");
    	 System.out.println("1.Search By ID\r\n"
    	 		+ "2.Search By Dept\r\n"
    	 		+ "3.Search By FirstName\r\n"
    	 		+ "4.Search By LastName");
    	 System.out.println("Enter an option:");
    	 int searchOption=input.nextInt();
    	   if(searchOption==1) {
    		   System.out.println("Enter employeeId:");
    		   int employeeID=input.nextInt();
    		   List<Employee> empDetails=
    				   crudImpl.showEmployees().stream().filter(c->c.getId()==employeeID).collect(Collectors.toList());
    		   System.out.println("Employee Details are:");
    		   System.out.println(empDetails);
    	   }
    	   else if(searchOption==2) {
    		   System.out.println("Enter Department:");
    		   String department=input.next();
    		   List<Employee> empDetails=
    		   crudImpl.showEmployees().stream().filter(c->c.getDepartment().equals(department)).collect(Collectors.toList());
    		   System.out.println("Employee Details are:");
    		   System.out.println(empDetails);
    	   }
    	   else if(searchOption==3) {
    		   System.out.println("Enter FirstName:");
    		   String firstName=input.next();
    		   List<Employee> empDetails=
    		   crudImpl.showEmployees().stream().filter(c->c.getFirstName().equals(firstName)).collect(Collectors.toList());
    		   System.out.println("Employee Details are:");
    		   System.out.println(empDetails);
    	   }
    	   else if(searchOption==4) {
    		   System.out.println("Enter LastName:");
    		   String lastName=input.next();
    		   List<Employee> empDetails=
    		   crudImpl.showEmployees().stream().filter(c->c.getLastName().equals(lastName)).collect(Collectors.toList());
    		   System.out.println("Employee Details are:");
    		   System.out.println(empDetails);
    	   }
    	   closeConnection();
     }
     //4.Delete an Employee
     else if(option==4) {
    	 System.out.println("Enter employee Id to be deleted:");
    	 int empId=input.nextInt();
    	 boolean b=crudImpl.deleteEmployee(empId);
    	 if(b) {
    		 System.out.println("Deleted successfully");
    	 }else {
    		 System.out.println("Id does not exist");
    	 }
    	 closeConnection();
     }
     //5.Update an Employee
     else if(option==5) {
    	 System.out.println("Enter EmployeeId to be updated:");
    	 int empId=input.nextInt();
    	 boolean b=crudImpl.updateEmployee(empId);
    	 if(b) {
    		 System.out.println("Updated successfully");
    	 }else {
    		 System.out.println("Id does not exist");
    	 }
    	 closeConnection();
     }
	}
	
	 //Closing connection
	 public static void closeConnection() throws SQLException {
		 if (con != null) {
				con.close();
			}
	 }
	 
}