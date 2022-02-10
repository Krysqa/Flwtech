import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjects.AboutPage;
import PageObjects.MorePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LogoutTc_2  extends base{
    
	@Test
	public void Logouttc() throws IOException 
	{
		
		AndroidDriver <AndroidElement> driver = capabilities("FlowDriveApp");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
      MorePage mpage= new MorePage(driver);
      AboutPage abtpage = new AboutPage(driver);
      
     mpage.More.click();
     mpage.About.click();
     abtpage.Logout.click();

	}

}
