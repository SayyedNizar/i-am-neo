package com.example.firstdemo.firstdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstdemoApplication.class, args);
		System.out.println("Hello World");
		DataBase();
	}

	public static void DataBase()
	{
		String url="jdbc:mysql://localhost:3306/firstdemo";
		String user="root";
		String password="nizar2005";
		
		try(Connection conn=DriverManager.getConnection(url, user, password)){
		if(conn!=null)
		{
			System.out.print("Connected Successfully....");
		}
		}
		catch(SQLException e)
		{
			System.out.print("Connection not Successful..."+e.getMessage());
		}
	}
}