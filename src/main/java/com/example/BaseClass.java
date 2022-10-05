package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){
        WebDriverManager.chromedriver().setup();
    	//System.setProperty("webdriver.chrome.driver","/Users/menakagandhis/eclipse/sample-cucumber-testng/src/main/resources/chromedriver-3");
        driver = new ChromeDriver();
    }

    public static void navigateToHome(){
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public static void closeDriver(){
        driver.quit();
    }


}
