package com.Capium.Actions;

import org.testng.Assert;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.LoginLocators;
import com.Capium.Locators.ManageLocators;
import com.Capium.Utilites.HelperClass;
import org.testng.Assert;
import org.testng.Assert;

public class ManageActions {
	ManageLocators manage= null;
	public ManageActions() {
		this.manage = new ManageLocators();
		PageFactory.initElements(HelperClass.getDriver(),manage);
	}

WebDriver driver = HelperClass.getDriver();
WebDriverWait wait=HelperClass.getWait();


public void verifyandselectmanage() throws TimeoutException {
	 HelperClass.waitForPageToLoad(driver);
//	 By manage =By.xpath("//span[normalize-space()='Manage']");
//	 fastAngularClick(driver, manage, "Export");
//
//	
	 try {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	     // Use the outerHTML <a> element and its span text
	     WebElement Manage = wait.until(ExpectedConditions
	             .elementToBeClickable(By.xpath("//span[normalize-space()='Manage']")));

	     Manage.click();
	     HelperClass.waitForPageToLoad(driver);

	     System.out.println("Manage clicked successfully.");
	 } catch (Exception e) {
	     throw new RuntimeException("Unexpected error while clicking Manage: " + e.getMessage(), e);
	 }
	}
	

	private void fastAngularClick(WebDriver driver2, By manage2, String string) {
	
	
}


	public void verifyandSelectClient() throws InterruptedException {
//		 By Clients =By.xpath("(//span[normalize-space()='Clients'])[1]");
//		 fastAngularClick(driver, Clients, "Clients");
//		
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Clients);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Clients);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Clients);
		 HelperClass.validatePageText(driver,"Add Client",By.xpath("//span[contains(text(),'Add Client')]"));
	   
		
	}

		
		public void verifyandSelectUsers() throws InterruptedException, TimeoutException {
		    HelperClass.waitForPageToLoad(driver);
		    
//		    By Users =By.xpath("//span[contains(text(),'User')]");
//			 fastAngularClick(driver,Users, "Users");
			
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		        // Locate and click the "User" button
		        WebElement userButton = wait.until(ExpectedConditions
		            .elementToBeClickable(By.xpath("//span[contains(text(),'User')]")));

		        userButton.click();
		        HelperClass.waitForPageToLoad(driver);

		        // Wait for a unique element on the User page (change the XPath to suit your page)
		        WebElement users = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//span[contains(text(),'User')]")  // Update if different on your page
		        ));

		        // Validate navigation success
		        boolean isOnUserPage = users.isDisplayed();
		        Assert.assertTrue(isOnUserPage, " Navigated to 'User' page successfully.");

		        System.out.println(" 'User' clicked and validated successfully.");

		    } catch (Exception e) {
		        Assert.fail(" Unexpected error while clicking 'User': " + e.getMessage());
		    }
		

	}		
	  
	public void verifyandSelectImport() throws InterruptedException {
//		By Import =By.xpath("//mat-icon[@title='Import']//parent::div");
//		 fastAngularClick(driver,Import, "Import");
		
		 HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Import);
		 HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Import);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Import);
		 HelperClass.waitForPageToLoad(driver);
		 HelperClass.validatePageText(driver,"Import Data",By.xpath("//p[normalize-space()='Import Data']"));
	
		
		
	}
	public void verifyandSelectExport() throws InterruptedException {
		 HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Export);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Export);
		 HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Export);
		 HelperClass.validatePageText(driver,"Export Data",By.xpath("//p[normalize-space()='Export Data']"));
	
	    }	
		
	
	public void verifyandSelectPermission() throws InterruptedException {
		 HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Permission);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Permission);
		 HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Permission);
		 HelperClass.waitForPageToLoad(driver);
		 HelperClass.validatePageText(driver,"Admin Access",By.xpath("//th[normalize-space()='Admin Access']"));
	
	}
		
		
		

	

    public void clickAdduser() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.adduser);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.adduser);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.adduser);
    	
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//ng-select[@formcontrolname='title'])[1]","Mr");
		  
		  
		  try {
			    WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));

			    // Locate the selected value inside the title dropdown
			    WebElement selectedTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("(//ng-select[@formcontrolname='title'])[1]//span[contains(@class,'ng-value-label')]")
			    ));

			    String actualText = selectedTitle.getText().trim();
			    String expectedText = "Mr";

			    if (actualText.equals(expectedText)) {
			        System.out.println("✅ Title selected correctly: " + actualText);
			    } else {
			        throw new AssertionError("❌ Incorrect title selected! Expected: '" + expectedText + "', but found: '" + actualText + "'");
			    }

			} catch (Exception e) {
			    System.err.println("❌ Failed to validate title selection: " + e.getMessage());
			    Assert.fail("Title dropdown validation failed: " + e.getMessage());
			}

}
    public void verifyAndEnterfirstmiddleandlastname(String firstName, String middleName, String lastName, String email) throws InterruptedException, TimeoutException {
        HelperClass.waitForPageToLoad(driver);

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // First Name
            WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@formcontrolname='firstName']")));
            firstNameField.clear();
            firstNameField.sendKeys(firstName);
//            Assert.assertEquals(firstNameField.getAttribute("value").trim(), firstName, "First name not entered correctly!");

            // Middle Name
            WebElement middleNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@formcontrolname='middleName']")));
            middleNameField.clear();
            middleNameField.sendKeys(middleName);
//            Assert.assertEquals(middleNameField.getAttribute("value").trim(), middleName, "Middle name not entered correctly!");

            // Last Name
            WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@formcontrolname='lastName']")));
            lastNameField.clear();
            lastNameField.sendKeys(lastName);
        	HelperClass.scrollIntoView(manage.emailtextfield);
//            Assert.assertEquals(lastNameField.getAttribute("value").trim(), lastName, "Last name not entered correctly!");

            // Email
            
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(

                    By.xpath("//input[@formcontrolname='email']")));
            emailField.clear();
            emailField.sendKeys(email);
            
           
//            Assert.assertEquals(emailField.getAttribute("value").trim(), email, "Email not entered correctly!");

            // Optional success logs
            System.out.println("First name entered: " + firstName);
            System.out.println("Middle name entered: " + middleName);
            System.out.println("Last name entered: " + lastName);
            System.out.println("Email entered: " + email);

        } catch (Exception e) {
            throw new RuntimeException("Error while entering user details: " + e.getMessage(), e);
        }
    }
        public void selectadministratorfromdropdown() throws InterruptedException {
        	 HelperClass.waitForPageToLoad(driver);       	
        HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='permissions']","Administrator");

		  
  		try {
  		    WebDriverWait wait1 = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));

  		    // Wait for the selected value label to appear inside the dropdown
  		    WebElement selectedValue = wait1.until(ExpectedConditions.visibilityOfElementLocated(
  		        By.xpath("//ng-select[@formcontrolname='permissions']//span[contains(@class, 'ng-value-label')]")
  		    ));

  		    String actualText = selectedValue.getText().trim();
  		    String expectedText = "Administrator";

  		    if (actualText.equals(expectedText)) {
  		        System.out.println(" Permission selected correctly: " + actualText);
  		    } else {
  		        throw new AssertionError("Incorrect permission selected! Expected: '" + expectedText + "', but found: '" + actualText + "'");
  		    }

  		} catch (Exception e) {
  		    System.err.println(" Failed to validate selected permission: " + e.getMessage());
  		    Assert.fail("Permission dropdown validation failed: " + e.getMessage());
  		}
    	HelperClass.scrollIntoView(manage.BusinessdropdowninUsers);

        Thread.sleep(2000);
    }

        
        public void selectRegularUser() throws InterruptedException {
            try {
                HelperClass.selectFromCustomDropdown(
                    HelperClass.getDriver(),
                    "//ng-select[@formcontrolname='permissions']",
                    "Regular User"
                );

                WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
                WebElement selectedValue = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//ng-select[@formcontrolname='permissions']//span[contains(@class, 'ng-value-label')]")
                ));

                String actualText = selectedValue.getText().trim();
                String expectedText = "Regular User";

                if (actualText.equals(expectedText)) {
                    System.out.println(" Permission selected correctly: " + actualText);
                    Assert.assertTrue(true, "Permission 'Regular User' selected successfully.");
                } else {
                    System.err.println(" Incorrect permission selected! Expected: '" + expectedText + "', but found: '" + actualText + "'");
                    Assert.fail("Incorrect permission selected! Expected: '" + expectedText + "', but found: '" + actualText + "'");
                }

            } catch (Exception e) {
                System.err.println(" Failed to select or validate 'Regular User': " + e.getMessage());
                Assert.fail("Exception during permission selection: " + e.getMessage());
            }

          
            HelperClass.scrollIntoView(manage.BusinessdropdowninUsers);
            Thread.sleep(2000); 
        }

        public void selectManager() throws InterruptedException {
            try {
                HelperClass.selectFromCustomDropdown(
                    HelperClass.getDriver(),
                    "//ng-select[@formcontrolname='permissions']",
                    "Manager"
                );

                WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
                WebElement selectedValue = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//ng-select[@formcontrolname='permissions']//span[contains(@class, 'ng-value-label')]")
                ));

                String actualText = selectedValue.getText().trim();
                String expectedText = "Manager";

                if (actualText.equals(expectedText)) {
                    System.out.println(" Permission selected correctly: " + actualText);
                    Assert.assertTrue(true, "Permission 'Manager' selected successfully.");
                } else {
                    System.err.println(" Incorrect permission selected! Expected: '" + expectedText + "', but found: '" + actualText + "'");
                    Assert.fail("Incorrect permission selected! Expected: '" + expectedText + "', but found: '" + actualText + "'");
                }

            } catch (Exception e) {
                System.err.println(" Failed to select or validate 'Manager': " + e.getMessage());
                Assert.fail("Exception during permission selection: " + e.getMessage());
            }

          
            HelperClass.scrollIntoView(manage.BusinessdropdowninUsers);
            Thread.sleep(2000); 
        }

        
        public void validateFirstUserIsActive() {

        	 HelperClass.waitForPageToLoad(driver);
 		    try {
 		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

 		        // Locate and click the "User" button
 		        WebElement userButton = wait.until(ExpectedConditions
 		            .elementToBeClickable(By.xpath("//span[contains(text(),'User')]")));

 		        userButton.click();
 		        HelperClass.waitForPageToLoad(driver);

 		        // Wait for a unique element on the User page (change the XPath to suit your page)
 		        WebElement users = wait.until(ExpectedConditions.visibilityOfElementLocated(
 		            By.xpath("//span[contains(text(),'User')]")  // Update if different on your page
 		        ));

 		        // Validate navigation success
 		        boolean isOnUserPage = users.isDisplayed();
 		        Assert.assertTrue(isOnUserPage, "✅ Navigated to 'User' page successfully.");

 		        System.out.println(" 'User' clicked and validated successfully.");

 		    } catch (Exception e) {
 		        Assert.fail(" Unexpected error while clicking 'User': " + e.getMessage());
 		    }
 		

 			
        	
        	
        	
        	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       	    wait.until(ExpectedConditions.textToBe(By.xpath("(//table//tr[1]//td)[last()]"), ""));
        
       	    String actualText = HelperClass.getText(By.xpath("(//table//tr[1]//td)[last()]"));
       	    String expectedText = "";
        
       	    if (actualText.equals(expectedText)) {
       	        //  Case 1: Form cleared — pass
       	        Assert.assertTrue(true, "First user is Active");
       	    } else {
       	        //  Case 2: Form not cleared — fail with message
       	        Assert.fail("First user is NOT Active" + actualText + "'");
       	    }
       	}
        
        
        

        	public void SelectbusinessdropdownfromUsers() {
        	    HelperClass.waitForPageToLoad(driver);
        	    manage.BusinessdropdowninUsers.sendKeys("postal");
        	}
////        	    try {
////        	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        	        
//        	        // Locate and click the dropdown to open
//        	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
//        	            By.xpath("//ng-select[@formcontrolname='addressType']")
//        	        ));
//        	        dropdown.click();
//
//        	        // Wait and click the option
//        	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
//        	            By.xpath("//ng-select[@formcontrolname='addressType']" + addressType + "')]")
//        	        ));
//        	        option.click();
//
//        	        // Wait a bit for the UI to update the selected value
//        	        Thread.sleep(1000);
//
//        	        // Now validate if the selected value in the dropdown matches expected
//        	        WebElement selectedValue = driver.findElement(By.xpath("//ng-select[@formcontrolname='addressType']//span[@class='ng-value-label']"));
//        	        String actualSelected = selectedValue.getText().trim();
//
//        	        if (actualSelected.equals(addressType)) {
//        	            Assert.assertTrue(true, "Selected address type is correct: " + actualSelected);
//        	            System.out.println("Validation Passed: Selected address type is " + actualSelected);
//        	        } else {
//        	            Assert.fail("Validation Failed: Expected address type '" + addressType + "' but found '" + actualSelected + "'");
//        	        }
//
//        	    } catch (Exception e) {
//        	        Assert.fail("Exception occurred while selecting address type: " + e.getMessage());
//        	    }
//        	}

     
	   public void verifyAndEnterAddressDetails(String address, String city, String county) throws InterruptedException {
		    HelperClass.waitForPageToLoad(driver);

		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		        // Address
		        WebElement addressField = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//input[@formcontrolname='address']")));
		        addressField.clear();
		        addressField.sendKeys(address);

		        // City
		        WebElement cityField = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//input[@formcontrolname='city']")));
		        cityField.clear();
		        cityField.sendKeys(city);

		        // County
		        WebElement countyField = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//input[@formcontrolname='county']")));
		        countyField.clear();
		        countyField.sendKeys(county);

		        // Validation for each field
		        String actualAddress = addressField.getAttribute("value").trim();
		        String actualCity = cityField.getAttribute("value").trim();
		        String actualCounty = countyField.getAttribute("value").trim();

		        try {
		            Assert.assertTrue(actualAddress.equals(address),
		                "Address not entered correctly! Expected: '" + address + "', but found: '" + actualAddress + "'");
		            Assert.assertTrue(actualCity.equals(city),
		                "City not entered correctly! Expected: '" + city + "', but found: '" + actualCity + "'");
		            Assert.assertTrue(actualCounty.equals(county),
		                "County not entered correctly! Expected: '" + county + "', but found: '" + actualCounty + "'");
		            System.out.println("✅ Address details entered and validated successfully.");
		        } catch (AssertionError ae) {
		            Assert.fail("Validation failed for address details: " + ae.getMessage());
		        }

		    } catch (Exception e) {
		        throw new RuntimeException("Error while entering address details: " + e.getMessage(), e);
		    }
	   }
//		    public void SelectCountryFromUsers() {
//		    	manage.CountrydropdownInusers.sendKeys("india");
//		        HelperClass.waitForPageToLoad(driver);
//		    }
//		        try {
//		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		            
//		            // Locate and click the country dropdown to open
//		            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
//		                By.xpath("(//ng-select[@formcontrolname='country'])[2]")
//		            ));
//		            dropdown.click();
//
//		            // Wait and click the option - corrected xpath syntax here
//		            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
//		                By.xpath("(//ng-select[@formcontrolname='country'])[2]" + country + "')]")
//		            ));
//		            option.click();
//
//		            // Wait a bit for the UI to update the selected value
//		            Thread.sleep(1000);
//
//		            // Validate if the selected value in the dropdown matches expected
//		            WebElement selectedValue = driver.findElement(By.xpath("//ng-select[@formcontrolname='country']//span[@class='ng-value-label']"));
//		            String actualSelected = selectedValue.getText().trim();
//
//		            if (actualSelected.equals(country)) {
//		                Assert.assertTrue(true, "Selected country is correct: " + actualSelected);
//		                System.out.println("Validation Passed: Selected country is " + actualSelected);
//		            } else {
//		                Assert.fail("Validation Failed: Expected country '" + country + "' but found '" + actualSelected + "'");
//		            }
//
//		        } catch (Exception e) {
//		            Assert.fail("Exception occurred while selecting country: " + e.getMessage());
//		        }
//		    }
//		

		    public void enterPostalCode(String postalCode) {
		        HelperClass.waitForPageToLoad(driver);
		        try {
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		            WebElement postalCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//input[@formcontrolname='postalCode']")
		            ));

		            postalCodeField.clear();
		            postalCodeField.sendKeys(postalCode);

		            // Validate the entered value
		            String enteredValue = postalCodeField.getAttribute("value").trim();
		            if (enteredValue.equals(postalCode)) {
		                Assert.assertTrue(true, "Postal code entered correctly: " + enteredValue);
		                System.out.println("Validation Passed: Postal code entered is " + enteredValue);
		            } else {
		                Assert.fail("Validation Failed: Expected postal code '" + postalCode + "' but found '" + enteredValue + "'");
		            }

		        } catch (Exception e) {
		            Assert.fail("Exception occurred while entering postal code: " + e.getMessage());
		        }
		    }

		    

		    	
		    public void clickSaveButtonInusers() {
		    	
		    	try {
		    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		    	    // Wait for 'Save' button to be clickable
		    	    WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(
		    	        By.xpath("//span[normalize-space()='Save']")
		    	    ));

		    	    if (saveButton.isDisplayed() && saveButton.isEnabled()) {
		    	        saveButton.click();
		    	        System.out.println("'Save' button clicked successfully.");
		    	        Assert.assertTrue(true, "'Save' button clicked successfully.");
		    	    } else {
		    	        System.err.println("'Save' button is not displayed or not enabled.");
		    	        Assert.fail("'Save' button is not ready to be clicked.");
		    	    }

		    	} catch (Exception e) {
		    	    System.err.println(" Exception while clicking Save button: " + e.getMessage());
		    	    Assert.fail("Test failed due to exception: " + e.getMessage());
		    	}
		    }
		    	    // Now wait for the success message to appear
//		    	    WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		    	        By.xpath("//*[contains(text(),'User updated successfully')]")
//		    	    ));
//
//		    	    if (successMsg.isDisplayed()) {
//		    	        System.out.println("Success message verified: 'User updated successfully'");
//		    	        Assert.assertTrue(true, "User updated successfully");
//		    	    } else {
//		    	        System.out.println("Success message not displayed");
//		    	        Assert.fail("User not updated successfully");
//		    	    }
//
//		    	} catch (Exception e) {
//		    	    System.out.println("An error occurred: " + e.getMessage());
//		    	    Assert.fail("Test failed due to exception: " + e.getMessage());
//		    	}
//
//		    

		        public void clickSaveAndInvite() {
			        try {
			            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			            WebElement saveandinvite = wait.until(ExpectedConditions.elementToBeClickable(
			                By.xpath("//span[normalize-space()='Save and Invite']")
			            ));

			            // Assert button is displayed and enabled before clicking
			            Assert.assertTrue(saveandinvite.isDisplayed() && saveandinvite.isEnabled(), "'Save and Invite' button is not ready to be clicked");

			            saveandinvite.click();
			            System.out.println("Clicked on 'Save and Invite' button successfully.");
			            Assert.assertTrue(true, "'Save and Invite' button clicked successfully.");

			        } catch (Exception e) {
			            System.err.println("Failed to click 'Save and Invite' button: " + e.getMessage());
			            Assert.fail("Could not click 'Save and Invite' button: " + e.getMessage());
			        }
		        
		 
		        }    
		        
		        
			        public void clickSaveAndExit() {
				        try {
				            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				            WebElement saveandexit = wait.until(ExpectedConditions.elementToBeClickable(
				                By.xpath("//span[normalize-space()='Save and Exit']")
				            ));

				            // Assert button is displayed and enabled before clicking
				            Assert.assertTrue(saveandexit.isDisplayed() && saveandexit.isEnabled(), "'Save and Exit' button is  ready to be clicked");

				            saveandexit.click();
				            System.out.println("Clicked on 'Save and Exit' button successfully.");
				            Assert.assertTrue(true, "'Save and Exit' button clicked successfully.");

				        } catch (Exception e) {
				            System.err.println("Failed to click 'Save and Exit' button: " + e.getMessage());
				            Assert.fail("Could not click 'Save and Exit' button: " + e.getMessage());
				        }
			        }
				        
				        public void clickCancelchanges() {
					        try {
					            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					            WebElement Cancelchanges = wait.until(ExpectedConditions.elementToBeClickable(
					                By.xpath("//span[normalize-space()='Cancel Changes']")
					            ));

					            // Assert button is displayed and enabled before clicking
					            Assert.assertTrue(Cancelchanges.isDisplayed() && Cancelchanges.isEnabled(), "'Cancel changes' button is  ready to be clicked");

					            Cancelchanges.click();
					            System.out.println("Clicked on 'Cancel changes' button successfully.");
					            Assert.assertTrue(true, "'Cancel changes' button clicked successfully.");

					        } catch (Exception e) {
					            System.err.println("Failed to click 'Cancel changes' button: " + e.getMessage());
					            Assert.fail("Could not click 'Cancel changes' button: " + e.getMessage());
					        }
		    }

		    
		    
        	
    public void verifyandSelectEmail() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.emailtextfield);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.emailtextfield);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.emailtextfield);
    	HelperClass.scrollUntilElementVisible(driver,manage.emailtextfield);
    	HelperClass.setValueUsingJS(manage.emailtextfield, "lileka5577@mytaemin.com");
    	
    	
  	  // Step 1: Wait for input field and enter value
	    WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='email'])[1]")));
	    amountInput.clear();
	    amountInput.sendKeys("divya@gmail.com");
	
	    // Step 2: Send TAB or click outside to trigger blur/change event
	    amountInput.sendKeys(Keys.TAB);
	    Thread.sleep(1000);
    }
    public void clicksaveandInvite() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.saveandinvite);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.saveandinvite);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.saveandinvite);
    }
    
    public void clickoncheckbox() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.clickoncheckbox);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.clickoncheckbox);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.clickoncheckbox);
    
    }
    public void clickdelete() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.delete);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.delete);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.delete);
    }
    public void clickyes() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.yes);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.yes);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.yes);
}
    public void clickkebabicon() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.kebab);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.kebab);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.kebab);
		Thread.sleep(5000);
}
    public void selectexporttoexcel() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.exporttoexcel);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.exporttoexcel);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.exporttoexcel);
	System.out.println("excel downloaded successfully");
    }
 
    

public void selectexporttoCSV() throws InterruptedException {
//	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.exporttoCSV);
//	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.exporttoCSV);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.exporttoCSV);
//System.out.println("CSV downloaded successfully");


    HelperClass.waitForPageToLoad(driver);
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement exportCSVButton = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']")));

        Assert.assertTrue(exportCSVButton.isDisplayed());

        exportCSVButton.click();
        HelperClass.waitForPageToLoad(driver);

        System.out.println("Export to CSV clicked successfully.");

    } catch (Exception e) {
        Assert.fail("Unexpected error while clicking Export to CSV: " + e.getMessage());
    }


     }
public void selectexporttoPDF() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.exporttoPDV);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.exporttoPDV);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.exporttoPDV);
System.out.println("PDV downloaded successfully");

}
public void Clickoncheckbox() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.clickonCheckbox);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.clickonCheckbox);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.clickonCheckbox);
}

//public void ClickonDelete() throws InterruptedException {
//	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Delete);
//	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Delete);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Delete);
//}  
public void mousehoverdelete() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[normalize-space()='delete_outline']/ancestor::button"));
	String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
	String expected = "Confirm Delete";

	if (actualText.equals(expected)) {
		System.out.println("'Confirm Delete' page verified");
	} else {
		System.out.println("Text not matched. Actual: " + actualText);
	}
	
HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space()='Yes']"));
String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Record deleted successfully']")).trim();
String expected1 = "Record deleted successfully";

if (actualText1.equals(expected1)) {
	System.out.println("'Confirm Delete' page verified");
} else {
	System.out.println("Text not matched. Actual: " + actualText1);
}
		
}

public void mousehoverdeletefornooption() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[normalize-space()='delete_outline']/ancestor::button"));
	String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
	String expected = "Confirm Delete";

	if (actualText.equals(expected)) {
		System.out.println("'Confirm Delete' page verified");
	} else {
		System.out.println("Text not matched. Actual: " + actualText);
	}
	
HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space()='No']"));
String actualText1 = HelperClass.getText(By.xpath("//span[normalize-space()='Add User']")).trim();
String expected1 = "Add User";

if (actualText1.equals(expected1)) {
	System.out.println("'Add User' page verified");
} else {
	System.out.println("Text not matched. Actual: " + actualText1);
}
   }
































public void ClickonYes() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Yes);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Yes);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Yes);
}  
public void ExportasExcel() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.ExportasExcel);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.ExportasExcel);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.ExportasExcel);
	System.out.println("excel exported successfully");
}
public void ExportasCSV() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.ExportasCSV);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.ExportasCSV);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.ExportasCSV);
	System.out.println("CSV exported successfully");
}
public void ExportasPDF() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.ExportasPDF);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.ExportasPDF);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.ExportasPDF);
	Thread.sleep(5000);
	System.out.println("PDF exported successfully");
	Thread.sleep(5000);
}
public void verifySearchtextfield() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Search);
	manage.Search.click();
	HelperClass.setValueUsingJS(manage.Search, "Vamshi");
	Thread.sleep(5000);
}
////public void clickoncheckboxofUser() {
////	manage.ClickoncheckboxofUser.click();
//public void ClickoncheckBoxofUser() throws InterruptedException {
//	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.ClickoncheckboxofUser);
//	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.ClickoncheckboxofUser);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.ClickoncheckboxofUser);
//	FluentWait<WebDriver> wait = null;
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-checkbox-80-input")));
//	driver.switchTo().frame("iframe_id_or_locator");
//	Thread.sleep(5000);


public void FirstnameTextfield() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.firstnameTextfield);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.firstnameTextfield);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.firstnameTextfield);
	//HelperClass.setValueUsingJS(manage.firstnameTextfield, "Varun");
	

	  // Step 1: Wait for input field and enter value
  WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='firstName']")));
  amountInput.clear();
  amountInput.sendKeys("Divya");

  // Step 2: Send TAB or click outside to trigger blur/change event
  amountInput.sendKeys(Keys.TAB);
  Thread.sleep(1000);
	
	
}
public void GmailTextfield() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.firstnameTextfield);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.firstnameTextfield);
	HelperClass.scrollUntilElementVisible(driver,manage.GmailTextfield );
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.GmailTextfield);
//	HelperClass.setValueUsingJS(manage.GmailTextfield, "Varun@gmail.com");
	Thread.sleep(5000);
	
	  // Step 1: Wait for input field and enter value
    WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@formcontrolname='email'])[1]")));
    amountInput.clear();
    amountInput.sendKeys("Divya@gmail.com");

    // Step 2: Send TAB or click outside to trigger blur/change event
    amountInput.sendKeys(Keys.TAB);
    Thread.sleep(1000);
}
public void Save() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Save);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Save);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Save);
	System.out.println("saved successfully");
	Thread.sleep(5000);
}
public void uploadFileWithRobot() throws Exception{
	WebDriver driver = HelperClass.getDriver(); // ✅ get driver here
	// Locate the hidden input[type='file'] element
	WebElement chooseFileButton = driver.findElement(By.xpath("//input[@type='file']"));
	chooseFileButton.sendKeys("C:\\Users\\user\\Downloads\\capium logo.jpg");

   // chooseFileButton.click();
	HelperClass.ClickUsingJS(HelperClass.getDriver(),By.xpath("//input[@formcontrolname='photo']"));
    Thread.sleep(2000);

    String filePath = "C:\\Users\\user\\Downloads\\capium logo.jpg";

    Robot robot = new Robot();
    StringSelection selection = new StringSelection(filePath);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    Thread.sleep(500);

    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
}
public void Print() throws InterruptedException {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Print);
}

public void UsersCheckbox() throws InterruptedException {
     manage.Usercheckbox.click();
}
     public void UsersCheckboxInusers() throws InterruptedException {
         manage.UserCheckboxinUsers.click();
}
public void ClickonProfileDeletion() {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.ProfileDeletion);

}
public void AddUserNoDeleteButton() {
	manage.AddUsersNoDeleteButton.click();
}
public void ExportAsExcelInAddUsers() {
	manage.ExportAsExcelInAddUsers.click();
}
public void ExportAsCSVInAddUsers() {
	manage.ExportAsCSVInAddUsers.click();
}
public void ExportAsPDFInAddUsers() {
	manage.ExportAsPDFInAddUsers.click();
}
public void IdCheckBoxUsers() {
	manage.IdCheckboxInUsers.click();
}
public void DeleteInUsers() {
	manage.DeleteInUsers.click();
}
public void YesButtonInUsers() {
	manage.YesButtonInUsers.click();
}
public void NoButtonInUsers() {
	manage.NoButtonInUsers.click();
}
public void ExportAsExcelInUsers() {
	manage.ExportAsExcelUsers.click();
}
public void ExportAsCSVInUsers() {
	manage.ExportAsCSVUsers.click();
}
public void ExportAsPDFInUsers() {
	manage.ExportAsPDFUsers.click();
}
public void CrossButtonInUsers() {
	manage.CrossButtonUsers.click();
}
public void CancelSelectionInUsers() {
	manage.CancelSelection.click();
}
public void CrossButtonInAddUsers() {
	manage.CrossButtonAddUsers.click();
}
public void CancelSelectionInAddUsers() {
	manage.CancelSelectionAddUsers.click();
}
public void EditPermissionsInAddUsers() {
	  HelperClass.scrollUntilElementVisible(driver,manage.EditPermissions);
	manage.EditPermissions.click();
}
public void TaxreturnArrowInAddUsers() {
	manage.TaxReturnArrowInAddUsers.click();
}
public void QuickreturnArrowInAddUsers() throws InterruptedException {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.QuickreturnarrowInAddUsers);
	Thread.sleep(5000);
}
public void CalculatorArrowInQuickreturnArrowInAddUsers() throws InterruptedException {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.CalculatorArrowinQuickreturnarrowInAddUsers);
	HelperClass.scrollUntilElementVisible(driver,manage.ReportsarrowInAddUsers );
	Thread.sleep(5000);
}
public void AttachmentArrowInQuickreturnArrowInAddUsers() throws InterruptedException {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.AttachmentArrowinQuickreturnarrowInAddUsers);
	HelperClass.scrollUntilElementVisible(driver,manage.ReportsarrowInAddUsers );
	Thread.sleep(5000);
}
public void ReportsArrowInQuickreturnArrowInAddUsers() throws InterruptedException {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.ReportsArrowinQuickreturnarrowInAddUsers);
	HelperClass.scrollUntilElementVisible(driver,manage.ReportsarrowInAddUsers );
	Thread.sleep(5000);
}
public void ManageArrowInAddUsers() throws InterruptedException {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.ManageArrowInAddUsers);
	HelperClass.scrollUntilElementVisible(driver,manage.CalculatorArrowInAddUsers );
	Thread.sleep(5000);
}
public void CalculatorArrowInAddUsers() {
	manage.CalculatorArrowInAddUsers.click();
	HelperClass.scrollUntilElementVisible(driver,manage.RandDenhancedexpenditureinCalculatArrow);

}
public void ViewRadioButtonIneditPermissions() {
	manage.ViewRadioButtonInEditPermission.click();
}
public void SaveButtonIneditPermissions() {
	manage.SaveButtonInEditPermission.click();
}
public void CancelButtonIneditPermissions() {
	manage.CancelButtonInEditPermission.click();
}
public void ResetToDefualtIneditPermissions() {
	manage.ResetToDefaultInEditPermission.click();
}
public void CloseIconIneditPermissions() {
	manage.CloseIconInEditPermission.click();
}
public void ThisDayDropdown() throws IOException {

HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//input[normalize-space(@aria-autocomplete)='list'])[1]", " 30 days ");
HelperClass.captureScreenshot("mandatory fields required message verified");
}

public void verifyAndEnterfirstnameandemail(String firstName, String email) throws InterruptedException, TimeoutException {
    HelperClass.waitForPageToLoad(driver);

    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // First Name
        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@formcontrolname='firstName']")));
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
       Assert.assertEquals(firstNameField.getAttribute("value").trim(), firstName, "First name not entered correctly!");

        

        // Email
        
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(

                By.xpath("//input[@formcontrolname='email']")));
        emailField.clear();
        emailField.sendKeys(email);
        
       
       Assert.assertEquals(emailField.getAttribute("value").trim(), email, "Email not entered correctly!");

        // Optional success logs
        System.out.println("First name entered: " + firstName);
        System.out.println("Email entered: " + email);

    } catch (Exception e) {
        throw new RuntimeException("Error while entering user details: " + e.getMessage(), e);
    }
	HelperClass.scrollIntoView(manage.BusinessdropdowninUsers);

}


public void verifyStatusAlldropdown() throws InterruptedException {
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
HelperClass.waitForPageToLoad(driver);
HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']","Active");
}

public void Resendinvitation() throws InterruptedException {
	Thread.sleep(10000);
HelperClass.waitForPageToLoad(driver);
HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']","Resend Invitation");
}
public void Invite() {
HelperClass.waitForPageToLoad(driver);	
HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']","Invite");
}
public void Archieved() {
HelperClass.waitForPageToLoad(driver);
HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']","Archived");	
	
}
	
	
	
}

//	// Click the dropdown (ng-select) using the arrow
//	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
//	    By.xpath("//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']")
//	));
//	dropdown.click();
//}
//
//
//
//	  public void verifyResendinvitation() throws InterruptedException {
//		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		  HelperClass.waitForPageToLoad(driver);
//		  Thread.sleep(3000);
//
//			// Click the dropdown (ng-select) using the arrow
//			WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
//			    By.xpath("//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']")
//			));
//			dropdown.click();	  
//		  HelperClass.waitForPageToLoad(driver);
//		  Thread.sleep(3000);
//			WebElement dropdown1 = wait.until(ExpectedConditions.elementToBeClickable(
//				    By.xpath("//ng-dropdown-panel//span[normalize-space(text())='Resend Invitation']")
//				));
//				dropdown1.click();  
//		  
//		  
//		  
//	  }
//}
//		  
		  
		  
		  
		  
	  
//		  WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
//				    By.xpath("//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']")
//				));
//				dropdown.click();
//		  HelperClass.waitForPageToLoad(driver);
////		  Thread.sleep(5000);
//		  WebElement dropdown1 = wait.until(ExpectedConditions.elementToBeClickable(
//				    By.xpath("//ng-dropdown-panel//span[normalize-space(text())='Resend Invitation']")
//				));
//				dropdown1.click();
//	  }
//	  public void verifyInvite() throws InterruptedException {
//		  HelperClass.waitForPageToLoad(driver);
//
//		  WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
//				    By.xpath("//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']")
//				));
//				dropdown.click();
//		  HelperClass.waitForPageToLoad(driver);
////		  Thread.sleep(3000);
//		  WebElement dropdown1 = wait.until(ExpectedConditions.elementToBeClickable(
//				    By.xpath("//ng-dropdown-panel//span[normalize-space(text())='Archived']")
//				));
//				dropdown1.click();
//	  }
//	  public void verifyArchieved() throws InterruptedException {
//		  HelperClass.waitForPageToLoad(driver);
//
//		  WebElement element=driver.findElement(By.xpath("//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']"));
//		  element.click();
//		  HelperClass.waitForPageToLoad(driver);
////		  Thread.sleep(3000);
//		  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='Archived']"));
//		  option.click();
//	  }
//	  
//}
//







