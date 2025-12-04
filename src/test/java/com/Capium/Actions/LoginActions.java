package com.Capium.Actions;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;


public class  LoginActions {
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();


public LoginActions() {

		PageFactory.initElements(driver, this);


}
	
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

	@FindBy(xpath = "(//h6[text()='Corporation Tax']/parent::a)[2])")

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

	public WebElement CorporationTax_Home1;
	
	@FindBy(xpath="//p[text()='Easily submit files to HMRC for corporations']//parent::a")

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


	public void EnterUsername(String username) throws InterruptedException {

	     inputUsername.clear();

		inputUsername.sendKeys(username);

	}

	public void EnterPassword(String password) {

        inputPassword.clear();

		inputPassword.sendKeys(password);

	}

	public void ClickLoginbtn() throws Exception {

		btnLoginpage.click();

		Thread.sleep(10000);

	}

	public boolean isHomePage() {

		try {

			return Homepage_Element.isDisplayed();

		} catch (Exception e) {

			return false;

		}

	}	
 

	public void Logout() throws IOException {

	    WebDriver driver = HelperClass.getDriver();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

	    wait.pollingEvery(Duration.ofMillis(300));

	    boolean logoutClicked = false;

	    try {

	        // Try 5.0 Profile Icon logout

	        if (isElementVisible(FivePointProfileIcon, wait)) {

	            HelperClass.clickWithRetry(FivePointProfileIcon, driver, wait);

	            Log.info("Clicked 5.0 Profile Icon.");

	            if (isElementVisible(SignoutFivePointZero, wait)) {

	                HelperClass.clickWithRetry(SignoutFivePointZero, driver, wait);

	                Log.info("Clicked 5.0 Sign Out.");

	                logoutClicked = true;

	            }

	        }

	        // Try homepage logo logout

	        if (!logoutClicked && isElementVisible(Logo_in_homepage, wait)) {

	            HelperClass.clickWithRetry(Logo_in_homepage, driver, wait);

	            Log.info("Clicked homepage logo.");

	            if (isElementVisible(Logout_inside_logo, wait)) {

	                HelperClass.clickWithRetry(Logout_inside_logo, driver, wait);

	                Log.info("Clicked logout inside logo.");

	                logoutClicked = true;

	            }

	        }

	        // Try direct logout element

	        if (!logoutClicked && isElementVisible(Logout_element, wait)) {

	            HelperClass.clickWithRetry(Logout_element, driver, wait);

	            Log.info("Clicked direct logout element.");

	            logoutClicked = true;

	        }

	        if (logoutClicked) {

	            // Wait until login screen is visible

	            wait.until(ExpectedConditions.or(

	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='365']")),

	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Receipts, Invoices & Bankfeeds']"))

	            ));

	            Log.info("Successfully redirected to login page after logout.");

	        } else {

	            Log.warn("No logout option available. Skipping logout.");

	        }

	    } catch (Exception e) {

	        Log.error("Logout failed: " + e.getMessage());

	        HelperClass.captureScreenshot("LogoutFailure");

	    }

	}


	public boolean isElementVisible(WebElement element, WebDriverWait wait) {

		try {

			wait.until(ExpectedConditions.visibilityOf(element));

			return element.isDisplayed();

		} catch (Exception e) {

			return false;

		}

	}

	public static void waitForPageToLoad(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {

			wait.until(webDriver -> (Boolean) js.executeScript("return (window.angular !== undefined) && "

					+ "(angular.element(document).injector() !== undefined) && "

					+ "(angular.element(document).injector().get('$http').pendingRequests.length === 0);"));

		} catch (Exception e) {

			//Log.warn("Angular wait skipped: " + e.getMessage());

		}

		wait.until(webDriver -> js.executeScript("return document.readyState").toString().equals("complete"));

	}

	
		
	

//public void NavigateToModule(String Module) throws InterruptedException {
//		
//		// Wait for URL to stabilize
//				wait.until(d -> d.getCurrentUrl() != null && !d.getCurrentUrl().isEmpty());
//				String currentUrl = driver.getCurrentUrl();
//				System.out.println("Current URL: <<" + currentUrl + ">>");
//				// Case 1: Already in New Eco Home
//				Thread.sleep(10000);
//				if (currentUrl.contains("https://account.capium.com/home")) {
//					Thread.sleep(10000);
//					String moduleXpath = "(//h6[normalize-space()='" + Module + "']/ancestor::div[@class='card'])[2]";
//					WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
//					HelperClass.scrollIntoView(targetModule);
//					HelperClass.safeClick(targetModule, Module + " Module");
//					return;
//				}
//				// Case 2: Old Eco Homepage (Circle Page)
//				if (currentUrl.equals("https://app.capium.com/") || currentUrl.equals("https://app.capium.com/")) {
//					boolean navigated = false;
//					int retries = 3;
//					while (!navigated && retries > 0) {
//						try {
//							WebElement OldEcoCT = wait.until(ExpectedConditions
//									.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Corporation Tax')]"))));
//							HelperClass.safeClick(OldEcoCT, "CT Module in Old Eco");
// 
//							WebElement C_icon = wait.until(
//									ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//							HelperClass.safeClick(C_icon, "Modules Icon");
//							WebElement C_home = wait.until(ExpectedConditions
//									.visibilityOf(driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//							HelperClass.safeClick(C_home, "Home inside Modules");
//							String newUrl = driver.getCurrentUrl();
//							if (newUrl.contains("https://account.capium.com/home")) {
//								navigated = true;
//							} else {
//								retries--;
//								System.out.println("Navigation did not reach New Eco, retries left: " + retries);
//							}
//						} catch (Exception e) {
//							retries--;
//							System.out.println(
//									"Exception during Old Eco navigation, retries left: " + retries + " -> " + e.getMessage());
//						}
//					}
//					if (!navigated) {
//						throw new RuntimeException("Failed to navigate to New Eco after retries");
//					}
// 
//					// Click target module after navigation
//					String moduleXpath = "(//h6[normalize-space()='" + Module + "']/ancestor::div[@class='card'])[2]";
//					WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
//					HelperClass.scrollIntoView(targetModule);
//					HelperClass.safeClick(targetModule, Module + " Module");
//					return;
//				}
//				// Case 3: Already inside another module (Accounts/Payroll/etc.)
//				if (currentUrl.startsWith("https://app.capium.com/")
//						&& !currentUrl.equals("https://app.capium.com/")) {
// 
//					boolean navigated = false;
//					int retries = 3;
// 
//					while (!navigated && retries > 0) {
//						try {
//							// Step 1: Click Modules icon
//							WebElement C_icon = wait.until(
//									ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//							HelperClass.safeClick(C_icon, "Modules Icon");
// 
//							// Step 2: Click Home inside Modules
//							WebElement C_home = wait.until(ExpectedConditions
//									.visibilityOf(driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//							HelperClass.safeClick(C_home, "Home inside Modules");
// 
//							// Step 3: Check if landed in New Eco or Old Eco
//							String newUrl = driver.getCurrentUrl();
// 
//							if (newUrl.contains("https://account.capium.com/home")) {
//								navigated = true; //Success → already in New Eco home
//								break;
//							} else if (newUrl.equals("https://app.capium.com/")
//									|| newUrl.equals("https://app.capium.com/")) {
//								//Got redirected to Old Eco home → Use OldEco CT path to jump to NewEco
//								try {
//									WebElement OldEcoCT = wait.until(ExpectedConditions.visibilityOf(
//											driver.findElement(By.xpath("//div[contains(text(),'Corporation Tax')]"))));
//									HelperClass.safeClick(OldEcoCT, "CT Module in Old Eco");
//									// Retry going back via Modules → Home
//									WebElement inner_C_icon = wait.until(ExpectedConditions
//											.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//									HelperClass.safeClick(inner_C_icon, "Modules Icon Inside OldEco CT");
//									WebElement inner_C_home = wait.until(ExpectedConditions.visibilityOf(
//											driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//									HelperClass.safeClick(inner_C_home, "Home inside Modules after OldEco");
//									String finalUrl = driver.getCurrentUrl();
//									if (finalUrl.contains("https://account.capium.com/home")) {
//										navigated = true;
//										break;
//									}
//								} catch (Exception oe) {
//									System.out.println("Retry OldEco→NewEco failed: " + oe.getMessage());
//								}
//							}
//							retries--;
//							System.out.println("Retrying Case 3 navigation, attempts left: " + retries);
// 
//						} catch (Exception e) {
//							retries--;
//							System.out.println(
//									"Exception in Case 3 navigation, retries left: " + retries + " -> " + e.getMessage());
//						}
//					}
//					if (!navigated) {
//						throw new RuntimeException("Failed to navigate to New Eco home after retries (Case 3).");
//					}
//					String moduleXpath = "(//h6[normalize-space()='" + Module + "']/ancestor::div[@class='card'])[2]";
//					WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
//					HelperClass.scrollIntoView(targetModule);
//					HelperClass.safeClick(targetModule, Module + " Module");
//					return;
//				}
// 
//				throw new RuntimeException("Unknown page state → Cannot navigate to module: " + Module);
//	}
// 
// 
	
//	public void NavigateToModule() {
//		// Wait for URL to stabilize
//				wait.until(d -> d.getCurrentUrl() != null && !d.getCurrentUrl().isEmpty());
//				String currentUrl = driver.getCurrentUrl();
//				System.out.println("Current URL: <<" + currentUrl + ">>");
//				// Case 1: Already in New Eco Home
//				if (currentUrl.contains("https://account.capium.com/home")) {
//					String moduleXpath = "(//h6[normalize-space()='Corporation Tax']/ancestor::div[@class='card'])[2]";
//					WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
//				cr	HelperClass.sollIntoView(targetModule);
////					HelperClass.safeClick(targetModule, "CT.50" + " Module");
//					HelperClass.clickWithRetry(targetModule, driver, wait);
//					return;
//				}
//				// Case 2: Old Eco Homepage (Circle Page)
//				if (currentUrl.equals("https://app.capium.com/") || currentUrl.equals("https://app.capium.com")) {
//					boolean navigated = false;
//					int retries = 3;
//					while (!navigated && retries > 0) {
//						try {
//							WebElement OldEcoCT = wait.until(ExpectedConditions
//									.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Corporation Tax')]"))));
//							HelperClass.safeClick(OldEcoCT, "CT Module in Old Eco");
//							WebElement C_icon = wait.until(
//									ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//							HelperClass.safeClick(C_icon, "Modules Icon");
//							WebElement C_home = wait.until(ExpectedConditions
//									.visibilityOf(driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//							HelperClass.safeClick(C_home, "Home inside Modules");
//							String newUrl = driver.getCurrentUrl();
//							if (newUrl.contains("https://account.capium.com/home")) {
//								navigated = true;
//							} else {
//								retries--;
//								System.out.println("Navigation did not reach New Eco, retries left: " + retries);
//							}
//						} catch (Exception e) {
//							retries--;
//							System.out.println(
//									"Exception during Old Eco navigation, retries left: " + retries + " -> " + e.getMessage());
//						}
//					}
//					if (!navigated) {
//						throw new RuntimeException("Failed to navigate to New Eco after retries");
//					}
//					// Click target module after navigation
//					String moduleXpath = "(//h6[normalize-space()='Corporation Tax']/ancestor::div[@class='card'])[2]";
//					WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
//					HelperClass.scrollIntoView(targetModule);
//					HelperClass.safeClick(targetModule, "CT.5.0" + " Module");
//					return;
//				}
//				// Case 3: Already inside another module (Accounts/Payroll/etc.)
//				if (currentUrl.startsWith("https://app.capium.com/")
//&& !currentUrl.equals("https://app.capium.com/")) {
//					boolean navigated = false;
//					int retries = 3;
//					while (!navigated && retries > 0) {
//						try {
//							// Step 1: Click Modules icon
//							WebElement C_icon = wait.until(
//									ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//							HelperClass.safeClick(C_icon, "Modules Icon");
//							// Step 2: Click Home inside Modules
//							WebElement C_home = wait.until(ExpectedConditions
//									.visibilityOf(driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//							HelperClass.safeClick(C_home, "Home inside Modules");
//							// Step 3: Check if landed in New Eco or Old Eco
//							String newUrl = driver.getCurrentUrl();
//							if (newUrl.contains("https://account.capium.com/home")) {
//								navigated = true; //Success → already in New Eco home
//								break;
//							} else if (newUrl.equals("https://app.capium.com/")
//									|| newUrl.equals("https://app.capium.com")) {
//								//Got redirected to Old Eco home → Use OldEco CT path to jump to NewEco
//								try {
//									WebElement OldEcoCT = wait.until(ExpectedConditions.visibilityOf(
//											driver.findElement(By.xpath("//div[contains(text(),'Corporation Tax')]"))));
//									HelperClass.safeClick(OldEcoCT, "CT Module in Old Eco");
//									// Retry going back via Modules → Home
//									WebElement inner_C_icon = wait.until(ExpectedConditions
//											.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//									HelperClass.safeClick(inner_C_icon, "Modules Icon Inside OldEco CT");
//									WebElement inner_C_home = wait.until(ExpectedConditions.visibilityOf(
//											driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//									HelperClass.safeClick(inner_C_home, "Home inside Modules after OldEco");
//									String finalUrl = driver.getCurrentUrl();
//									if (finalUrl.contains("https://account.capium.com/home")) {
//										navigated = true;
//										break;
//									}
//								} catch (Exception oe) {
//									System.out.println("Retry OldEco→NewEco failed: " + oe.getMessage());
//								}
//							}
//							retries--;
//							System.out.println("Retrying Case 3 navigation, attempts left: " + retries);
//						} catch (Exception e) {
//							retries--;
//							System.out.println(
//									"Exception in Case 3 navigation, retries left: " + retries + " -> " + e.getMessage());
//						}
//					}
//					if (!navigated) {
//						throw new RuntimeException("Failed to navigate to New Eco home after retries (Case 3).");
//					}
//					String moduleXpath = "(//h6[normalize-space()='Corporation Tax']/ancestor::div[@class='card'])[2]";
//					WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
//					HelperClass.scrollIntoView(targetModule);
//					HelperClass.safeClick(targetModule, "CT 5.0" + " Module");
//					return;
//				}
//				throw new RuntimeException("Unknown page state → Cannot navigate to module: " + "CT5.0");
//	}

	public void NavigateToModule(String Module) {
		// Wait for URL to stabilize
		wait.until(d -> d.getCurrentUrl() != null && !d.getCurrentUrl().isEmpty());
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: <<" + currentUrl + ">>");
		// Case 1: Already in New Eco Home
if (currentUrl.contains("account.capium.com/home")) {
		//if (currentUrl.contains("account.beta.capium.co.uk/")) {
			// String moduleXpath = "//h6[normalize-space()='" + Module +
			// "']/ancestor::div[@class='card']";
//			String moduleXpath = "(//h6[normalize-space()='" + Module + "']/ancestor::div[@class='card'])[last()]";
//			String moduleXpath = "(//h6[contains(normalize-space(), '" + Module + "')]/ancestor::a)[last()]";
			String moduleXpath = "(//h6[normalize-space()='"+Module+"']/ancestor::div[@class='card'])[last()]";

			WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
			HelperClass.scrollIntoView(targetModule);
			HelperClass.clickWithRetry(targetModule, driver, wait);
//			HelperClass.safeClick(targetModule, Module + " Module");
			return;
		}
		// Case 2: Old Eco Homepage (Circle Page)
		if (currentUrl.equals("https://app.capium.com/") || currentUrl.equals("https://app.capium.com")) {
		//if (currentUrl.equals("https://app.beta.capium.co.uk/") || currentUrl.equals("https://app.beta.capium.co.uk")) {
			boolean navigated = false;
			int retries = 3;
			while (!navigated && retries > 0) {
				try {
					WebElement OldEcoCT = wait.until(ExpectedConditions
							.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Accounts Production')]"))));
					HelperClass.clickWithRetry(OldEcoCT, driver, wait);

//					HelperClass.safeClick(OldEcoCT, "CT Module in Old Eco");
					WebElement C_icon = wait.until(
							ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//					HelperClass.safeClick(C_icon, "Modules Icon");
					HelperClass.clickWithRetry(C_icon, driver, wait);
					WebElement C_home = wait.until(ExpectedConditions
							.visibilityOf(driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//					HelperClass.safeClick(C_home, "Home inside Modules");
					HelperClass.clickWithRetry(C_home, driver, wait);
					String newUrl = driver.getCurrentUrl();
				if (newUrl.contains("account.capium.com/home")) {
					//if (newUrl.contains("account.beta.capium.co.uk/")) {
						navigated = true;
					} else {
						retries--;
						System.out.println("Navigation did not reach New Eco, retries left: " + retries);
					}
				} catch (Exception e) {
					retries--;
					System.out.println(
							"Exception during Old Eco navigation, retries left: " + retries + " -> " + e.getMessage());
				}
			}
			if (!navigated) {
				throw new RuntimeException("Failed to navigate to New Eco after retries");
			}
			// Click target module after navigation
			// String moduleXpath = "//h6[normalize-space()='" + Module +"']/ancestor::div[@class='card']";
//			String moduleXpath = "(//h6[normalize-space()='" + Module + "']/ancestor::div[@class='card'])[last()]";
//			String moduleXpath = "(//h6[contains(normalize-space(), '" + Module + "')]/ancestor::a)[last()]";

			String moduleXpath = "(//h6[normalize-space()='"+Module+"']/ancestor::div[@class='card'])[last()]";
			WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
			HelperClass.scrollIntoView(targetModule);
//			HelperClass.safeClick(targetModule, Module + " Module");
			HelperClass.clickWithRetry(targetModule, driver, wait);
			return;
		}
		// Case 3: Already inside another module (Accounts/Payroll/etc.)
		if (currentUrl.startsWith("https://app.capium.com/") && !currentUrl.equals("https://app.capium.com/")) {
	//	if (currentUrl.startsWith("https://app.beta.capium.co.uk/")&& !currentUrl.equals("https://app.beta.capium.co.uk/")) {
			boolean navigated = false;
			int retries = 3;
			while (!navigated && retries > 0) {
				try {
					WebElement C_icon = wait.until(
							ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//					HelperClass.safeClick(C_icon, "Modules Icon");
					HelperClass.clickWithRetry(C_icon, driver, wait);
					WebElement C_home = wait.until(ExpectedConditions
							.visibilityOf(driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//					HelperClass.safeClick(C_home, "Home inside Modules");
					HelperClass.clickWithRetry(C_home, driver, wait);
					String newUrl = driver.getCurrentUrl();
				if (newUrl.contains("account.capium.com/home")) {
				//	if (newUrl.contains("account.beta.capium.co.uk/")) {
						navigated = true;
						break;
					}
				else if (newUrl.equals("https://app.capium.com/") || newUrl.equals("https://app.capium.com")) {
					//else if (newUrl.equals("https://app.beta.capium.co.uk/")|| newUrl.equals("https://app.beta.capium.co.uk")) {
						try {
							WebElement OldEcoCT = wait.until(ExpectedConditions.visibilityOf(
									driver.findElement(By.xpath("//div[contains(text(),'Accounts Production')]"))));
//							HelperClass.safeClick(OldEcoCT, "CT Module in Old Eco");
							HelperClass.clickWithRetry(C_home, driver, wait);
							WebElement inner_C_icon = wait.until(ExpectedConditions
									.visibilityOf(driver.findElement(By.xpath("//a[@title='Modules']"))));
//							HelperClass.safeClick(inner_C_icon, "Modules Icon Inside OldEco CT");
							HelperClass.clickWithRetry(C_home, driver, wait);
							WebElement inner_C_home = wait.until(ExpectedConditions.visibilityOf(
									driver.findElement(By.xpath("//a[@href='/' and contains(@class,'my')]"))));
//							HelperClass.safeClick(inner_C_home, "Home inside Modules after OldEco");
							HelperClass.clickWithRetry(C_home, driver, wait);
							String finalUrl = driver.getCurrentUrl();
//							if (finalUrl.contains("account.capium.com/home")) {
							if (finalUrl.contains("account.beta.capium.co.uk/")) {
								navigated = true;
								break;
							}
						} catch (Exception oe) {
							System.out.println("Retry OldEco→NewEco failed: " + oe.getMessage());
						}
					}
					retries--;
					System.out.println("Retrying Case 3 navigation, attempts left: " + retries);
				} catch (Exception e) {
					retries--;
					System.out.println(
							"Exception in Case 3 navigation, retries left: " + retries + " -> " + e.getMessage());
				}
			}
			if (!navigated) {
				throw new RuntimeException("Failed to navigate to New Eco home after retries (Case 3).");
			}
			// String moduleXpath = "//h6[normalize-space()='" + Module +
			// "']/ancestor::div[@class='card']";
//			String moduleXpath = "(//h6[normalize-space()='" + Module + "']/ancestor::div[@class='card'])[last()]";
//			String moduleXpath = "(//h6[contains(normalize-space(), '" + Module + "')]/ancestor::a)[last()]";

			String moduleXpath = "(//h6[normalize-space()='"+Module+"']/ancestor::div[@class='card'])[last()]";
			WebElement targetModule = HelperClass.waitForVisibility(driver.findElement(By.xpath(moduleXpath)));
			HelperClass.scrollIntoView(targetModule);
//			HelperClass.safeClick(targetModule, Module + " Module");
			HelperClass.clickWithRetry(targetModule, driver, wait);
			return;
		}
		throw new RuntimeException("Unknown page state → Cannot navigate to module: " + Module);
	}
}