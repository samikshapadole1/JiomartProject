package signinfront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn{
	
	@FindBy (xpath="//span[text()='Sign In']")
	private WebElement SignInPage;
	
	
	@FindBy (xpath="//div//p")
	private WebElement textofaccess;
	
	@FindBy (xpath="//input[@name='undefined']")
	private WebElement MobileNumber ;
	
	@FindBy (xpath="(//button[@type='submit'])[3]")
	private WebElement GetOtp;
	 
	@FindBy (xpath=" (//div[contains(@class,'j-text')])[7]")
	private WebElement Termservice;
	 
 
	
	 public SignIn(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 }
	 
	 public void ClickOnsignInPage(){
	 SignInPage.click();
	 }
	 
	public void SendMobileNumber() {
	MobileNumber.sendKeys("1057983275");
	}
	
	public void  ClickOnGetOtp(){
    GetOtp.click();
	}

}
