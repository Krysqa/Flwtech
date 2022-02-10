package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;

public class LatestTripsdetailsPage {
	
	public LatestTripsdetailsPage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.TextView [@text='Score breakdown']")
	public WebElement ScoreBreakdown;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/score")
	public List <WebElement> latestTripscores;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/distance")
	public WebElement LatestTripdistance;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/duration")
	public WebElement LatestTripDuration;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/start_time")
	public WebElement Latestripstartime;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/end_time")
	public WebElement Latestripendtime;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_dashboard_pause")
	public WebElement Backbutton;
	
	
	

}
