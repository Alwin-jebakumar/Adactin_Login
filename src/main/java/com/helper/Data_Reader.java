package com.helper;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

public class Data_Reader {
	
	Properties p = new Properties();

	public Data_Reader() throws IOException {

//		To declare the path of the property file location 

		File f = new File("D://Project//AdactinHotel//src//main//java//com//propertyfile//Adactin.properties");

//		To get the property file 

		FileInputStream fis = new FileInputStream(f);

//		Load the property file into properties

		p.load(fis);

	}

	public String getUrl() throws IOException {

		String url = p.getProperty("url");

		return url;

	}

	public String getUsername() throws IOException {

		String username = p.getProperty("username");

		return username;

	}
	
	public String getPassword() {

		String pass = p.getProperty("password");
		
		return pass;
		
	}

}
