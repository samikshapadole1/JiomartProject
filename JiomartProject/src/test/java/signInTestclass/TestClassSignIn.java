package signInTestclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import signinfront.SignIn;

public class TestClassSignIn {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.jiomart.com");

        SignIn signIn = new SignIn(driver);
	    
        signIn.ClickOnsignInPage();
        
		 
		 signIn.SendMobileNumber();

		 
	    signIn.ClickOnGetOtp(); 
		}
	 
}

