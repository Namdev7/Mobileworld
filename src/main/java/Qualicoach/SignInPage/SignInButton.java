package Qualicoach.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Qualicoach.Base.TestBaseClass;

public class SignInButton extends TestBaseClass{

	public SignInButton (WebDriver rdriver)
	{
		driver= rdriver;
	PageFactory.initElements(rdriver, this);	
	}
	
	By SignInButton=By.xpath("//button[text()='SIGN IN']");
	By LogInButton=By.xpath("//a[text()='Log In']");
	By BottomSignInButton=By.xpath("//a[text()='Sign In']");
	By UserName=By.xpath("/html/body/div/div/div/div/div/form/div[1]/input");
	
	By PassWord=By.xpath("//input[@id='password']");

	
	
	public WebElement VerifySignInButton()
	{
		
	    return driver.findElement(SignInButton);
	    
	}
	
	public WebElement VerifyBottomSignInButton() {
		return driver.findElement(BottomSignInButton);
		
	}
	
	public void ClickOnSignInButton()
	{
		driver.findElement(SignInButton).click();
	}
	
	
	public WebElement UserNameInputText()
	{
		return driver.findElement(UserName);
	}
	
	
	public WebElement UserNameInputText1()
	{
		return driver.findElement(UserName);
		
	}
	
	
	public WebElement UserNameInputText2()
	{
		return driver.findElement(UserName);
	}
	
	public WebElement  UserNameInputTextValid()
	{
		return driver.findElement(UserName);
	}
	
	
	public WebElement  UserNameInputTextInValid()
	{
		return driver.findElement(UserName);
	}
	
	
	public WebElement PasswordInputText()
	{
		return driver.findElement(PassWord);
	}
	
	
	public WebElement PasswordInputText1()
	{
		return driver.findElement(PassWord);
	}
	
	public WebElement PasswordInputText2()
	{
		return driver.findElement(PassWord);
	}
	
	public WebElement PasswordInputText3()
	{
		return driver.findElement(PassWord);
	}
	
	public WebElement PasswordInputTextEmpty()
	{
		return driver.findElement(PassWord);
	}
	
	public WebElement PasswordInputempty()
	{
	return	driver.findElement(UserName);
		
	
}}

