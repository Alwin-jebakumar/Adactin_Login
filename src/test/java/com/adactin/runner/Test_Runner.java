package com.adactin.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/com/adactin/feature",
glue = "com.adactin.stepdefintion"
//monochrome = true,
//dryRun = false,
//strict = true,
//tags = {"@smoke"},
//plugin = {"html:Reports/Adactin",
//		"pretty",
//		"json:JsonReport/AdactinJs.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/AdactinExtent.html"}
)

public class Test_Runner extends BaseClass{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {			// Launch the Browser

		driver = browserLaunch("chrome");
		
	}
	
	@AfterClass
	public static void tear_Down() {		// Close the Browser

		driver.quit();
		
	}
	
	

}
