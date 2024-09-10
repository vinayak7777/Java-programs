package com.learn.jdbc.ex1;

// 1. import java.sql package
import java.sql.*;
public class Program1 {

	public static void main(String[] args) {
		
		try {
		// TODO Auto-generated method stub
		//2. Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
