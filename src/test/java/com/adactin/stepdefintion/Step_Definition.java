package com.adactin.stepdefintion;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Test_Runner;

import com.baseclass.BaseClass;

import com.helper.Data_Reader_Manager;

import com.pageobjectmanager.Page_Object_Manager;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
	
	public static WebDriver driver = Test_Runner.driver;						// null
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
//	ClassName refName = new ConstructorName();
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		
		getUrl(Data_Reader_Manager.getInstanceDRM().getInstanceDR().getUrl());
	}

	@When("^user Enter Username In UserName Field$")
	public void user_Enter_Username_In_UserName_Field() throws Throwable {
		
		inputOnElement(pom.getLogin_Page().getUsername(), 
				Data_Reader_Manager.getInstanceDRM().getInstanceDR().getUsername());
	}

	@When("^user Enter Password In Password Field$")
	public void user_Enter_Password_In_Password_Field() throws Throwable {
		
		inputOnElement(pom.getLogin_Page().getPassword(), 
				Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPassword());
		
	}

	@Then("^user Click On The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		
		clickOnElement(pom.getLogin_Page().getLoginbtn());
	}
	

}
