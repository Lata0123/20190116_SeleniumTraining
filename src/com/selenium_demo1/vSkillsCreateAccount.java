package com.selenium_demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class vSkillsCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://vskills.in/certification/create-account");
		driver.findElementById("input-firstname").sendKeys("firstUser");
		driver.findElementById("input-lastname").sendKeys("lastUser");
		driver.findElementById("input-email").sendKeys("user@gmail.com");
		driver.findElementById("input-telephone").sendKeys("7845128956");
		driver.findElementById("input-customer_group_id").click();
		driver.findElementByXPath("//*[@id=\"input-customer_group_id\"]/option[14]").click();
		driver.findElementById("input-address-1").sendKeys("House No. 12345");
		driver.findElementById("input-address-2").sendKeys("Street1");
		driver.findElementById("input-city").sendKeys("Delhi");
		driver.findElementById("input-postcode").sendKeys("110002");
		driver.findElementById("input-zone").click();
		driver.findElementByXPath("//*[@id=\"input-zone\"]/option[11]").click();
		driver.findElementById("input-password").sendKeys("Password@12345");
		driver.findElementById("input-confirm").sendKeys("Password@12345");
		driver.findElementByName("agree").click();
		driver.findElementByXPath("//*[@id=\"content\"]/form/div/div/input[2]").click();
	}

}
