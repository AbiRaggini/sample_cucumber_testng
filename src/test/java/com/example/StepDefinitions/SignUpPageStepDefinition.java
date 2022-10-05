package com.example.StepDefinitions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.example.SignUpPage;
import com.example.TestBase;
import com.example.loginPageFB;





public class SignUpPageStepDefinition extends TestBase{
	
	loginPageFB loginpage_obj;
	SignUpPage signupPage_obj;
	
	
	@io.cucumber.java.en.Given("^user opens browser$")
	public void user_opens_browser() throws Throwable{
		System.out.println("jjjjjjjj");
		com.example.TestBase.initialization();
	    
	}
	@io.cucumber.java.en.When("^user is on login page$")
	public void user_is_on_login_page() {
		loginpage_obj = new loginPageFB();
		String title = loginpage_obj.verifyLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook – log in or sign up", title);
	    }
	
	@io.cucumber.java.en.Then("^user clicks on Create New Account$")
	public void user_clicks_on_create_new_account() {
	    loginpage_obj = PageFactory.initElements(driver, loginPageFB.class);
		signupPage_obj = loginpage_obj.new_Account();
	    
	}
	@io.cucumber.java.en.Then("^user routes to SignupPage and enter all required details$")
	public void user_enter_all_required_details() {
		Assert.assertEquals("Sign Up",signupPage_obj.signupPage_titleVerification());
		System.out.println(signupPage_obj.signupPage_titleVerification());
		signupPage_obj.Fill_Details("Rose", "Kelly", "9944805197", "V@ntage7", "21", "Mar", "1989");
	}
	@io.cucumber.java.en.Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() {
	   signupPage_obj.Create__NewUser_submitBtn();

	}
	@io.cucumber.java.en.Then("^User routes to OTP page$")
	public void user_routes_to_otp_page() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		wait.until(ExpectedConditions.titleContains("Facebook"));
		Assert.assertTrue(signupPage_obj.OTP());
	  	}
	@io.cucumber.java.en.Then("^close the browser$")
	public void close_the_browser() {
		TestBase.tearDown();
	   
	}



}
