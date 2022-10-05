package com.example;



	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	

	public class loginPageFB  extends TestBase
	{
		@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
		WebElement new_account;
		
		public loginPageFB() {
			PageFactory.initElements(driver, this);
//			loginpage_obj = PageFactory.initElements(driver, loginPage.class);
		}
		
		public String verifyLoginPageTitle() {
			return driver.getTitle();
		}
		
		public SignUpPage new_Account() {
			new_account.click();
			return new SignUpPage();
			
		}

	}

