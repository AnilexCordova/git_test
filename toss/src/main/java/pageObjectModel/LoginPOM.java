package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM 
{
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement loginButton;

}
