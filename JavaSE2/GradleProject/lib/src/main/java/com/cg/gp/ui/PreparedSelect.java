package com.cg.gp.ui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelect {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
			) {
				String sql = "SELECT empno, ename, doj, salary, deptno FROM employees WHERE deptno = 10"; 
				
				PreparedStatement ps = con.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
						System.out.printf("%s\t%s\t%s\t%s\t%s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

	}

}
