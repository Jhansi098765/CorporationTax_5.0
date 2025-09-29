package com.Capium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.Capium.Utilites.HelperClass;

public class ManageLocators {


	@FindBy(xpath="//span[normalize-space()='Manage']")
	public WebElement Manage;
	
	@FindBy(xpath = "(//span[normalize-space()='Clients'])[1]")
	@CacheLookup
	public WebElement Clients;
	

	@FindBy(xpath="//mat-icon[@title='Users']//parent::div")
	public WebElement Users;
	

	@FindBy(xpath="//mat-icon[@title='Import']//parent::div")
	public WebElement Import;
	
	@FindBy(xpath="//mat-icon[@title='Export']//parent::div")
	public WebElement Export;

	@FindBy(xpath="//mat-icon[@title='Permission']//parent::div")
	public WebElement Permission;
     
	
//	@FindBy(xpath="//span[text()='Manage']")
//	public WebElement manage;
//	
//	@FindBy(xpath="//mat-icon[@title='Users']//parent::div")
//	public WebElement Users;
	
	@FindBy(xpath="//span[normalize-space()='Add User']")
	public WebElement adduser;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	public WebElement firstmiddleandlastname;
	

	@FindBy(xpath="//input[@formcontrolname='email']")
	public WebElement emailtextfield;
	
	@FindBy(xpath="//span[normalize-space()='Save and Invite']")
	public WebElement saveandinvite;
	
	

	@FindBy(xpath="//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'][parent::label[@for='mat-checkbox-15-input']]")
	public WebElement clickoncheckbox ;
	
	@FindBy(xpath="//mat-icon[normalize-space()='delete_outline']")
	public WebElement delete ;
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	public WebElement yes ;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement statusall ;
	
	
	@FindBy(xpath="//span[contains(text(),'Active')]")
	public WebElement active ;
	
	@FindBy(xpath="//span[contains(text(),'Resend Invitation')]")
	public WebElement Resendinvitation ;
	
	@FindBy(xpath="//span[contains(text(),'Invite')]")
	public WebElement Invite;
	
	@FindBy(xpath="//span[contains(text(), 'Archived')]")
	public WebElement Archived ;
	
	@FindBy(xpath="//mat-icon[normalize-space()='more_vert']")
	public WebElement kebab ;
	
	@FindBy(xpath="//span[normalize-space()='Export to Excel']")
	public WebElement exporttoexcel ;
	
	@FindBy(xpath="//span[normalize-space()='Export to CSV']")
	public WebElement exporttoCSV ;
	
	@FindBy(xpath="//span[normalize-space()='Export to PDF']")
	public WebElement exporttoPDV ;
	
	@FindBy(xpath="//input[@id='mat-checkbox-8-input']/parent::span")
	public WebElement clickonCheckbox ;

	@FindBy(xpath="//button[.//mat-icon[text()='delete_outline'] and .//p[text()='Delete']]")
	public WebElement Delete ;

	@FindBy(xpath="//span[normalize-space()='Yes']")
	public WebElement Yes ;
	
	@FindBy(xpath="//button[.//mat-icon[normalize-space()='border_all'] and .//p[normalize-space()='Excel']]")
	public WebElement ExportasExcel ;
	
	@FindBy(xpath="//button[.//mat-icon[normalize-space()='description'] and .//p[normalize-space()='CSV']]")
	public WebElement ExportasCSV ;
	
	@FindBy(xpath="//mat-icon[normalize-space()='highlight_off'][1]/ancestor::button[1]")
	public WebElement ExportasPDF ;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	public WebElement Search;
	
	@FindBy(xpath="//label[@for=\"mat-checkbox-160-input\"]//input[@type=\"checkbox\"]")
     public WebElement ClickoncheckboxofUser;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	public WebElement firstnameTextfield;


	@FindBy(xpath="(//input[@formcontrolname='email'])[1]")
	public WebElement GmailTextfield;


	@FindBy(xpath="//button[normalize-space(.)='Save']")
	public WebElement Save;

	@FindBy(xpath="//input[@formcontrolname='photo']")
	public WebElement ChooseaFile;
	

	@FindBy(xpath="//button[.//mat-icon[text()=\"print\"] and .//p[text()=\"Print\"]]")
	public WebElement Print;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]//mat-checkbox")
	public WebElement Usercheckbox;
	
	@FindBy(xpath="//a[normalize-space(text())=\"Delete Photo\"]")
	public WebElement ProfileDeletion;
	

	@FindBy(xpath="//button[normalize-space(.)='No']")
	public WebElement AddUsersNoDeleteButton;
	
	@FindBy(xpath="//mat-icon[text()='border_all']")
	public WebElement ExportAsExcelInAddUsers;
	
	@FindBy(xpath="//mat-icon[text()='description']")
	public WebElement ExportAsCSVInAddUsers;
	
	@FindBy(xpath="//mat-icon[text()='picture_as_pdf']")
	public WebElement ExportAsPDFInAddUsers;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]//mat-checkbox")
	public WebElement IdCheckboxInUsers;
	

	@FindBy(xpath="//button[.//mat-icon[text()='delete_outline'] and .//p[text()='Delete']]")
	public WebElement DeleteInUsers;
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	public WebElement YesButtonInUsers;
	

	@FindBy(xpath="//button[normalize-space(.)='No']")
	public WebElement NoButtonInUsers;
	

	@FindBy(xpath="//mat-icon[text()='border_all']")
	public WebElement ExportAsExcelUsers;
	
	@FindBy(xpath="//mat-icon[text()='description']")
	public WebElement ExportAsCSVUsers;
	

	@FindBy(xpath="//mat-icon[text()='picture_as_pdf']")
	public WebElement ExportAsPDFUsers;
	
	@FindBy(xpath="//mat-icon[text()='highlight_off']")
	public WebElement CrossButtonUsers;
	
	@FindBy(xpath="//a[text()='Cancel Selection']")
	public WebElement CancelSelection;
	
	@FindBy(xpath="//mat-icon[text()='highlight_off']")
	public WebElement CrossButtonAddUsers;
	
	@FindBy(xpath="//a[text()='Cancel Selection']")
	public WebElement CancelSelectionAddUsers;
	

	@FindBy(xpath="//span[text()=' Click here']")
	public WebElement EditPermissions;
	
	@FindBy(xpath="(//mat-icon[text()=' keyboard_arrow_right '])[3]")
	public WebElement TaxReturnArrowInAddUsers;
	
	@FindBy(xpath="(//mat-icon[contains(@class, 'mat-icon') and contains(text(), 'keyboard_arrow_right')])[5]")
	public WebElement QuickreturnarrowInAddUsers;
	
	@FindBy(xpath="(//mat-icon[contains(@class, 'mat-icon') and contains(text(), 'keyboard_arrow_right')])[5]")
	public WebElement CalculatorArrowinQuickreturnarrowInAddUsers;
	
	
	@FindBy(xpath="(//mat-icon[contains(@class, 'mat-icon') and contains(text(), 'keyboard_arrow_right')])[5]")
	public WebElement ReportsarrowInAddUsers;
	
	@FindBy(xpath="(//mat-icon[contains(@class, 'mat-icon') and contains(text(), 'keyboard_arrow_right')])[6]")
	public WebElement AttachmentArrowinQuickreturnarrowInAddUsers;
	
	@FindBy(xpath="(//mat-icon[contains(@class, 'mat-icon') and contains(text(), 'keyboard_arrow_right')])[7]")
	public WebElement ReportsArrowinQuickreturnarrowInAddUsers;
	
	@FindBy(xpath="(//mat-icon[contains(@class, 'mat-icon') and contains(text(), 'keyboard_arrow_right')])[7]")
	public WebElement ManageArrowInAddUsers;

	@FindBy(xpath="(//mat-icon[@role='img' and @aria-hidden='true' and contains(@class, 'mat-icon') and contains(@class, 'material-icons') and @data-mat-icon-type='font' and normalize-space(.)='keyboard_arrow_right'])[8]")
	public WebElement CalculatorArrowInAddUsers;
	
	@FindBy(xpath="//span[@title=\"R&D Enhanced Expenditure\"]")
	public WebElement RandDenhancedexpenditureinCalculatArrow ;
	
	@FindBy(xpath="(//span[@class=\"mat-radio-outer-circle\"])[5]")
	public WebElement ViewRadioButtonInEditPermission ;
	

	@FindBy(xpath="(//span[normalize-space(text())='Save'])[2]")
	public WebElement SaveButtonInEditPermission ;
	
	@FindBy(xpath="//span[normalize-space(text())='Cancel']")
	public WebElement CancelButtonInEditPermission ;
	
	@FindBy(xpath="//span[normalize-space(text())='Cancel']")
	public WebElement ResetToDefaultInEditPermission ;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='close'])[2]")
	public WebElement CloseIconInEditPermission ;
	
	@FindBy(xpath="//ng-select[@formcontrolname='permissions']")
	public WebElement PermissionsDropdowninUsers;
	
	@FindBy(xpath="//ng-select[@formcontrolname='addressType']")
	public WebElement BusinessdropdowninUsers;
	
	@FindBy(xpath="(//ng-select[@formcontrolname='country'])[2]")
	public WebElement CountrydropdownInusers;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	public WebElement SaveButtonInUsers;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	public WebElement SaveandExitbuttoninusers;
	
	@FindBy(xpath="//span[normalize-space()='Cancel Changes']")
	public WebElement CancelchangesButton;
	
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='Active']")
	public WebElement ActiveInstatusalldropdown;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='Resend Invitation']")
	public WebElement ResendInvitationInstatusalldropdown;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='Invite']")
	public WebElement InviteInstatusalldropdown;
	
	@FindBy(xpath="//ng-dropdown-panel//span[normalize-space(text())='Archived']")
	public WebElement ArchivedInstatusalldropdown;
	
	@FindBy(xpath="//span[normalize-space(text())='Status-All']/ancestor::ng-select//span[@class='ng-arrow-wrapper']")
	public WebElement Statusalldropdown;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]//mat-checkbox")
	public WebElement UserCheckboxinUsers;
}


	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	