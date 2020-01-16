package com.selenium_demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_Selenium {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//Thread.sleep(3000);
		//driver.findElementByLinkText("Sign in").click();
		driver.findElementByXPath("//*[@id=\"signin_info\"]/a[2]").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input").sendKeys("Unique User");
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]").sendKeys("UniqueUser123");
		driver.findElementByClassName("btn_checkavail").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input").sendKeys("UniqueUser@123");
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input").sendKeys("UniqueUser@123");
		driver.findElementByXPath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input").sendKeys("UniqueUser@gmail.com");
		driver.findElementByXPath("//*[@id=\"mobno\"]").sendKeys("9123123123");
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]/option[2]").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]/option[2]").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]/option[2]").click();
		driver.findElementByXPath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]").click();
		driver.findElementByXPath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select").click();
		driver.findElementByXPath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select/option[21]").click();
		driver.findElementByClassName("submitbtn").click();
		
	}

}
