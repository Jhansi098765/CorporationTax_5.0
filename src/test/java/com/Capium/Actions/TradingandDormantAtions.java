package com.Capium.Actions;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Locators.TradingandDormantLocator;
import com.Capium.Utilites.ExcelReader;
import com.Capium.Utilites.HelperClass;

public class TradingandDormantAtions {
	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	TradingandDormantLocator TradingandDormant= null;
	public TradingandDormantAtions() {
	this.TradingandDormant=new TradingandDormantLocator() ;
		PageFactory.initElements(HelperClass.getDriver(),TradingandDormant);
	}
	public void Tax_ReturnoftradingandDormantperiod() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.waitForPageToLoad(driver);
		
		 try {
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		     // Use the outerHTML <a> element and its span text
				HelperClass.waitForPageToLoad(driver);
		     WebElement taxReturnButton = wait.until(ExpectedConditions
		             .elementToBeClickable(By.xpath("//a[@href='/submissions']//span[normalize-space()='Tax Return']")));

		     taxReturnButton.click();
		     HelperClass.waitForPageToLoad(driver);

		     System.out.println("Tax Return clicked successfully.");
				HelperClass.waitForPageToLoad(driver);

		 } catch (TimeoutException e) {
		     throw new RuntimeException("Tax Return button not clickable within timeout", e);
		 } catch (Exception e) {
				HelperClass.waitForPageToLoad(driver);

		     throw new RuntimeException("Unexpected error while clicking Tax Return: " + e.getMessage(), e);
		 }
		}
	
	
	
	public void SearchTextfieldfortradinganddormant(String clientname) throws InterruptedException {
		 HelperClass.waitForPageToLoad(driver);
		 try {
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				HelperClass.waitForPageToLoad(driver);

		     WebElement searchField = wait.until(ExpectedConditions
		             .visibilityOfElementLocated(By.xpath("//input[@placeholder='Search here...']")));

		     // Always clear before typing
		     searchField.clear();
				HelperClass.waitForPageToLoad(driver);

		     searchField.sendKeys(clientname);

		     System.out.println("Entered client name: " + clientname);

		     // Wait for search result containing clientName to appear
		     wait.until(ExpectedConditions.presenceOfElementLocated(
		             By.xpath("//td[contains(@class,'mat-mdc-cell')]//a[contains(normalize-space(),'" + clientname+ "')]")));

		 } catch (TimeoutException e) {
		     throw new RuntimeException("Search field or client result not found within timeout", e);
		 } catch (Exception e) {
		     throw new RuntimeException("Unexpected error while entering client name: " + e.getMessage(), e);
		 }
			HelperClass.waitForPageToLoad(driver);

		 Thread.sleep(5000)	;
		 }
	
	 public void Clientfortradinganddormant(String clientName) {
		 HelperClass.waitForPageToLoad(driver);
			
				 try {
				     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
						HelperClass.waitForPageToLoad(driver);

				  
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
		 
    
    public void AddCt600oftradingandDormantperiod() {
    	 HelperClass.waitForPageToLoad(driver);
    	TradingandDormant.AddCt600oftradingandDormantperiod.click();
    	 HelperClass.waitForPageToLoad(driver);
    }
    
    public void ManualCheckboxoftradingandDormantperiod() {
    	 HelperClass.waitForPageToLoad(driver);
    	TradingandDormant.ManualCheckboxoftradingandDormantperiod.click();
    	 HelperClass.waitForPageToLoad(driver);
    }
    
    public void SplitCT600betweenDormantandTradingperiod() {
    	 HelperClass.waitForPageToLoad(driver);
    	TradingandDormant.SplitCT600betweenDormantandTradingperiodCheckbox.click();
    	 HelperClass.waitForPageToLoad(driver);
    }

public void Capital_AllowancesCalculatoroftradingandDormantperiod() throws InterruptedException {
    	
	 HelperClass.waitForPageToLoad(driver);    	
    	HelperClass.scrollIntoView(TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
    	 HelperClass.waitForPageToLoad(driver);    	
    	HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
        HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
       HelperClass.safeClick(By.xpath("//p[normalize-space()='Capital Allowances']//parent::div//button"), 2);
    }   	
    public void AddNewAssetoftradingandDormantperiod() throws InterruptedException{
    	 HelperClass.waitForPageToLoad(driver);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AddNewAssetoftradingandDormantperiod);
		HelperClass.waitForPageToLoad(driver);

    }
    public void assetdescriptionoftradinganddormantperiod() throws InterruptedException   {
    	 HelperClass.waitForPageToLoad(driver);	
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDescription']")));
		  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='assetDescription']"), row[0], 2); 
		  HelperClass.waitForPageToLoad(driver);
		  WebElement assetDescription = driver.findElement(By.xpath("//input[@formcontrolname='assetDescription']"));
		  String value = assetDescription.getAttribute("value");

		  if (value.equals("Asset1")) {
				HelperClass.waitForPageToLoad(driver);
		      System.out.println("PASS: 'Asset1' is in Asset Description field");
		  } else {
		      System.out.println("FAIL: 'Asset1' is NOT in Asset Description field");
		  }
	  }
	  
    public void DormantEndDate() throws InterruptedException { 
		HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.DormantEndDate);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.DormantEndDate);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.DormantEndDate);
		HelperClass.waitForPageToLoad(driver);

//		//Thread.sleep(3000);
//			
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2023']]"));
//		//Thread.sleep(10000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2023']"));
//		//Thread.sleep(10000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' FEB ']"));
//		//Thread.sleep(2000);
		HelperClass.waitForPageToLoad(driver);
		TradingandDormant.Datefortradinganddormant.click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform();
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
		HelperClass.waitForPageToLoad(driver);
		
 }

    public void Ct60026ReturnoftradingandDormantperiod() {
    	HelperClass.waitForPageToLoad(driver);
    	TradingandDormant.Ct60026ReturnoftradingandDormantperiod.click(); 
    	HelperClass.waitForPageToLoad(driver);
    }
    
    
    public void CapitalAllowancesCalculatoroftradingandDormantperiod() throws InterruptedException {
    	
    	HelperClass.waitForPageToLoad(driver);
    	
    	HelperClass.scrollIntoView(TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
    	HelperClass.waitForPageToLoad(driver);
    	HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
        HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
        HelperClass.waitForPageToLoad(driver);
       HelperClass.safeClick(By.xpath("//p[normalize-space()='Capital Allowances']//parent::div//button"), 2);
    }   	

    public void AddCt600ofTradingandDormantperiod() throws InterruptedException{
    	HelperClass.waitForPageToLoad(driver);
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AddCt600oftradingandDormantperiod);
    	
   
}
   
    String Filepath = "D:\\CT 5.0\\CorporationTax_5.0\\src\\test\\resources\\Exceldata\\capitalAllowance_Calculator.xlsx";
    String data [][]=ExcelReader.getSheetData(Filepath, "Sheet1");
	String[] row=data[0];
	  public void Enter_description() throws InterruptedException   {
		  Thread.sleep(4000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDescription']")));
		  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='assetDescription']"), row[0], 2); 
		  
		  WebElement assetDescription = driver.findElement(By.xpath("//input[@formcontrolname='assetDescription']"));
		  String value = assetDescription.getAttribute("value");

		  if (value.equals("Asset1")) {
		      System.out.println("PASS: 'Asset1' is in Asset Description field");
		  } else {
		      System.out.println("FAIL: 'Asset1' is NOT in Asset Description field");
		  }
	  }
	  
	
	public void WDVbroughtFwdfortradinganddormantperiod() throws InterruptedException, IOException {
		 HelperClass.waitForPageToLoad(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='wDVBroughtFwd']")));
		 HelperClass.waitForPageToLoad(driver);
		 HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='wDVBroughtFwd']"), row[1], 5);
		 HelperClass.waitForPageToLoad(driver);
//		HelperClass.validateTextField(By.xpath("//input[@formcontrolname='wDVBroughtFwd']"),"wDVBroughtFwd","1000");
	}
	public void MainpoolOFSaveAndExitButtonfortradinganddormantperiod() {
		 HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.SaveAndExitButtonOfCapitalallowance1oftradingandDormantperiod);
	}
		
	  public void SelectAssetCategory() throws InterruptedException {
		  HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  HelperClass.waitForPageToLoad(driver);
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
 public void AssetacquisitiondateoftradingandDormantperiod() throws InterruptedException {
	 
	 HelperClass.waitForPageToLoad(driver);	
		HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		 HelperClass.waitForPageToLoad(driver);	
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
		
		 HelperClass.waitForPageToLoad(driver);	
		 

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
				   
				    "First Year Allowance at 100%",
				    "Asset is a Car",
				    "Super deduction at 130%"
				);
			HelperClass.waitForPageToLoad(driver);

				List<String> ignoreList = Arrays.asList(
				    "No Claim",
				    "Business Closed"
				);
				HelperClass.waitForPageToLoad(driver);

				HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
	 }
 
 public void AssertSummaryfortradinganddormantperiod() {
	 HelperClass.waitForPageToLoad(driver);	
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AssertSummaryoftradingandDormantperiod);
		HelperClass.waitForPageToLoad(driver);

	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	 HelperClass.waitForPageToLoad(driver);	
	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.waitForPageToLoad(driver);
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.waitForPageToLoad(driver);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
	HelperClass.waitForPageToLoad(driver);

}
  
	public void CT600computationoftradingandDormantperiod() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);	
		HelperClass.scrollIntoView(TradingandDormant.CT600computationoftradingandDormantperiod);
		TradingandDormant.CT600computationoftradingandDormantperiod.click();
		HelperClass.waitForPageToLoad(driver);
		Thread.sleep(3000);
		HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
		System.out.println("computation 180");
		HelperClass.waitForPageToLoad(driver);
		Thread.sleep(3000);
        HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
	    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
		HelperClass.waitForPageToLoad(driver);
	    System.out.println("comuputation 1000");
		
	}
   public void MainformForCapitalallowanceoftradingandDormantperiod() {
		HelperClass.waitForPageToLoad(driver);
	   TradingandDormant.MainformForCapitalallowanceoftradingandDormantperiod.click();
		HelperClass.waitForPageToLoad(driver);
	   HelperClass.scrollIntoView(TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod);
		HelperClass.waitForPageToLoad(driver);

   }
	 public void EnhancedEXpenditureInMainformoftradingandDormantperiod() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
		 Thread.sleep(2000);
		 TradingandDormant.EnhancedEXpenditureInMainformoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		 HelperClass.scrollIntoView(TradingandDormant.OtherallowancesandchargesInMainformoftradingandDormantperiod);
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
		 String value = element.getAttribute("value");
		 System.out.println("Fetched Main form Value: " + value);
		 HelperClass.waitForPageToLoad(driver);


		
	 }
	 public void SelectAssetCategoryfortradinganddormantperiod() throws InterruptedException {
		 HelperClass.waitForPageToLoad(driver);	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  HelperClass.waitForPageToLoad(driver);	
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Machinery and Plant (Main Pool)");
		  HelperClass.waitForPageToLoad(driver);	
	  }
	     
	  
	  
	  public void SelectMainpoolfortradinganddormantperiod(){
		  HelperClass.waitForPageToLoad(driver);	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div")));
		  HelperClass.scrollToElement(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
		  HelperClass.ClickUsingJS(driver,By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
	  }
	  

	             
	 public void QuicKEntryInMainFormoftradinganddormantperiod() throws InterruptedException {
		 HelperClass.waitForPageToLoad(driver);	
		 HelperClass.scrollIntoView(TradingandDormant.QuickEntryInMainformoftradingandDormantperiod);
		 TradingandDormant.QuickEntryInMainformoftradingandDormantperiod.click();
		 HelperClass.waitForPageToLoad(driver);	
	    	HelperClass.scrollIntoView(TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
	    	Thread.sleep(2000);
	    	HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
  }
	 
public void mousehoverdeletefortradinganddormantperiod() throws InterruptedException {
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


  
String Filepath1 = "D:\\CT 5.0\\CorporationTax_5.0\\src\\test\\resources\\Exceldata\\capitalAllowance_Calculator.xlsx";
String data1 [][]=ExcelReader.getSheetData(Filepath, "Sheet1");
String[] row1=data[0];

	  
		  
	  
	  
  public void Additionsadditionoftradinganddormantperiod() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='additions']")));
	  
	  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='additions']"), row1[2], 10);
		 HelperClass.validateTextField(By.xpath("//input[@formcontrolname='additions']"),"additions","1000");

	  }
  
  public void AssertSummaryforadditionoftradinganddormantperiod() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AssertSummaryforadditionsoftradinganddormantperiod);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
  public void CT600Computationforadditionsoftradinganddormantperiod() throws InterruptedException {
		HelperClass.scrollIntoView(TradingandDormant.CT600computationforadditionoftradinganddormantperiod);
		TradingandDormant.CT600computationforadditionoftradinganddormantperiod.click();
		Thread.sleep(3000);
		HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
		System.out.println("computation 180");
		HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
		Thread.sleep(3000);
	    HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
	    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
	    System.out.println("comuputation 1000");
  }

	 public void SelectAssetCategorySpecialRatePool() throws InterruptedException {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  Thread.sleep(5000);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Machinery and Plant (Special Rate Pool)");
		  Thread.sleep(2000);
	  }
	    
public void SpecialRatePoolfortradinganddormantperiod() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div")));
	  TradingandDormant.SpecialRatepooloftradinganddormantperiod.click();
}
public void AIAamountoftradinganddormantperiod() throws InterruptedException {
	 HelperClass.scrollIntoView(TradingandDormant.AIAamountoftradingandDormantperiod);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='aIAClaimed']")));
	 HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='aIAClaimed']"), row[3], 2); 
	 HelperClass.validateTextField(By.xpath("//input[@formcontrolname='aIAClaimed']"),"aIAClaimed","500");
	}

String Filepath2= "D:\\CT 5.0\\CorporationTax_5.0\\src\\test\\resources\\Exceldata\\capitalAllowance_Calculator.xlsx";
String data2[][]=ExcelReader.getSheetData(Filepath, "Sheet1");
String[] row2=data[0];
  public void Enter_description1()   {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDescription']")));
	  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='assetDescription']"), row[0], 2); 
}

public void AIAamountoftradingandDormantperiod() throws InterruptedException {
 HelperClass.scrollIntoView(TradingandDormant.AIAamountoftradingandDormantperiod);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='aIAClaimed']")));
 HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='aIAClaimed']"), row[3], 2); 
 HelperClass.validateTextField(By.xpath("//input[@formcontrolname='aIAClaimed']"),"aIAClaimed","500");
}

public void RestrictionAmountoftradingandDormantperiod() {
HelperClass.scrollIntoView(TradingandDormant.RestrictionAmountoftradingandDormantperiod);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='restrictionAmount']")));
HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='restrictionAmount']"), row[4], 2); 
}

public void AssetDisposedDate() {
	 HelperClass.scrollIntoView(TradingandDormant.AssetDisposedDate);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
	
	 HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetDisposedDate);
		
			
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

public void AssertSummaryforAdditionandAIAamountoftradinganddormantperiod() throws InterruptedException {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AssertSummaryForadditionandaiafortradinganddormantperiod);
	  
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(174.60)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"795.40");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"174.60");
}

public void CT600ComputationforAdditionandAIAamountoftradinganddormantperiod() throws InterruptedException {
	HelperClass.scrollIntoView(TradingandDormant.CT600computationoftradingandDormantperiodforadditionandaia);
	TradingandDormant.CT600computationoftradingandDormantperiodforadditionandaia.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "174.60");
	System.out.println("computation 360");
	Thread.sleep(3000);
    HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
    System.out.println("comuputation 1000");
    HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
    HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
    System.out.println("comuputation 30");
	
}

public void EnhancedExpenditureInmainFormforAdditionandAIAamountfortradinganddormantperiod() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	 Thread.sleep(2000);
	 TradingandDormant.enhancedexpenditureFortradinganddormantforadditionsandaia.click();
	 Thread.sleep(3000);
	 HelperClass.scrollIntoView(TradingandDormant.OtherallowancesandchargesInMainformoftradingandDormantperiod);
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
}

public void firstYearAllowanceAtHundredPercentfortrading() throws InterruptedException {
	Thread.sleep(10000);	
	TradingandDormant.FirstYearAllowanceatHundredPercentCheckboxfortrading.click();

}
public void Additionsfortrading() throws  InterruptedException {
	HelperClass.waitForPageToLoad(driver);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='additions']")));
  
  HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='additions']"), row1[2], 10);
  HelperClass.waitForPageToLoad(driver);
}


//public void DisposalAmount() {
//HelperClass.scrollIntoView(TradingandDormant.DisposalAmount);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='disposalProceeds']")));
//HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='disposalProceeds']"), row[4], 2); 
////HelperClass.validateTextField(By.xpath("//input[@formcontrolname='disposalProceeds']"),"disposalProceeds", "30");
//}
//public void structuresAndBuildingsAllowances() {
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div")));
//	  TradingandDormant.StructuresAndBuildingsAllowances.click();
//
//}
//public void losses() {
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[.//mat-icon[text()='calculate'] and .//a[text()='Losses, Deficits & Excess Amount Calculator']]")));
//	  TradingandDormant.losses.click();
//}
//public void AssertSummary1() {
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
//	  HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssertSummary1);
//	 
//	         
//	// verify and validations
//	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
//	
//	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimed);
//	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
//	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
//	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
//}
//public void CT600Computation1() throws InterruptedException {
//	HelperClass.scrollIntoView(TradingandDormant.CT600computation1);
//	TradingandDormant.CT600computation1.click();
//	Thread.sleep(3000);
//	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
//	System.out.println("computation 180");
//	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
//	Thread.sleep(3000);
//    HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPool);
//    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
//    System.out.println("comuputation 1000");
//}
//}





public void SelectAssetCategoryElectricVehicleChargepointsfortradingandormant() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  Thread.sleep(5000);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Electric Vehicle Charge Points");
	  Thread.sleep(2000);
}

public void firstYearAllowanceAtHundredPercentfortradinganddormant() throws InterruptedException {
	Thread.sleep(10000);	
	TradingandDormant.FirstYearAllowanceatHundredPercentCheckboxfortrading.click();
}
public void AssertSummaryforElectricVehicleChargePointsfortrading() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AssertSummaryforElectricVehicleChargePointsfortrading);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for FYA']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='FYA claimed @ 100%']]/td"),"(1000.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"1000.00");

}
public void CT600ComputationforElectricVehicleChargePointsfortrading() throws InterruptedException {
	HelperClass.scrollIntoView(TradingandDormant.CT600computationofelectricvehiclechchargepointsfortradinganddormant);
	TradingandDormant.CT600computationofelectricvehiclechchargepointsfortradinganddormant.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "1,000.00");
	System.out.println("computation 1,000.00");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='FYA claimed @ 100%']]/td[@class='aright'])[1]"), "(1,000.00)");
HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Total FYA & WDA claimed']]/td[@class='aright'][1]"), "1,000.00");

System.out.println("comuputation 1000");
}
public void capitalallowancesandBalancingchargesInmainformfortradinganddormant() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
	 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

	 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

	 String expectedAllowanceAmount = "1000";

	 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
	     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
	     Assert.assertTrue(true, "Allowance amount matched.");
	 } else {
	     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
	 }
	 
	 
	 
	 
//	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));
//	 String value = element.getAttribute("value");
//	 System.out.println("Fetched Main form Value: " + value);
//	 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));	
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);
//
//	 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);
//
//	 String expectedAllowanceAmount = "1000";
//
//	 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
//	     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//	     Assert.assertTrue(true, "Allowance amount matched.");
//	 } else {
//	     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//	     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
//	 }
//
//}
}
public void AssetDisposedDatefortrading() {
	HelperClass.waitForPageToLoad(driver);
	 HelperClass.scrollIntoView(TradingandDormant.AssetDisposedDatefortrading);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));

	 HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetDisposedDate);
		
			
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2025']]"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2021']"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' JAN ']"));
	//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='assetDisposedDate']")));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='27 January 2021']"));
}
public void DisposalAmountfortrading() {
	HelperClass.waitForPageToLoad(driver);
HelperClass.scrollIntoView(TradingandDormant.DisposalAmountfortrading);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='disposalProceeds']")));
HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='disposalProceeds']"), row[4], 2); 
	
}
public void BusinessClosedCheckboxfortrading() {
    // Use JS click to click the checkbox element safely
    HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.BusinessclosedCheckboxfortrading);

    WebElement checkbox = driver.findElement(By.xpath("//mat-checkbox[@formcontrolname='businessClosed']//input[@type='checkbox']"));

    // If not selected, click normally
    if (!checkbox.isSelected()) {
        checkbox.click();
    }

    // Assert checkbox is selected, fail test if not
    if (checkbox.isSelected()) {
//        System.out.println("'Business Closed' checkbox is selected.");
      Assert.assertTrue(true, "'Business Closed' checkbox is selected.");
    } else {
//        System.out.println("'Business Closed' checkbox is NOT selected.");
       Assert.fail("'Business Closed' checkbox should be selected but is not.");
    }
}

public void AssertSummaryadditionalanddisposalwithbusinessclosedforElectricVehicleChargePointsfortrading() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AssertSummaryadditionalanddisposalwithbusinessclosedforelectricchargevehiclepointsfortrading);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for FYA']]/td"), "970.00");
	
	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='FYA claimed @ 100%']]/td"),"(970.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Disposal proceeds']]/td"),"(30.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"(970.00)");
}
public void CT600ComputationadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints() throws InterruptedException {
	HelperClass.scrollIntoView(TradingandDormant.CT600computationadditionalanddisposalwithbusinessclosedforelectricchargevehiclepointsfortrading);
	TradingandDormant.CT600computationadditionalanddisposalwithbusinessclosedforelectricchargevehiclepointsfortrading.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "970.00");
	System.out.println("computation 970");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Additions qualifying for FYA']]/td[@class='aright'][1]"), "970.00");
	Thread.sleep(3000);
HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='FYA claimed @ 100%']]/td[@class='aright'])[1]"), "(970.00)");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Disposal proceeds']]/td[@class='aright'])[1]"), "(30.00)");
HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing allowance']]/td[@class='aright'])[1]"), "(970.00)");

System.out.println("comuputation 970");
}
public void capitalallowancesandBalancingchargesInmainform2fortradinganddormant() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
	 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

	 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

	 String expectedAllowanceAmount = "970";

	 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
	     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//	     Assert.assertTrue(true, "Allowance amount matched.");
	 } else {
	     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//	     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
	 }
}
	 public void Noclaimcheckboxfortrading() throws InterruptedException {
			Thread.sleep(5000);
			
			// Use JS click to click the checkbox element safely
		    HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.BusinessclosedCheckboxfortrading);

		    WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='No Claim']/parent::div//input[@type='checkbox']"));

		    // If not selected, click normally
		    if (!checkbox.isSelected()) {
		        checkbox.click();
		    }

		    // Assert checkbox is selected, fail test if not
		    if (checkbox.isSelected()) {
		        System.out.println("'NO claim' checkbox is selected.");
		        Assert.assertTrue(true, "'NO claim' checkbox is selected.");
		    } else {
		        System.out.println("'NO claim' checkbox is NOT selected.");
		        Assert.fail("'NO claim' checkbox should be selected but is not.");
		    }
		}



public void AssertSummaryfornoclaimelectricchargevehiclepointsfortrading() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssertSummaryfornoclaimelectricchargevehiclepointsfortrading);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Additions qualifying for FYA']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='Balance in the pool']]/td"),"1000.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"1000.00");
	
	

}

	public void CT600Computationfornoclaimelectricchargevehiclepointsfortrading() throws InterruptedException {
		HelperClass.scrollIntoView(TradingandDormant.CT600computationfornoclaimelectricchargevehiclepointsfortrading);
		TradingandDormant.CT600computationfornoclaimelectricchargevehiclepointsfortrading.click();
		Thread.sleep(3000);
		HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "0");
		System.out.println("computation 0");
		
	
}
	public void capitalallowancesandBalancingchargesInmainformfornoclaimtradinganddormant() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));
		 String value = element.getAttribute("value");
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "0";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
		 
}
	public void SelectAssetCategoryAsEnterpisezonefortradinganddormant() throws InterruptedException {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  Thread.sleep(5000);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Enterprise Zones");
		  Thread.sleep(2000);
	}
	
	public void capitalallowancesandBalancingchargesInmainformForEnterpriseZone() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormfortrading.click();
		 Thread.sleep(3000);
		
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box721']"));
		 String value = element.getAttribute("value");
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box721']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "1000";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
		 
	}
	
	public void capitalallowancesandBalancingchargesInmainform2fortradinganddormantforenterpirsezone() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box721']"));
		 String value = element.getAttribute("value");
		 System.out.println("Fetched Main form Value: " + value);
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box721']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "970";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
}
	
	public void capitalallowancesandBalancingchargesInmainformfornoclaimtradinganddormantforenterpisezone() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box721']"));
		 String value = element.getAttribute("value");
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box721']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "0";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
}
	public void SelectAssetCategoryAsZeroemissionsgoodsvehiclefortrading() throws InterruptedException {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  Thread.sleep(5000);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Zero Emission Goods Vehicle");
		  Thread.sleep(2000);
	}
	public void capitalallowancesandBalancingchargesInmainformForZeroemissionsGoodsvehiclefortrading() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormfortrading.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));
		 String value = element.getAttribute("value");
		
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "1000";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
		 
	}
	public void capitalallowancesandBalancingchargesInmainform2fortradinganddormantforzeroemmissionsgoodsvehicle() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));
		 String value = element.getAttribute("value");
		 System.out.println("Fetched Main form Value: " + value);
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "970";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
}
	public void capitalallowancesandBalancingchargesInmainform3fornoclaimtradinganddormantforzeroemisisonsgoodsvehicle() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));
		 String value = element.getAttribute("value");
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "0";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
		 
	}
	public void SelectAssetCategoryAsZeroemissionsCarsfortrading() throws InterruptedException {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  HelperClass.waitForPageToLoad(driver);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Zero Emission Cars");
		  Thread.sleep(2000);
	}
	
	public void capitalallowancesandBalancingchargesInmainformForZeroemissionsCarsfortrading() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormfortrading.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));
		 String value = element.getAttribute("value");
		
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "1000";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
		 
	}
	public void capitalallowancesandBalancingchargesInmainform2fortradinganddormantforzeroemmissionsforcars() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));
		 String value = element.getAttribute("value");
		 System.out.println("Fetched Main form Value: " + value);
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "970";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
}
	public void capitalallowancesandBalancingchargesInmainform3fornoclaimtradinganddormantforzeroemisisonsCars() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
		 Thread.sleep(2000);
		 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
		 Thread.sleep(3000);
		
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));
		 String value = element.getAttribute("value");
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box723']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "0";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
		 
	}
	public void AssetacquisitiondateoftradingandDormantperiodforelectricchargevehiclechargepoints() throws InterruptedException {
		 
		 HelperClass.waitForPageToLoad(driver);	
			HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
			HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
			HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
			 HelperClass.waitForPageToLoad(driver);	
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
			
			 HelperClass.waitForPageToLoad(driver);	
			 

				WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
				 
				// Use JavaScript to read the DOM property `.value`
				JavascriptExecutor js = (JavascriptExecutor) driver;
				String actualWDVRate = (String) js.executeScript("return arguments[0].value;", wdaRate);
		 
				System.out.println("WDARate Value-->: " + actualWDVRate);
				
				
				String expectedWDVRate = "0";
		 
				if (actualWDVRate.equals(expectedWDVRate)) {
				    System.out.println(" WDVRate Matched: -->>" + actualWDVRate);
				    
				    
				} else {
				    System.out.println("Validation Failed: Expected ->" + expectedWDVRate + " but found ->" + actualWDVRate);
				  
				    
				}
				
				List<String> expectedEnabled = Arrays.asList(
					   
					    "First Year Allowance at 100%"
					   
					);
					 
					List<String> ignoreList = Arrays.asList(
					    "No Claim",
					    "Business Closed"
					);
					 
					HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
		 }


public void SelectAssetCategoryAsShortlifeassetfortrading() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
	  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
	  HelperClass.waitForPageToLoad(driver);
	  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Short Life Assets");
	  HelperClass.waitForPageToLoad(driver);
}
public void Assetacquisitiondateforshortlifeasset() throws InterruptedException {
	 
	
	HelperClass.waitForPageToLoad(driver);	
	HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
	HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
	HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
	 HelperClass.waitForPageToLoad(driver);	
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
	
	 HelperClass.waitForPageToLoad(driver);	
		
	
	
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
//		    "Asset is a Car",
		    "Super deduction at 130%",
		    "Claim Small Pool Allowances"
		);
		 
		List<String> ignoreList = Arrays.asList(
		    "No Claim",
		    "Business Closed"
		);
		 
		HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
}

public void EnhancedExpenditureInmainFormforshortlifeassetoftrading() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
	 Thread.sleep(2000);
	 TradingandDormant.EnhancedEXpenditureforshortlifeassetoftrading.click();
	 Thread.sleep(3000);
	 HelperClass.scrollIntoView(TradingandDormant.OtherallowancesandchargesInMainformoftradingandDormantperiod);
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
	 
	 String value = element.getAttribute("value");
	
	 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

	 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

	 String expectedAllowanceAmount = "30";

	 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
	     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//	     Assert.assertTrue(true, "Allowance amount matched.");
	 } else {
	     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//	     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
	 }
	 
}
public void AssertSummaryforshortlifeassetofadditions() {
	HelperClass.waitForPageToLoad(driver);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant .AssertSummaryforshortlifeassetofadditionamountfortrading);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 2.96%']]/td"),"(29.60)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"970.40");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"29.60");
}
public void CT600Computationforshortlifeassetofadditions() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	HelperClass.scrollIntoView(TradingandDormant.CT600computationforshortlifeassetofadditionamountfortrading);
	TradingandDormant.CT600computationforshortlifeassetofadditionamountfortrading.click();
	Thread.sleep(3000);
	HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "29.60");
	System.out.println("computation 29.60");
	HelperClass.validateAndVerify(By.xpath("//tr[td[text()='Other Additions']]/td[@class='aright'][1]"), "1,000.00");
	Thread.sleep(3000);
    HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPoolfortrading);
    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDA @ 2.96%']]/td[@class='aright'])[1]"), "(29.60)");
    System.out.println("comuputation (29.60)");
}

public void ClaimSmallpoolAllowancheckboxfortrading() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 HelperClass.waitForPageToLoad(driver);
	 WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
	     By.xpath("//span[normalize-space(text())='Claim Small Pool Allowances']/ancestor::mat-checkbox")));
	 HelperClass.waitForPageToLoad(driver);
	 checkbox.click();
	 
//	    WebElement checkbox1 = driver.findElement(By.xpath("//span[normalize-space(text())='Claim Small Pool Allowances']/ancestor::mat-checkbox"));
//
//	    // If not selected, click normally
//	    if (!checkbox1.isSelected()) {
//	        checkbox1.click();
//	    }
//
//	    // Assert checkbox is selected, fail test if not
//	    if (checkbox1.isSelected()) {
//	        System.out.println("'claim small pool allowances' checkbox is selected.");
//	        Assert.assertTrue(true, "'claim small pool allowances' checkbox is selected.");
//	    } else {
//	        System.out.println("'claim small pool allowances' checkbox is NOT selected.");
//	        Assert.fail("'claim small pool allowances' checkbox should be selected but is not.");
//	    }
	}


public void AssertSummaryforClaimsmallPOOlAllowanceforadditionsofshortlifeasset() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	 HelperClass.waitForPageToLoad(driver);
	  HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssertSummaryForClaimsmallPOOlAllowancewithWDV);
	  HelperClass.waitForPageToLoad(driver);

	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Small pools WDA']]/td"),"1000.00");
	
}	
	public void CT600ComputationforClaimsmallPOOlAllowancewithadditionsoftrading() throws InterruptedException {
		HelperClass.scrollIntoView(TradingandDormant.CT600computationClaimsmallPOOlAllowancewithAddition);
		TradingandDormant.CT600computationClaimsmallPOOlAllowancewithWDv.click();
		Thread.sleep(3000);
		HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPoolfortrading);
	    HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1,000.00");
	    System.out.println("comuputation 1000");
	    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Small pools WDA']]/td[@class='aright'])[1]"), "1,000.00");
	    System.out.println("comuputation 1000");
		
	}
	public void EnhancedExpenditureInmainFormforClaimsmallpoolallowancefortrading() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
		 Thread.sleep(2000);
		 TradingandDormant.EnhancedEXpenditureInMainformForAdditionAndLargerdisposedamount.click();
		 Thread.sleep(3000);
		 HelperClass.scrollIntoView(TradingandDormant.OtherallowancesandchargesInMainformoftradingandDormantperiod);
		 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
		 
		 String value = element.getAttribute("value");
		
		 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

		 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

		 String expectedAllowanceAmount = "1000";

		 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
		     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//		     Assert.assertTrue(true, "Allowance amount matched.");
		 } else {
		     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//		     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
		 }
		 
	}
	public void AssertSummaryofbusinessclosedchcekboxfortrading() {
		 HelperClass.waitForPageToLoad(driver);	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.Assetsummaryforbusinessclosedcheckboxfortrading);

		 
		         
		// verify and validations
		HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
		 HelperClass.waitForPageToLoad(driver);	
		HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
		HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Balancing allowance']]/td"),"970.40");
		
	}
	  
		public void CT600computationofbusinessclosedcheckboxfortradingandadditions() throws InterruptedException {
			 HelperClass.waitForPageToLoad(driver);	
			HelperClass.scrollIntoView(TradingandDormant.CT600computationoftradingandDormantperiod);
			TradingandDormant.CT600computationoftradingandDormantperiod.click();
			Thread.sleep(3000);
			HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "970.40");
			System.out.println("computation 970.40");
			Thread.sleep(3000);
	        HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
		    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Other Additions']]/td[@class='aright'])[1]"), "1,000.00");
		    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='Balancing allowance']]/td[@class='aright'])[1]"), "970.40");
  
			
		}
		
		public void EnhancedExpenditureInmainFormforbusinessclosedcheckboxforadditions() throws InterruptedException {
			 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]"));
			 Thread.sleep(2000);
			 TradingandDormant.EnhancedEXpenditureInMainformForAdditionAndLargerdisposedamount.click();
			 Thread.sleep(3000);
			 HelperClass.scrollIntoView(TradingandDormant.OtherallowancesandchargesInMainformoftradingandDormantperiod);
			 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));
			 
			 String value = element.getAttribute("value");
			
			 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box705']"));	
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

			 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

			 String expectedAllowanceAmount = "970";

			 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
			     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//			     Assert.assertTrue(true, "Allowance amount matched.");
			 } else {
			     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//			     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
			 }
			 
		}
			 public void SelectAssstcategoryasotherchargesandallowancesfortrading() {
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
				  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
				 HelperClass.waitForPageToLoad(driver);		
				 HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Other Charges and Allowances");
				 
			}
		

public void Assetacquisitiondateforotherchargesandallowancesfortrading() throws InterruptedException {
	 
	 HelperClass.waitForPageToLoad(driver);	
		HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		 HelperClass.waitForPageToLoad(driver);	
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
		
		 HelperClass.waitForPageToLoad(driver);	
		 

			WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
			 
			// Use JavaScript to read the DOM property `.value`
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String actualWDVRate = (String) js.executeScript("return arguments[0].value;", wdaRate);
	 
			System.out.println("WDARate Value-->: " + actualWDVRate);
			
			
			String expectedWDVRate = "0";
	 
			if (actualWDVRate.equals(expectedWDVRate)) {
			    System.out.println(" WDVRate Matched: -->>" + actualWDVRate);
			    
			    
			} else {
			    System.out.println("Validation Failed: Expected ->" + expectedWDVRate + " but found ->" + actualWDVRate);
			  
			    
			}
			
			List<String> expectedEnabled = Arrays.asList(
				   
				    
				   
				);
				 
				List<String> ignoreList = Arrays.asList(
				    "No Claim",
				    "Business Closed"
				);
				 
				HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
	 }

public void capitalallowancesandBalancingchargesforotherchargesandallowancesformainform2() throws InterruptedException {
	 HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]"));
	 Thread.sleep(2000);
	 TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod.click();
	 Thread.sleep(3000);
	
	 WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));
	 String value = element.getAttribute("value");
	 System.out.println("Fetched Main form Value: " + value);
	 WebElement allowanceAmount = driver.findElement(By.xpath("//input[@formcontrolname='box713']"));	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 String actualAllowanceAmount = (String) js.executeScript("return arguments[0].value;", allowanceAmount);

	 System.out.println("Allowance Amount Value -->: " + actualAllowanceAmount);

	 String expectedAllowanceAmount = "970";

	 if (actualAllowanceAmount.equals(expectedAllowanceAmount)) {
	     System.out.println("Allowance Amount Matched: -->> " + actualAllowanceAmount);
//	     Assert.assertTrue(true, "Allowance amount matched.");
	 } else {
	     System.out.println("Validation Failed: Expected -> " + expectedAllowanceAmount + " but found -> " + actualAllowanceAmount);
//	     Assert.fail("Mismatch in Allowance Amount! Expected: " + expectedAllowanceAmount + ", but got: " + actualAllowanceAmount);
	 }
}
public void AssetacquisitiondateoftradingandDormantperiodforelectricvehiclechargepoints() throws InterruptedException {
	 
	 HelperClass.waitForPageToLoad(driver);	
		HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		 HelperClass.waitForPageToLoad(driver);	
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
		
		 HelperClass.waitForPageToLoad(driver);	
		 

			WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
			 
			// Use JavaScript to read the DOM property `.value`
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String actualWDVRate = (String) js.executeScript("return arguments[0].value;", wdaRate);
	 
			System.out.println("WDARate Value-->: " + actualWDVRate);
			
			
			String expectedWDVRate = "0";
	 
			if (actualWDVRate.equals(expectedWDVRate)) {
			    System.out.println(" WDVRate Matched: -->>" + actualWDVRate);
			    
			    
			} else {
			    System.out.println("Validation Failed: Expected ->" + expectedWDVRate + " but found ->" + actualWDVRate);
			  
			    
			}
			
			List<String> expectedEnabled = Arrays.asList(
				   
				    "First Year Allowance at 100%"
				   
				);
				 
				List<String> ignoreList = Arrays.asList(
				    "No Claim",
				    "Business Closed"
				);
				 
				HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
	 }

public void AssetacquisitiondateoftradingandDormantperiodforenterprizezone() throws InterruptedException {
	 
	 HelperClass.waitForPageToLoad(driver);	
		HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		 HelperClass.waitForPageToLoad(driver);	
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
		
		 HelperClass.waitForPageToLoad(driver);	
		 

			WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
			 
			// Use JavaScript to read the DOM property `.value`
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String actualWDVRate = (String) js.executeScript("return arguments[0].value;", wdaRate);
	 
			System.out.println("WDARate Value-->: " + actualWDVRate);
			
			
			String expectedWDVRate = "0";
	 
			if (actualWDVRate.equals(expectedWDVRate)) {
			    System.out.println(" WDVRate Matched: -->>" + actualWDVRate);
			    
			    
			} else {
			    System.out.println("Validation Failed: Expected ->" + expectedWDVRate + " but found ->" + actualWDVRate);
			  
			    
			}
			
			List<String> expectedEnabled = Arrays.asList(
				   
				    "First Year Allowance at 100%"
				   
				);
				 
				List<String> ignoreList = Arrays.asList(
				    "No Claim",
				    "Business Closed"
				);
				 
				HelperClass.validateCheckboxes(driver, expectedEnabled, ignoreList);
	 }



}


            


