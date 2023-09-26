package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Login_Page;

public class Page_Object_Manager {
	
	public static WebDriver driver;			// null
	
	private Login_Page lp ;
	
	public Page_Object_Manager(WebDriver abc) {

		driver = abc;
	
	}

	public Login_Page getLogin_Page() {

		lp = new Login_Page(driver);
		
		return lp;
		
	}

}
