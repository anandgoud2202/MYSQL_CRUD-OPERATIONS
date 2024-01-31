package com.java.MYSQL_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MYSQL_INSERT {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your id");
		int id=scan.nextInt();
		System.out.println("Enter name");
		String name=scan.next();
		System.out.println("Enter department name");
		String dept=scan.next();
		System.out.println("enter your salary");
		int salary=scan.nextInt();
		System.out.println("enter your lacation");
		String location=scan.next();
		
		try {
						
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306?user=root&password=12345";
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement("insert into ananddb.Details values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.setInt(4, salary);
			ps.setString(5, location);
			int z = ps.executeUpdate();
			if (z>0) {
				System.out.println("Record inserted succesfully");
			} else {
				System.out.println("Record not inserted succesfully");
			}
			} catch (Exception e) {
			System.out.println("ERROR");
			// TODO: handle exception
		}
	}

}
