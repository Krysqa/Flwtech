import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LatestTripsdetailsPage;
import PageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTc_1 extends base{

     @Test
     public void Logintc() throws IOException, InterruptedException
     {
	
		AndroidDriver <AndroidElement> driver = capabilities("FlowDriveApp");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		LoginPage L = new LoginPage(driver);
		L.AlreadyRegistered.click();
		L.EmailAddress.sendKeys("chris.qaconsultants@gmail.com");
		L.Password.sendKeys("iloveYOU101");
		L.Login.click();
		L.Allowhileusingtheappbt.click();
		L.Whileusingtheappbt.click();
		L.Allowinsettingsbt.click();
		L.Allowalwaysradiobt.click();
		L.Imagebt.click();
		L.Allowbt.click();
		L.Permissionallowbt.click();
		L.Skipbt.click();
		
		
	}

     
}
