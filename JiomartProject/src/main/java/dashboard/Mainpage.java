package dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mainpage {
	
	@FindBy(xpath="//a[text()='Groceries']") 
     private WebElement Groceries; 
	

	@FindBy(xpath="(//a[text()='Premium Fruits'])[2]")
	private WebElement premiumfruits; 
	
	@FindBy(xpath="(//a[text()='Home & Kitchen'])[2]")
	private WebElement Homekitchen ;
	
	@FindBy(xpath="//a[text()='Fashion']")
	private WebElement fashion;
	
	@FindBy(xpath="//a[text()='Electronics']")
	private WebElement electronic; 
	
	@FindBy(xpath="(//a[text()='Beauty'])[2]")
	private WebElement Beauty;
	
	@FindBy(xpath="(//a[text()='Jewellery'])[1]")
	private WebElement jwellery;
	
	@FindBy(xpath="//a[text()='Home Improvement']")
	private WebElement homeimprovement; 
	
	@FindBy(xpath="//a[text()='Sports, Toys & Luggage']")
	private WebElement sportluggage;
	
	@FindBy(xpath="//button[@id='btn_minicart']")
	private WebElement carticon;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signin;
	


}
