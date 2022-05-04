package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
		  driver.get("https://jupiter.cloud.planittesting.com/#/shop"); 
		  
		  //click on element
		  WebElement product = driver.findElement(By.id("product-3"));
		  System.out.println(product);
		  driver.findElement(By.linkText("Buy"));
		  
		//open cart
		 driver.findElement(By.id("nav-cart")).click();
		 WebElement cartProduct = driver.findElement(By.id("product-3"));
		 if(cartProduct.equals(product)) {
			 System.out.println("Pass");
		 } else {
			 System.out.println("Fail");
		 }
		  
		  
		  
		  
	}
	}
		  

