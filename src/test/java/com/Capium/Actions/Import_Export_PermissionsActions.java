package com.Capium.Actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Locators.Import_Export_PermissionsLocators;
import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;

public class Import_Export_PermissionsActions {
	
	Import_Export_PermissionsLocators importexportpermissions= null;
	public Import_Export_PermissionsActions() {
		this.importexportpermissions = new 	Import_Export_PermissionsLocators();
		PageFactory.initElements(HelperClass.getDriver(),importexportpermissions);
	}
	WebDriver driver = HelperClass.getDriver();
	
	public void ManageDashBoard() throws InterruptedException {
		Thread.sleep(3000);
			HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Manage);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Manage);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Manage);
	}
	public void Permissions() throws InterruptedException {
	
		HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Permissions);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Permissions);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Permissions);
	}
	
	public void taxreturn_Arrow() throws InterruptedException {
//		Thread.sleep(5000);
//		HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.TaxreturnArrow);
//		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.TaxreturnArrow);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.TaxreturnArrow);
//		Thread.sleep(4000);
		
			 HelperClass.waitForPageToLoad(driver);
			 try {
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

				    WebElement taxReturnButton = wait.until(ExpectedConditions
				            .elementToBeClickable(By.xpath("(//mat-icon[text()=' keyboard_arrow_right ' and contains(@class, 'mat-icon')])[3]")));

				    taxReturnButton.click();
				    HelperClass.waitForPageToLoad(driver);

				    System.out.println("Tax Return arrow clicked successfully.");
				    
				    // Pass condition
				    Assert.assertTrue(true, "Tax Return arrow clicked successfully.");
				    
				} catch (TimeoutException e) {
				    // Fail if button was not clickable in time
				    Assert.fail("Tax Return arrow not clickable within timeout: " + e.getMessage());
				    
				} catch (Exception e) {
				    // Fail on any unexpected error
				    Assert.fail("Unexpected error while clicking Tax Return arrow: " + e.getMessage());
				}

	      HelperClass.validatePageText(driver,"Accounting Period",By.xpath("//span[@title='Accounting Period']"));
		 HelperClass.validatePageText(driver,"CT600 Return",By.xpath("//span[@title='CT600 Return']"));
		 HelperClass.validatePageText(driver,"Submission History",By.xpath("//span[@title='Submission History']"));
		 HelperClass.validatePageText(driver,"Data Security",By.xpath("//span[@title='Data Security']"));

		Log.info("Accounting period,CT600 return, Submission history, Data security");
}

//	public void viewRadioButton() {
//		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.ViewRadioButton);
//		HelperClass.viewRadioButton("//table/tbody/tr[2]/td[2]/mat-radio-group/mat-radio-button/div//label[normalize-space()='View']/parent::div//input");

	
	public void Quickentry_Arrow() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Quickentryarrow);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Quickentryarrow);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Quickentryarrow);
		Thread.sleep(5000);
		HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Reportss_arrow );
		Log.info("Calculator,Attachments,Reports");
		Thread.sleep(2000);
	}
	public void Calculator_Arrow() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Calculatorarrow);
	HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Calculatorarrow);
	HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Calculatorarrow);
	Thread.sleep(5000);
}
	public void attachment_Arrow() throws InterruptedException {
	HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Attachmentsarrow );
    HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Attachmentsarrow);
	HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Attachmentsarrow);
	HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Attachmentsarrow);
	Log.info("Accounts and computation included,file attachment");
		Thread.sleep(15000);
}
	public void Reports_Arroww() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Reportss_arrow);
	    HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Reportss_arrow );
	HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Reportss_arrow);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Reportss_arrow);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Reportss_arrow);
		 HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Manage );
		Log.info("CT600 computtaion,Accounts Report (AA-217)");
}

	public void Manage_Arrow() throws InterruptedException {
		// HelperClass.scrollUntilElementVisible(driver,importexportpermissions.REportsarrow );
		 HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Calculator_Arrow);
		 Thread.sleep(5000);
	HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Manage_arrow);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Manage_arrow);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Manage_arrow);
		 HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Calculator_Arrow);
		 Thread.sleep(5000);
Log.info("email log,users log,users,exports,permission,import");
	}
	public void CalculatorArroww() throws InterruptedException {
		HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Calculator_Arrow);
	    HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Calculator_Arrow);
	    HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Calculator_Arrow);
	    HelperClass.scrollUntilElementVisible(driver,importexportpermissions.R_and_D_enhancedExpenditure);
		Thread.sleep(5000);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Calculator_Arrow);
		Log.info("Add Back,Capital Allowances,Adjustment,R&D Expenditure,Balancing Charge,Creative Enha. expenditure,Trading Losses Summary,Losses surrendered for R&D tax credit,Disallowable Expanses,R&D Enhanced Expenditure");
				
				
	}
	public void Reportss_arrow() throws InterruptedException {
		HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Reportss_arrow);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Reportss_arrow);
	    HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Reportss_arrow);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Reportss_arrow);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.Reportss_arrow);
		Log.info("CT600 Computation,Accounts Report (AA-217)");
}
	public void verifySearchtextfield() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.SearchInPermission);
		importexportpermissions.SearchInPermission.click();
		HelperClass.setValueUsingJS(importexportpermissions.SearchInPermission, "Quick Entry");
		Thread.sleep(5000);
}
	public void View_Access() throws InterruptedException {
		//HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.Calculatorarrow);
	//	HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.Calculatorarrow);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.ViewAccess);
		//Thread.sleep(5000);
	}
	public void SaveButton() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.SaveButton);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.SaveButton);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.SaveButton);
		Thread.sleep(5000);
	}
	public void SaveAndExitBUtton() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.SaveAndExitButton);
	}
	public void CancelChangesButton() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.CancelChanges);
		HelperClass.scrollUntilElementVisible(driver,importexportpermissions.Reportss_arrow);
	
}
	public void ClickOnImportOfManageScreen() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.ImportOfManageScreen);
		//HelperClass.ClickUsingJS(driver, By.xpath("//mat-icon[@title='Import']//parent::div"));
		
}
	public void ClickClientRadioButtonInImport() throws InterruptedException {
		Thread.sleep(4000);
		importexportpermissions.ClientsRadioButtonInIMPORT.click();
//		HelperClass.validateCheckboxIsSelected(driver, "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/div[1]/app-settings[1]/div[1]/div[1]/app-import-settings[1]/div[1]/div[1]/div[3]/div[1]/mat-radio-group[1]/div[1]/div[1]/mat-radio-button[1]/div[1]/div[1]/input[1]");
}
	public void ClickNextofImport() throws InterruptedException {
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.NextofImport);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.NextofImport);
}
//	public void ClickBrowseOFimport() throws InterruptedException {
//		HelperClass.scrollIntoView(importexportpermissions.BrowseOFimport);
//		importexportpermissions.BrowseOFimport.click();
//		
//	}

	public void uploadFileWithRobot() throws Exception{
		WebDriver driver = HelperClass.getDriver(); // ✅ get driver here
		
//		WebElement chooseFileButton = driver.findElement(By.xpath("//input[@type='file']"));
//		chooseFileButton.sendKeys("C:\\Users\\user\\Downloads\\capium logo.jpg");
	HelperClass.scrollIntoView(importexportpermissions.BrowseOFimport);
	   Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),By.xpath("//button[normalize-space(text())='Browse']"));
	    Thread.sleep(2000);

//	    String filePath = "C:\\Users\\user\\OneDrive\\ImportClient.xlsx";
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_L);
	    robot.keyRelease(KeyEvent.VK_L);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(500);
	    StringSelection stringSelection = new StringSelection("C:\\Users\\user\\OneDrive\\ImportClient.xlsx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	}
	public void ClickOnExportOfManageScreen() throws InterruptedException {
		importexportpermissions.ExportOfManageScreen.click();
	}
	
		public void ClickOnAllDropdownFromExport() {
			importexportpermissions.AllFromdropdown.click();
		}
		public void ClickOnThisWeekDropdownFromExport() {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Week");	
			
		}
		
		
		
//			public void ClickOnThisWeekDropdownFromExport() {
//			    // Step 1: Select "This Week" from the dropdown
//			    HelperClass.selectFromCustomDropdown(
//			        HelperClass.getDriver(),
//			        "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']",
//			        "This Week"
//			    );
//
//			    // Step 2: Wait for dropdown input to become visible
//			    WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
//			    WebElement dropdownInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
//			        By.xpath("//input[@type='text' and @aria-autocomplete='list']")
//			    ));
//
//			    // Step 3: Get value from the input
//			    String actualText = dropdownInput.getAttribute("value");
//			    String expectedText = "This Week";
//
//			    // Step 4: Use equals directly (with null check beforehand)
//			    if (actualText != null && actualText.equals(expectedText)) {
//			        System.out.println("✅ 'This Week' is correctly selected in the dropdown.");
//			        Assert.assertTrue(true, "'This Week' is selected as expected.");
//			    } else {
//			        System.out.println("❌ Validation failed! Expected: '" + expectedText + "', but found: '" + actualText + "'");
//			        Assert.fail("Dropdown selection validation failed!");
//			    }
//			}
//
//			
			
		
	public void ClickOnSaveAndNextOfImport() throws InterruptedException {
		Thread.sleep(3000);
		importexportpermissions.SaveAndNextOfImport.click();
}
	public void ClickOnNextButtonafterbrowse() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		importexportpermissions.NextButtonAfterBrowse.click();
}
	public void clickExcelInExport() {
		HelperClass.waitForPageToLoad(driver);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    HelperClass.waitForPageToLoad(driver);
	    HelperClass.scrollIntoView(importexportpermissions.ExportofExcelOFRexport);

	    WebElement excelButton = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//button[.//p[normalize-space(text())='Excel']]")  
	    ));
	    // Validate and click
	    if (excelButton.isDisplayed() && excelButton.isEnabled()) {
	        excelButton.click();
	        System.out.println(" Excel  clicked.");
	        Assert.assertTrue(true, "Excel  clicked successfully.");
	    } else {
	        System.out.println(" Excel  is not clickable.");
	        Assert.fail("Excel  is not clickable.");
	    }
	}

			
		

	public void exportForexcelInexport() throws InterruptedException {
	
		importexportpermissions.ExportofExcelOFRexport.click();
	}
//		HelperClass.waitForPageToLoad(driver);
//		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		    WebElement exportButton = wait.until(ExpectedConditions.elementToBeClickable(
//		        By.xpath("//button[normalize-space()='Export']") 
//		    ));
//		    HelperClass.waitForPageToLoad(driver);
//		    if (exportButton.isDisplayed() && exportButton.isEnabled()) {
//		        exportButton.click();
//		        System.out.println(" Export button clicked.");
//		        Assert.assertTrue(true, "Export button clicked successfully.");
//		    } else {
//		        System.out.println(" Export button is not clickable.");
//		        Assert.fail("Export button is not clickable.");
//		    }
//		}


	public void ClickOnLastWeekDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Week");		
	}
		
//		public void ClickOnLastWeekDropdownFromExport() {
//		    WebDriver driver = HelperClass.getDriver();
//		    String expectedOption = "Last Week";
//		    String dropdownXPath = "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']";
//
//		    try {
//		        // Select "Last Week" from dropdown
//		        HelperClass.selectFromCustomDropdown(driver, dropdownXPath, expectedOption);
//		        HelperClass.waitForPageToLoad(driver); // Optional: wait for UI to update
//
//		        // Get selected value from input inside the dropdown
//		        String actualValue = driver.findElement(By.xpath(dropdownXPath + "//input")).getAttribute("value").trim();
//
//		        // Assertion using assertTrue
//		        Assert.assertTrue(
//		            actualValue.equals(expectedOption),
//		            "Dropdown selection failed! Expected: '" + expectedOption + "', but found: '" + actualValue + "'"
//		        );
//
//		    } catch (Exception e) {
//		        Assert.fail("Exception occurred while selecting 'Last Week' from dropdown: " + e.getMessage());
//		    }
//		}


	public void ClickOnThisMonthDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Month");		
}
	public void ClickOnLastMonthDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Month");		
}
	public void ClickOnThisQuarterDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Quarter");		
}
	public void ClickOnLastQuarterDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Quarter");		
}
	public void ClickOnThisYearDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Year");		
}
	public void ClickOnLastYearDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Year");		
}
	public void ClickOnCustomDropdownFromExport() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Custom");		
}
	public void exportForCSVInexport() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		importexportpermissions.ExportasCSVforExport.click();
	}
		public void exportForPDFInexport() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			importexportpermissions.ExportasPDFforExport.click();
}
		public void ClickUsersRadioButtonInImport() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			Thread.sleep(4000);
			importexportpermissions.UsersRadioButtonInImport.click();
//			HelperClass.validateCheckboxIsSelected(driver, "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/div[1]/app-settings[1]/div[1]/div[1]/app-export-settings[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/mat-checkbox[1]/div[1]/div[1]/input[1]");
	}
		
		public void ClientsRadiobuttoninExport() {
			HelperClass.waitForPageToLoad(driver);
		
			importexportpermissions.ClientsRadioButtonInEXPORT.click();
			
		}
}
//		public void validateAndClickClientsCheckbox() {
//		    WebElement clientsCheckbox = new WebDriverWait(driver, Duration.ofSeconds(10))
//		        .until(ExpectedConditions.presenceOfElementLocated(
//		            By.xpath("(//mat-checkbox//input[@type='checkbox'])[1]")
//		        ));
//
//		    if (clientsCheckbox.isDisplayed() && clientsCheckbox.isEnabled()) {
//		        clientsCheckbox.click();
//		        if (clientsCheckbox.isSelected()) {
//		            Assert.assertTrue(true, "'Clients' checkbox selected.");
//		        } else {
//		            Assert.fail("'Clients' checkbox not selected after click.");
//		        }
//		    } else {
//		        Assert.fail("'Clients' checkbox not clickable.");
//		    }
//		}
//}