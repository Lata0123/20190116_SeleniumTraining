package com.selenium_demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class vSkillsMyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.vskills.in/certification/login");
		driver.findElementById("input-email").sendKeys("user@gmail.com");
		driver.findElementById("input-password").sendKeys("Password@12345");
		driver.findElementByXPath("//*[@value='Login']");                                                                                                                                                                                                                                                                                                                                                                                                                                                              		
	}

}
