package signInTestclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import signinfront.GetOtp;
 

public class TestClassGetOtp {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.jiomart.com/customer/account/login");
		
		GetOtp getOtp = new GetOtp(driver);
		 
		getOtp.sendfirstname();
		getOtp.sendlastname();
		getOtp.sendemail();
		getOtp.ClickOngetstarted();
		
		 }

}
