package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardLocator {


	@FindBy(xpath="//mat-icon[@title='Quick Add']")
	public WebElement QuickAddOfDashBoard;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='space_dashboard'])[2]")
	public WebElement DashBoardOfQuickAdd;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='person'])[2]")
	public WebElement TaxReturnOfQuickAdd;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='settings'])[2]")
	public WebElement ManageOfQuickAdd;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='settings_outline']")
	public WebElement SettingsINDashboard;
	
	@FindBy(xpath="//span[normalize-space(text())='Email Templates']")
	public WebElement EmailTemplates;
	
	@FindBy(xpath="//span[normalize-space(text())='Document Templates']")
	public WebElement DocumentTemplates;
	
	@FindBy(xpath="//span[normalize-space(text())='Logo on Tax Document']")
	public WebElement LogoONTaxDocument;
	
	@FindBy(xpath="//span[normalize-space(text())='Save']")
	public WebElement SaveOFemailtemplate;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='keyboard_double_arrow_up']")
	public WebElement keyboarddoublearrowdownofemailtemplates;
	
	@FindBy(xpath="//span[normalize-space(text())='Save']")
	public WebElement SaveOFDocumentTemplate;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='keyboard_double_arrow_up']")
	public WebElement keyboarddoublearrowdownofDocumenttemplates;
	
	@FindBy(xpath="//span[text()='Add New']")
	public WebElement AddNewbtn;
	
	@FindBy(xpath="//mat-icon[@title='search']")
	public WebElement Serachicon; 
	
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement Serachbar; 
	
	@FindBy(xpath="//mat-icon[normalize-space()='confirmation_number']")
	public WebElement Ticket; 
	
	@FindBy(xpath="//span[text()='Add Support Ticket']")
	public WebElement AddSupportTicket; 
	
	@FindBy(xpath="//mat-icon[normalize-space()='help_outline']")
	public WebElement Help; 
	
	@FindBy(xpath="//div[@title='User Image']")
	public WebElement Userimage; 
	
	@FindBy(xpath="//span[text()='My Account']")
	public WebElement MyAccount; 
	
	@FindBy(xpath="//ng-select[@panelclass='myPanelClass view-list']")
	public WebElement Thisday;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='30 days']")
	public WebElement thirtydays; 
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='60 days']")
	public WebElement sixtydays; 
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='90 days']")
	public WebElement ninetydays;

	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='180 days']")
	public WebElement oneeightydays;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='360 days']")
	public WebElement threesixtydays;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='Custom']")
	public WebElement custom;
	
	@FindBy(xpath="//ng-select[@panelclass='myPanelClass']")
	public WebElement Thisfinancialyear;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2024']")
	public WebElement Twothousandtwentyfour;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2023']")
	public WebElement Twothousandtwentythree;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2022']")
	public WebElement Twothousandtwentytwo;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2021']")
	public WebElement Twothousandtwentyone;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2020']")
	public WebElement Twothousandtwenty;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2019']")
	public WebElement Twothousandnineteen;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2018']")
	public WebElement Twothousandeighteen;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2017']")
	public WebElement Twothousandseventeen;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2016']")
	public WebElement Twothousandsixteen;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='2015']")
	public WebElement Twothousandfifteen;
	
	@FindBy(xpath="//mat-icon[normalize-space()='history']")
	public WebElement history;
	
}

