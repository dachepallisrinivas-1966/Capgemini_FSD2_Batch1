package com.cg.jdbcp.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class StatementInsert {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
			 Statement st = con.createStatement();
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
			
			String sql = "INSERT INTO employees(empno, ename, doj, salary, deptno) VALUES (" + empNumber + ",'" + empName + "','" + strDoj + "'," + salary + "," + deptNumber + ")"; 
			
			int rowsInserted = st.executeUpdate(sql);
			System.out.println(rowsInserted + " row inserted");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
