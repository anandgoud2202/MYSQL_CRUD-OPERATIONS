package com.java.MYSQL_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MYSQL_DELETE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number to be deleted");
			int id=scan.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306?user=root&password=12345";
			Connection con = DriverManager.getConnection(url);
			
			PreparedStatement ps = con.prepareStatement("delete from ananddb.Details where id=? ");
			ps.setInt(1, id);
			int x = ps.executeUpdate();
			if (x>0) {
				System.out.println("record deleted");
			} else {
				System.out.println("record not deleted");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
