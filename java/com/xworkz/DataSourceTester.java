package com.xworkz;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.jdbc.Driver;

public class DataSourceTester {

	public static void main(String[] args) throws SQLException {
		
		String contextConfigLocation = "spring/datasource.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(contextConfigLocation);
		System.out.println(container);
		DriverManagerDataSource dm = container.getBean(DriverManagerDataSource.class);
		
		Connection connection = dm.getConnection();
		System.out.println(connection);
		
	}

}
