package com.qait.Gmail;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_test {
	WebDriver driver;
	Gmail_Action obj = new Gmail_Action(driver);

	@BeforeTest
	public void Before() {
		obj.launch();

	}

	@Test
	public void Test1() throws InterruptedException {
		obj.loginWithValid();

	}
	@Test
	public void Test2() throws InterruptedException {
		obj.mail();
		
		
	}
	 @AfterTest
	 public void After() throws InterruptedException {
	
	 obj.close();
	
	 }
}