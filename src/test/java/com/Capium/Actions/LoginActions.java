package com.Capium.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.LoginLocators;
import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;



public class LoginActions {

	LoginLocators loginLocators = null;
	WebDriverWait wait=HelperClass.getWait();
	WebDriver driver=HelperClass.getDriver();

	public LoginActions() {
		this.loginLocators = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginLocators);
	}
	
//	public void ClickOnAccountantLogin() {
	//	wait.until(ExpectedConditions.visibilityOf(loginLocators.AccountantLogin));
//		HelperClass.ClickUsingJS(driver, loginLocators.AccountantLogin);
	//}

	public void EnterUsername(String username) {
		loginLocators.inputUsername.clear();
		loginLocators.inputUsername.sendKeys(username);

	}

	public void EnterPassword(String password) {
		loginLocators.inputPassword.clear();
		loginLocators.inputPassword.sendKeys(password);
	}

	public void ClickLoginbtn() throws Exception {
		loginLocators.btnLogin.click();
		Thread.sleep(5000);
	}

	public boolean isHomePage() {
		try {
			return loginLocators.Homepage_Element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	

	public void navigateToCorporationTaxModule() {
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(3));
 
		try {
			if (isElementVisible(loginLocators.CorporationTax_Module, wait)) {
				loginLocators.CorporationTax_Module.click();
				System.out.println("Navigated to CorporationTax 5.0 module from Homepage.");
				return;
			}
 
			if (isElementVisible(loginLocators.C_icon_inside_modules, wait)) {
			    loginLocators.C_icon_inside_modules.click();
			    Thread.sleep(2000);
			    wait.until(ExpectedConditions.visibilityOf(loginLocators.InsideCiconHomebutton));
 
			    // Try Home button first...
			    if (isElementVisible(loginLocators.InsideCiconHomebutton, wait)) {
			        loginLocators.InsideCiconHomebutton.click();
			        System.out.println("Navigated to Capium365 module from inside 3.0 module.");
			        return;
			    }
 
			    if (isElementVisible(loginLocators.CorporationTax_Module, wait)) {
			        // 1️⃣ Wait until clickable
			        WebElement corp = wait.until(ExpectedConditions.elementToBeClickable(loginLocators.CorporationTax_Module));
 
			        // 2️⃣ Scroll into view via JS
			        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", corp);
 
			        // 3️⃣ Use JavaScript click for robustness
			        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", corp);
			        System.out.println("Navigated to CorporationTax 5.0 module from Homepage.");
			        return;
			    }
			}
 
			System.out.println("Capium365 module could not be found in any known location.");
 
		} catch (Exception e) {
			System.out.println("Error while navigating to Capium365 module.");
			e.printStackTrace();
		}
	}
	
	public void Logout() {
        WebDriver driver = HelperClass.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
 
        int attempts = 0;
 
        while (attempts < 3) {
            try {
                // Always re-initialize locators for fresh references
                loginLocators = PageFactory.initElements(driver, LoginLocators.class);
 
                // CASE 1: 5.0 Module Logout
                if (isElementVisible(loginLocators.FivePointProfileIcon, wait)) {
                    wait.until(ExpectedConditions.elementToBeClickable(loginLocators.FivePointProfileIcon)).click();
 
                    if (isElementVisible(loginLocators.SignoutFivePointZero, wait)) {
                        wait.until(ExpectedConditions.elementToBeClickable(loginLocators.SignoutFivePointZero)).click();
                        System.out.println("Logged out via 5.0 Profile Icon.");
                        break;
                    }
                }
                // CASE 2: Homepage Logo → Logout
                else if (isElementVisible(loginLocators.Logo_in_homepage, wait)) {
                    wait.until(ExpectedConditions.elementToBeClickable(loginLocators.Logo_in_homepage)).click();
 
                    if (isElementVisible(loginLocators.Logout_inside_logo, wait)) {
                        wait.until(ExpectedConditions.elementToBeClickable(loginLocators.Logout_inside_logo)).click();
                        System.out.println("Logged out via Logo in homepage.");
                        break;
                    }
                }
                // CASE 3: Direct Logout Icon
                else if (isElementVisible(loginLocators.Logout_element, wait)) {
                    wait.until(ExpectedConditions.elementToBeClickable(loginLocators.Logout_element)).click();
                    System.out.println("Logged out via direct logout element.");
                    break;
                }
 
                // Validate that login page appears after logout
                wait.until(ExpectedConditions.or(
                        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='Sign In']")),
                        ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='Accountant Login']"))
                ));
 
                System.out.println("Successfully redirected to login page.");
                break;
 
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                System.out.println("Stale element during logout. Retrying...");
                attempts++;
            } catch (Exception e) {
                System.out.println("Logout failed: " + e.getMessage());
                e.printStackTrace();
                break;
            }
        }HelperClass.tearDown();
    }
 
 
	public boolean isElementVisible(WebElement element, WebDriverWait wait) {
	    try {
	        wait.until(ExpectedConditions.visibilityOf(element));
	        return element.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	public void navigateToCorporationTaxModule1() {
	    WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(3));
 
	    try {
	        boolean navigated = false;
 
	        while (!navigated) {
 
	            if (isElementVisible(loginLocators.CorporationTax_Module, wait)) {
	                loginLocators.CorporationTax_Module.click();
	                System.out.println("Navigated to TimeAndFees module from Homepage.");
	                navigated = true;
	                break;
	            }
 
	            List<WebElement> oldEcoModules = HelperClass.getDriver().findElements(
	                By.xpath("//a/div[contains(@class,'circle') and " +
	                         "(normalize-space()='Accounts Production' " +
	                         "or normalize-space()='Self Assessment' " +
	                         "or normalize-space()='Corporation Tax' " +
	                         "or normalize-space()='Bookkeeping')]")
	            );
 
	            if (!oldEcoModules.isEmpty()) {
	                System.out.println("Old Eco space detected. Found " + oldEcoModules.size() + " modules.");
 
	                boolean clickedModule = false;
 
	                for (WebElement module : oldEcoModules) {
	                    String classAttr = module.getAttribute("class");
	                    if (classAttr != null && (classAttr.contains("disabled") || classAttr.contains("lock"))) {
	                        System.out.println("Skipping locked module: " + module.getText());
	                        continue;
	                    }
 
	                    if (module.isDisplayed() && module.isEnabled()) {
	                        System.out.println("Clicking Old Eco module: " + module.getText());
	                        module.click();
	                        clickedModule = true;
	                        break;
	                    }
	                }
 
	                if (clickedModule) {
	                    try {
	                        WebElement cIcon = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5))
	                                                .until(ExpectedConditions.elementToBeClickable(loginLocators.C_icon_inside_modules));
	                        cIcon.click();
 
	                        WebElement homeIcon = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5))
	                                                .until(ExpectedConditions.elementToBeClickable(loginLocators.InsideCiconHome));
	                        homeIcon.click();
 
	                        System.out.println("Clicked Home from C icon inside Old Eco module.");
	                    } catch (StaleElementReferenceException sere) {
	                        System.out.println("Stale element detected for C icon. Retrying in next loop...");
	                    } catch (TimeoutException te) {
	                        System.out.println("C icon or Home icon not clickable yet. Will retry in next loop.");
	                    }
	                }
 
 
	                continue;
	            }
 
	            if (isElementVisible(loginLocators.C_icon_inside_modules, wait)) {
	                loginLocators.C_icon_inside_modules.click();
	                wait.until(ExpectedConditions.visibilityOf(loginLocators.InsideCiconHome));
 
	                if (isElementVisible(loginLocators.InsideCiconHome, wait)) {
	                    loginLocators.InsideCiconHome.click();
	                    System.out.println("Navigated Home from inside 5.0 module.");
	                }
 
	                continue;
	            }
 
	            Thread.sleep(500);
	        }
 
	    } catch (Exception e) {
	        System.out.println("Error while navigating to TimeAndFees module: " + e.getMessage());
	      //  Log.info("Error while navigating to TimeAndFees module.", "Anwar", "Redirection To TimeAndFees Module");
	    }
	}
	
}

