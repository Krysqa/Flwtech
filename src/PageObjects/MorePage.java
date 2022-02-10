package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class MorePage {
	
	public MorePage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//android.widget.TextView [@text= 'More']")
	public WebElement More;
	
	@FindBy(xpath="//android.widget.TextView [@text= 'Preferences']")
	public WebElement Preferences;
	
	@FindBy(xpath="//android.widget.TextView [@text= 'FAQs']")
	public WebElement FAQs;

	@FindBy(xpath="//android.widget.TextView [@text= 'Terms and Conditions']")
	public WebElement TermsandConditions;
	
	@FindBy(xpath="//android.widget.TextView [@text= 'About']")
	public WebElement About;
	
	@FindBy(xpath="//android.widget.TextView [@text= 'Change Password']")
	public WebElement ChangePassword;
	
	@FindBy(xpath="//android.widget.TextView [@text= 'Contact Us']")
	public WebElement ContactUs;
	
	@FindBy(xpath="//android.widget.TextView [@text= 'Tutorial']")
	public WebElement Tutorial;
	
	@FindBy(xpath="//android.widget.TextView [@text= 'Optimizations']")
	public WebElement Optimizations;

	
}
