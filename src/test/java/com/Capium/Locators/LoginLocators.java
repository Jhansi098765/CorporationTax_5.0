package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	
//	@FindBy(xpath="(//a[normalize-space()='Login'])[1]")
	//public WebElement AccountantLogin;
	
//	@FindBy(xpath = "//input[@id='txtusername']")
//	@CacheLookup
//	public WebElement inputUsername;
//
//	@FindBy(xpath = "//input[@id='txtpassword']")
//	@CacheLookup
//	public WebElement inputPassword;
//
	@FindBy(xpath = "//button[@id='btnLogin']")
	@CacheLookup
	public WebElement btnLogin;
//
//	@FindBy(xpath = "//h1")
//	@CacheLookup
//	public WebElement Headingtag;
//   // C module
//	@FindBy(xpath = "//a[@title='Modules']")
//	@CacheLookup
//	public WebElement C_icon_inside_modules;
//
//	@FindBy(xpath = "//div[text()='Bookkeeping']")
//	@CacheLookup
//	public WebElement Bookkeeping_Module;
//
//	@FindBy(xpath = "//div[text()='Accounts Production']")
//	@CacheLookup
//	public WebElement AccountsProduction_Module;
//
//	@FindBy(xpath = "//div[@class='card-body-list']//div//p[contains(text(),'Easily submit files to HMRC for corporations')]")
//	@CacheLookup
//	public WebElement CorporationTax_Module;
//
//	@FindBy(xpath = "//div[text()='Self Assessment']")
//	@CacheLookup
//	public WebElement SelfAssessment_Module;
//
//	@FindBy(xpath = "//div[text()='Payroll']")
//	@CacheLookup
//	public WebElement Payroll_Module;
//
//	@FindBy(xpath = "//p[normalize-space()='Welcome to your Capium EcoSystem']")
//	@CacheLookup
//	public WebElement Homepage_Element;
//
//	@FindBy(xpath = "//a/h6[contains(text(),'Bookkeeping')]")
//	@CacheLookup
//	public WebElement Homepage_BK_module;
//	
//	@FindBy(xpath="//i[@class='icon fa fa-power-off']")
//	@CacheLookup
//	public WebElement Logout_element;
//	
//	@FindBy(xpath="//div[@class='profile-logo']//label")
//	@CacheLookup
//	public WebElement Logo_in_homepage;
//	
//	@FindBy(xpath="//a[normalize-space()='Logout']")
//	@CacheLookup
//	public WebElement Logout_inside_logo;
//	
//	@FindBy(xpath="//div[@title='User Image']")
//	public WebElement FivePointProfileIcon;
//	
//	@FindBy(xpath="//a[normalize-space()='Sign Out']")
//	public WebElement SignoutFivePointZero;
//	
//	
//	@FindBy(xpath = "//h6[text()='365']//parent::a")
//	@CacheLookup
//	public WebElement Capiuum365_Module;
//	
//	@FindBy(xpath="//h6[text()='365']//parent::div")
//	public WebElement InsideCicon5_0_365Module;
//	
//	@FindBy(xpath="//div[normalize-space()='Capium 365']")
//	public WebElement insideCicon3_0_365Module;
//	
//	@FindBy(xpath="//img[@alt='Capium Logo']//parent::div//parent::a")
//	public WebElement CiconFivepoint_o;
//
//	@FindBy(xpath="//div[@class='card-body-list']//div//h6[contains(text(),'Corporation Tax')]")
//	public WebElement CorporationTax_Home;
//	
//	@FindBy(xpath="//h6[normalize-space()='Corporation Tax']")
//	public WebElement CorporationTax_InsideCicon;
//	
//	@FindBy(xpath="//a[@href='/']//parent::span")
//	public WebElement InsideCiconHomebutton;
//	
//	@FindBy(xpath="//a[@href='/' and contains(@class,'my')]")
//	public WebElement InsideCiconHome;
//	
//	
//	 @FindBy(xpath = "//input[@id='txtusername']")
//		public WebElement inputUsername;
//	 
//		@FindBy(xpath = "//input[@id='txtpassword']")
//		public WebElement inputPassword;
//	 
//		@FindBy(xpath = "//button[@id='btnLogin']")
//		public WebElement btnLoginpage;
//	 
//		@FindBy(xpath = "//h1")
//		public WebElement Headingtag;
//	   // C module
//		@FindBy(xpath = "//a[@title='Modules']")
//		public WebElement C_icon_inside_modules;
//	 
		@FindBy(xpath = "(//h6[text()='Corporation Tax']/parent::a)[2]")
		public WebElement CorporationTax_Module1;
//		
//		@FindBy(xpath="//a[@href='/' and contains(@class,'my')]")
//		public WebElement InsideCiconHome;
//		
//		@FindBy(xpath="//a[@class='my-capium']")
//		public WebElement InsideCiconHomebutton;
//	 
//		@FindBy(xpath = "//p[normalize-space()='Welcome to your Capium EcoSystem']")
//		public WebElement Homepage_Element;
//		
//		@FindBy(xpath="//i[@class='icon fa fa-power-off']")
//		public WebElement Logout_element;
//		
//		@FindBy(xpath="//div[@class='profile-logo']//label")
//		public WebElement Logo_in_homepage;
//		
//		@FindBy(xpath="//a[normalize-space()='Logout']")
//		public WebElement Logout_inside_logo;
//		
//		@FindBy(xpath="//div[@title='User Image']")
//		public WebElement FivePointProfileIcon;
//		
//		@FindBy(xpath="//a[normalize-space()='Sign Out']")
//		public WebElement SignoutFivePointZero;
//		
//		
//		@FindBy(xpath = "//h6[text()='365']//parent::a")
//		public WebElement Capiuum365_Module;
//		
//		@FindBy(xpath="//h6[text()='365']//parent::div")
//		public WebElement InsideCicon5_0_365Module;
//		
//		@FindBy(xpath="//div[normalize-space()='Capium 365']")
//		public WebElement insideCicon3_0_365Module;
//		
//		@FindBy(xpath="//img[@alt='Capium Logo']//parent::div//parent::a")
//		public WebElement CiconFivepoint_o;
//	 
//		@FindBy(xpath="//div[@class='card-body-list']//div//h6[contains(text(),'Corporation Tax')]")
//		public WebElement CorporationTax_Home;
//		
//		@FindBy(xpath="//h6[normalize-space()='Corporation Tax']")
//		public WebElement CorporationTax_InsideCicon;
//		
//		@FindBy(xpath="//img[@alt='Capium Logo']/ancestor::a")
//		public WebElement CiconFivePointO;
//		
//		@FindBy(xpath="//p[normalize-space()='Easily submit files to HMRC for corporations']/ancestor::a")
//		public WebElement CorporationTaxInsideC;
//		
//		@FindBy(xpath="//div[normalize-space()='Capium 365']/parent::div")
//		public WebElement Capium365InsideCicon;
//		
//		@FindBy(xpath="//img[@alt='Capium Logo']/ancestor::a")
//		public WebElement CapiumLogo;
//		
//		@FindBy(xpath="//p[normalize-space()='Track your clients finances in real time']/ancestor::a")
//		public WebElement bk5in_c_icon;
//		
//		@FindBy(xpath="//div[normalize-space()='Charity Accounts']/parent::div")
//		public WebElement Charity;
//	 
//	 
//	
	@FindBy(xpath = "//input[@id='txtusername']")
	public WebElement inputUsername;
 
	@FindBy(xpath = "//input[@id='txtpassword']")
	public WebElement inputPassword;
 
	@FindBy(xpath = "//button[@id='btnLogin']")
	public WebElement btnLoginpage;
 
	@FindBy(xpath = "//h1")
	public WebElement Headingtag;
   // C module
	@FindBy(xpath = "//a[@title='Modules']")
	public WebElement C_icon_inside_modules;
 
	@FindBy(xpath = "(//h6[text()='Corporation Tax']/parent::a)[2]")
	public WebElement CorporationTax_Module;
	
	@FindBy(xpath="//a[@href='/' and contains(@class,'my')]")
	public WebElement InsideCiconHome;
	
	@FindBy(xpath="//a[@class='my-capium']")
	public WebElement InsideCiconHomebutton;
 
	@FindBy(xpath = "//p[normalize-space()='Welcome to your Capium EcoSystem']")
	public WebElement Homepage_Element;
	
	@FindBy(xpath="//i[@class='icon fa fa-power-off']")
	public WebElement Logout_element;
	
	@FindBy(xpath="//div[@class='profile-logo']//label")
	public WebElement Logo_in_homepage;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	public WebElement Logout_inside_logo;
	
	@FindBy(xpath="//div[@title='User Image']")
	public WebElement FivePointProfileIcon;
	
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	public WebElement SignoutFivePointZero;
	
	
	@FindBy(xpath = "//h6[text()='365']//parent::a")
	public WebElement Capiuum365_Module;
	
	@FindBy(xpath="//h6[text()='365']//parent::div")
	public WebElement InsideCicon5_0_365Module;
	
	@FindBy(xpath="//div[normalize-space()='Capium 365']")
	public WebElement insideCicon3_0_365Module;
	
	@FindBy(xpath="//img[@alt='Capium Logo']//parent::div//parent::a")
	public WebElement CiconFivepoint_o;
 
	@FindBy(xpath="(//div[@class='card-body-list']//div//h6[contains(text(),'Corporation Tax')])[2]")
	public WebElement CorporationTax_Home;
	
	@FindBy(xpath="//h6[normalize-space()='Corporation Tax']")
	public WebElement CorporationTax_InsideCicon;
	
	@FindBy(xpath="//img[@alt='Capium Logo']/ancestor::a")
	public WebElement CiconFivePointO;
	
	@FindBy(xpath="//p[normalize-space()='Easily submit files to HMRC for corporations']/ancestor::a")
	public WebElement CorporationTaxInsideC;
	
	@FindBy(xpath="//div[normalize-space()='Capium 365']/parent::div")
	public WebElement Capium365InsideCicon;
	
	@FindBy(xpath="//img[@alt='Capium Logo']/ancestor::a")
	public WebElement CapiumLogo;
	
	@FindBy(xpath="//p[normalize-space()='Track your clients finances in real time']/ancestor::a")
	public WebElement bk5in_c_icon;
	
	@FindBy(xpath = "//p[text()='Track your clients finances in real time']//parent::a")
	public WebElement Homepage_BK_module;
	
	@FindBy(xpath="//div[normalize-space()='Charity Accounts']/parent::div")
	public WebElement Charity;
	
    @FindBy(xpath="//p[normalize-space()='Welcome to your Capium EcoSystem']")
    public WebElement HomePageElement;
 
}
