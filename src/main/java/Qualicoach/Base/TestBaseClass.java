package Qualicoach.Base;


import java.io.FileReader;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestBaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public static void intilization () throws IOException
	{
			FileReader reader =new FileReader("data.properties");
			prop =new Properties();
			prop.load(reader);
			
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			driver=new ChromeDriver(); 	
		    driver.manage().window().maximize();
		    
		    
	}
	
	
}