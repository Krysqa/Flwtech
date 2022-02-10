import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LatestTripsdetailsPage;
import PageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ValidateLatestTrip_Tc5 extends base {
	
	@Test
	public void validaterecenttrip() throws IOException 
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
		LatestTripsdetailsPage ltp = new LatestTripsdetailsPage(driver);
       
		String scoreH = hp.Tripscore.get(0).getText();
		String timeH = hp.LatestripdurationH.getText();
		String distanceH = hp.LatestripdistanceH.getText();
		String starttimeH = hp.LatestripstartimeH.getText();
		String endtimeH = hp.LatestripendtimeH.getText();
		
		hp.Latestrip.click();
		
		String score = ltp.latestTripscores.get(0).getText();
		String time = ltp.LatestTripDuration.getText();
		String distance = ltp.LatestTripdistance.getText();
		String starttime = ltp.Latestripstartime.getText();
		String endtime = ltp.Latestripendtime.getText();
		
		Assert.assertEquals(scoreH, score);
		Assert.assertEquals(timeH, time);
		Assert.assertEquals(distanceH, distance);
		Assert.assertEquals(starttimeH, starttime);
		Assert.assertEquals(endtimeH, endtime);
		
		
	}
	 
	
   
}
