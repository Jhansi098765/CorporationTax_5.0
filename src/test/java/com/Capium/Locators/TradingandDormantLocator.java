package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradingandDormantLocator {

	@FindBy(xpath="//span[contains(text(),'Tax Return')]")
	public WebElement Tax_ReturnoftradingandDormantperiod;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='add']")
	public WebElement AddCt600oftradingandDormantperiod ;
	
	@FindBy(xpath="//label[text()='Manual ']/parent::div")
	public WebElement ManualCheckboxoftradingandDormantperiod ;
	
	@FindBy(xpath="//label[text()=' Split CT600 between Dormant & Trading period ']/parent::div")
	public WebElement SplitCT600betweenDormantandTradingperiodCheckbox ;
	
	@FindBy(xpath="//input[@formcontrolname='dendDate']/ancestor::mat-form-field//button[@aria-label='Open calendar']")
	public WebElement DormantEndDate ;
	
	@FindBy(xpath="//button[.//span[normalize-space(text())='Save and Exit']]")
	public WebElement SaveAndExitOfDormantPeriod ;
	
	@FindBy(xpath="//a[contains(text(),' CT-26')]")
	public WebElement Ct60026ReturnoftradingandDormantperiod;
	
	@FindBy(xpath="//input[@placeholder='Search here...']")
	public WebElement SearchTextfieldoftradingandDormantperiod;
	
	
	
	@FindBy(xpath=" //a[contains(text(),' vijith')]")
	public WebElement clientoftradingandDormantperiod;
	
	@FindBy(xpath="//a[contains(text(),' CT-10')]")
	public WebElement CT600_ReturnoftradingandDormantperiod ;

	
	@FindBy(xpath="//p[normalize-space()='Capital Allowances']//parent::div//button")
	public WebElement CapitalAllowancesCalculatoroftradingandDormantperiod;
	
	@FindBy(xpath="//mat-icon[text()='add']/parent::button[.//span[normalize-space(text())='Add new Asset']]")
	public WebElement AddNewAssetoftradingandDormantperiod;
	
	@FindBy(xpath="//input[@formcontrolname='assetDescription' and @id='mat-input-136' and contains(@class, 'mat-mdc-input-element')]")
	public WebElement AddDescriptionoftradingandDormantperiod;
	
	@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
	public WebElement AssetCategoryoftradingandDormantperiod;
	
	@FindBy(xpath="//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Machinery and Plant (Main Pool)']")
	public WebElement MainpoolAssetoftradingandDormantperiod ;
	
	@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
	public WebElement AssetacquisitiondateoftradingandDormantperiod;
	
	@FindBy(xpath="//input[@formcontrolname='wDVBroughtFwd']")
	public WebElement WDVBroughtFwdoftradingandDormantperiod;
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	public WebElement SaveAndExitoftradingandDormantperiod;
	
	@FindBy(xpath="//button[@aria-label='Choose month and year' and .//span[normalize-space(text())='2021']]")
	public WebElement YeardropdownoftradingandDormantperiod;

	@FindBy(xpath="//button[normalize-space()='Save and Exit']")
	public WebElement SaveAndExitButtonOfCapitalallowanceoftradingandDormantperiod;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryoftradingandDormantperiod;
	
	@FindBy(xpath="//tr[th[text()='Total AIA claimed']]")
	public WebElement TotalAIAClaimedoftradingandDormantperiod;

	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationoftradingandDormantperiod;

	@FindBy(xpath="//span[@class='tagixbrl' and @title='ct-comp:TotalCapitalAllowances (FYear)']")
	public WebElement CapitalallowanceAmountInComputationoftradingandDormantperiod;
	
	@FindBy(xpath="//td[normalize-space(text())='Transfer from SLA to Main Pool']")
	public WebElement TransferfromSLAtoMainPooloftradingandDormantperiod;
	
	@FindBy(xpath="//div[contains(@class, 'mdc-tab') and @role='tab' and .//span[normalize-space(text())='Main Forms']]")
	public WebElement MainformForCapitalallowanceoftradingandDormantperiod;
	
	@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
	public WebElement CapitalallowancesAndBalancingChargeInMainFormoftradingandDormantperiod;
	
	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement EnhancedEXpenditureInMainformoftradingandDormantperiod;
	
	@FindBy(xpath="//p[normalize-space(text())='Other allowances and charges']")
	public WebElement OtherallowancesandchargesInMainformoftradingandDormantperiod;
	
	@FindBy(xpath="//div[@role='tab' and .//span[text()='Quick Entry']]")
	public WebElement QuickEntryInMainformoftradingandDormantperiod;
	
	@FindBy(xpath="//mat-icon[text()='delete_outline']")
	public WebElement DeleteAssetoftradingandDormantperiod;
	
	@FindBy(xpath="//input[@formcontrolname='additions']")
	public WebElement AdditionsoftradingandDormantperiod;
	
	@FindBy(xpath="//input[@formcontrolname='aIAClaimed']")
	public WebElement AIAamountoftradingandDormantperiod;
	
	@FindBy(xpath="//input[@formcontrolname='restrictionAmount']")
	public WebElement RestrictionAmountoftradingandDormantperiod;
	
	@FindBy(xpath="//button[normalize-space()='Save and Exit']")
	public WebElement SaveAndExitButtonOfCapitalallowance1oftradingandDormantperiod;
	
	@FindBy(xpath="//span[contains(text(),'Tax Return')]")
	public WebElement TaxReturnoftradingandDormantperiod;
	
	@FindBy(xpath="//span[normalize-space(text())='Machinery and Plant (Special Rate Pool)']/parent::div")
	public WebElement SpecialRatepooloftradinganddormantperiod;
	
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
	public WebElement AssertSummaryforadditionsoftradinganddormantperiod;
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationforadditionoftradinganddormantperiod;
	
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
	
	@FindBy(xpath="//mat-checkbox[.//span[normalize-space()='First Year Allowance at 100%']]//input[@type='checkbox']")
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
	
	@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
	public WebElement CT600computationoftradingandDormantperiodforadditionandaia;

	@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
	public WebElement enhancedexpenditureFortradinganddormantforadditionsandaia;
	
	@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
	public WebElement AssertSummaryForadditionandaiafortradinganddormantperiod;
	
	@FindBy(xpath="//button[@aria-label='1 March 2023']")
	public WebElement Datefortradinganddormant;
	

	@FindBy(xpath="//mat-checkbox[.//span[contains(text(), 'First Year Allowance at 100%')]]//input")
	public WebElement FirstYearAllowanceatHundredPercentCheckboxfortrading;
	
	@FindBy(xpath="//input[@formcontrolname='additions']")
	public WebElement Additionsfortrading;
	
	

	
	
	
	
	
	

@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
public WebElement CapitalallowancesandBalancingchargesinMainformfortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryadditionalanddisposalwithbusinessclosedforelectricchargevehiclepointsfortrading;

@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
public WebElement CT600computationadditionalanddisposalwithbusinessclosedforelectricchargevehiclepointsfortrading;


@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryfornoclaimelectricchargevehiclepointsfortrading;

@FindBy(xpath="//a[starts-with(normalize-space(), 'CT600 Computation')]/ancestor::li")
public WebElement CT600computationfornoclaimelectricchargevehiclepointsfortrading;


@FindBy(xpath="//label[normalize-space()='No Claim']/parent::div//input[@type='checkbox']")
public WebElement NoClaimcheckbox1fortrading;

@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
public WebElement CapitalallowancesandBalancingchargesinMainformfornoclaimfortrading;

@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
public WebElement AssetCategoryforenterpriseZonefortrading;

@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
public WebElement AssetCategoryforZeroemissionsgoodsvehiclefortrading;

@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
public WebElement CapitalallowancesandBalancingchargesinMainformforZeroemissionsgoodsvehiclefortrading;

@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
public WebElement AssetCategoryforZeroemissionsCarsfortrading;

@FindBy(xpath="//a[.//p[text()='Page 9'] and contains(normalize-space(.), 'Capital allowances and Balancing charges')]")
public WebElement CapitalallowancesandBalancingchargesinMainformforZeroemissionsgoodsCarsfortrading;

@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
public WebElement AssetCategoryforDesignatedenhnacedallowancefortrading;

@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
public WebElement AssetCategoryforShortlifeassetfortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforshortlifeassetofwdvamountfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforshortlifeassetofwdvamountfortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforshortlifeassetofadditionamountfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforshortlifeassetofadditionamountfortrading;


@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforrestrictionandadditionamountfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforrestrictionandadditionamountfortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforrestrictionandadditionamountforspecialratepoolfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforrestrictionandadditionamountforspecialratepoolfortrading;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureforspecialratepoolfortrading;

@FindBy(xpath="//mat-checkbox[.//span[normalize-space(text())='Super deduction at 130%']]")
public WebElement superdeductionatONETHIRTYpercentfortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforSuperdeductionfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforSuperdeductionfortrading;

@FindBy(xpath="//a[contains(text(),'CT-25')]")
public WebElement CT600return2fortrading;

@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
public WebElement Assetacquisitiondateforsuperdeductionfortrading;

@FindBy(xpath="//a[contains(text(),'CT-13')]")
public WebElement CT600return3fortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforwdvandrestrictionamountfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforwdvandrestrictionamountfortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforadditionandnoclaimfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforadditionandnoclaimfortrading;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureInMainformforsuperdeductionfortrading;


@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforadditionforassetisacarfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforadditionforassetisacarfortrading;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureInMainformforassetisacarfortrading;

@FindBy(xpath="//input[@id=//label[normalize-space(.)='75g/Km or less']/@for]")
public WebElement AssetIsaCarBetween75gkmorlessfortrading;

@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
public WebElement Assetacquisitiondateforfullexpensingfortrading;

@FindBy(xpath="//input[@id=//label[normalize-space(.)='Full Expensing (FYA 100%)']/@for]")
public WebElement fullexpensingfortrading;


@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement Assetsummaryforfullexpensingfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforfullexpensingfortrading;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureInMainformforfullexpensingfortrading;

@FindBy(xpath="//button[.//mat-icon[normalize-space(text())='more_vert']]")
public WebElement kebabiconforcapitalallowancefortrading;

@FindBy(xpath="//button[.//span[normalize-space(text())='Asset wise details']]")
public WebElement AssetwiseDetailsfortrading;

@FindBy(xpath="//button[.//span[normalize-space(text())='Pool wise details']]")
public WebElement poolwisedetailsfortrading;

@FindBy(xpath="//span[normalize-space()='Save']")
public WebElement Savebuttonforcapitalallowancefortrading;

@FindBy(xpath="//span[normalize-space()='Cancel Changes']")
public WebElement CancelChangesforcapitallowancefortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement Assetsummaryforstructureandbuildingsfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationforstructureandbuildingsfortrading;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureInMainformforstructureandbuildingsfortrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement AssertSummaryforElectricVehicleChargePointsfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationofelectricvehiclechchargepointsfortradinganddormant;

@FindBy(xpath="//td[normalize-space(text())='Transfer from SLA to Main Pool']")
public WebElement TransferfromSLAtoMainPoolfortrading;

@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
public WebElement CapitalallowancesAndBalancingChargeInMainFormfortrading;

@FindBy(xpath="//input[@formcontrolname='assetDisposedDate']")
public WebElement AssetDisposedDatefortrading;


@FindBy(xpath="//input[@formcontrolname='disposalProceeds']")
public WebElement DisposalAmountfortrading;

@FindBy(xpath="//input[@id=//label[normalize-space(span)='Business Closed']/@for]")
public WebElement BusinessclosedCheckboxfortrading;

@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
public WebElement CapitalallowancesAndBalancingChargeInMainForm2fortrading;

@FindBy(xpath="//label[normalize-space()='No Claim']/parent::div//input[@type='checkbox']")
public WebElement NoClaimcheckboxfortrading;

@FindBy(xpath="//ng-select[@formcontrolname='assetCategory']//input[@aria-autocomplete='list']")
public WebElement AssetCategoryforenterpriseZonefortradinganddormant;

@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
public WebElement CapitalallowancesAndBalancingChargeInMainForm2fortradingforenterpisezone;

@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
public WebElement AssetacquisitiondateoftradingandDormantperiodforelectricchargeandvehicles;

@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
public WebElement AssetacquisitiondateoftradingandDormantperiodforshortlifeasset;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureforshortlifeassetoftrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement Assetsummaryforshortlifeassetforadditions;

@FindBy(xpath="//td[normalize-space(text())='Transfer from SLA to Main Pool']")
public WebElement TransferfromSLAtoMainPoolfortrading1;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationofclaimsmallpoolallowancefortrading;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureforClaimsmallpoolallowanceoftrading;

@FindBy(xpath="//button[.//span[text()='Asset Summary']]")
public WebElement Assetsummaryforbusinessclosedcheckboxfortrading;

@FindBy(xpath="//a[normalize-space(text())='CT600 Computation']/ancestor::li")
public WebElement CT600computationofbusinessclosedcheckboxfortrading;

@FindBy(xpath="//li[a[p[normalize-space()='Page 8'] and contains(normalize-space(), 'Enhanced Expenditure')]]")
public WebElement EnhancedEXpenditureforbusinessclosedcheckboxfortrading;

@FindBy(xpath="(//span[normalize-space(text())='Other Charges and Allowances']/parent::div)[1]")
public WebElement OtherChargesAndAlloawncesfortrading;


@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
public WebElement AssetacquisitiondateoftradingandDormantperiodforotherhchargesandallowances;

@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
public WebElement CapitalallowancesAndBalancingChargeforotherchargesandallowancesformainform3;

@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
public WebElement CapitalallowancesAndBalancingChargeforotherchargesandallowancesformainform2;

@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
public WebElement AssetacquisitiondateoftradingandDormantperiodforelectricvehiclechargepoints;

@FindBy(xpath="(//mat-form-field[@appearance='fill'])[1]")
public WebElement AssetacquisitiondateoftradingandDormantperiodforenterprizezone;

@FindBy(xpath="//a[normalize-space(.)='Page 9 Capital allowances and Balancing charges']")
public WebElement CapitalallowancesAndBalancingChargeinmainformfortradinganddormant;

}



