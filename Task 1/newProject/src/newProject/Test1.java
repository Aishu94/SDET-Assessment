package newProject;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;
        
public class Test1 {
    public static void main(String[] args) {  
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
		  driver.get("https://jupiter.cloud.planittesting.com/#/"); 
		  System.out.println("Successfully opened the website!");
	       driver.quit();
	}
}



