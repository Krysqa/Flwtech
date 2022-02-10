package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class AboutPage {
	
	public AboutPage(AppiumDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath= "//android.widget.Button[@text= Log out]")
	public WebElement Logout;
	
	@FindBy(xpath="//android.widget.Button[@text= Third party licenses]")
	public WebElement ThirdPartylicence;
	
	

}
