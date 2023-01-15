package TC_01;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Qualicoach.Base.TestBaseClass;
import Qualicoach.Homepage.HomePage;
import Qualicoach.SignInPage.SignInButton;

public class SignInButtonTests extends TestBaseClass {

	SignInButton signInButton=new SignInButton(driver);
	public ExtentReports extent;
	public ExtentTest test;
	public HomePage home;
	
	public Select sel;
	@BeforeTest
	public void config()
	{
		
		    String path= System.getProperty("user.dir") + "\\reports\\index.html";
		    ExtentSparkReporter repo=new ExtentSparkReporter(path);
		
		    repo.config().setReportName("Automation Report for Mobile World");
		    repo.config().setDocumentTitle("Qualicoach Mobile World");
		    
		    extent=new ExtentReports();
		    extent.attachReporter(repo);
		    extent.setSystemInfo("Tester", "Namdev Bedare");
	}
	
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		extent.createTest("Driver Intilization Successfully");
		intilization();
		driver.get(prop.getProperty("URL"));
	    System.out.println(driver.getTitle());
	}
	
	
	//@Test (priority=1)
	public void VerifySignInButton() {
		extent.createTest("SignIn Button Displays Successfully");
		signInButton.VerifySignInButton().isEnabled();
		extent.flush();
		
	}
	
	
	//@Test (priority=2)
	public void VerifyBottomsignInbutton() {
		extent.createTest(" Bottom SignIn Button Displays Successfully");
	    signInButton.VerifyBottomSignInButton().isEnabled();
	    extent.flush();
	}
	
	
	
	//@Test(priority=3)
	public void VerifyUserNameInputTextBox() throws InterruptedException
	{
		extent.createTest(" Successfully Clicked on Sign In Button");
		signInButton.ClickOnSignInButton();
		
		extent.createTest(" Successfully passed 2 alphanumeric and 1 special character in UserName text feild");
		signInButton.UserNameInputText().sendKeys(prop.getProperty("UName"));
		Thread.sleep(2000);
		signInButton.UserNameInputText().clear();
		
		extent.createTest(" Successfully passed 10 alphanumeric and 10 special characters in UserName text feild");
		signInButton.UserNameInputText1().sendKeys(prop.getProperty("UName1"));
		Thread.sleep(2000);
		signInButton.UserNameInputText1().clear();
		
		
		extent.createTest(" Successfully passed 1 numeric and 1 special character in the username text field");
		signInButton.UserNameInputText2().sendKeys(prop.getProperty("UName2"));
		Thread.sleep(2000);
		signInButton.UserNameInputText2().clear();
		
		extent.createTest(" Successfully passed Valid EmailId in the username text field");
		signInButton.UserNameInputTextValid().sendKeys(prop.getProperty("ValidUName"));
		Thread.sleep(2000);
		signInButton.UserNameInputTextValid().clear();
		
		extent.createTest(" Successfully passed InValidEmailId EmailId in the username text field");
		signInButton.UserNameInputText1().sendKeys(prop.getProperty("InValidEmailId"));
		extent.flush();
		
		
	}
	
	
	
	//@Test(priority=4)
	public void VerifyPasswordInputTextBox() throws InterruptedException {
		
		
		extent.createTest(" Successfully Clicked on Sign In Button");
		signInButton.ClickOnSignInButton();
		
		extent.createTest(" Successfully passed  3 digit alphanumeric in the password text field");
		signInButton.PasswordInputText().sendKeys(prop.getProperty("Password"));
		Thread.sleep(3000);
		
		extent.createTest(" Successfully passed  10 digit alphanumeric in the password text field");
		signInButton.PasswordInputText().clear();
		signInButton.PasswordInputText1().sendKeys(prop.getProperty("Password1"));
		Thread.sleep(3000);
		signInButton.PasswordInputText1().clear();
		
		extent.createTest(" Successfully passed  only one digit in the password text field"); 
		signInButton.PasswordInputText2().sendKeys(prop.getProperty("Password2"));
		Thread.sleep(3000);
		signInButton.PasswordInputText2().clear();
		
		extent.createTest(" Successfully passed  11 alphanumerics in the password text field");
		signInButton.PasswordInputText3().sendKeys(prop.getProperty("Password3"));
		Thread.sleep(3000);
		signInButton.PasswordInputText3().clear();
		
		extent.createTest(" Successfully passed  Empty String In password text field");
		signInButton.PasswordInputTextEmpty().sendKeys("");
		Thread.sleep(3000);
		signInButton.PasswordInputTextEmpty().clear();
		
		extent.createTest(" Successfully passed only the username do not anter anything in the password text field");
		signInButton.PasswordInputempty().sendKeys(prop.getProperty("ValidUName"));
	    extent.flush();
	}
	
	
	
	//@Test(priority=5)
	public void HomepageTextvalidationTest() {
		
		HomePage home=new HomePage(driver);
		extent.createTest(" Successfully Displyed Welcome To Our Mobile World!");
		String ActualText=home.Welcometext().getText();
		String expectedText="Welcome To Our Mobile World!";
		
		if (ActualText.equals(expectedText))
		{
			System.out.println("Autal and expected results are same"+ActualText);
		}
		else
		{
			System.out.println("Autal and expected results are different"+ActualText);
		}
		
	}
	
	
	
	//@Test(priority=6)
	public void LatestMobileTextValidation()
	{
		home=new HomePage(driver);
		
		extent.createTest(" Successfully Displyed Latest Mobile collections");
		String actual=home.LatestMobilecoll().getText();
		String expected="Latezt Mobiles";

		if (actual.equals(expected))
		{
			System.out.println("Autal and expected results are same " + actual);
		}
		else
		{
			System.out.println("Autal and expected results are different " + actual);
		}
	}
	
	//@Test(priority=7)
	public void ClickOnLatestDropdown()
	{
		home=new HomePage(driver);
		extent.createTest(" Successfully Clicked on Latest Dropdown");
		home.LatestDrop().click();
		
	
	}
	
	
	@Test(priority=8)
	public void  SelectmobileBrands() throws InterruptedException
	{
		home=new HomePage(driver);
//		extent.createTest(" Successfully Selected Samsung Mobile assest");
	WebElement Latestdrop=driver.findElement(By.xpath("//a[contains(text(),'Latest')]"));
//		Latestdrop.click();
//		Thread.sleep(3000);
//		WebElement Sm=driver.findElement(By.xpath("//a[contains(text(),'Samsung')]"));
//		Sm.click();
//		
//		
//		Thread.sleep(3000);
		//Latestdrop.click();
//    	extent.createTest(" Successfully Selected Lenovo Mobile assest");
//    	WebElement leneo=driver.findElement(By.xpath("//a[contains(text(),'Lenovo')]"));
//    	leneo.click();
//		Thread.sleep(3000);
		
		Latestdrop.click();
		extent.createTest(" Successfully Selected Apple Mobile assest");
		WebElement Apple=driver.findElement(By.xpath("//a[contains(text(),'Apple')]"));
		Apple.click();
		Thread.sleep(3000);
		
	}
		
		

	@AfterMethod
	public void teardown()
	{ 
		extent.createTest(" Driver close Successfully "); 
		driver.quit();
		extent.flush();
	}
}
