package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class TripsPage {
	
	   public TripsPage(AppiumDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	   }
	   
	   @FindBy(xpath="//android.widget.TextView [@text=Trips]")
	   public WebElement Trips;
	   
	   @FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/score")
	   public List <WebElement> Alltripscores;
	   
	   
	   
	   

}
