package com.Capium.Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Locators.DashBoardLocator;
import com.Capium.Utilites.HelperClass;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;
import java.io.IOException;

public class DashboardActions {
	
		
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait=HelperClass.getWait();
		DashBoardLocator DashBoard= null;
		public DashboardActions() {
		this.DashBoard=new DashBoardLocator() ;
			PageFactory.initElements(HelperClass.getDriver(),DashBoard);
		}
		
		 public void QuickAddOfDashBoard() throws InterruptedException {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[@title='Quick Add']")));
			 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.QuickAddOfDashBoard);
		    }
		    public void DashBoardOfQuickAdd() {
		    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-icon[normalize-space(text())='space_dashboard'])[2]")));
				 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.DashBoardOfQuickAdd);
				 try {
					    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard") || driver.findElement(By.xpath("//*[contains(text(),'CT600 Submission Summary')]")).isDisplayed());
					    System.out.println(" Dashboard page loaded successfully.");
					} catch (Exception e) {
					    System.out.println(" Dashboard navigation failed: " + e.getMessage());
					}

		    }
		    public void TaxReturnOfQuickAdd() {
		    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-icon[normalize-space(text())='person'])[2]")));
				 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.TaxReturnOfQuickAdd);
				 try {
					    Assert.assertTrue(driver.getCurrentUrl().contains("Tax Amount") || driver.findElement(By.xpath("//div[normalize-space(text())='Tax Amount']")).isDisplayed());
					    System.out.println(" TaxReturn page loaded successfully.");
					} catch (Exception e) {
					    System.out.println(" TaxReturn navigation failed: " + e.getMessage());
					}
					}
				 
				  public void ManageOfQuickAdd() {
				    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-icon[normalize-space(text())='settings'])[2]")));
						 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.ManageOfQuickAdd);
						 try {
							    Assert.assertTrue(driver.getCurrentUrl().contains("Add Client") || driver.findElement(By.xpath("(//span[normalize-space()='Add Client'])[1]")).isDisplayed());
							    System.out.println(" Manage page loaded successfully.");
							} catch (Exception e) {
							    System.out.println(" Manage navigation failed: " + e.getMessage());
							}
}

					 public void SettingsofDashboard() throws InterruptedException {
						 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space(text())='settings_outline']")));
						 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.SettingsINDashboard);
					    }
					 public void ClickonEmailTemplates() throws InterruptedException {
						 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Email Templates']")));
						 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.EmailTemplates);
					    }
					 public void ClickonSaveOfEmailTemplates() throws InterruptedException {
						 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Save']")));
						 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.SaveOFemailtemplate);
						 String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Email template saved successfully']")).trim();
							String expected = "Email template saved successfully";

							if (actualText.equals(expected)) {
								System.out.println("'Email template saved successfully' page verified");
							} else {
								System.out.println("Text not matched. Actual: " + actualText);
						         
						   }
					 }
							public void Clickonkeyboarddoublearrowdownofemailtemplates() throws InterruptedException {
								 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space(text())='keyboard_double_arrow_up']")));
								 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.keyboarddoublearrowdownofemailtemplates);
							    }
							 public void ClickonDocumentTemplates() throws InterruptedException {
								 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Document Templates']")));
								 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.DocumentTemplates);
							    }
							 public void ClickonSaveOFDocumentTemplate() throws InterruptedException {
								 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Save']")));
								 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.SaveOFDocumentTemplate);
								 String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Document template saved successfully']")).trim();
									String expected = "Document template saved successfully";

									if (actualText.equals(expected)) {
										System.out.println("'Document template saved successfully' page verified");
									} else {
										System.out.println("Text not matched. Actual: " + actualText);
								         
								   }
							 
}
							 
									public void Clickonkeyboarddoublearrowdownofdocumenttemplates() throws InterruptedException {
										 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space(text())='keyboard_double_arrow_up']")));
										 HelperClass.ClickUsingJS(HelperClass.getDriver(),DashBoard.keyboarddoublearrowdownofDocumenttemplates);
									    }
									

//Step7:Validate the Cicon
	public void validateCiconfields() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		DashBoard=PageFactory.initElements(driver, DashBoardLocator.class);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[text()='My Admin']"));
		HelperClass.waitForPageToLoad(driver);
		Thread.sleep(4000);
		try {
		    String actualText = HelperClass.getText(By.xpath("//span[text()=' My Firm Details']"));
		    System.out.println(actualText.equals("My Firm Details") ? "Cicon operation is Done" : "Cicon operation is not Done");
		} catch (Exception e) {
		    System.out.println("Error finding or comparing text: " + e.getMessage());
		}
	}
	//Step8:Click on Ticket
	public void clickonTicket() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		DashBoard=PageFactory.initElements(driver, DashBoardLocator.class);
		Thread.sleep(2000);
		DashBoard.Ticket.click();
		HelperClass.waitForPageToLoad(driver);
	}
	//Step9:Validate the Ticket
	public void validateTicket() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		DashBoard=PageFactory.initElements(driver, DashBoardLocator.class);
		Thread.sleep(2000);
		HelperClass.waitForPageToLoad(driver);
		try {
		    String actualText = HelperClass.getText(By.xpath("//span[text()='Add Support Ticket']"));
		    System.out.println(actualText.equals("Add Support Ticket") ? "Cicon operation is Done" : "Cicon operation is not Done");
		} catch (Exception e) {
		    System.out.println("Error finding or comparing text: " + e.getMessage());
		}
	}
	//Step10:
	public void clickonhelp() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		DashBoard=PageFactory.initElements(driver, DashBoardLocator.class);
		Thread.sleep(2000);
		HelperClass.hoverOverElement(driver, By.xpath("//mat-icon[normalize-space()='help_outline']"));
	}
	//Step11:
	public void validatetheHelp() throws InterruptedException, IOException {
		HelperClass.waitForPageToLoad(driver);
		DashBoard=PageFactory.initElements(driver,DashBoardLocator.class);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='help_outline']"));
		HelperClass.captureScreenshot("Help");
	}
	//step12:
	public void clickonuserimage() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		DashBoard=PageFactory.initElements(driver, DashBoardLocator.class);
		Thread.sleep(2000);
		DashBoard.Userimage.click();
	}
	public void validateuserimage() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		DashBoard=PageFactory.initElements(driver, DashBoardLocator.class);
		Thread.sleep(2000);
		try {
		    String actualText = HelperClass.getText(By.xpath("//span[text()='My Account']"));
		    System.out.println(actualText.equals("My Account") ? "Userimage is Done" : "Userimage is not Done");
		} catch (Exception e) {
		    System.out.println("Error finding or comparing text: " + e.getMessage());
		}
		HelperClass.clickUsingJS(By.xpath("//p[@class='text-gray-200 mb-10 m-0']"));
		
	}
	
	public void verifythisdaydropdown() throws InterruptedException {

		  HelperClass.waitForPageToLoad(driver);
		  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass view-list']"));
		  element.click();
		  
	}
		  
		  public void verifyThirtydays() throws InterruptedException {
			  HelperClass.waitForPageToLoad(driver);

			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass view-list']"));
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
//			  Thread.sleep(3000);
//			  Thread.sleep(5000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='30 days']"));
			  option.click();
		  }
		  
		  
		  public void verifySixetydays() throws InterruptedException {
			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass view-list']"));
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
//			  Thread.sleep(3000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='60 days']"));
			  option.click();
		  }
		  public void verifyNinetydays() throws InterruptedException {
			  HelperClass.waitForPageToLoad(driver);

			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass view-list']"));
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
//			  Thread.sleep(3000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='90 days']"));
			  option.click();
		  }
		  public void verifyOneEightydays() throws InterruptedException {
			  HelperClass.waitForPageToLoad(driver);

			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass view-list']"));
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
//			  Thread.sleep(3000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='180 days']"));
			  option.click();
		  }
		  
		  public void verifyThreesixtydays() throws InterruptedException {
			  HelperClass.waitForPageToLoad(driver);

			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass view-list']"));
			  HelperClass.waitForPageToLoad(driver);

			  element.click();
			  HelperClass.waitForPageToLoad(driver);
			  Thread.sleep(3000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='360 days']"));
			  option.click();
		  }
		  public void verifyCustom() throws InterruptedException {
			  HelperClass.waitForPageToLoad(driver);

			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass view-list']"));
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
//			  Thread.sleep(3000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='Custom']"));
			  option.click();
		  }
		  
		  public void verifythisThisfinancailyeardropdown() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ng-select[1]/div[1]/span[2]"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  
		}	
		  
		  
		  public void verifyTwothousandtwentyfour() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  Thread.sleep(3000);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
Thread.sleep(3000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2024']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click(); 
			  
		}	
		  public void verifyTwothousandtwentythree() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  Thread.sleep(3000);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
              Thread.sleep(3000);
			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2023']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click(); 
}
		  public void verifyTwothousandtwentytwo() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2022']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click(); 
}
		  public void verifyTwothousandtwentyone() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2021']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click(); 
}
		  public void verifyTwothousandtwenty() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2020']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click(); 
}
		  public void verifyTwothousandnineteen() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2019']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click(); 
}  
		  
		  public void verifyTwothousandeighteen() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2018']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click();
		  }
		  
		  public void verifyTwothousandseventeen() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2017']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click();
		  }
		  
		  public void verifyTwothousandsixteen() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2016']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click();
		  }
		  public void verifyTwothousandfifteen() throws InterruptedException {

			  HelperClass.waitForPageToLoad(driver);
			  WebElement element=driver.findElement(By.xpath("//ng-select[@panelclass='myPanelClass']"));
			  HelperClass.waitForPageToLoad(driver);
			  element.click();
			  HelperClass.waitForPageToLoad(driver);

			  WebElement option= driver.findElement(By.xpath("//ng-dropdown-panel//span[normalize-space(text())='2015']"));
			  HelperClass.waitForPageToLoad(driver);
			  option.click();
}
		  public void history() throws InterruptedException {
			  HelperClass.waitForPageToLoad(driver);
			  HelperClass.waitUntilVisible(HelperClass.getWait(), DashBoard.history);
				HelperClass.waitUntilClickable(HelperClass.getWait(), DashBoard.history);
				HelperClass.ClickUsingJS(HelperClass.getDriver(), DashBoard.history);
				Thread.sleep(5000);
			
			  HelperClass.validatePageText(driver,"Subject",By.xpath("//th[.//div[text()='Subject']]"));
		  }
}