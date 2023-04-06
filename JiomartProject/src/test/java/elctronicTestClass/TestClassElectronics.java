package elctronicTestClass;

 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import electronicsection.Electronics;

public class TestClassElectronics {
     
	WebDriver driver;
	Electronics electronics;
	
@BeforeClass
 public void OpenBrowser() {
 System.out.println("Open Browser");
		
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
			
 System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
@BeforeMethod
public void OpenElectronics(){
System.out.println("Open Electronics section");
driver.get("https://www.jiomart.com");
   
Electronics electronics = new Electronics(driver);
electronics.sendelectronic();
//electronics.sendmobileTablet();
//electronics.sendpowerBank();
}
	
@Test
public void VerifyPowerBankPage() {
System.out.println("Power Bank");


	}
	
@AfterMethod
public void VerifyPowerBankPageOpen() {
System.out.println("Product of Power Bank");

System.out.println("Display");
System.out.println("==========-====");
}	

@AfterClass
public void ClosePowerBankPage() {
System.out.println("Close");
}
}
