package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Capium.Utilites.HelperClass;

public class CapitalAllowances_Locator {
	//public static final String AdditionsOfMainPool = null;

	@FindBy(xpath="//span[contains(text(),'Tax Return')]")
	public WebElement Tax_Return;
	
	@FindBy(xpath="//input[@placeholder='Search here...']")
	public WebElement SearchTextfield;
	
	@FindBy(xpath=" //a[contains(text(),' vijith')]")
	public WebElement client;
	
	@FindBy(xpath="//a[contains(text(),' CT-2')]")
	public WebElement CT600_Return ;

	@FindBy(xpath="//p[normalize-space()='Capital Allowances']//parent::div//button")
	public WebElement CapitalAllowancesCalculator;
	
	@FindBy(xpath="//mat-icon[text()='add']/parent::button[.//span[normalize-space(text())='Add new Asset']]")
	public WebElement AddNewAsset;
	
	@FindBy(xpath="//input[@formcontrolname='assetDescription' and @id='mat-input-136' and contains(@class, 'mat-mdc-input-element')]")
	public WebElement AddDescription;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategory;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryforstructureandbuildings;
	
	@FindBy(xpath="//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Machinery and Plant (Main Pool)']")
	public WebElement MainpoolAsset ;
	
	@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
	public WebElement Assetacquisitiondate;
	
	@FindBy(xpath="//input[@formcontrolname='wDVBroughtFwd']")
	public WebElement WDVBroughtFwd;
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	public WebElement SaveAndExit;
	
	@FindBy(xpath="//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2021']]")
	public WebElement Yeardropdown;

	@FindBy(xpath="//button[normalize-space()='Save and Exit']")
	public WebElement SaveAndExitButtonOfCapitalallowance;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummary;
	
	@FindBy(xpath="//tr[th[text()='Total AIA claimed']]")
	public WebElement TotalAIAClaimed;

	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computation;

	@FindBy(xpath="//span[@class='tagixbrl' and @title='ct-comp:TotalCapitalAllowances (FYear)']")
	public WebElement CapitalallowanceAmountInComputation;
	
	@FindBy(xpath="//td[normalize-space(text())='Transfer from SLA to Main Pool']")
	public WebElement TransferfromSLAtoMainPool;
	
	@FindBy(xpath="//div[contains(@class, 'mdc-tab') and @role='tab' and .//span[normalize-space(text())='Main Forms']]")
	public WebElement MainformForCapitalallowance;
	
	@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
	public WebElement CapitalallowancesAndBalancingChargeInMainForm;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainform;
	
	@FindBy(xpath="//p[normalize-space(text())='Other allowances and charges']")
	public WebElement OtherallowancesandchargesInMainform;
	
	@FindBy(xpath="//div[@role='tab' and .//span[text()='Quick Entry']]")
	public WebElement QuickEntryInMainform;
	
	@FindBy(xpath="//mat-icon[text()='delete_outline']")
	public WebElement DeleteAsset;
	
	@FindBy(xpath="//input[@formcontrolname='additions']")
	public WebElement Additions;
	
	@FindBy(xpath="//input[@formcontrolname='aIAClaimed']")
	public WebElement AIAamount;
	
	@FindBy(xpath="//input[@formcontrolname='restrictionAmount']")
	public WebElement RestrictionAmount;
	
	@FindBy(xpath="//button[normalize-space()='Save and Exit']")
	public WebElement SaveAndExitButtonOfCapitalallowance1;
	
	@FindBy(xpath="//span[contains(text(),'Tax Return')]")
	public WebElement TaxReturn;
	
	@FindBy(xpath="//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div")
	public WebElement SpecialRatepool;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryForSpecialRatePool;
	
	@FindBy(xpath="//input[@formcontrolname='assetAcquisitionDate']/following::button[@aria-label='Open calendar'][1]")
	public WebElement AssetacquisitiondateForSpecialRatePool;
	
	@FindBy(xpath="//input[@formcontrolname='assetDisposedDate']")
	public WebElement AssetDisposedDate;
	
	@FindBy(xpath="//input[@formcontrolname='disposalProceeds']")
	public WebElement DisposalAmount;
	
	@FindBy(xpath="//span[normalize-space(text())='Structures and Buildings Allowance']/parent::div")
	public WebElement StructuresAndBuildingsAllowances;
	
	@FindBy(xpath="//li[.//mat-icon[text()='calculate'] and .//a[text()='Losses, Deficits & Excess Amount Calculator']]")
	public WebElement losses;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummary1;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computation1;

	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummary2;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computation2;
	
	@FindBy(xpath="//label[normalize-space(span)='Asset is a Car']/preceding::input[@type='checkbox'][1]")
	public WebElement AssetIsaCarBetween75to130gKm;

	@FindBy(xpath="//ng-dropdown-panel//div/span[normalize-space()='Short Life Assets']")
	public WebElement ShortLifeAsset;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategory1;
	
	@FindBy(xpath="(//span[normalize-space(text())='Other Charges and Allowances']/parent::div)[1]")
	public WebElement OtherChargesAndAlloawnces;

	@FindBy(xpath="(//span[normalize-space(text())='Designated Enhanced Allowance'])[2]")
	public WebElement DesignatedEnhancedAllowance;
	
	@FindBy(xpath="//mat-checkbox[.//span[contains(text(), 'First Year Allowance at 100%')]]//input")
	public WebElement FirstYearAllowanceatHundredPercentCheckbox;
	
	@FindBy(xpath="//mat-checkbox[@formcontrolname='noClaim']//input[@type='checkbox']")
	public WebElement NoClaimCheckBox;
	
	@FindBy(xpath="//mat-checkbox[.//span[text()='First Year Allowance at 100%']]//input[@type='checkbox']")
	public WebElement Firstyearallowanceat100percent;
	
	
	@FindBy(xpath="//span[normalize-space(text())='Super deduction at 130%']/ancestor::mat-checkbox//input[@type='checkbox']")
	public WebElement superdeductionFormainpool;
	
	@FindBy(xpath="//input[@id=//label[normalize-space(span)='75g/Km or less']/@for]")
	public WebElement SEVENTYFIVEgKmOrlessformainpool;
	
	@FindBy(xpath="//input[@id=//label[normalize-space(span)='Business Closed']/@for]")
	public WebElement BusinessclosedCheckbox;

	@FindBy(xpath="//span[normalize-space(text())='Electric Vehicle Charge Points']")
	public WebElement ElectricVehicleChargePoints;
   
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForwdvandadditionamount;

	@FindBy(xpath="//span[normalize-space()='Save and Exit']/parent::button")
	public WebElement MainpoolOFSaveAndExitButton;

	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForwdvanddisposedamount;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationwdvbfwdamountandDisposedAmount;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformForWDVanddisposedamount;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForwdvandLargerdisposedamount;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationwdvbfwdamountandLargerDisposedAmount;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformForWDVandLargerdisposedamount;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForAdditionAmountandLargerdisposedamount;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationAdditionAmountandLargerDisposedAmount;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformForAdditionAndLargerdisposedamount;
	

	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForAdditionAmountanddisposedamount;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationAdditionAmountandDisposedAmount;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureforadditionanddisposed;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureforadditionandAIAamount;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForWDVamountwithNOClaim;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationAdditionAmountWithNOClaim;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureforadditionWithNOClaim;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForAdditionAndDisposalwithbusinessClosed;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationAdditionAndDisposalwithbusinessClosed;
	
	@FindBy(xpath="//span[normalize-space(text())='Claim Small Pool Allowances']/ancestor::mat-checkbox")
	public WebElement Claimsmallpoolallowancheckbox;
	
	@FindBy(xpath="//span[normalize-space(text())='CT600 Return']")
	public WebElement CT600returnfromComputation;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForClaimsmallPOOlAllowancewithWDV;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationClaimsmallPOOlAllowancewithWDv;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForClaimsmallPOOlAllowancewithAddition;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationClaimsmallPOOlAllowancewithAddition;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement ClaimsmallPOOlAllowancewithadditionandAIAOFAssertSummary;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement ClaimsmallPOOlAllowancewithadditionandAIAComputationOfCt600;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement ClaimsmallPOOlAllowancewithadditionandDisposedAssertSummary;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement ClaimsmallPOOlAllowancewithadditionandDisposedCT600COMPUTATION;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForWDVOfSpecialrate;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForWDVOfSpecialrate;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureForWDVOfSpecialrate;
	
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForAdditionOfSpecialrate;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForAdditionOfSpecialrate;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureForAdditionOfSpecialrate;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForWDvandAdditionOfSpecialrate;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForWDVandAdditionOfSpecialrate;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureForWDvandAdditionOfSpecialrate;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForDesignatedenhnacedallowance;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForDesignatedenhnacedallowance;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureForDesignatedenhancedallowance;
	
	@FindBy(xpath="(//span[normalize-space(text())='Zero Emission Cars'])[2]")
	public WebElement ZeroEmissionCars;
	

	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForZeroemissioncars;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForZeroemissioncars;
	
	@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
	public WebElement Assetacquisitiondateforpreviousyear;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForstructureandbuildings;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForstructureandbuildings;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureForstructureandbuildings;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForadditionsofstructureandbuildings;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForadditionsofstructureandbuildings;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForWDVandadditionsofstructureandbuildings;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForWDVandadditionsofstructureandbuildings;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForRestrictionsandadditionsofstructureandbuildings;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForRestrictionsandadditionsofstructureandbuildings;
	
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForRestrictionsandWDVofstructureandbuildings;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForRestrictionsandWDVofstructureandbuildings;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForOtherchargesandalloawnces;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationForotherChargesandallowances;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureforotherchargesandallowances;
	
	@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
	public WebElement CapitalallowancesandBalancingchargesinMainform;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryadditionalanddisposalwithbusinessclosedforelectricchargevehiclepoints;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationadditionalanddisposalwithbusinessclosedforelectricchargevehiclepoints;

	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryfornoclaimelectricchargevehiclepoints;
	
	@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
	public WebElement CT600computationfornoclaimelectricchargevehiclepoints; 
	
	
	@FindBy(xpath="//label[normalize-space()='No Claim']/parent::div//input[@type='checkbox']")
	public WebElement NoClaimcheckbox1;
	
	@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
	public WebElement CapitalallowancesandBalancingchargesinMainformfornoclaim;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryforenterpriseZone;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryforZeroemissionsgoodsvehicle;
	
	@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
	public WebElement CapitalallowancesandBalancingchargesinMainformforZeroemissionsgoodsvehicle;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryforZeroemissionsCars;
	
	@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
	public WebElement CapitalallowancesandBalancingchargesinMainformforZeroemissionsgoodsCars;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryforDesignatedenhnacedallowance;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryforShortlifeasset;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforshortlifeassetofwdvamount;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforshortlifeassetofwdvamount;

	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforshortlifeassetofadditionamount;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforshortlifeassetofadditionamount;

	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforrestrictionandadditionamount;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforrestrictionandadditionamount;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforrestrictionandadditionamountforspecialratepool;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforrestrictionandadditionamountforspecialratepool;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureforspecialratepool;
	
	@FindBy(xpath="//mat-checkbox[.//span[normalize-space(text())='Super deduction at 130%']]")
	public WebElement superdeductionatONETHIRTYpercent;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforSuperdeduction;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforSuperdeduction;
	
	@FindBy(xpath="//a[contains(text(),'CT-25')]")
	public WebElement CT600return2;
	
	@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
	public WebElement Assetacquisitiondateforsuperdeduction;
	
	@FindBy(xpath="//a[contains(text(),'CT-13')]")
	public WebElement CT600return3;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforwdvandrestrictionamount;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforwdvandrestrictionamount;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforadditionandnoclaim;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforadditionandnoclaim;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformforsuperdeduction;
	
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryforadditionforassetisacar;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforadditionforassetisacar;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformforassetisacar;
	
	@FindBy(xpath="//input[@id=//label[normalize-space(.)='75g/Km or less']/@for]")
	public WebElement AssetIsaCarBetween75gkmorless;
	
	@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
	public WebElement Assetacquisitiondateforfullexpensing;
	
	@FindBy(xpath="//input[@id=//label[normalize-space(.)='Full Expensing (FYA 100%)']/@for]")
	public WebElement fullexpensing;
	
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement Assetsummaryforfullexpensing;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforfullexpensing;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformforfullexpensing;

	@FindBy(xpath="//button[.//mat-icon[normalize-space(text())='more_vert']]")
	public WebElement kebabiconforcapitalallowance;
	
	@FindBy(xpath="//button[.//span[normalize-space(text())='Asset wise details']]")
	public WebElement AssetwiseDetails;
	
	@FindBy(xpath="//button[.//span[normalize-space(text())='Pool wise details']]")
	public WebElement poolwisedetails;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	public WebElement Savebuttonforcapitalallowance;
	
	@FindBy(xpath="//span[normalize-space()='Cancel Changes']")
	public WebElement CancelChangesforcapitallowance;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement Assetsummaryforstructureandbuildings;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforstructureandbuildings;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformforstructureandbuildings;
	
	
}
	


	
	
	

