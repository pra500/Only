package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New1Test {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void firTest() {
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String title=driver.getTitle();			
		System.out.println(title);		
		driver.quit();
  }
  
  
  
  
  
 
}
