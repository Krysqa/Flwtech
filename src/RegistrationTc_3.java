import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RegistrationTc_3 extends base {
	
	 

    
	@Test
	public void Registertc() throws IOException {
		
		AndroidDriver <AndroidElement> driver = capabilities("FlowDriveApp");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		RegistrationPage R = new RegistrationPage (driver);
		R.EmailAddress.sendKeys("john.qaconsultants@gmail.com");
		R.Password.sendKeys("RANGEROVER");
		R.RepeatPassword.sendKeys("RANGEROVER");
		R.FirstName.sendKeys("JOHN");
		R.LastName.sendKeys("DOE");
		R.Postcode.sendKeys("RG12 7YY");
		R.AcceptTC.click();
		R.Register.click();

	}

	
}
