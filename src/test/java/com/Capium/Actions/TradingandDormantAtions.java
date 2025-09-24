package com.Capium.Actions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	public void Tax_ReturnoftradingandDormantperiod() {
		if (HelperClass.isButtonEnabled(By.xpath("//span[contains(text(),'Tax Return')]"))) {
			TradingandDormant.Tax_ReturnoftradingandDormantperiod.click();
			System.out.println("Tax_return clicked sucesssfully");
		}
		else {
			System.out.println("Tax_Return not clicked");
		}
		
	}	
	
	 public void SearchTextfieldoftradingandDormantperiod() {
		
		 wait.until(ExpectedConditions.visibilityOf(TradingandDormant.SearchTextfieldoftradingandDormantperiod));
		 TradingandDormant.SearchTextfieldoftradingandDormantperiod.sendKeys("vijith");
		
	 }
    public void clientoftradingandDormantperiod() {
    	TradingandDormant.clientoftradingandDormantperiod.click();
	 
    }
    public void AddCt600oftradingandDormantperiod() {
    	TradingandDormant.AddCt600oftradingandDormantperiod.click();
    }
    
    public void ManualCheckboxoftradingandDormantperiod() {
    	TradingandDormant.ManualCheckboxoftradingandDormantperiod.click();
    }
    
    public void SplitCT600betweenDormantandTradingperiod() {
    	TradingandDormant.SplitCT600betweenDormantandTradingperiodCheckbox.click();
    }

public void Capital_AllowancesCalculatoroftradingandDormantperiod() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	
    	HelperClass.scrollIntoView(TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
    	Thread.sleep(2000);
    	
    	HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
        HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
       HelperClass.safeClick(By.xpath("//p[normalize-space()='Capital Allowances']//parent::div//button"), 2);
    }   	
    public void AddNewAssetoftradingandDormantperiod() throws InterruptedException{
    	HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AddNewAssetoftradingandDormantperiod);
    	//Thread.sleep(5000);
    }
    public void assetdescriptionoftradinganddormantperiod() throws InterruptedException   {
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
	  
    public void DormantEndDate() throws InterruptedException {


   	 
		
		HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.DormantEndDate);
		HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.DormantEndDate);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.DormantEndDate);
		//Thread.sleep(3000);
			
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2023']]"));
		//Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and normalize-space(text())='2023']"));
		//Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' FEB ']"));
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[contains(@class, 'mat-calendar-body-cell-content') and normalize-space(text())='1']"));
		//Thread.sleep(2000);
//	    HelperClass.validateAndVerify(By.xpath("//input[normalize-space(@formcontrolname)='WDARate']"),"18.00");
		Thread.sleep(5000);
 }

    public void Ct60026ReturnoftradingandDormantperiod() {
    	TradingandDormant.Ct60026ReturnoftradingandDormantperiod.click(); 
    }
    
    
    public void CapitalAllowancesCalculatoroftradingandDormantperiod() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	
    	HelperClass.scrollIntoView(TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
    	Thread.sleep(2000);
    	
    	HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
        HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.CapitalAllowancesCalculatoroftradingandDormantperiod);
       HelperClass.safeClick(By.xpath("//p[normalize-space()='Capital Allowances']//parent::div//button"), 2);
    }   	

    public void AddCt600ofTradingandDormantperiod() throws InterruptedException{
    	HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AddCt600oftradingandDormantperiod);
    	//Thread.sleep(5000);
   
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='wDVBroughtFwd']")));
		  
		 HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='wDVBroughtFwd']"), row[1], 5);
		HelperClass.validateTextField(By.xpath("//input[@formcontrolname='wDVBroughtFwd']"),"wDVBroughtFwd","1000");
	}
	public void MainpoolOFSaveAndExitButtonfortradinganddormantperiod() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.SaveAndExitButtonOfCapitalallowance1oftradingandDormantperiod);
	}
		
	  public void SelectAssetCategory() throws InterruptedException {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  Thread.sleep(5000);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Machinery and Plant (Main Pool)");
		  Thread.sleep(2000);
	  }
	     
	  
	  
	  public void SelectMainpool(){
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div")));
		  HelperClass.scrollToElement(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
		  HelperClass.ClickUsingJS(driver,By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
	  }
	  
	  public void SelectSpecialRatepool(){
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div")));
		  HelperClass.scrollToElement(By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div"));
		  HelperClass.ClickUsingJS(driver,By.xpath("//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div"));
	  }    	 
 public void AssetacquisitiondateoftradingandDormantperiod() throws InterruptedException {
	 
			
		HelperClass.waitUntilVisible(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.waitUntilClickable(HelperClass.getWait(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),TradingandDormant.AssetacquisitiondateoftradingandDormantperiod);
		//Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='1 March 2023']"));
		
		Thread.sleep(5000);
 }

 public void AssertSummaryfortradinganddormantperiod() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Asset Summary']]")));
	  HelperClass.ClickUsingJS(HelperClass.getDriver(), TradingandDormant.AssertSummaryoftradingandDormantperiod);
	 
	         
	// verify and validations
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Other Additions']]/td"), "1000.00");
	
	HelperClass.scrollIntoView(TradingandDormant.TotalAIAClaimedoftradingandDormantperiod);
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='WDA @ 18.00%']]/td"),"(180.00)");
	HelperClass.validateAndVerify(By.xpath("//tr[th[normalize-space()='WDV C/fwd']]/td"),"820.00");
	HelperClass.validateAndVerify(By.xpath("//tr[th[text()='Total FYA & WDA claimed']]/td"),"180.00");
}
  
	public void CT600computationoftradingandDormantperiod() throws InterruptedException {
		HelperClass.scrollIntoView(TradingandDormant.CT600computationoftradingandDormantperiod);
		TradingandDormant.CT600computationoftradingandDormantperiod.click();
		Thread.sleep(3000);
		HelperClass.validateAndVerify(By.xpath("//span[@title='ct-comp:TotalCapitalAllowances (FYear)']"), "180.00");
		System.out.println("computation 180");
		Thread.sleep(3000);
        HelperClass.scrollIntoView(TradingandDormant.TransferfromSLAtoMainPooloftradingandDormantperiod);
	    HelperClass.validateAndVerify(By.xpath("(//tr[td[normalize-space()='WDV B/fwd']]/td[@class='aright'])[1]"), "1,000.00");
	    System.out.println("comuputation 1000");
		
	}
   public void MainformForCapitalallowanceoftradingandDormantperiod() {
	   TradingandDormant.MainformForCapitalallowanceoftradingandDormantperiod.click();
	   HelperClass.scrollIntoView(TradingandDormant.CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod);
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


		// System.out.println("MainForm(180)");
	 }
	 public void SelectAssetCategoryfortradinganddormantperiod() throws InterruptedException {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")));
		  HelperClass.ClickUsingJS(driver, By.xpath("//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']"));
		  Thread.sleep(5000);
		  HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']","Machinery and Plant (Main Pool)");
		  Thread.sleep(2000);
	  }
	     
	  
	  
	  public void SelectMainpoolfortradinganddormantperiod(){
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div")));
		  HelperClass.scrollToElement(By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
		  HelperClass.ClickUsingJS(driver,By.xpath("//span[normalize-space()='Machinery and Plant (Main Pool)']//parent::div"));
	  }
	  

	             
	 public void QuicKEntryInMainFormoftradinganddormantperiod() throws InterruptedException {
		 HelperClass.scrollIntoView(TradingandDormant.QuickEntryInMainformoftradingandDormantperiod);
		 TradingandDormant.QuickEntryInMainformoftradingandDormantperiod.click();

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
