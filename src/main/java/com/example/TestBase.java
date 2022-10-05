package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fis= new FileInputStream("/Users/menakagandhis/eclipse/sample-cucumber-testng/src/main/java/com/example/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome") )
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "/Users/menakagandhis/eclipse/CucumberWithTestNG/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF"))
		{	WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "/Users/menakagandhis/eclipse/CucumberWithPOM/chromedriver");
			driver = new FirefoxDriver();
		}
    	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		}
	public static void tearDown() {
		driver.close();
	}

}
