package com.java.MYSQL_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MYSQL_UPDATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("enter name");
//			String name=scan.next();
//			System.out.println("enter location");
//			String location=scan.next();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306?user=root&password=12345";
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement("update ananddb.Details set name=?, location=? where id=?");
			ps.setString(1, "Nandu");
			ps.setString(2, "goa");
			ps.setInt(3, 14);
			int z=ps.executeUpdate();
			
			if (z>0) {
				System.out.println("Record Updated successfully");
			} else {
				System.out.println("Record not Updated");
			}
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

}
