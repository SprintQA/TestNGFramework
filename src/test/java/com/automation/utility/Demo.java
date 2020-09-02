package com.automation.utility;

import java.io.FileReader;
import java.util.Properties;

public class Demo {
	public static void main(String[] args) throws Exception {

		// Creating object of properties class which is helping to read data from properties files
		Properties prop = new Properties();

		// Create File reader object to read data from file
		FileReader fr = new FileReader("src\\test\\resources\\config\\data.properties");

		// Loading properties from properties file to prop object
		prop.load(fr);

		
		System.out.println(prop.getProperty("browser"));
	}
}
