package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;



public class LoginPage {
	
	public LoginPage(AppiumDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath="//android.widget.Button [@text='Already registered']" )
	public WebElement AlreadyRegistered;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/email_input")
	public WebElement EmailAddress;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/unknown_input")
	public WebElement Password;
	
	@FindBy(xpath="//android.widget.Button [@text= 'Login']")
	public WebElement Login;
	
	@FindBy(xpath="//android.widget.Button [@text= 'Allow while using the app']")
	public WebElement Allowhileusingtheappbt;
	
	@FindBy(xpath="//android.widget.Button [@text= 'While using the app']")
	public WebElement Whileusingtheappbt;
	
	@FindBy(xpath="//android.widget.Button [@text= 'Allow in settings']")
	public WebElement Allowinsettingsbt;
	
	@FindBy(id="com.android.permissioncontroller:id/allow_always_radio_button")
	public WebElement Allowalwaysradiobt;
	
	@FindBy(className="android.widget.ImageButton")
	public WebElement Imagebt;
	
	@FindBy(xpath="//android.widget.Button [@text= 'Allow']")
	public WebElement Allowbt;
	
	@FindBy(id= "com.android.permissioncontroller:id/permission_allow_button")
	public WebElement Permissionallowbt;
	
	@FindBy(id= "com.thefloow.thefloowltd.floowdrivedemo.app:id/skip_button")
	public WebElement Skipbt;

	
			
	
	
	
}
