package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;

public class HomePage {

	public HomePage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//android.widget.TextView [@text= 'Home']")
	public WebElement Home;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/journey_count_view")
	public WebElement Totaljourney;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_next")
	public WebElement NextButton;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/btn_prev")
	public WebElement PrevButton;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/score")
	public List <WebElement> Tripscore;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/latest_journey_show_all")
	public WebElement Showalltrips;
	
	@FindBy(id= "com.thefloow.thefloowltd.floowdrivedemo.app:id/day_text")
	public WebElement Latestrip;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/duration")
	public WebElement LatestripdurationH;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/distance")
	public WebElement LatestripdistanceH;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/start_time")
	public WebElement LatestripstartimeH;
	
	@FindBy(id="com.thefloow.thefloowltd.floowdrivedemo.app:id/end_time")
	public WebElement LatestripendtimeH;
	
	
	
	
	
	
	
	
}
