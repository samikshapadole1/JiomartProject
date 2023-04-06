package signinfront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetOtp {
	
	@FindBy (xpath="//div//h1")
    private WebElement Welcomejio;			
	
	@FindBy (xpath="(//div//p)[1]")
	private WebElement text;			
			

	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement Firstname;			
		

	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement Lastname;			
		

	@FindBy (xpath="//input[@ type='email']")
	private WebElement Email;			
		

//	@FindBy (xpath="")
//	private WebElement whatsappbox;			
//		
//
//	@FindBy (xpath="")
//	private WebElement entertext;			
		
	@FindBy (xpath=" //span[@class='slider round']")
	private WebElement blankbox;			
		
//	@FindBy (xpath="")
//	private WebElement verifyphone;			
//		
//	@FindBy (xpath="(//div// p)[2]")
//	private WebElement SMStext;			
		
//	@FindBy (xpath="")
//	private WebElement ;			
//		
//	@FindBy (xpath="")
//	private WebElement ;			
		
	@FindBy (xpath="//a[@id='resend-link']")
	private WebElement Resendotp;			
		
	@FindBy (xpath="(//button[@aria-label='button Get Started']")
	private WebElement Getstarted;	
	
	
	 public GetOtp(WebDriver driver) {
	 PageFactory.initElements(driver, this);
     }
	 
	 public void sendfirstname() {
	 Firstname.sendKeys("Rahima");	
	 }
	 
	 public void sendlastname() {
	 Lastname.sendKeys("Kapoor");
	 }
	 
	 public void sendemail(){
	 Email.sendKeys("abcd123@gmail.com");
	 }	 
	
	 public void ClickOngetstarted(){
	 Getstarted.click();
	 }
		 
}	 
	 
	 
	 