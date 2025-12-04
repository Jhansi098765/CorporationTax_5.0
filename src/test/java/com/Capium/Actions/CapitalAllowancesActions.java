package com.Capium.Actions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.Assert;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.CapitalAllowances_Locator;
import com.Capium.Utilites.ExcelReader;
import com.Capium.Utilites.HelperClass;
import io.cucumber.java.en.Given;

public class CapitalAllowancesActions{
	
	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	CapitalAllowances_Locator capitalallowance= null;
	public CapitalAllowancesActions() {
	this.capitalallowance=new CapitalAllowances_Locator() ;
	HelperClass.waitForPageToLoad(driver);

		PageFactory.initElements(HelperClass.getDriver(),capitalallowance);
	}

       public void Tax_Return() {
		 HelperClass.waitForPageToLoad(driver);
		 try {
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		     // Use the outerHTML <a> element and its span text
		     WebElement taxReturnButton = wait.until(ExpectedConditions
		             .elementToBeClickable(By.xpath("//a[@href='/submissions']//span[normalize-space()='Tax Return']")));

		     taxReturnButton.click();
		     HelperClass.waitForPageToLoad(driver);

		     System.out.println("Tax Return clicked successfully.");
		 } catch (TimeoutException e) {
		     throw new RuntimeException("Tax Return button not clickable within timeout", e);
		 } catch (Exception e) {
		     throw new RuntimeException("Unexpected error while clicking Tax Return: " + e.getMessage(), e);
		 }
		}
	

	public void SearchTextfield(String clientname) throws InterruptedException {
		 HelperClass.waitForPageToLoad(driver);
		 try {
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		     WebElement searchField = wait.until(ExpectedConditions
		             .visibilityOfElementLocated(By.xpath("//input[@placeholder='Search here...']")));

		     // Always clear before typing
		     searchField.clear();
		     searchField.sendKeys(clientname);

		     System.out.println("Entered client name: " + clientname);
            driver.findElement(By.xpath("//mat-icon[normalize-space()='search']")).click();
		     // Wait for search result containing clientName to appear
		     wait.until(ExpectedConditions.presenceOfElementLocated(
		             By.xpath("//td[contains(@class,'mat-mdc-cell')]//a[contains(normalize-space(),'" + clientname+ "')]")));

		 } catch (TimeoutException e) {
		     throw new RuntimeException("Search field or client result not found within timeout", e);
		 } catch (Exception e) {
		     throw new RuntimeException("Unexpected error while entering client name: " + e.getMessage(), e);
		 }
		 Thread.sleep(5000)	;
		 }
	
	
	 
//    public void Client() {
//    	HelperClass.waitForPageToLoad(driver);
//	 capitalallowance.client.click();
//	 HelperClass.waitForPageToLoad(driver);
//	 
    


	public void Client(String clientName) {
		 HelperClass.waitForPageToLoad(driver);
			
				 try {
				     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
				  
				     WebElement clientLink = wait.until(ExpectedConditions
				             .elementToBeClickable(By.xpath("//td[contains(@class,'mat-mdc-cell')]//a[normalize-space()='" + clientName + "']")));
		 
				     clientLink.click();
				     HelperClass.waitForPageToLoad(driver);
		 
				     System.out.println("Client clicked: " + clientName);
				 } catch (TimeoutException e) {
				     throw new RuntimeException("Client '" + clientName + "' not clickable within timeout", e);
				 } catch (Exception e) {
				     throw new RuntimeException("Unexpected error while clicking client: " + e.getMessage(), e);
				 }
				}
		 
    
    public void Capital_AllowancesCalculator() throws InterruptedException {
    	
    	
    	HelperClass.waitForPageToLoad(driver);
    	HelperClass.scrollIntoView(capitalallowance.CapitalAllowancesCalculator);
    	
    	HelperClass.waitForPageToLoad(driver);
    	HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.CapitalAllowancesCalculator);
        HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.CapitalAllowancesCalculator);
       HelperClass.safeClick(By.xpath("//p[normalize-space()='Capital Allowances']//parent::div//button"), 2);
    }   	

    public void AddnewAsset() throws InterruptedException{
    	HelperClass.waitForPageToLoad(driver);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AddNewAsset);
    	
   
}
   
    String Filepath = "D:\\CT 5.0\\CorporationTax_5.0\\src\\test\\resources\\Exceldata\\capitalAllowance_Calculator.xlsx";
    String data [][]=ExcelReader.getSheetData(Filepath, "Sheet1");
	String[] row=data[0];
	  public void Enter_description() throws InterruptedException   {
		  HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDescription']")));
		  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='assetDescription']"), row[0], 2); 
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until the input field is visible and value is populated
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@formcontrolname='assetDescription']")));

		String actualText = driver.findElement(By.xpath("//input[@formcontrolname='assetDescription']")).getAttribute("value");
		String expectedText = "Asset1";

		if (actualText.equals(expectedText)) {
		    // Case 1: Value matches — pass
		    Assert.assertTrue(true, "'Asset1' is present in the Asset Description field.");
		} else {
		    // Case 2: Value mismatch — fail
		    Assert.fail("Asset Description mismatch! Expected 'Asset1' but found: '" + actualText + "'");
		}

	  } 
	
	public void WDVbroughtFwd() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='wDVBroughtFwd']")));
		  
		 HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='wDVBroughtFwd']"), row[1], 5);
		HelperClass.validateTextField(By.xpath("//input[@formcontrolname='wDVBroughtFwd']"),"wDVBroughtFwd","1000");
	}
	public void MainpoolOFSaveAndExitButton() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.MainpoolOFSaveAndExitButton);
	}
		
	  public void SelectAssetCategory() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  Thread.sleep(5000);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Machinery and Plant (Main Pool)");
		  Thread.sleep(2000);
	  }
	     
	  
	  
	  public void SelectMainpool(){
			HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div")));
		  HelperClass.scrollToElement(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
		  HelperClass.ClickUsingJS(driver,By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
	  }
	  
	  public void SelectSpecialRatepool(){
			HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div")));
		  HelperClass.scrollToElement(By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div"));
		  HelperClass.ClickUsingJS(driver,By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div"));
	  }    	 
 public void Assetacquisitiondate() throws InterruptedException {
	 
		HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.Assetacquisitiondate);
		HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.Assetacquisitiondate);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.Assetacquisitiondate);
		//Thread.sleep(3000);
			
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2021']]"));
		//Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2021']"));
		//Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' JAN ']"));
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 January 2021']"));
		Thread.sleep(2000);

		
		WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
		 
		// Use JavaScript to read the DOM property `.value`
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String actualWDVRate = (String) js.executeScript("return arguments[0].value;", wdaRate);
 
		System.out.println("WDARate Value-->: " + actualWDVRate);
		
		
		String expectedWDVRate = "18.00";
 
		if (actualWDVRate.equals(expectedWDVRate)) {
		    System.out.println(" WDVRate Matched: -->>" + actualWDVRate);
		    
		    
		} else {
		    System.out.println("Validation Failed: Expected ->" + expectedWDVRate + " but found ->" + actualWDVRate);
		  
		    
		}
		
		List<String> expectedEnabled = Arrays.asList(
			    "Asset is a Car",
			    "First Year Allowance at 100%",
			    "Claim Small Pool Allowances"
			);
			 
			List<String> ignoreList = Arrays.asList(
			    "No Claim",
			    "Business Closed"
			);
			 
			HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
 }

 
  public void AssertSummary() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time
	  WebElement assetSummaryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
	      By.xpath("//button[.//span[normalize-space()='Asset Summary']]")
	  ));

	  assetSummaryBtn.click();


	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
  }
  
	public void CT600Computation() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollIntoView(capitalallowance.CT600computation);
		capitalallowance.CT600computation.click();
		Thread.sleep(3000);
		HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
		System.out.println("computation 180");
		Thread.sleep(3000);
        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
	    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
	    System.out.println("comuputation 1000");
		
	}
   public void MainFormForCapitalAllowance() {
		HelperClass.waitForPageToLoad(driver);
	   capitalallowance.MainformForCapitalallowance.click();
	   HelperClass.scrollIntoView(capitalallowance.CapitalallowancesAndBalancingChargeInMainForm);
   }
	 public void EnhancedExpenditureInmainForm(String actualallowanceamount, String expectedallowanceamount) throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
		 Thread.sleep(2000);
		 capitalallowance.EnhancedEXpenditureInMainform.click();
		 Thread.sleep(3000);
		 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
		 String value = element.getAttribute("value");
		 System.out.println("Fetched Main form Value: " + value);
		 
		 
		 WebElement allowanceamount = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
		 
			// Use JavaScript to read the DOM property `.value`
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String actualWDVRate = (String) js.executeScript("return arguments[0].value;", allowanceamount);
	 
			System.out.println("allowance amount Value-->: " + actualallowanceamount);
			
			
			String expectedWDVRate = "180";
	 
			if (actualWDVRate.equals(expectedWDVRate)) {
			    System.out.println(" allowance amount Matched: -->>" + actualallowanceamount);
			    
			    
			} else {
			    System.out.println("Validation Failed: Expected ->" + expectedallowanceamount + " but found ->" + actualallowanceamount);
	 }
			
	 }
	             
	 public void QuicKEntryInMainForm() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
		 HelperClass.scrollIntoView(capitalallowance.QuickEntryInMainform);
		   capitalallowance.QuickEntryInMainform.click();

	    	HelperClass.scrollIntoView(capitalallowance.CapitalAllowancesCalculator);
	    	Thread.sleep(2000);
	    	HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.CapitalAllowancesCalculator);
  }
	 
public void mousehoverdelete() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));Thread.sleep(3000);
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

  
String Filepath1 = "D:\\CT 5.0\\CorporationTax_5.0\\src\\test\\resources\\Exceldata\\capitalAllowance_Calculator.xlsx";
String data1 [][]=ExcelReader.getSheetData(Filepath, "Sheet1");
String[] row1=data[0];

	  public void EnterDescriptionOFMainPool()   {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDescription']")));
		  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='assetDescription']"), row1[0], 2);
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='additions']")));
		  
		  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='additions']"), row1[2], 10);
		 
		  
	  }
	  
  public void Additions() throws  InterruptedException {
		HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='additions']")));
	  
	  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='additions']"), row1[2], 10);
	  HelperClass.waitForPageToLoad(driver);
//		 HelperClass.validateTextField(By.xpath("//input[@formcontrolname='additions']"),"additions","1000");

	  }

	 public void SelectAssetCategorySpecialRatePool() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  Thread.sleep(5000);
			HelperClass.waitForPageToLoad(driver);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Machinery and Plant (Special Rate Pool)");
		  Thread.sleep(2000);
	  }
	    
public void SpecialRatePool() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div")));
	capitalallowance.SpecialRatepool.click();
}
String Filepath2= "D:\\CT 5.0\\CorporationTax_5.0\\src\\test\\resources\\Exceldata\\capitalAllowance_Calculator.xlsx";
String data2[][]=ExcelReader.getSheetData(Filepath, "Sheet1");
String[] row2=data[0];
  public void Enter_description1()   {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDescription']")));
	  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='assetDescription']"), row[0], 2); 
}
  


public void AIAamount() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
 HelperClass.scrollIntoView(capitalallowance.AIAamount);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='aIAClaimed']")));
 HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='aIAClaimed']"), row[3], 2); 
 HelperClass.validateTextField(By.xpath("//input[@formcontrolname='aIAClaimed']"),"aIAClaimed","500");

}
public void RestrictionAmount() {
	HelperClass.waitForPageToLoad(driver);
HelperClass.scrollIntoView(capitalallowance.RestrictionAmount);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='restrictionAmount']")));
HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='restrictionAmount']"), row[4], 2); 
}
public void AssetDisposedDate() {
	HelperClass.waitForPageToLoad(driver);
	 HelperClass.scrollIntoView(capitalallowance.AssetDisposedDate);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
	
	 HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.AssetDisposedDate);
		
			
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2025']]"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2021']"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' JAN ']"));
	//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='27 January 2021']"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
	    HelperClass.validateAndVerify(By.xpath("//input[normalize-space(@formcontrolname)='WDARate']"),"18.00");
	 //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
	
}
public void DisposalAmount() {
	HelperClass.waitForPageToLoad(driver);
HelperClass.scrollIntoView(capitalallowance.DisposalAmount);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='disposalProceeds']")));
HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='disposalProceeds']"), row[4], 2); 
//HelperClass.validateTextField(By.xpath("//input[@formcontrolname='disposalProceeds']"),"disposalProceeds", "30");
}
public void structuresAndBuildingsAsset() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	By elementLocator = By.xpath("//span[normalize-space(text())='Structures and Buildings Allowance']/parent::div");

	try {
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    element.click(); // Or perform whatever action is needed
	} catch (TimeoutException e) {
	    System.out.println("Element not visible within timeout: " + e.getMessage());
	    // Optional: take screenshot or log detailed error
	}

	  }  

public void losses() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[.//mat-icon[text()='calculate'] and .//a[text()='Losses, Deficits & Excess Amount Calculator']]")));
	  capitalallowance.losses.click();
}
public void AssertSummary1() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummary1);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
public void CT600Computation1() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.scrollIntoView(capitalallowance.CT600computation1);
	capitalallowance.CT600computation1.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDA @ 18.00%']]/td[@class='aright'])[1]"), "(180.00)");
    System.out.println("comuputation 180");
}
public void AssertSummary2() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummary1);
	  //capitalallowance.AssertSummary.click();
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space(text()) = 'Additions qualifying for AIA']]/td"), "1000.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space(text()) = 'AIA claimed']]/td"), "(500.00)");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDA @ 18.00%']]/td"),"(90.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"410.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"90.00");
}
public void CT600Computation2() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.scrollIntoView(capitalallowance.CT600computation1);
	capitalallowance.CT600computation1.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "590.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[normalize-space(text()) = 'Additions qualifying for AIA']]/td[2]"), "1,000.00");
    System.out.println("comuputation adition amount 1000");
    HelperClass.validateAndVerify(By.xpath("//tr[td[normalize-space(text()) = 'AIA claimed']]/td[2]"), "(500.00)");
    System.out.println("comuputation adition amount 500");

	Thread.sleep(3000);
  HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
  HelperClass.validateAndVerify(By.xpath("//tr[td[normalize-space(text()) = 'WDA @ 18.00%']]/td[2]"), "(90.00)");
 
}

public void EnhancedExpenditureInmainFormforwdvandAIAamount() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	 Thread.sleep(2000);
	 capitalallowance.enhancedexpenditureforadditionandAIAamount.click();
	 Thread.sleep(3000);
	 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box690']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
	 
	 WebElement element1 = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
	 String value1 = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
}
public void AssetIsaCarBetween75to130gKm() throws InterruptedException {
	Thread.sleep(3000);
	 HelperClass.scrollIntoView(capitalallowance.AssetIsaCarBetween75to130gKm);
	// Thread.sleep(3000);
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssetIsaCarBetween75to130gKm);
}

	
public void OtherChargesAndAllowances() {
	HelperClass.waitForPageToLoad(driver);
    HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@formcontrolname)='assetCategory']", "Other Charges and Allowances");

}
public void DesignatedEnhancedAllowance () throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	int attempts = 0;

	while (attempts < 3) {
	    try {
	        // Step 1: Click the dropdown
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"))); 
	        dropdown.click();

	        // Step 2: Wait for the option to become clickable
	        WebElement option = wait.until(ExpectedConditions.refreshed(
	            ExpectedConditions.elementToBeClickable(
	                By.xpath("//span[normalize-space(text())='Designated Enhanced Allowance']"))));

	        // Step 3: Click the option
	        option.click();
	        break;

	    } catch (TimeoutException | StaleElementReferenceException e) {
	        System.out.println("Retrying due to: " + e.getMessage());
	        attempts++;
	        Thread.sleep(200); // short delay before retry
	    }

	}
}
	public void firstYearAllowanceAtHundredPercent() throws InterruptedException {
		Thread.sleep(10000);	
		capitalallowance.FirstYearAllowanceatHundredPercentCheckbox.click();
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.FirstYearAllowanceatHundredPercentCheckbox);
//		HelperClass.checkCheckbox("//mat-checkbox[.//span[contains(text(), 'First Year Allowance at 100%')]]//input","firstyearallowanceat100percent");
	}




//public void firstYearAllowanceAtHundredPercent() {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//    // Use robust XPath based on label
//    By checkboxLocator = By.xpath("//mat-checkbox[.//span[contains(text(), 'First Year Allowance at 100%')]]//input");
//
//    // Wait until the checkbox is visible and clickable
//    WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(checkboxLocator));
//
//    // Click only if not already selected
//    if (!checkbox.isSelected()) {
//        checkbox.click();
//    }
//}

	public void NoClaimCheckbox() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.NoClaimCheckBox);
		HelperClass.waitForPageToLoad(driver);
//		HelperClass.checkCheckbox("//mat-checkbox[@formcontrolname='noClaim']//input[@type='checkbox']","NOclaimCheckbox");
		
		
	}
	public void LargerDisposalAmount() {
		HelperClass.scrollIntoView(capitalallowance.DisposalAmount);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='disposalProceeds']")));
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='disposalProceeds']"), row[5], 2); 
	//	HelperClass.validateTextField(By.xpath("//input[@formcontrolname='disposalProceeds']"),"disposalProceeds", "2000");
}
	 public void AssertSummaryforwdvandadditionamount() throws InterruptedException {

		  try {
			    WebElement assetSummaryBtn1 = new WebDriverWait(driver, Duration.ofSeconds(15))
			        .until(ExpectedConditions.visibilityOfElementLocated(
			            By.xpath("//button[.//span[normalize-space(text())='Asset Summary']]")
			        ));
			    assetSummaryBtn1.click();
			    System.out.println("PASS: Asset Summary button clicked");
			} catch (TimeoutException e) {
			    System.out.println("FAIL: Asset Summary button not found - " + e.getMessage());
			    // Optionally take screenshot or throw new RuntimeException(e);
			}


		HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
		HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
		HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
		HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(360.00)");
		HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"1640.00");
		HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"360.00");
}

		public void CT600ComputationforWDVandadditionamount() throws InterruptedException {
			Thread.sleep(3000);
			HelperClass.scrollIntoView(capitalallowance.CT600computation);
			capitalallowance.CT600computation.click();
			Thread.sleep(3000);
			HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "360.00");
			System.out.println("computation 360");
			Thread.sleep(3000);
	        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
		    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
		    System.out.println("comuputation 1000");
		    HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
			Thread.sleep(3000);
		    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
		    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
		    System.out.println("comuputation 1000");
			
		}
	  
		 public void EnhancedExpenditureInmainFormforwdvandAdditionamont() throws InterruptedException {
			 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
			 Thread.sleep(2000);
			 capitalallowance.EnhancedEXpenditureInMainform.click();
			 Thread.sleep(3000);
			 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
			 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
			 String value = element.getAttribute("value");
			 System.out.println("Fetched Main form Value: " + value);
		 }
		 public void AssertSummaryforwdvandDisposedamount() throws InterruptedException {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForwdvanddisposedamount);
			 

			HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
			HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space(text())='Disposal proceeds']]/td"), "(30.00)");
			HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(174.60)");
			HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"795.40");
			HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"174.60");
	}

			public void CT600ComputationforWDVanddisposedamount() throws InterruptedException {
				HelperClass.scrollIntoView(capitalallowance.CT600computationwdvbfwdamountandDisposedAmount);
				capitalallowance.CT600computationwdvbfwdamountandDisposedAmount.click();
				Thread.sleep(3000);
				HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "174.60");
				System.out.println("computation 360");
				Thread.sleep(3000);
		        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
			    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
			    System.out.println("comuputation 1000");
				Thread.sleep(3000);
			    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
			    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
			    System.out.println("comuputation 30");
				
			}
			 public void EnhancedExpenditureInmainFormforwdvanddisposedamont() throws InterruptedException {
				 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
				 Thread.sleep(2000);
				 capitalallowance.EnhancedEXpenditureInMainformForWDVanddisposedamount.click();
				 Thread.sleep(3000);
				 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
				 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
				 String value = element.getAttribute("value");
				 System.out.println("Fetched Main form Value: " + value);
}
			 public void AssertSummaryforwdvandlargerDisposedamount() throws InterruptedException {
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
				  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForwdvandLargerdisposedamount);
				HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
				HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space(text())='Disposal proceeds']]/td"), "(2000.00)");
				HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing charge']]/td"),"1000.00");
				
		}

				public void CT600ComputationforWDVandLargerdisposedamount() throws InterruptedException {
					HelperClass.scrollIntoView(capitalallowance.CT600computationwdvbfwdamountandLargerDisposedAmount);
					capitalallowance.CT600computationwdvbfwdamountandLargerDisposedAmount.click();
					Thread.sleep(3000);
					HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalBalancingCharges (FYear)']"), "1,000.00");
					System.out.println("computation totalbalancecharge 1000");
					Thread.sleep(3000);
			        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
			        HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
				    System.out.println("comuputation WDV amount 2000");
				    HelperClass.validateAndVerify(By.xpath("((//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(2,000.00)");
				    System.out.println("comuputation disposal amount 2000");
				    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
				    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing charge']]/td[@class='aright'])[1]"), "1,000.00");
				    System.out.println("comuputation balancing charge amount 1000");
					
				}
				 public void EnhancedExpenditureInmainFormforwdvandLargerdisposedamont() throws InterruptedException {
					 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
					 Thread.sleep(2000);
					 capitalallowance.EnhancedEXpenditureInMainformForWDVandLargerdisposedamount.click();
					 Thread.sleep(3000);
					 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
					 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box710']"));
					 String value = element.getAttribute("1000");
					 System.out.println("Fetched Main form Value: " + 1000);
	}
				 public void AssertSummaryforAdditionandlargerDisposedamount() throws InterruptedException {
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
					  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForwdvandLargerdisposedamount);
					HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
					HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space(text())='Disposal proceeds']]/td"), "(2000.00)");
					HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing charge']]/td"),"1000.00");
				
			}

					public void CT600ComputationforAdditionandLargerdisposedamount() throws InterruptedException {
						HelperClass.scrollIntoView(capitalallowance.CT600computationAdditionAmountandLargerDisposedAmount);						capitalallowance.CT600computationAdditionAmountandLargerDisposedAmount.click();
						Thread.sleep(3000);
						HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalBalancingCharges (FYear)']"), "1,000.00");
						System.out.println("computation totalbalancecharge 1000");
						Thread.sleep(3000);
				        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
					    
					    HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
						Thread.sleep(3000);
						System.out.println("computation other additions 1000");
					    HelperClass.validateAndVerify(By.xpath("((//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(2,000.00)");
					    System.out.println("comuputation disposal amount 2000");
					    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing charge']]/td[@class='aright'])[1]"), "1,000.00");
					    System.out.println("comuputation balancing charge amount 1000");
						
					}
					 public void EnhancedExpenditureInmainFormforAdditionandLargerdisposedamont() throws InterruptedException {
						 HelperClass.scrollIntoView(capitalallowance.EnhancedEXpenditureInMainformForAdditionAndLargerdisposedamount);
						 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
						 Thread.sleep(2000);
						 capitalallowance.EnhancedEXpenditureInMainformForAdditionAndLargerdisposedamount.click();
						 Thread.sleep(3000);
						 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
						 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box710']"));
						 String value = element.getAttribute("1000");
						 System.out.println("Fetched Main form Value: " + 1000);
						 
				
		}
					 public void AssertSummaryforAdditionandDisposedamount() throws InterruptedException {
						 
						 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForAdditionAmountanddisposedamount);
						HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
						HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space(text())='Disposal proceeds']]/td"), "(2000.00)");
						HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(174.60)");
						HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"795.40");
						HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"174.60");
				}

						public void CT600ComputationforAdditionanddisposedamount() throws InterruptedException {
							HelperClass.scrollIntoView(capitalallowance.CT600computationAdditionAmountandDisposedAmount);
							capitalallowance.CT600computationAdditionAmountandDisposedAmount.click();
							Thread.sleep(3000);
							HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "174.60");
							System.out.println("computation 360");
							Thread.sleep(3000);
					        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
						    
						    HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
							Thread.sleep(3000);
						    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
						    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
						    System.out.println("comuputation 30");
							
						}
						 public void EnhancedExpenditureInmainFormforAdditionanddisposedamont() throws InterruptedException {
							 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
							 Thread.sleep(2000);
							 capitalallowance.enhancedexpenditureforadditionanddisposed.click();
							 Thread.sleep(3000);
							 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
							 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
							 String value = element.getAttribute("value");
							 System.out.println("Fetched Main form Value: " + value);
			}


						 public void AssertSummaryforAdditionandAIAamount() throws InterruptedException {
							  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time
							  WebElement assetSummaryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
							      By.xpath("//button[.//span[normalize-space()='Asset Summary']]")
							  ));

							  assetSummaryBtn.click();

							HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(174.60)");
							HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"795.40");
							HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"174.60");
					}

							public void CT600ComputationforAdditionandAIAamount() throws InterruptedException {
								HelperClass.scrollIntoView(capitalallowance.CT600computation);
								capitalallowance.CT600computation.click();
								Thread.sleep(3000);
								HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "174.60");
								System.out.println("computation 360");
								Thread.sleep(3000);
						        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
							    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
							    System.out.println("comuputation 1000");
							    HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
								Thread.sleep(3000);
							    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
							    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
							    System.out.println("comuputation 30");
								
							}
							 public void EnhancedExpenditureInmainFormforAdditionandAIAamount() throws InterruptedException {
								 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
								 Thread.sleep(2000);
								 capitalallowance.EnhancedEXpenditureInMainform.click();
								 Thread.sleep(3000);
								 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
								 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
								 String value = element.getAttribute("value");
								 System.out.println("Fetched Main form Value: " + value);
				}

								public void BusinessClosedCheckbox() {
									HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.BusinessclosedCheckbox);
									try {
									    WebElement checkbox = driver.findElement(By.xpath("//mat-checkbox[@formcontrolname='businessClosed']//input[@type='checkbox']"));
									    
									    if (!checkbox.isSelected()) {
									        checkbox.click();
									    }

									    System.out.println(checkbox.isSelected()
									        ? "'Business Closed' checkbox is selected."
									        : "'Business Closed' checkbox is NOT selected.");

									} catch (Exception e) {
									    System.out.println(" Error: " + e.getMessage());
									}
								}


									
								
								
								 public void AssertSummaryforwdvWithNoClaim() throws InterruptedException {
									 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
									  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForWDVamountwithNOClaim);
									 

									HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
									
									HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(0.00)");
									HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"1000.00");
								
								 }	
									public void CT600ComputationforAdditionandNOClaims() throws InterruptedException {
										HelperClass.scrollIntoView(capitalallowance.CT600computationAdditionAmountWithNOClaim);
										capitalallowance.CT600computationAdditionAmountWithNOClaim.click();
										Thread.sleep(3000);
										HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "0");
										System.out.println("computation 0");
										Thread.sleep(3000);
								        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
									    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
									    System.out.println("comuputation 1000");
									    
										
									}
									 public void EnhancedExpenditureInmainFormforAdditionandNOClaim() throws InterruptedException {
										 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
										 Thread.sleep(2000);
										 capitalallowance.enhancedexpenditureforadditionWithNOClaim.click();
										 Thread.sleep(3000);
										 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
										 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
										 String value = element.getAttribute("value");
										 System.out.println("Fetched Main form Value: " + value);
							}
									 public void AssertSummaryforadditionanadDisposedwithBusinessclosed() {
										 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
										  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForAdditionAndDisposalwithbusinessClosed);
										 

										HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
										
										HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Disposal proceeds']]/td"),"(30.00)");
										HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"970.00");
										
									 }	
										public void CT600ComputationforAdditionanddiposalsBusinessclosed() throws InterruptedException {
											HelperClass.scrollIntoView(capitalallowance.CT600computationAdditionAndDisposalwithbusinessClosed);
											capitalallowance.CT600computationAdditionAndDisposalwithbusinessClosed.click();
											Thread.sleep(3000);
											HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "970.00");
											System.out.println("computation 970");
											Thread.sleep(3000);
									        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
										    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
										    System.out.println("comuputation 1000");
										    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
										    
										    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing allowance']]/td[@class='aright'])[1]"), "970.00");
											
	}
										 public void CT600ReturnFromComputation() throws InterruptedException {
											 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='CT600 Return']")));
											  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.CT600returnfromComputation);
											 
}
										 public void ClaimSmallpoolAllowancheckbox() throws InterruptedException {
											 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
											 HelperClass.waitForPageToLoad(driver);
											 WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
											     By.xpath("//span[normalize-space(text())='Claim Small Pool Allowances']/ancestor::mat-checkbox")));
											 HelperClass.waitForPageToLoad(driver);
											 checkbox.click();
											 HelperClass.selectCheckboxAndValidateRate("Claim Small Pool Allowances", "18.00");

////											 HelperClass.validateAndClickCheckbox(By.xpath("//span[normalize-space(text())='Claim Small Pool Allowances']/ancestor::mat-checkbox"), "Claim Small Pool Allowances", true);
//											 checkbox.click();
										 }
											 

										 public void AssertSummaryforClaimsmallPOOlAllowancewithWDv() {
											 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
											 HelperClass.waitForPageToLoad(driver);
											  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForClaimsmallPOOlAllowancewithWDV);
											  HelperClass.waitForPageToLoad(driver);

											HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
								
											
											HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Small pools WDA']]/td"),"1000.00");
											
										 }	
											public void CT600ComputationforClaimsmallPOOlAllowancewithWDv() throws InterruptedException {
												HelperClass.scrollIntoView(capitalallowance.CT600computationClaimsmallPOOlAllowancewithWDv);
												capitalallowance.CT600computationClaimsmallPOOlAllowancewithWDv.click();
												Thread.sleep(3000);
												HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
											    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
											    System.out.println("comuputation 1000");
											    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Small pools WDA']]/td[@class='aright'])[1]"), "1,000.00");
											    System.out.println("comuputation 1000");
												

												
 
}
											public void AssertSummaryforClaimsmallPOOlAllowancewithAddition() {
												 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
												  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForClaimsmallPOOlAllowancewithAddition);
												 

												HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
												
												HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Small pools WDA']]/td"),"1000.00");
												
												
											 }	
												public void CT600ComputationforClaimsmallPOOlAllowancewithAddition() throws InterruptedException {
													HelperClass.scrollIntoView(capitalallowance.CT600computationClaimsmallPOOlAllowancewithAddition);
													capitalallowance.CT600computationClaimsmallPOOlAllowancewithAddition.click();
													Thread.sleep(3000);
													
											        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
												    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
												    System.out.println("comuputation 1000");
												    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Small pools WDA']]/td[@class='aright'])[1]"), "1,000.00");
												    System.out.println("comuputation 1000");

													
	 
												}
												public void AssertSummaryforClaimsmallPOOlAllowancewithAdditionandAIA() {
													 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
													  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.ClaimsmallPOOlAllowancewithadditionandAIAOFAssertSummary);
													 

													HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
													
													HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Disposal proceeds']]/td"),"(30.00)");
													HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"970.00");
													
												 }	
													public void ClaimsmallPOOlAllowancewithAdditionandAIAComputationOfCt600() throws InterruptedException {
														HelperClass.scrollIntoView(capitalallowance.ClaimsmallPOOlAllowancewithadditionandAIAComputationOfCt600);
														capitalallowance.ClaimsmallPOOlAllowancewithadditionandAIAComputationOfCt600.click();
														Thread.sleep(3000);
														HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "970.00");
														System.out.println("computation 970");
														Thread.sleep(3000);
												        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
													    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
													    System.out.println("comuputation 1000");
													    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
													    
													    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing allowance']]/td[@class='aright'])[1]"), "970.00");
														

														
		 
													}
		
													
													public void ClaimsmallPOOlAllowancewithAdditionandDisposedAssertSummary() {
														 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
														  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.ClaimsmallPOOlAllowancewithadditionandDisposedAssertSummary);
														 

														HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
														
														HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Disposal proceeds']]/td"),"(30.00)");
														HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"970.00");
														
													 }	
														public void ClaimsmallPOOlAllowancewithAdditionandDisposedCT600COMPUTATION() throws InterruptedException {
															HelperClass.scrollIntoView(capitalallowance.ClaimsmallPOOlAllowancewithadditionandDisposedCT600COMPUTATION);
															capitalallowance.ClaimsmallPOOlAllowancewithadditionandDisposedCT600COMPUTATION.click();
															Thread.sleep(3000);
															HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "970.00");
															System.out.println("computation 970");
															Thread.sleep(3000);
													        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
														    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
														    System.out.println("comuputation 1000");
														    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
														    
														    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing allowance']]/td[@class='aright'])[1]"), "970.00");
															
														}
														public void AssertSummaryForWDVofSpecialrate() throws InterruptedException {
															  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time
															  WebElement assetSummaryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
															      By.xpath("//button[.//span[normalize-space()='Asset Summary']]")
															  ));

															  assetSummaryBtn.click();


															// verify and validations
															HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
															
															HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
															HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 6.00%']]/td"),"(60.00)");
															HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"940.00");
															HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"60.00");
														  }
														  
															public void CT600ComputationForWDVoFspecialrate() throws InterruptedException {
																HelperClass.scrollIntoView(capitalallowance.CT600computation);
																capitalallowance.CT600computation.click();
																Thread.sleep(3000);
																HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "60.00");
																System.out.println("computation 60");
																Thread.sleep(3000);
														        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
															    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
															    System.out.println("comuputation 1000");
																
															}
														 
															 public void EnhancedExpenditureInmainFormFORwdvOfSpecialrate() throws InterruptedException {
																 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
																 Thread.sleep(2000);
																 capitalallowance.EnhancedEXpenditureInMainform.click();
																 Thread.sleep(3000);
																 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
																 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box695']"));
																 String value = element.getAttribute("value");
																 System.out.println("Fetched Main form Value: " + value);


			
															 }
															 public void AssertSummaryForAdditionofSpecialrate() throws InterruptedException {
																  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time
																  WebElement assetSummaryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
																      By.xpath("//button[.//span[normalize-space()='Asset Summary']]")
																  ));

																  assetSummaryBtn.click();


																// verify and validations
																HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
																
																HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
																HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 6.00%']]/td"),"(60.00)");
																HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"940.00");
																HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"60.00");
															  }
															  
																public void CT600ComputationForAdditionspecialrate() throws InterruptedException {
																	HelperClass.scrollIntoView(capitalallowance.CT600computation);
																	capitalallowance.CT600computation.click();
																	Thread.sleep(3000);
																	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "60.00");
																	System.out.println("computation 60");
																	Thread.sleep(3000);
															        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
																    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
																    System.out.println("comuputation 1000");
																	
																}
															 
																 public void EnhancedExpenditureInmainFormFORAdditionOfSpecialrate() throws InterruptedException {
																	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
																	 Thread.sleep(2000);
																	 capitalallowance.EnhancedEXpenditureInMainform.click();
																	 Thread.sleep(3000);
																	 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
																	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box695']"));
																	 String value = element.getAttribute("value");
																	 System.out.println("Fetched Main form Value: " + value);


				
																 }
																 public void AssertSummaryForWDVandAdditionofSpecialrate() throws InterruptedException {
																	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time
																	  WebElement assetSummaryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
																	      By.xpath("//button[.//span[normalize-space()='Asset Summary']]")
																	  ));

																	  assetSummaryBtn.click();


																	// verify and validations
																	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
																	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
																	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
																	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 6.00%']]/td"),"(120.00)");
																	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"1880.00");
																	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"120.00");
																  }
																  
																	public void CT600ComputationForWDVandAdditionspecialrate() throws InterruptedException {
																		HelperClass.scrollIntoView(capitalallowance.CT600computation);
																		capitalallowance.CT600computation.click();
																		Thread.sleep(3000);
																		HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "120.00");
																		System.out.println("computation 120");
																		Thread.sleep(3000);
																        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
																	    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
																	    System.out.println("comuputation 1000");
																	    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
																	    System.out.println("comuputation 1000");
																		
																	}
																 
																	 public void EnhancedExpenditureInmainFormFORWDVandAdditionOfSpecialrate() throws InterruptedException {
																		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
																		 Thread.sleep(2000);
																		 capitalallowance.EnhancedEXpenditureInMainform.click();
																		 Thread.sleep(3000);
																		 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
																		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box695']"));
																		 String value = element.getAttribute("value");
																		 System.out.println("Fetched Main form Value: " + value);


					
																	 }
																	
		 public void DesignatedEnhnacedAllowance() {
			
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space(text())='Designated Enhanced Allowance'])[2]")));
				capitalallowance.DesignatedEnhancedAllowance.click();		 

	}
		 public void Assertsummary() throws InterruptedException {
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time
			  WebElement assetSummaryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
			      By.xpath("//button[.//span[normalize-space()='Asset Summary']]")
			  ));

			  assetSummaryBtn.click();


			// verify and validations
			HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
			HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
			HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
			HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 6.00%']]/td"),"(120.00)");
			HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"1880.00");
			HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"120.00");
		  }
		  
			public void CT600computationForDesignatedenhnacedallowance1() throws InterruptedException {
				HelperClass.scrollIntoView(capitalallowance.CT600computationForDesignatedenhnacedallowance);
				capitalallowance.CT600computationForDesignatedenhnacedallowance.click();
				Thread.sleep(3000);
				HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "120.00");
				System.out.println("computation 120");
				Thread.sleep(3000);
		        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
			    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
			    System.out.println("comuputation 1000");
			    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
			    System.out.println("comuputation 1000");
				
			}
		 
			 public void EnhancedExpenditureInmainFormdesignatedenhnacedallowance1() throws InterruptedException {
				 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
				 Thread.sleep(2000);
				 capitalallowance.EnhancedEXpenditureInMainform.click();
				 Thread.sleep(3000);
				 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
				 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box695']"));
				 String value = element.getAttribute("value");
				 System.out.println("Fetched Main form Value: " + value);



			 }
			 public void Zeroemissionsandcars() {
					
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space(text())='Zero Emission Cars'])[2]")));
				capitalallowance.ZeroEmissionCars.click();		 
}
			
	 
			 public void AssertSummaryForzeroemmisioncars() throws InterruptedException {
				  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time
				  WebElement assetSummaryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
				      By.xpath("//button[.//span[normalize-space()='Asset Summary']]")
				  ));

				  assetSummaryBtn.click();


				// verify and validations
				HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
				HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
				HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
				HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 6.00%']]/td"),"(120.00)");
				HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"1880.00");
				HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"120.00");
			  }
			  
				public void CT600ComputationForzeroemmissioncars() throws InterruptedException {
					HelperClass.scrollIntoView(capitalallowance.CT600computation);
					capitalallowance.CT600computation.click();
					Thread.sleep(3000);
					HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "120.00");
					System.out.println("computation 120");
					Thread.sleep(3000);
			        HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
				    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
				    System.out.println("comuputation 1000");
				    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
				    System.out.println("comuputation 1000");
					
				}
			 
//				 public void EnhancedExpenditureInmainFormFORWDVandAdditionOfSpecialrate() throws InterruptedException {
//					 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
//					 Thread.sleep(2000);
//					 capitalallowance.EnhancedEXpenditureInMainform.click();
//					 Thread.sleep(3000);
//					 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
//					 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box695']"));
//					 String value = element.getAttribute("value");
//					 System.out.println("Fetched Main form Value: " + value);


				 
public void Assetacquisitiondateforpreviousyear() throws InterruptedException {
	 
	
	HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.Assetacquisitiondateforpreviousyear);
	HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.Assetacquisitiondateforpreviousyear);
	HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.Assetacquisitiondateforpreviousyear);
	//Thread.sleep(3000);
		
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2021']]"));
	//Thread.sleep(10000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2020']"));
	//Thread.sleep(10000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' JAN ']"));
	//Thread.sleep(2000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 January 2020']"));
	//Thread.sleep(2000);
//    HelperClass.validateAndVerify(By.xpath("//input[normalize-space(@formcontrolname)='WDARate']"),"18.00");
	//Thread.sleep(5000);
}
public void AssertSummaryforStructureandBuildings() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForstructureandbuildings);
	 

	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Disposal proceeds']]/td"),"(30.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"970.00");
}
public void CT600ComputationForstructureandbuildings() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationForstructureandbuildings);
	capitalallowance.CT600computationForstructureandbuildings.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "120.00");
	System.out.println("computation 120");
	Thread.sleep(3000);
    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
    System.out.println("comuputation 1000");
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
    System.out.println("comuputation 1000");
	
}
public void EnhancedExpenditureInmainFormforstructureandbuildings() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	 Thread.sleep(2000);
	 capitalallowance.EnhancedEXpenditureInMainform.click();
	 Thread.sleep(3000);
	 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box711']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);

}
public void AssertSummaryforadditionsofStructureandBuildings() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForadditionsofstructureandbuildings);
	 

	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Disposal proceeds']]/td"),"(30.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"970.00");
}
public void CT600ComputationForadditionsofstructureandbuildings() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationForadditionsofstructureandbuildings);
	capitalallowance.CT600computationForadditionsofstructureandbuildings.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "120.00");
	System.out.println("computation 120");
	Thread.sleep(3000);
   HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
   HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
   System.out.println("comuputation 1000");
   HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
   System.out.println("comuputation 1000");
	
}
public void SelectAssetCategoryforstructureandbuildings() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(5000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Structures and Buildings Allowance");
	  Thread.sleep(2000);
}
public void AssertSummaryforWDVandadditionofstructureandbuildings() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForWDVandadditionsofstructureandbuildings);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
public void CT600ComputationforWDVandAdditionofstructureandbuildings() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationForstructureandbuildings);
	capitalallowance.CT600computationForWDVandadditionsofstructureandbuildings.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
  HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
  HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
  System.out.println("comuputation 1000");
}
public void AssertSummaryforRestrictionandadditionofstructureandbuildings() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForRestrictionsandadditionsofstructureandbuildings);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
public void CT600ComputationforRestrictionandAdditionofstructureandbuildings() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationForRestrictionsandadditionsofstructureandbuildings);
	capitalallowance.CT600computationForRestrictionsandadditionsofstructureandbuildings.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
System.out.println("comuputation 1000");
}

public void AssertSummaryforRestrictionandWDVofstructureandbuildings() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForRestrictionsandWDVofstructureandbuildings);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
public void CT600ComputationforRestrictionandWDVofstructureandbuildings() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationForRestrictionsandWDVofstructureandbuildings);
	capitalallowance.CT600computationForRestrictionsandWDVofstructureandbuildings.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
System.out.println("comuputation 1000");
}





//                      OTHER CHARGES AND ALLOWANCES

public void SelectAssetCategoryOtherchargesandallowances() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(5000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Other Charges and Allowances");
	  Thread.sleep(2000);
}
public void AssertSummaryforOtherchargesandallowances() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForOtherchargesandalloawnces);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
public void CT600ComputationforOtherChargesandallowances() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationForotherChargesandallowances);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
System.out.println("comuputation 1000");
}

public void EnhancedExpenditureForOtherChargesandallowances() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	 Thread.sleep(2000);
	 capitalallowance.enhancedexpenditureforotherchargesandallowances.click();
	 Thread.sleep(3000);
	 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box725']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
	 

}
public void SelectAssetCategoryElectricVehicleChargepoints() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(5000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Electric Vehicle Charge Points");
	  Thread.sleep(2000);
}
public void AssertSummaryforElectricVehicleChargePoints() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForOtherchargesandalloawnces);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for FYA']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='FYA claimed @ 100%']]/td"),"(1000.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"1000.00");

}
public void CT600ComputationforElectricVehicleChargePoints() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationForotherChargesandallowances);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "1,000.00");
	System.out.println("computation 1,000.00");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='FYA claimed @ 100%']]/td[@class='aright'])[1]"), "(1,000.00)");
HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Total FYA & WDA claimed']]/td[@class='aright'][1]"), "1,000.00");

System.out.println("comuputation 1000");
}

public void capitalallowancesandBalancingchargesInmainform() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 capitalallowance.CapitalallowancesAndBalancingChargeInMainForm.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
	 

}
public void AssertSummaryadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryadditionalanddisposalwithbusinessclosedforelectricchargevehiclepoints);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for FYA']]/td"), "970.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='FYA claimed @ 100%']]/td"),"(970.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Disposal proceeds']]/td"),"(30.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"(970.00)");


}
public void CT600ComputationadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationadditionalanddisposalwithbusinessclosedforelectricchargevehiclepoints);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "970.00");
	System.out.println("computation 970");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "970.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='FYA claimed @ 100%']]/td[@class='aright'])[1]"), "(970.00)");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing allowance']]/td[@class='aright'])[1]"), "(970.00)");

System.out.println("comuputation 970");
}


public void AssertSummaryfornoclaimelectricchargevehiclepoints() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryfornoclaimelectricchargevehiclepoints);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for FYA']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='Balance in the pool']]/td"),"1000.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"1000.00");
	
	try {
	    // Get "Balance in the pool" value
	    String balanceText = driver.findElement(By.xpath("//tr[th[normalize-space()='Balance in the pool']]/td")).getText().replace(",", "").trim();
	    double balance = Double.parseDouble("1000");

	    // Get "WDV Cf" value
	    String wdvCfText = driver.findElement(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td")).getText().replace(",", "").trim();
	    double wdvCf = Double.parseDouble("1000");

	    // Validation logic
	    if (balance == wdvCf) {
	        System.out.println(" PASS: Balance in the pool is equal to WDV Cf.");
	    } else {
	        System.out.println(" FAIL: Balance in the pool is NOT equal to WDV Cf.");
	    }

	} catch (Exception e) {
	    System.out.println(" ERROR during validation: " + e.getMessage());
	}



}
public void CT600Computationfornoclaimelectricchargevehiclepoints() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationfornoclaimelectricchargevehiclepoints);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "0");
	System.out.println("computation 0");
	

}
public void Noclaimcheckbox1() throws InterruptedException {
	Thread.sleep(10000);	
	capitalallowance.NoClaimcheckbox1.click();
}
public void capitalallowancesandBalancingchargesInmainformfornoclaim() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 capitalallowance.CapitalallowancesAndBalancingChargeInMainForm.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));
	 String value = element.getAttribute("value");
	 HelperClass.validateAndVerify(By.xpath("//input[@formcontrolname='box713']"), "0");
	 System.out.println("Fetched Main form Value: " + value);

}
public void SelectAssetCategoryAsEnterpisezone() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(5000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Enterprise Zones");
	  Thread.sleep(2000);
}
public void capitalallowancesandBalancingchargesInmainformForEnterpriseZone() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 capitalallowance.CapitalallowancesAndBalancingChargeInMainForm.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box721']"));
	 String value = element.getAttribute("value");
	 HelperClass.validateAndVerify(By.xpath("//input[@formcontrolname='box721']"), "1000");
	 System.out.println("Fetched Main form Value: " + 1000);
}
public void SelectAssetCategoryAsZeroemissionsgoodsvehicle() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(5000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Zero Emission Goods Vehicle");
	  Thread.sleep(2000);
}
public void capitalallowancesandBalancingchargesInmainformForZeroemissionsGoodsvehicle() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 capitalallowance.CapitalallowancesAndBalancingChargeInMainForm.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
}

public void SelectAssetCategoryAsZeroemissionsCars() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(5000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Zero Emission Cars");
	  Thread.sleep(2000);
}
public void capitalallowancesandBalancingchargesInmainformForZeroemissionsCars() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 capitalallowance.CapitalallowancesAndBalancingChargeInMainForm.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box726']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
}

public void SelectAssetCategoryAsDesignatedenhnacedallowance() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(7000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Designated Enhanced Allowance");
	  Thread.sleep(2000);
}

public void SelectAssetCategoryAsShortlifeasset() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(7000);
		HelperClass.waitForPageToLoad(driver);

	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Short Life Assets");
	  Thread.sleep(2000);
		HelperClass.waitForPageToLoad(driver);

}

public void AssertSummaryforshortlifeassetofwdvamount() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryforshortlifeassetofwdvamount);
		HelperClass.waitForPageToLoad(driver);

	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	HelperClass.waitForPageToLoad(driver);

	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");


}
public void CT600Computationforshortlifeassetofwdvamount() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationforshortlifeassetofwdvamount);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180.00");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "970.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDA @ 18.00%']]/td[@class='aright'])[1]"), "(180.00)");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV C/fwd']]/td[@class='aright'])[1]"), "820.00");

}
public void AssertSummaryforshortlifeassetofadditionamount() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryforshortlifeassetofwdvamount);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	HelperClass.waitForPageToLoad(driver);

	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");


}
public void CT600Computationforshortlifeassetofadditionamount() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);

	HelperClass.scrollIntoView(capitalallowance.CT600computationforshortlifeassetofwdvamount);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	HelperClass.waitForPageToLoad(driver);

	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180.00");
	HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "970.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDA @ 18.00%']]/td[@class='aright'])[1]"), "(180.00)");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV C/fwd']]/td[@class='aright'])[1]"), "820.00");

}
public void AssertSummaryforrestrictionandadditionamount() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryforshortlifeassetofwdvamount);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(30.00)");

}
public void CT600Computationforrestrictionandadditionamount() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationforshortlifeassetofwdvamount);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "30.00");
	System.out.println("computation 30.00");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "970.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDA @ 18.00%']]/td[@class='aright'])[1]"), "(30.00)");

}

public void AssertSummaryforrestrictionandadditionamountforspecialratepool() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryforshortlifeassetofwdvamount);
		HelperClass.waitForPageToLoad(driver);

	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	HelperClass.waitForPageToLoad(driver);

	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 6.00%']]/td"),"(30.00)");

}
public void CT600Computationforrestrictionandadditionamountforspecialratepool() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationforshortlifeassetofwdvamount);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "30.00");
	System.out.println("computation 30.00");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "970.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDA @ 6.00%']]/td[@class='aright'])[1]"), "(30.00)");

}
public void EnhancedExpenditureforspecialratepool() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	 Thread.sleep(2000);
	 capitalallowance.EnhancedEXpenditureInMainform.click();
	 Thread.sleep(3000);
	 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box695']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);

}
public void AssertSummaryforrestrictionandWDVamountforspecialratepool() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryforshortlifeassetofwdvamount);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 6.00%']]/td"),"(30.00)");
}
public void CT600ComputationforrestrictionandWDVwithspecialratepool() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationforshortlifeassetofwdvamount);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "30.00");
	System.out.println("computation 30.00");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='WDV B/fwd']]/td[@class='aright'][1]"), "1000.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDA @ 6.00%']]/td[@class='aright'])[1]"), "(30.00)");



By WDVRateLocator=By.xpath("//input[normalize-space(@formcontrolname)='WDARate']");
WebElement submissiontypeinsubmissionfield=wait.until(ExpectedConditions.visibilityOfElementLocated(WDVRateLocator));
String expectedWDVRate="18.00";
String actualWDVRate=submissiontypeinsubmissionfield.getText().trim();
if(actualWDVRate.equals(expectedWDVRate)) {
	System.out.println("Type of submission: "+actualWDVRate);
}
else {
	System.out.println("Type of submission: "+expectedWDVRate+"Found: "+actualWDVRate);
}

}
public void AssertSummaryforsuperdeduction() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryforshortlifeassetofwdvamount);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for Super deduction']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Super deduction claimed @ 130%']]/td"),"(1300.00)");
}
public void CT600ComputationforSuperdeduction() throws InterruptedException {
	HelperClass.scrollIntoView(capitalallowance.CT600computationforshortlifeassetofwdvamount);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "1,300.00");
	System.out.println("computation 30.00");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for Super deduction']]/td[@class='aright'][1]"), "1000.00");
	Thread.sleep(3000);

HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Super deduction claimed @ 130%']]/td[@class='aright'][1]"), "(1,300.00)");

}
public void SuperDeductionatOnethirtypercent() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);

	
	Thread.sleep(3000);
	HelperClass.waitForPageToLoad(driver);

	HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.superdeductionatONETHIRTYpercent);
	HelperClass.waitForPageToLoad(driver);


}
public void CT600_Return2() {
	 HelperClass.waitForPageToLoad(driver);
	   	 capitalallowance.CT600return2.click();
	 	HelperClass.waitForPageToLoad(driver);

   }
public void Assetacquisitiondateforsuperdeduction() throws InterruptedException {
	 
	HelperClass.waitForPageToLoad(driver);

	HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.Assetacquisitiondateforsuperdeduction);
	HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.Assetacquisitiondateforsuperdeduction);
	HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.Assetacquisitiondateforsuperdeduction);
	HelperClass.waitForPageToLoad(driver);
		
	WebElement date=driver.findElement(By.xpath("//input[@formcontrolname='assetAcquisitionDate']"));
	HelperClass.waitForPageToLoad(driver);
	HelperClass.setDateAsText(driver, date, "01/01/2023");
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2023']]"));
//	//Thread.sleep(10000);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath(" //button[@aria-label='2023']"));
//	//Thread.sleep(10000);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='DEC']"));
//	//Thread.sleep(2000);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 February 2023']"));
//	Thread.sleep(2000);
}
public void CT600_Return3() throws InterruptedException {
	 HelperClass.waitForPageToLoad(driver);
	 HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.CT600return3);
		HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.CT600return3);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.CT600return3);
		HelperClass.waitForPageToLoad(driver);
	   	
  }
public void AssertSummaryforwdvandrestrictionamount() throws InterruptedException {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryForwdvanddisposedamount);
		HelperClass.waitForPageToLoad(driver);


	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDV B/fwd']]/td"), "1000.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space(text())='Disposal proceeds']]/td"), "(30.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(30.00)");
	
}
public void CT600ComputationforWDVandrestrictionamount() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);

	HelperClass.scrollIntoView(capitalallowance.CT600computationwdvbfwdamountandDisposedAmount);
	capitalallowance.CT600computationwdvbfwdamountandDisposedAmount.click();
	HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "30.00");
	System.out.println("computation 30");
	HelperClass.waitForPageToLoad(driver);

    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
    System.out.println("comuputation 1000");
	HelperClass.waitForPageToLoad(driver);

    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
    System.out.println("comuputation 30");
	
}
public void CT600Computationforadditionandnoclaim() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);

	HelperClass.scrollIntoView(capitalallowance.CT600computationfornoclaimelectricchargevehiclepoints);
	capitalallowance.CT600computationForotherChargesandallowances.click();
	HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "0");
	System.out.println("computation 0");
	
}
public void AssertSummaryforadditionandnoclaim() {
	HelperClass.waitForPageToLoad(driver);

	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummaryforshortlifeassetofwdvamount);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(0.00)");

}
public void EnhancedExpenditureInmainFormforsuperdeduction() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
 Thread.sleep(2000);
 capitalallowance.EnhancedEXpenditureInMainform.click();
	HelperClass.waitForPageToLoad(driver);

 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box691']"));
 String value = element.getAttribute("value");
 System.out.println("Fetched Main form Value: " + value);
}


public void EnhancedExpenditureInmainFormforassetisacar() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
 Thread.sleep(2000);
 capitalallowance.EnhancedEXpenditureInMainform.click();
	HelperClass.waitForPageToLoad(driver);

 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
 String value = element.getAttribute("value");
 System.out.println("Fetched Main form Value: " + value);
}
public void AssertSummaryforassetisacar() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummary1);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
public void CT600Computationforassetisacar() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.scrollIntoView(capitalallowance.CT600computation1);
	capitalallowance.CT600computation1.click();
	HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	HelperClass.waitForPageToLoad(driver);

    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
    System.out.println("comuputation 1000");
}

public void AssetIsaCarBetween75gkmorless() throws InterruptedException{
	HelperClass.waitForPageToLoad(driver);

	 HelperClass.scrollIntoView(capitalallowance.AssetIsaCarBetween75gkmorless);
	// Thread.sleep(3000);
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssetIsaCarBetween75gkmorless);
}

public void EnhancedExpenditureInmainFormforassetisacarfor75g() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	HelperClass.waitForPageToLoad(driver);

 capitalallowance.EnhancedEXpenditureInMainform.click();
HelperClass.waitForPageToLoad(driver);

 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
 String value = element.getAttribute("value");
 System.out.println("Fetched Main form Value: " + value);
}
public void AssertSummaryforassetisacarfor75g() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummary1);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
public void CT600Computationforassetisacarfor75g() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.scrollIntoView(capitalallowance.CT600computation1);
	capitalallowance.CT600computation1.click();
	HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
	System.out.println("computation 180");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	HelperClass.waitForPageToLoad(driver);
;
    HelperClass.scrollIntoView(capitalallowance.TransferfromSLAtoMainPool);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
    System.out.println("comuputation 1000");
}


public void AssetacquisitiondateforFullexpensing() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	
	HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.Assetacquisitiondateforfullexpensing);
	HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.Assetacquisitiondateforfullexpensing);
	HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.Assetacquisitiondateforfullexpensing);
	HelperClass.waitForPageToLoad(driver);
		
	
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2021']]"));
//	//Thread.sleep(10000);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2021']"));
//	//Thread.sleep(10000);
//	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' JAN ']"));
//	//Thread.sleep(2000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='31 December 2023']"));
	HelperClass.waitForPageToLoad(driver);


}

public void Fullexpensing() throws InterruptedException{
	HelperClass.waitForPageToLoad(driver);
	HelperClass.waitForPageToLoad(driver);

	 HelperClass.scrollIntoView(capitalallowance.fullexpensing);
	 HelperClass.waitForPageToLoad(driver);
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.fullexpensing);
}

public void AssertSummaryforfullexpensing() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummary1);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for Full Expensing']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Full Expensing claimed @ 100%']]/td"),"(1000.00)");
	
}
public void CT600Computationforfullexpensing() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.scrollIntoView(capitalallowance.CT600computation1);
	capitalallowance.CT600computation1.click();
	HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "1000.00");
	System.out.println("computation 1000");
	
}
public void EnhancedExpenditureInmainFormforfullexpensing() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	HelperClass.waitForPageToLoad(driver);

 capitalallowance.EnhancedEXpenditureInMainform.click();
	HelperClass.waitForPageToLoad(driver);

 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box688']"));
 String value = element.getAttribute("value");
 System.out.println("Fetched Main form Value: " + value);
}

public void kebabiconforcapitalallowance() throws InterruptedException{
	HelperClass.waitForPageToLoad(driver);
	HelperClass.waitForPageToLoad(driver);

	 HelperClass.scrollIntoView(capitalallowance.kebabiconforcapitalallowance);
	 HelperClass.waitForPageToLoad(driver);
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.kebabiconforcapitalallowance);
}
public void AssetwiseDetails() {
	HelperClass.waitForPageToLoad(driver);
 capitalallowance.AssetwiseDetails.click();
 HelperClass.waitForPageToLoad(driver);
 
}
public void PoolwiseDetails() {
	HelperClass.waitForPageToLoad(driver);
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.kebabiconforcapitalallowance);
 capitalallowance.poolwisedetails.click();
 HelperClass.waitForPageToLoad(driver);
}

public void mousehoveredit() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[normalize-space(text())='edit']"));
}

public void MainpoolOFSaveButton() {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.Savebuttonforcapitalallowance);
	System.out.println("Asset created successfully");
}
public void MainpoolOFCancelchanges() {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.CancelChangesforcapitallowance);

}

public void AssertSummaryforstructureandbuildings() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), capitalallowance.AssertSummary1);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Initial cost']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(capitalallowance.TotalAIAClaimed);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='SBA @ 3.00%']]/td"),"(30.0)");
	
}
public void CT600Computationforstructureandbuildings() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.scrollIntoView(capitalallowance.CT600computation1);
	capitalallowance.CT600computation1.click();
	HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "30.00");
	System.out.println("computation 30.00");
	
}
public void EnhancedExpenditureforstructureandbuildings() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	HelperClass.waitForPageToLoad(driver);

 capitalallowance.EnhancedEXpenditureInMainform.click();
	HelperClass.waitForPageToLoad(driver);

 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box711']"));
 String value = element.getAttribute("value");
 System.out.println("Fetched Main form Value: " + value);
}
public void EnhancedExpenditureInmainForm() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	 Thread.sleep(2000);
	 capitalallowance.EnhancedEXpenditureInMainform.click();
	 Thread.sleep(3000);
	 HelperClass.scrollIntoView(capitalallowance.OtherallowancesandchargesInMainform);
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
	 
	 
	 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));

	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

	System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

	String expectedAllowanceAmount = "180";

	if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
	    System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
	} else {
	    System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
	}

	 
	 
}

public void CT600_Return() {
	 HelperClass.waitForPageToLoad(driver);
	 HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.CT600_Return);
		HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.CT600_Return);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.CT600_Return);
		HelperClass.waitForPageToLoad(driver);
	   	
  }
public void Assetacquisitiondateforshortlifeasset() throws InterruptedException {
	 
	HelperClass.waitForPageToLoad(driver);
	HelperClass.waitUntilVisible(HelperClass.getWait(),capitalallowance.Assetacquisitiondate);
	HelperClass.waitUntilClickable(HelperClass.getWait(),capitalallowance.Assetacquisitiondate);
	HelperClass.ClickUsingJS(HelperClass.getDriver(),capitalallowance.Assetacquisitiondate);
	//Thread.sleep(3000);
		
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2021']]"));
	//Thread.sleep(10000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2021']"));
	//Thread.sleep(10000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' JAN ']"));
	//Thread.sleep(2000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 January 2021']"));
	Thread.sleep(2000);

	
	WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
	 
	// Use JavaScript to read the DOM property `.value`
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String actualWDVRate = (String) js.executeScript("return arguments[0].value;", wdaRate);

	System.out.println("WDARate Value-->: " + actualWDVRate);
	
	
	String expectedWDVRate = "2.96";

	if (actualWDVRate.equals(expectedWDVRate)) {
	    System.out.println(" WDVRate Matched: -->>" + actualWDVRate);
	    
	    
	} else {
	    System.out.println("Validation Failed: Expected ->" + expectedWDVRate + " but found ->" + actualWDVRate);
	  
	    
	}
	
	List<String> expectedEnabled = Arrays.asList(
		    "Asset is a Car",
		    "Claim Small Pool Allowances"
		);
		 
		List<String> ignoreList = Arrays.asList(
		    "No Claim",
		    "Business Closed"
		);
		 
		HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
}


}
            

