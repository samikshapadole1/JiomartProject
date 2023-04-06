package electronicsection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 public class Electronics{
	
	 
	WebDriver driver;
	//WebDriverWait wait;
	
	@FindBy(xpath ="//a[text()='Electronics']")
	private WebElement Electronic;
	
	@FindBy (xpath ="//a[text() = 'Mobiles & Tablets']")
	private WebElement MobileTablet;
	
	@FindBy(xpath="//a[text()='TV & Speaker']")
	private WebElement TVSpeaker;
	
	@FindBy(xpath="(//a[text()='Home Appliances'])[2]")
	private WebElement HomeAppliance;
	
	@FindBy(xpath="//a[text()='Computers']")
	private WebElement Computers;
	
	@FindBy(xpath="//a[text()='Kitchen Appliances']")
	private WebElement Kitchen;
	
	@FindBy(xpath="//a[text()='Personal Care & Grooming']")
	private WebElement PersonalCare;
	
	@FindBy(xpath="(//a[text()='Smart Devices'])[1]")
	private WebElement SmartDevice;
	
	@FindBy(xpath="(//a[text()='Smartphones']")
	private WebElement smartphone;
	
	@FindBy(xpath="(//a[text()='Wearable Technology']")
	private WebElement WearableTechno;
	
	@FindBy(xpath="//a[text()='Power Banks']")
	private WebElement PowerBank;
	
	
	
	public Electronics(WebDriver driver){
	PageFactory.initElements(driver, this);
	this.driver=driver;
	}
	
	public void sendelectronic() {
    Actions action = new Actions(driver);
	action.moveToElement(Electronic).moveToElement(MobileTablet).moveToElement(PowerBank).click().build().perform();
	//wait=new WebDriverWait(driver,20);
	}
	
//	public void sendmobileTablet(){
//	Actions action = new Actions(driver);
//	action.moveToElement(MobileTablet);
//	}
//	public void sendpowerBank(){
//	Actions action = new Actions(driver);
//	action.moveToElement(PowerBank).click().build().perform();
//	}
}
	 
	 
	



