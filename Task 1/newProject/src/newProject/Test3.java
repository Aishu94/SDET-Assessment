package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) {

	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
	  driver.get("https://jupiter.cloud.planittesting.com/#/"); 
	  
	//click shopping button
	  WebElement shop = driver.findElement(By.linkText("Start Shopping »"));
	  shop.click(); String actualUrl="https://jupiter.cloud.planittesting.com/#/shop";
	  String expectedUrl= driver.getCurrentUrl(); if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
		  System.out.println("Test passed"); } else { System.out.println("Test failed"); }}
}
	  

