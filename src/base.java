import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException 
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\global.properties");
		Properties prop =  new Properties();
		prop.load(fis);
		prop.get(appName);
		
		// TODO Auto-generated method stub
	  File appDir = new File("src");
      File app =  new File(appDir, (String) prop.get(appName));
	  DesiredCapabilities cap = new DesiredCapabilities();
	  
	  String device = (String)prop.get("device");
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	  
	  cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	  
	  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	  
	  AndroidDriver <AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	  
	  return driver;
		
	}

}
