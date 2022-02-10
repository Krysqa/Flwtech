package Tests;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjects.RegistrationPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RegistrationTc_3 extends base {
    
	@Test
	public void Registertc() throws IOException {
		
		AndroidDriver <AndroidElement> driver = capabilities("FlowDriveApp");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		RegistrationPage R = new RegistrationPage (driver);
		R.EmailAddress.sendKeys();
		R.Password.sendKeys();
		R.RepeatPassword.sendKeys();
		R.FirstName.sendKeys();
		R.LastName.sendKeys();
		R.Postcode.sendKeys();
		R.AcceptTC.click();
		R.Register.click();

	}

}
