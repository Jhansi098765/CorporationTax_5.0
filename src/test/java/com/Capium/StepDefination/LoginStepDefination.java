package com.Capium.StepDefination;


import com.Capium.Actions.LoginActions;
import com.Capium.Utilites.ConfigReader;
import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	LoginActions loginpage=new LoginActions();
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		StepTracker.setCurrentStep("Launch the browser");
		Log.info("Launch browser successfully.");
	}

	@Given("User need to enter the Application Url")
	public void user_need_to_enter_the_application_url() {
		String url = ConfigReader.getProperty("app.url");
		HelperClass.openPage(url);
		 StepTracker.setCurrentStep("User need to enter the Application Url");		 
		 Log.info("LRL entered successfully.");
		 //loginpage.ClickOnAccountantLogin();
		 
	}

	@When("User Enter username and Password")
	public void user_enter_username_and_password() {
		String username = ConfigReader.getProperty("username");
		String password = ConfigReader.getProperty("password");
		loginpage.EnterUsername(username);
		loginpage.EnterPassword(password);
		StepTracker.setCurrentStep("User Enter username and Password");
		Log.info("Username and Password entered successfully.");
		
	}

	@Then("User Click on login button")
	public void user_click_on_login_button() throws Exception {
		loginpage.ClickLoginbtn();
		StepTracker.setCurrentStep("User Click on login button");
		Log.info("User Click on login button successfully.");
	}
	
	//@Then("click on C icon")
//	public void click_on_c_icon() {
	   
	//}
	
	@Then("redirect to Corporation tax five point zero")
	public void redirect_to_corporation_tax_five_point_zero() {
	   loginpage.navigateToCorporationTaxModule();
	}
}



