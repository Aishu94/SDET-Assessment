package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {  
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
		  driver.get("https://jupiter.cloud.planittesting.com/#/"); 
		  
		  //open login popup
		  driver.findElement(By.id("nav-login")).click();
		  //find username
	       WebElement username= driver.findElement(By.id("loginUserName"));
		 
		  //find password
		  WebElement password = driver.findElement(By.id("loginPassword")); 
		  
		  //click login
		  WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
		  username.sendKeys("abc@gmail.com"); password.sendKeys("password"); 
		  login.click(); String actualUrl="https://jupiter.cloud.planittesting.com/#/";
		  String expectedUrl= driver.getCurrentUrl(); if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
			  System.out.println("Test passed"); } else { System.out.println("Test failed"); }
		  
		  
		  
	}

}
