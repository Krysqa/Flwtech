import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.TripsPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ValidateAllTrips_Tc4 extends base {
    
	@Test
	public void validatealltrips() throws IOException 
	 {
		AndroidDriver <AndroidElement> driver = capabilities("FlowDriveApp");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
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
		
		HomePage hp =  new HomePage(driver);
		TripsPage tp = new TripsPage (driver);
		
		String tripnumber = hp.Totaljourney.getText();
		int tnumber= Integer.parseInt(tripnumber);
		hp.Showalltrips.click();
		
		int alltripscores = tp.Alltripscores.size();
		
		Assert.assertEquals(tnumber, alltripscores);
		
		}

}
