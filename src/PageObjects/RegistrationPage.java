package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class RegistrationPage {
	
	public RegistrationPage(AppiumDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id= "com.thefloow.thefloowltd.floowdrivedemo.app:id/email_input")
	public WebElement EmailAddress;
	
	@FindBy(xpath= "(//android.widget.EditText)[2]")
	public WebElement Password;
	
	@FindBy(xpath= "(//android.widget.EditText)[3]")
	public WebElement RepeatPassword;
	
	@FindBy(xpath="(//android.widget.EditText)[4]")
	public WebElement FirstName;
	
	@FindBy(xpath="(//android.widget.EditText)[5]")
	public WebElement LastName;
	
	@FindBy(xpath="(//android.widget.EditText)[6]")
	public WebElement Postcode;
	
	@FindBy(className="android.widget.CheckBox")
	public WebElement AcceptTC;
	
	@FindBy(xpath="//android.widget.Button @text= Register")
	public WebElement Register;
	
	
	
			

}
