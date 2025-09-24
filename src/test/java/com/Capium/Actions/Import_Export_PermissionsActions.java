package com.Capium.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Import_Export_PermissionsLocators;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;

import ch.qos.logback.core.util.Duration;

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
		Thread.sleep(5000);
		HelperClass.waitUntilVisible(HelperClass.getWait(),importexportpermissions.TaxreturnArrow);
		HelperClass.waitUntilClickable(HelperClass.getWait(),importexportpermissions.TaxreturnArrow);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),importexportpermissions.TaxreturnArrow);
		Thread.sleep(4000);
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
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Week");		
		}
	public void ClickOnSaveAndNextOfImport() throws InterruptedException {
		Thread.sleep(3000);
		importexportpermissions.SaveAndNextOfImport.click();
}
	public void ClickOnNextButtonafterbrowse() throws InterruptedException {
		importexportpermissions.NextButtonAfterBrowse.click();
}
	public void mousehoverExcel() throws InterruptedException {
		HelperClass.hoverOverElement(By.xpath("//button[.//p[normalize-space(text())='Excel']]"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[.//p[normalize-space(text())='Excel']]"));
		String actualText = HelperClass.getText(By.xpath("//button[.//p[normalize-space(text())='Excel']]")).trim();
		String expected = "Click on excel";

		if (actualText.equals(expected)) {
			System.out.println("'excel clicked' page verified");
		} else {
			System.out.println("Text not matched. Actual: " + actualText);
		}
}
	public void exportForexcelInexport() throws InterruptedException {
		importexportpermissions.ExportofExcelOFRexport.click();
}
	public void ClickOnLastWeekDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Week");		
}
	public void ClickOnThisMonthDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Month");		
}
	public void ClickOnLastMonthDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Month");		
}
	public void ClickOnThisQuarterDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Quarter");		
}
	public void ClickOnLastQuarterDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Quarter");		
}
	public void ClickOnThisYearDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","This Year");		
}
	public void ClickOnLastYearDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Last Year");		
}
	public void ClickOnCustomDropdownFromExport() {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']","Custom");		
}
	public void exportForCSVInexport() throws InterruptedException {
		importexportpermissions.ExportasCSVforExport.click();
	}
		public void exportForPDFInexport() throws InterruptedException {
			importexportpermissions.ExportasPDFforExport.click();
}
		public void ClickUsersRadioButtonInImport() throws InterruptedException {
			Thread.sleep(4000);
			importexportpermissions.UsersRadioButtonInImport.click();
//			HelperClass.validateCheckboxIsSelected(driver, "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/div[1]/app-settings[1]/div[1]/div[1]/app-export-settings[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/mat-checkbox[1]/div[1]/div[1]/input[1]");
	}
}