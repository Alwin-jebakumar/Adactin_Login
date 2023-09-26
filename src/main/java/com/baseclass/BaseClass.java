package com.baseclass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();

			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("Edge")) {

			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();

			driver.manage().window().maximize();

		}

		return driver;

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void inputOnElement(WebElement input, String value) {

		input.sendKeys(value);

	}

	public static void clickOnElement(WebElement input) {

		input.click();

	}

}
