package com.Capium.Actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

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

import io.cucumber.messages.types.Duration;

public class ManageActions {
	ManageLocators manage= null;
	public ManageActions() {
		this.manage = new ManageLocators();
		PageFactory.initElements(HelperClass.getDriver(),manage);
	}

WebDriver driver = HelperClass.getDriver();
WebDriverWait wait=HelperClass.getWait();
	
	
	//public void clickManage() {
		//manage.Manage.click();
//	}

public void verifyandselectmanage() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Manage);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Manage);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Manage);
	String actualtext = HelperClass.getText(By.xpath("//table/tbody/tr[1]/td[6]"));
	String expected = "Active";

	if (actualtext.equals(expected)) {
	    System.out.println("Manage details should display");
	} else {
	    System.out.println("Manage details should not display");
    }
   
}
	
	public void verifyandSelectClient() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Clients);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Clients);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Clients);
		String actualtext = HelperClass.getText(By.xpath("//span[contains(text(), 'Add Client')]"));
		String expected = "Add Client";

		if (actualtext.equals(expected)) {
		    System.out.println("Client  details should display");
		} else {
		    System.out.println("Client details should not display");
	    }
	   
		
	}
	public void verifyandSelectUsers() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Users);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Users);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Users);
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add User']"));
		String expected = "Add User";

		if (actualtext.equals(expected)) {
		    System.out.println("Add User details should display");
		} else {
		    System.out.println("Add User details should not display");
	    }
	   
		
	}
	public void verifyandSelectImport() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Import);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Import);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Import);
		
		String actualtext = HelperClass.getText(By.xpath("//p[contains(text(), 'Import Data')]"));
		String expected = "Import Data";

		if (actualtext.equals(expected)) {
		    System.out.println("Import Data details should display");
		} else {
		    System.out.println("Import Data details should not display");
	    }
		
		
	}
	public void verifyandSelectExport() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Export);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Export);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Export);
		

		String actualtext = HelperClass.getText(By.xpath("//p[contains(text(), 'Export Data')]"));
		String expected = "Export Data";

		if (actualtext.equals(expected)) {
		    System.out.println("Export Data details should display");
		} else {
		    System.out.println("Export Data details should not display");
	    }
		
		
		
	}
	public void verifyandSelectPermission() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Permission);
		HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Permission);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Permission);
		

		String actualtext = HelperClass.getText(By.xpath("//th[normalize-space(text())='Admin Access']"));
		String expected = "Admin Access";

		if (actualtext.equals(expected)) {
		    System.out.println("Admin Access details should display");
		} else {
		    System.out.println("Admin Access details should not display");
	    }
		
		
}
	

    public void SelectUsers() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Users);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Users);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Users);
}
    public void clickAdduser() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.adduser);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.adduser);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.adduser);
}
    public void verifyandSelectfirstname() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.firstname);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.firstname);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.firstname);
    	HelperClass.setValueUsingJS(manage.firstname, "vaani");
    	
    	  // Step 1: Wait for input field and enter value
	    WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='firstName']")));
	    amountInput.clear();
	    amountInput.sendKeys("divya");
	
	    // Step 2: Send TAB or click outside to trigger blur/change event
	    amountInput.sendKeys(Keys.TAB);
	    Thread.sleep(1000);
 
}
    public void verifyandSelectEmail() throws InterruptedException {
    	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.email);
    	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.email);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.email);
    	HelperClass.scrollUntilElementVisible(driver,manage.email );
    	HelperClass.setValueUsingJS(manage.email, "lileka5577@mytaemin.com");
    	
    	
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
//    public void selectexporttoCSV() throws InterruptedException {
//		manage.Manage.click();
//	System.out.println("excel downloaded successfully");
    

public void selectexporttoCSV() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.exporttoCSV);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.exporttoCSV);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.exporttoCSV);
System.out.println("CSV downloaded successfully");
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

public void ClickonDelete() throws InterruptedException {
	HelperClass.waitUntilVisible(HelperClass.getWait(),manage.Delete);
	HelperClass.waitUntilClickable(HelperClass.getWait(),manage.Delete);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), manage.Delete);
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
}










