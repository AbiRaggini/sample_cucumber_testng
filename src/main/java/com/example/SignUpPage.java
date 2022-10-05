package com.example;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class SignUpPage extends com.example.TestBase {
	
	@FindBy(xpath = "//div[contains(text(),'Sign Up')]")
	WebElement signUp_title;
	
	@FindBy(xpath = "//*[@name='firstname']")
	WebElement fn;
	
	@FindBy(xpath = "//*[contains(@name,'lastname')]")
	WebElement ln;
	
	@FindBy(xpath = "//input[@*='Mobile number or email address']")
	WebElement mob_or_Email;
	
	@FindBy(xpath = "//input[@autocomplete='new-password']")
	WebElement pswd;
	
	@FindBy(xpath = "//select[@title='Day']")
	WebElement DOB_D;
	
	@FindBy(xpath = "//*[@*='Month']")
	WebElement DOB_M;
	
	
	@FindBy(xpath = "//select[@name='birthday_year']")
	WebElement DOB_Y;
	
	
	@FindBy(xpath = "//label[text()='Male']")
	WebElement GNDR;
	
	@FindBy(xpath = "//button[contains(@name,'websubmit')]")
	WebElement sign_up;
	
	@FindBy(xpath = "//input[@name='contactpoint']")
	WebElement new_phonetext_Field;
	
	public SignUpPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String signupPage_titleVerification() {
		return signUp_title.getText();
		}
	
	public void Fill_Details(String fName,String lastName,String mobileNo, String psd,String dd,String mm,String yy ) {
		fn.sendKeys(fName);
		ln.sendKeys(lastName);
		mob_or_Email.sendKeys(mobileNo);
		pswd.sendKeys(psd);
		Select s1 = new Select(DOB_D);
		s1.selectByVisibleText(dd);
		Select s2 = new Select(DOB_M);
		s2.selectByVisibleText(mm);
		Select s3 = new Select(DOB_Y);
		s3.selectByVisibleText(yy);
		GNDR.click();
		}
	public void Create__NewUser_submitBtn() {
		sign_up.click();
	}
	
	public boolean OTP() {
		return new_phonetext_Field.isDisplayed();
		
	}
	
}
