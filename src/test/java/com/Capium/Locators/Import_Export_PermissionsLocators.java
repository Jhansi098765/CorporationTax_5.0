package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Import_Export_PermissionsLocators {

	@FindBy(xpath = "//span[normalize-space()='Manage']")
	@CacheLookup
	public WebElement Manage;
   
	@FindBy(xpath="//mat-icon[@title='Permission']")
	public WebElement Permissions;
	
	@FindBy(xpath="(//mat-icon[text()=' keyboard_arrow_right ' and contains(@class, 'mat-icon')])[3]")
	public WebElement TaxreturnArrow;
	
	@FindBy(xpath="//td[.//span[@title=\"Quick Entry\"]]//mat-icon[normalize-space(text())=\"keyboard_arrow_right\"]")
	public WebElement Quickentryarrow;
	
	@FindBy(xpath="(//span[@title=\"Calculator\"]/preceding-sibling::button//mat-icon)[1]")
	public WebElement Calculatorarrow;
	
	
	@FindBy(xpath="//span[@title=\"Attachments\"]/preceding-sibling::button//mat-icon")
	public WebElement Attachmentsarrow;
	
	@FindBy(xpath="//span[normalize-space()='Reports']//parent::div//parent::td")
	public WebElement Reports;
	
	@FindBy(xpath="//span[normalize-space()='Manage']//parent::div//parent::td")
	public WebElement Managee;
	
	@FindBy(xpath="(//button[contains(@class, 'mat-button') and .//mat-icon[normalize-space()='keyboard_arrow_right']])[8]")
	public WebElement Calculator_Arrow;
	
	@FindBy(xpath="(//mat-icon[text()=' keyboard_arrow_right '])[7]")
	public WebElement Reportss_arrow;
	
	@FindBy(xpath="(//button[contains(@class, 'mat-button') and .//mat-icon[normalize-space()='keyboard_arrow_right']])[7]")
	public WebElement Manage_arrow;
	
	@FindBy(xpath="//span[@title=\"R&D Enhanced Expenditure\" and normalize-space(text())=\"R&D Enhanced Expenditure\"]")
	public WebElement R_and_D_enhancedExpenditure;
	
	@FindBy(xpath="//input[contains(@class, 'mat-input-element') and @placeholder='Search']")
	public WebElement SearchInPermission;
	
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[14]")
	public WebElement ViewAccess;
	
	@FindBy(xpath="//span[normalize-space(text())='Save']/parent::button")
	public WebElement SaveButton;
	
	@FindBy(xpath="//span[normalize-space(text())='Save and Exit']/parent::button")
	public WebElement SaveAndExitButton;
	
	@FindBy(xpath="//span[normalize-space(text())='Cancel Changes']/parent::button")
	public WebElement CancelChanges;
	
	@FindBy(xpath="//input[@id='mat-radio-33-input']")
	public WebElement ViewRadioButton;
	
	@FindBy(xpath="//mat-icon[@title='Import']//parent::div")
	public WebElement ImportOfManageScreen;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/div[1]/app-settings[1]/div[1]/div[1]/app-import-settings[1]/div[1]/div[1]/div[3]/div[1]/mat-radio-group[1]/div[1]/div[1]/mat-radio-button[1]/div[1]/div[1]/input[1]")
	public WebElement ClientsRadioButtonInIMPORT;
	
	@FindBy(xpath="(//mat-checkbox//input[@type='checkbox'])[1]")
	public WebElement ClientsRadioButtonInEXPORT;
	
	@FindBy(xpath="//button[normalize-space(.)='Next']")
	public WebElement NextofImport;
	
	@FindBy(xpath="//button[normalize-space(text())='Browse']")
	public WebElement BrowseOFimport;
	
	@FindBy(xpath="//mat-icon[@title='Export']//parent::div")
	public WebElement ExportOfManageScreen;
	
	@FindBy(xpath="//span[normalize-space(text())='This Week']")
	public WebElement ThisWeekFromdropdown;
	
	@FindBy(xpath="//input[@type='text' and @aria-autocomplete='list']/parent::div[@role='combobox']")
	public WebElement AllFromdropdown;
	
	@FindBy(xpath="//button[.//span[normalize-space(text())='Save And Next']]")
	public WebElement SaveAndNextOfImport;

	@FindBy(xpath="//button[.//span[normalize-space(text())='Next']]")
	public WebElement NextButtonAfterBrowse;
	
	@FindBy(xpath="(//button[.//span[normalize-space(text())='Export']])[2]")
	public WebElement ExportofExcelOFRexport;
	
	@FindBy(xpath="(//span[normalize-space(text())='Last Week'])")
	public WebElement LastWeekFromdropdown;
	
	@FindBy(xpath="(//span[normalize-space(text())='This Month'])")
	public WebElement ThisMonthFromdropdown;
	
	@FindBy(xpath="(//span[normalize-space(text())='This Quarter'])")
	public WebElement ThisQuarterFromdropdown;
	
	@FindBy(xpath="(//span[normalize-space(text())='Last Quarter'])")
	public WebElement LastQuarterFromdropdown;
	
	@FindBy(xpath="(//span[normalize-space(text())='This Year'])")
	public WebElement ThisYearFromdropdown;
	
	@FindBy(xpath="(//span[normalize-space(text())='Last Year'])")
	public WebElement LastYearFromdropdown;
	
	@FindBy(xpath="(//span[normalize-space(text())='Custom'])")
	public WebElement CustomFromdropdown;
	
	@FindBy(xpath="//button[.//mat-icon[text()='description'] and .//p[text()='CSV']]")
	public WebElement ExportasCSVforExport;
	
	@FindBy(xpath="//button[.//mat-icon[normalize-space(text())='picture_as_pdf'] and .//p[normalize-space(text())='PDF']]")
	public WebElement ExportasPDFforExport;
	

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/div[1]/app-settings[1]/div[1]/div[1]/app-export-settings[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/mat-checkbox[1]/div[1]/div[1]/input[1]")
	public WebElement UsersRadioButtonInImport;
	
	
}

