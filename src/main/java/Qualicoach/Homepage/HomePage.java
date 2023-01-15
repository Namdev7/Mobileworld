package Qualicoach.Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver edriver)
	{
		driver=edriver;
		PageFactory.initElements(edriver,this);
		
	}
	
	By WelcomeText=By.xpath("//h1[contains(text(),'Welcome To Our Mobile World!')]");
	By LatestMobileCollection=By.xpath("//h1[contains(text(),'Latezt Mobiles')]");
	By LatestDrp=By.xpath("//a[contains(text(),'Latest')]");
	
	
	public WebElement Welcometext() {
		
		return driver.findElement(WelcomeText);
	}
	
    public WebElement LatestMobilecoll() {
		
		return driver.findElement(LatestMobileCollection);
	}
	
    public WebElement LatestDrop() {
		
		return driver.findElement(LatestDrp);
	}
	
    
    
    
}
