package commonFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import pageObjectModel.LoginPOM;

public class CommonFunction 
{
	public static WebDriver driver;
	
	@Test
	public void main() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://toss.bmark.in/");
		
		PageFactory.initElements(driver, LoginPOM.class);
		LoginPOM.email.sendKeys("admin@toss.com");
		LoginPOM.password.sendKeys("123456");
		LoginPOM.loginButton.click();
		assert driver.getTitle().equals("TOSS Academy");
		System.out.println("Login successful");
		System.out.println("Page title is: " + driver.getTitle());
				
	}
	
	@AfterSuite
	public void closeBrowser() 
	{
		driver.quit();
	}
		
}
