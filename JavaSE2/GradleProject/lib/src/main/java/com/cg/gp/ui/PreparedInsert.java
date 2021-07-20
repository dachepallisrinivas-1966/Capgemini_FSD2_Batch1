package com.cg.gp.ui;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsert {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
				 
				Scanner scan = new Scanner(System.in);) {
				
				System.out.print("Enter empno : ");
				int empNumber = scan.nextInt();
				System.out.print("Enter ename : ");
				String empName = scan.next();
				System.out.print("Enter doj [yyyy-mm-dd] : ");
				String strDoj = scan.next();
				System.out.print("Enter salary : ");
				double salary = scan.nextDouble();
				System.out.print("Enter deptno : ");
				int deptNumber = scan.nextInt();
				
				String sql = "INSERT INTO employees(empno, ename, doj, salary, deptno) VALUES (?,?,?,?,?)"; 
				
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, empNumber);
				ps.setString(2, empName);
				ps.setDate(3, Date.valueOf(strDoj));
				ps.setDouble(4, salary);
				ps.setInt(5, deptNumber);
				
				int rowsInserted = ps.executeUpdate();
				System.out.println(rowsInserted + " row inserted");
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

	}

}
