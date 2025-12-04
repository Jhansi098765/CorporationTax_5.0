package com.Capium.StepDefination;

import com.Capium.Actions.CapitalAllowancesActions;
import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.Given;

public class Capital_AllowancesStepDefination {
	CapitalAllowancesActions capitalallowances= new CapitalAllowancesActions();

	@Given("Click on Tax Return and Verify Tax Return")
	public void click_on_tax_return_and_verify_tax_return() throws InterruptedException {
		capitalallowances.Tax_Return();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
		   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
		   Log.info("Click on Tax Return and Verify Tax Return");
		
		}
	
	@Given("Search a client and verify")
	public void search_a_client_and_verify() throws InterruptedException {
		capitalallowances.SearchTextfield("vijith");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Search a client and verify");
		   StepTracker.setCurrentStep("Search a client and verify");
		   Log.info("Search a client and verify");
		
	}

	@Given("Select particular client")
	public void select_particular_client() {
		capitalallowances.Client("vijith");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select particular client");
		   StepTracker.setCurrentStep("Select particular client");
		   Log.info("Select particular client");
		
	}

	@Given("Select CT600 Return")
	public void select_ct600_return() {
		capitalallowances.CT600_Return();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select CT600 Return");
		   StepTracker.setCurrentStep("Select CT600 Return");
		   Log.info("Select CT600 Return");
		
	}

	@Given("Click on Capital Allowances calculator screen")
	public void click_on_capital_allowances_calculator_screen() throws InterruptedException {
		capitalallowances.Capital_AllowancesCalculator();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital Allowances calculator screen");
		   StepTracker.setCurrentStep("Click on Capital Allowances calculator screen");
		   Log.info("Click on Capital Allowances calculator screen");
		
	}
	@Given("Click on Add new asset")
	public void click_on_add_new_asset() throws InterruptedException {
		capitalallowances.AddnewAsset();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Add new asset");
		   StepTracker.setCurrentStep("Click on Add new asset");
		   Log.info("Click on Add new asset");
		
	}

	@Given("Enter Assert Description")
	public void enter_assert_description() throws InterruptedException {
		capitalallowances.Enter_description();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter Assert Description");
		   StepTracker.setCurrentStep("Enter Assert Description");
		   Log.info("Enter Assert Description");
		
	}

	@Given("Select asset category")
	public void select_asset_category() throws InterruptedException {
		capitalallowances.SelectAssetCategory();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category");
		   StepTracker.setCurrentStep("Select asset category");
		   Log.info("Select asset category");
		
	}

	@Given("Select Main pool Asset")
	public void select_main_pool_asset() {
		capitalallowances.SelectMainpool();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Main pool Asset");
		   StepTracker.setCurrentStep("Select Main pool Asset");
		   Log.info("Select Main pool Asset");
		
	}

	@Given("Select Asset acquisition date")
	public void select_asset_acquisition_date() throws InterruptedException {
		capitalallowances.Assetacquisitiondate();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date");
		   StepTracker.setCurrentStep("Select Asset acquisition date");
		   Log.info("Select Asset acquisition date");
		
	}

	@Given("Enter WDV b\\/fwd amount")
	public void enter_wdv_b_fwd_amount() throws InterruptedException {
		capitalallowances.WDVbroughtFwd();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter WDV b\\/fwd amount");
		   StepTracker.setCurrentStep("Enter WDV b\\/fwd amount");
		   Log.info("Enter WDV b\\/fwd amount");
		
	}

	@Given("Click on Assert Summary")
	public void click_on_assert_summary() throws InterruptedException {
	   capitalallowances.AssertSummary();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary");
	   StepTracker.setCurrentStep("Click on Assert Summary");
	   Log.info("Click on Assert Summary");
	
	}
	@Given("Click and Verify CT600 Computation")
	public void click_and_verify_ct600_computation() throws InterruptedException {
	   capitalallowances.CT600Computation();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation");
	   Log.info("Click and Verify CT600 Computation");
	
	}
	@Given("Click on MainFormForCapitalAllowance")
	public void click_on_main_form_for_capital_allowance() {
	  capitalallowances.MainFormForCapitalAllowance();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on MainFormForCapitalAllowance");
	   StepTracker.setCurrentStep("Click on MainFormForCapitalAllowance");
	   Log.info("Click on MainFormForCapitalAllowance");
	
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value() throws InterruptedException {
	   capitalallowances.EnhancedExpenditureInmainForm();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value");
	
	}
	@Given("Click on QuickEntry")
	public void click_on_quick_entry() throws InterruptedException {
		capitalallowances.QuicKEntryInMainForm();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on QuickEntry");
		   StepTracker.setCurrentStep("Click on QuickEntry");
		   Log.info("Click on QuickEntry");
		
	}
	@Given("Delete Assert")
	public void delete_assert() throws InterruptedException {
		capitalallowances.mousehoverdelete();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on QuickEntry");
		   StepTracker.setCurrentStep("Click on QuickEntry");
		   Log.info("Click on QuickEntry");
		
	}
//	@Given("Enter Addition amount")
//	public void enter_addition_amount() throws InterruptedException {
//		capitalallowances.Additions();
//	}

//	@Given("Enter AIA amount")
//	public void enter_aia_amount() {
//		capitalallowances.AIAClaimed();
//	}
	@Given("Enter AssertDescriptionOfMainPool")
	public void enter_assert_description_of_main_pool() {
		capitalallowances.EnterDescriptionOFMainPool();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter AssertDescriptionOfMainPool");
		   StepTracker.setCurrentStep("Enter AssertDescriptionOfMainPool");
		   Log.info("Enter AssertDescriptionOfMainPool");
		
	}
//	@Given("Enter Addition Amount of Main pool")
//	public void enter_addition_amount_of_main_pool() {
//		capitalallowances.Additions();
//	}

//	@Given("Enter Restriction Amount of main pool")
//	public void enter_restriction_amount_of_main_pool() {
//		capitalallowances.RestrictionAmountOfMainpool();
//	}

//	@Given("Select Special Rate pool")
//	public void select_special_rate_pool() {
//		capitalallowances.SelectSpecialRatepool();
//		
	//}
	
	@Given("SelectAsset Category for SpecialRatePool")
	public void select_asset_category_for_special_rate_pool() throws InterruptedException {
	   capitalallowances.SelectAssetCategorySpecialRatePool();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "SelectAsset Category for SpecialRatePool");
	   StepTracker.setCurrentStep("SelectAsset Category for SpecialRatePool");
	   Log.info("SelectAsset Category for SpecialRatePool");
	
	}
	@Given("Enter  Additions")
	public void enter_additions() throws InterruptedException {
		capitalallowances.Additions();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter  Additions");
		   StepTracker.setCurrentStep("Enter  Additions");
		   Log.info("Enter  Additions");
		
	}
	@Given("Enter AIA Amount")
	public void enter_aia_amount() throws InterruptedException {
		capitalallowances.AIAamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter AIA Amount");
		   StepTracker.setCurrentStep("Enter AIA Amount");
		   Log.info("Enter AIA Amount");
		
	}
	@Given("Enter  Restriction amount")
	public void enter_restriction_amount() {
	   capitalallowances.RestrictionAmount();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter  Restriction amount");
	   StepTracker.setCurrentStep("Enter  Restriction amount");
	   Log.info("Enter  Restriction amount");
	
	}
	@Given("Select Asset Disposed Date")
	public void select_asset_disposed_date() {
	 capitalallowances.AssetDisposedDate();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset Disposed Date");
	   StepTracker.setCurrentStep("Select Asset Disposed Date");
	   Log.info("Select Asset Disposed Date");
	
	}

	@Given("Enter disposal date")
	public void enter_disposal_date() {
	  capitalallowances.DisposalAmount();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter disposal date");
	   StepTracker.setCurrentStep("Enter disposal date");
	   Log.info("Enter disposal date");
	
	}
//
//	@Given("SelectAsset Category for StructuresAndBuildings Allowances")
//	public void select_asset_category_for_structures_and_buildings_allowances() {
//	    capitalallowances.structuresAndBuildingsAllowances();
//	}
//	@Given("Choose Asset Category")
//	public void choose_asset_category() {
	
	
	@Given("Click on Assert Summary1")
	public void click_on_assert_summary1() {
		 capitalallowances.AssertSummary1();
		 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary1");
		   StepTracker.setCurrentStep("Click on Assert Summary1");
		   Log.info("Click on Assert Summary1");
		
	}

	@Given("Click and Verify CT600 Computation1")
	public void click_and_verify_ct600_computation1() throws InterruptedException {
	   capitalallowances.CT600Computation1();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation1");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation1");
	   Log.info("Click and Verify CT600 Computation1");
	
	}

	@Given("Click on Assert Summary2")
	public void click_on_assert_summary2() {
		capitalallowances.AssertSummary2();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary2");
		   StepTracker.setCurrentStep("Click on Assert Summary2");
		   Log.info("Click on Assert Summary2");
		
	}

	@Given("Click and Verify CT600 Computation2")
	public void click_and_verify_ct600_computation2() throws InterruptedException {
		capitalallowances.CT600Computation2();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation2");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation2");
		   Log.info("Click and Verify CT600 Computation2");
		
	}
	@Given("Select asset is a car category")
	public void select_asset_is_a_car_category() throws InterruptedException {
	    capitalallowances.AssetIsaCarBetween75to130gKm();
	    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset is a car category");
		   StepTracker.setCurrentStep("Select asset is a car category");
		   Log.info("Select asset is a car category");
		
	}
	
	@Given("Select Asset category1")
	public void select_asset_category1() {
	    capitalallowances.AssertSummary1();
	    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset category1");
		   StepTracker.setCurrentStep("Select Asset category1");
		   Log.info("Select Asset category1");
		
	}
	@Given("Select Othercharges and allowances")
	public void select_othercharges_and_allowances() {
	  capitalallowances.OtherChargesAndAllowances();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Othercharges and allowances");
	   StepTracker.setCurrentStep("Select Othercharges and allowances");
	   Log.info("Select Othercharges and allowances");
	
	}
	@Given("Select Designated Enhanced allowance")
	public void select_designated_enhanced_allowance() throws InterruptedException {
	 capitalallowances.DesignatedEnhancedAllowance();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Designated Enhanced allowance");
	   StepTracker.setCurrentStep("Select Designated Enhanced allowance");
	   Log.info("Select Designated Enhanced allowance");
	
	}
	@Given("Select First Year Allowance at Hundred Percent Checkbox")
	public void select_first_year_allowance_at_hundred_percent_checkbox() throws InterruptedException {
	   capitalallowances.firstYearAllowanceAtHundredPercent();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select First Year Allowance at Hundred Percent Checkbox");
	   StepTracker.setCurrentStep("Select First Year Allowance at Hundred Percent Checkbox");
	   Log.info("Select First Year Allowance at Hundred Percent Checkbox");
	
	}
	@Given("Click on No Claim checkbox")
	public void click_on_no_claim_checkbox() throws InterruptedException {
	   capitalallowances.NoClaimCheckbox();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on No Claim checkbox");
	   StepTracker.setCurrentStep("Click on No Claim checkbox");
	   Log.info("Click on No Claim checkbox");
	
	}
	@Given("Enter larger disposed amount")
	public void enter_larger_disposed_amount() {
		capitalallowances.LargerDisposalAmount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter larger disposed amount");
		   StepTracker.setCurrentStep("Enter larger disposed amount");
		   Log.info("Enter larger disposed amount");
		

	}
	@Given("Click on Assert Summary for wdv b\\/fwd and addition amount")
	public void click_on_assert_summary_for_wdv_b_fwd_and_addition_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandadditionamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for wdv b/fwd and addition amount");
		   StepTracker.setCurrentStep("Click on Assert Summary for wdv b/fwd and addition amount");
		   Log.info("Click on Assert Summary for wdv b/fwd and addition amount");
		
	}

	@Given("Click and Verify CT600 Computation for wdv fwd and addition amount")
	public void click_and_verify_ct600_computation_for_wdv_fwd_and_addition_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandadditionamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for wdv fwd and addition amount");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for wdv fwd and addition amount");
		   Log.info("Click and Verify CT600 Computation for wdv fwd and addition amount");
		
	}

	@Given("Click on Assert Summary for wdv b\\/fwd amount adn disposed amount")
	public void click_on_assert_summary_for_wdv_b_fwd_amount_adn_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandDisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for wdv b/fwd amount adn disposed amount");
		   StepTracker.setCurrentStep("Click on Assert Summary for wdv b/fwd amount adn disposed amount");
		   Log.info("Click on Assert Summary for wdv b/fwd amount adn disposed amount");
		
	}

	@Given("Click and Verify CT600 Computation for wdv b\\/fwd amount adn disposed amount")
	public void click_and_verify_ct600_computation_for_wdv_b_fwd_amount_adn_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforWDVanddisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for wdv b/fwd amount adn disposed amount");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for wdv b/fwd amount adn disposed amount");
		   Log.info("Click and Verify CT600 Computation for wdv b/fwd amount adn disposed amount");
		
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv b\\/fwd amount adn disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_wdv_b_fwd_amount_adn_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforWDVanddisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv b/fwd amount adn disposed amount");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv b/fwd amount adn disposed amount");
		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv b/fwd amount adn disposed amount");
		
	}

	@Given("Click on Assert Summary wdv b\\/fwd and larger disposed amount")
	public void click_on_assert_summary_wdv_b_fwd_and_larger_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandlargerDisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary wdv b/fwd and larger disposed amount");
		   StepTracker.setCurrentStep("Click on Assert Summary wdv b/fwd and larger disposed amount");
		   Log.info("Click on Assert Summary wdv b/fwd and larger disposed amount");
		
	}

	@Given("Click and Verify CT600 Computation wdv b\\/fwd and larger disposed amount")
	public void click_and_verify_ct600_computation_wdv_b_fwd_and_larger_disposed_amount() throws InterruptedException {
	  capitalallowances.CT600ComputationforWDVandLargerdisposedamount();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation wdv b/fwd and larger disposed amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation wdv b/fwd and larger disposed amount");
	   Log.info("Click and Verify CT600 Computation wdv b/fwd and larger disposed amount");
	
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv b\\/fwd and larger disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_wdv_b_fwd_and_larger_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforWDVandLargerdisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv b/fwd and larger disposed amount");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv b/fwd and larger disposed amount");
		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv b/fwd and larger disposed amount");
		
	}

	@Given("Click on Assert Summary with addition with larger disposed amount")
	public void click_on_assert_summary_with_addition_with_larger_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandlargerDisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary with addition with larger disposed amount");
		   StepTracker.setCurrentStep("Click on Assert Summary with addition with larger disposed amount");
		   Log.info("Click on Assert Summary with addition with larger disposed amount");
		
	}

	@Given("Click and Verify CT600 Computation addition with larger disposed amount")
	public void click_and_verify_ct600_computation_addition_with_larger_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandlargerDisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation addition with larger disposed amount");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation addition with larger disposed amount");
		   Log.info("Click and Verify CT600 Computation addition with larger disposed amount");
		
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition with larger disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_with_larger_disposed_amount() throws InterruptedException {
		capitalallowances.EnhancedExpenditureInmainFormforAdditionandLargerdisposedamont();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition with larger disposed amount");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition with larger disposed amount");
		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition with larger disposed amount");
		
	}

	@Given("Click on Assert Summary addition and disposed amount")
	public void click_on_assert_summary_addition_and_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandDisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary addition and disposed amount");
		   StepTracker.setCurrentStep("Click on Assert Summary addition and disposed amount");
		   Log.info("Click on Assert Summary addition and disposed amount");
		
	}

	@Given("Click and Verify CT600 Computation addition and disposed amount")
	public void click_and_verify_ct600_computation_addition_and_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforAdditionanddisposedamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation addition and disposed amount");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation addition and disposed amount");
		   Log.info("Click and Verify CT600 Computation addition and disposed amount");
		
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_and_disposed_amount() throws InterruptedException {
		capitalallowances.EnhancedExpenditureInmainFormforAdditionanddisposedamont();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and disposed amount");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and disposed amount");
		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and disposed amount");
		
	}

	@Given("Click on Assert Summary addition and aia amount")
	public void click_on_assert_summary_addition_and_aia_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandAIAamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary addition and aia amount");
		   StepTracker.setCurrentStep("Click on Assert Summary addition and aia amount");
		   Log.info("Click on Assert Summary addition and aia amount");
		
	}

	@Given("Click and Verify CT600 Computation addition and aia amount")
	public void click_and_verify_ct600_computation_addition_and_aia_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforAdditionandAIAamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation addition and aia amount");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation addition and aia amount");
		   Log.info("Click and Verify CT600 Computation addition and aia amount");
		
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and aia amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_and_aia_amount() throws InterruptedException {
		capitalallowances.EnhancedExpenditureInmainFormforAdditionandAIAamount();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and aia amount");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and aia amount");
		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and aia amount");
		
	}

@Given("Click on BusinessclosedCheckbox")
public void click_on_businessclosed_checkbox() {
	capitalallowances.BusinessClosedCheckbox();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on BusinessclosedCheckbox");
	   StepTracker.setCurrentStep("Click on BusinessclosedCheckbox");
	   Log.info("Click on BusinessclosedCheckbox");
	
}

@Given("Click on MainPoolOfSaveAndExitButton")
public void click_on_main_pool_of_save_and_exit_button() {
    capitalallowances.MainpoolOFSaveAndExitButton();
    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on MainPoolOfSaveAndExitButton");
	   StepTracker.setCurrentStep("Click on MainPoolOfSaveAndExitButton");
	   Log.info("Click on MainPoolOfSaveAndExitButton");
	
}
@Given("Click on Assert Summary for wdv b\\/fwd amount and disposed amount")
public void click_on_assert_summary_for_wdv_b_fwd_amount_and_disposed_amount() throws InterruptedException {
   capitalallowances.AssertSummaryforwdvandDisposedamount();
   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for wdv b/fwd amount and disposed amount");
   StepTracker.setCurrentStep("Click on Assert Summary for wdv b/fwd amount and disposed amount");
   Log.info("Click on Assert Summary for wdv b/fwd amount and disposed amount");

}
@Given("Click and Verify CT600 Computation for wdv b\\/fwd amount and disposed amount")
public void click_and_verify_ct600_computation_for_wdv_b_fwd_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.CT600ComputationforWDVanddisposedamount();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for wdv b/fwd amount and disposed amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for wdv b/fwd amount and disposed amount");
	   Log.info("Click and Verify CT600 Computation for wdv b/fwd amount and disposed amount");
	
}
@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_wdv_bfwd_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforwdvanddisposedamont();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount");
	
}
@Given("Click on Assert Summary wdv bfwd and larger Disposed amount")
public void click_on_assert_summary_wdv_bfwd_and_larger_disposed_amount() throws InterruptedException {
   capitalallowances.AssertSummaryforwdvandlargerDisposedamount();
   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary wdv bfwd and larger Disposed amount");
   StepTracker.setCurrentStep("Click on Assert Summary wdv bfwd and larger Disposed amount");
   Log.info("Click on Assert Summary wdv bfwd and larger Disposed amount");

}

@Given("Click and Verify CT600 Computation wdv bfwd and larger Disposed amount")
public void click_and_verify_ct600_computation_wdv_bfwd_and_larger_disposed_amount() throws InterruptedException {
   capitalallowances.CT600ComputationforWDVandLargerdisposedamount();
   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation wdv bfwd and larger Disposed amount");
   StepTracker.setCurrentStep("Click and Verify CT600 Computation wdv bfwd and larger Disposed amount");
   Log.info("Click and Verify CT600 Computation wdv bfwd and larger Disposed amount");

}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_wdv_bfwd_and_larger_disposed_amount() throws InterruptedException {
  capitalallowances.EnhancedExpenditureInmainFormforwdvandLargerdisposedamont();
  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount");
  StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount");
  Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount");

  
}

@Given("Click on Assert Summary with AdditionAmount with larger Disposed Amount")
public void click_on_assert_summary_with_addition_amount_with_larger_disposed_amount() throws InterruptedException {
	 capitalallowances.AssertSummaryforAdditionandlargerDisposedamount();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary with AdditionAmount with larger Disposed Amount");
	   StepTracker.setCurrentStep("Click on Assert Summary with AdditionAmount with larger Disposed Amount");
	   Log.info("Click on Assert Summary with AdditionAmount with larger Disposed Amount");
	
}

@Given("Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount")
public void click_and_verify_ct600_computation_addition_amount_with_larger_disposed_amount() throws InterruptedException {
	 capitalallowances.CT600ComputationforAdditionandLargerdisposedamount();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount");
	   Log.info("Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount");
	
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_with_larger_disposed_amount() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforAdditionandLargerdisposedamont();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount");
	
}

@Given("Click on Assert Summary additionAmount and DisposedAmount")
public void click_on_assert_summary_addition_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.AssertSummaryforAdditionandDisposedamount();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary additionAmount and DisposedAmount");
	   StepTracker.setCurrentStep("Click on Assert Summary additionAmount and DisposedAmount");
	   Log.info("Click on Assert Summary additionAmount and DisposedAmount");
	
}

@Given("Click and Verify CT600 ComputationAddition and DisposedAmount")
public void click_and_verify_ct600_computation_Addition_and_disposed_amount() throws InterruptedException {
	 capitalallowances.CT600ComputationforAdditionanddisposedamount();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 ComputationAddition and DisposedAmount");
	   StepTracker.setCurrentStep("Click and Verify CT600 ComputationAddition and DisposedAmount");
	   Log.info("Click and Verify CT600 ComputationAddition and DisposedAmount");
	
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforAdditionanddisposedamont();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount");
	
}
@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value2")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value2() throws InterruptedException {
    capitalallowances.EnhancedExpenditureInmainFormforAdditionandAIAamount();
    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value2");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value2");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value2");
	
}

@Given("Click on Assert Summary WDV b\\/fwd amount with no claim")
public void click_on_assert_summary_wdv_b_fwd_amount_with_no_claim() throws InterruptedException {
	capitalallowances.AssertSummaryforwdvWithNoClaim();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary WDV b/fwd amount with no claim");
	   StepTracker.setCurrentStep("Click on Assert Summary WDV b/fwd amount with no claim");
	   Log.info("Click on Assert Summary WDV b/fwd amount with no claim");
	
}

@Given("Click and Verify CT600 Computation WDV b\\/fwd amount with no claim")
public void click_and_verify_ct600_computation_wdv_b_fwd_amount_with_no_claim() throws InterruptedException {
	capitalallowances.CT600ComputationforAdditionandNOClaims();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation WDV b/fwd amount with no claim");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation WDV b/fwd amount with no claim");
	   Log.info("Click and Verify CT600 Computation WDV b/fwd amount with no claim");
	
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value WDV b\\/fwd amount with no claim")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_wdv_b_fwd_amount_with_no_claim() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforAdditionandNOClaim();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value WDV b/fwd amount with no claim");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value WDV b/fwd amount with no claim");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value WDV b/fwd amount with no claim");
	
}
@Given("Click on Assert Summary addition and disposal with business closed")
public void click_on_assert_summary_addition_and_disposal_with_business_closed() {
	capitalallowances.AssertSummaryforadditionanadDisposedwithBusinessclosed();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary addition and disposal with business closed");
	   StepTracker.setCurrentStep("Click on Assert Summary addition and disposal with business closed");
	   Log.info("Click on Assert Summary addition and disposal with business closed");
	
}

@Given("Click and Verify CT600 Computation addition and disposed with business closed")
public void click_and_verify_ct600_computation_addition_and_disposed_with_business_closed() throws InterruptedException {
	capitalallowances.CT600ComputationforAdditionanddiposalsBusinessclosed();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation addition and disposed with business closed");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation addition and disposed with business closed");
	   Log.info("Click and Verify CT600 Computation addition and disposed with business closed");
	
}

@Given("Click on CT600 return from computation")
public void click_on_ct600_return_from_computation() throws InterruptedException {
	capitalallowances.CT600ReturnFromComputation();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on CT600 return from computation");
	   StepTracker.setCurrentStep("Click on CT600 return from computation");
	   Log.info("Click on CT600 return from computation");
	
}

@Given("Click on Claim small pool allowance")
public void click_on_claim_small_pool_allowance() throws InterruptedException {
  capitalallowances.ClaimSmallpoolAllowancheckbox();
  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Claim small pool allowance");
  StepTracker.setCurrentStep("Click on Claim small pool allowance");
  Log.info("Click on Claim small pool allowance");

}

@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with WDv")
public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_w_dv() {
    capitalallowances.AssertSummaryforClaimsmallPOOlAllowancewithWDv();
    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary Of ClaimsmallPOOlAllowance with WDv");
	   StepTracker.setCurrentStep("Click on Assert Summary Of ClaimsmallPOOlAllowance with WDv");
	   Log.info("Click on Assert Summary Of ClaimsmallPOOlAllowance with WDv");
	
}

@Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with WDv")
public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_w_dv() throws InterruptedException {
   capitalallowances.CT600ComputationforClaimsmallPOOlAllowancewithWDv();
   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with WDv");
   StepTracker.setCurrentStep("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with WDv");
   Log.info("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with WDv");

}

@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition")
public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_addition() {
   capitalallowances.AssertSummaryforClaimsmallPOOlAllowancewithAddition();
   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary Of ClaimsmallPOOlAllowance with addition");
   StepTracker.setCurrentStep("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition");
   Log.info("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition");

}

 @Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition")
public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_addition() throws InterruptedException {
    capitalallowances.CT600ComputationforClaimsmallPOOlAllowancewithAddition();
    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition");
	   Log.info("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition");
	
}

@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition and aia")
public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_addition_and_aia() {
    capitalallowances.AssertSummaryforClaimsmallPOOlAllowancewithAdditionandAIA();
    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary Of ClaimsmallPOOlAllowance with addition and aia");
	   StepTracker.setCurrentStep("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition and aia");
	   Log.info("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition and aia");
	
}

@Given("Select structure and buildings Asset")
public void select_structure_and_buildings_asset() throws InterruptedException {
	  capitalallowances.structuresAndBuildingsAsset();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select structure and buildings Asset");
	   StepTracker.setCurrentStep("Select structure and buildings Asset");
	   Log.info("Select structure and buildings Asset");
	
}
@Given("Select Asset acquisition date of previous year")
public void select_asset_acquisition_date_of_previous_year() throws InterruptedException {
	 capitalallowances.Assetacquisitiondateforpreviousyear();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date of previous year");
	   StepTracker.setCurrentStep("Select Asset acquisition date of previous year");
	   Log.info("Select Asset acquisition date of previous year");
	
}

@Given("Click on Assert Summary for structure and buildings")
public void click_on_assert_summary_for_structure_and_buildings() {
	 capitalallowances.AssertSummaryforStructureandBuildings();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for structure and buildings");
	   StepTracker.setCurrentStep("Click on Assert Summary for structure and buildings");
	   Log.info("Click on Assert Summary for structure and buildings");
	
}

@Given("Click and Verify CT600 Computation for structure and buildings")
public void click_and_verify_ct600_computation_for_structure_and_buildings() throws InterruptedException {
	 capitalallowances.CT600ComputationForstructureandbuildings();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for structure and buildings");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for structure and buildings");
	   Log.info("Click and Verify CT600 Computation for structure and buildings");
	
}

@Given("Click on Enhanced Expenditure and Verify structure and buildings value")
public void click_on_enhanced_expenditure_and_verify_structure_and_buildings_value() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforstructureandbuildings();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify structure and buildings value");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify structure and buildings value");
	   Log.info("Click on Enhanced Expenditure and Verify structure and buildings value");
	
}
@Given("Click on Assert Summary for additions of structure and buildings")
public void click_on_assert_summary_for_additions_of_structure_and_buildings() {
	capitalallowances.AssertSummaryforadditionsofStructureandBuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for additions of structure and buildings");
	   StepTracker.setCurrentStep("Click on Assert Summary for additions of structure and buildings");
	   Log.info("Click on Assert Summary for additions of structure and buildings");
	
}
@Given("Click and Verify CT600 Computations for additions of structure and buildings")
public void click_and_verify_ct600_computations_for_additions_of_structure_and_buildings() throws InterruptedException {
	capitalallowances.CT600ComputationForadditionsofstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computations for additions of structure and buildings");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computations for additions of structure and buildings");
	   Log.info("Click and Verify CT600 Computations for additions of structure and buildings");
	
}
@Given("Select asset category for structure and buildings")
public void select_asset_category_for_structure_and_buildings() throws InterruptedException {
	capitalallowances.SelectAssetCategoryforstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category for structure and buildings");
	   StepTracker.setCurrentStep("Select asset category for structure and buildings");
	   Log.info("Select asset category for structure and buildings");
	
}
@Given("Click on Assert Summary for wdv b\\/fwd and addition amount of structure and buildings")
public void click_on_assert_summary_for_wdv_b_fwd_and_addition_amount_of_structure_and_buildings() {
	capitalallowances.AssertSummaryforWDVandadditionofstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for wdv b\\\\/fwd and addition amount of structure and buildings");
	   StepTracker.setCurrentStep("Click on Assert Summary for wdv b\\\\/fwd and addition amount of structure and buildings");
	   Log.info("Click on Assert Summary for wdv b\\\\/fwd and addition amount of structure and buildings");
	
}

@Given("Click and Verify CT600 Computation for wdv fwd and addition amount of structure and buildings")
public void click_and_verify_ct600_computation_for_wdv_fwd_and_addition_amount_of_structure_and_buildings() throws InterruptedException {
	capitalallowances.CT600ComputationforWDVandAdditionofstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for wdv fwd and addition amount of structure and buildings");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for wdv fwd and addition amount of structure and buildings");
	   Log.info("Click and Verify CT600 Computation for wdv fwd and addition amount of structure and buildings");
	
}
@Given("Click on Assert Summary for structure and buildings with addition and restriction amount")
public void click_on_assert_summary_for_structure_and_buildings_with_addition_and_restriction_amount() {
	capitalallowances.AssertSummaryforRestrictionandadditionofstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for structure and buildings with addition and restriction amount");
	   StepTracker.setCurrentStep("Click on Assert Summary for structure and buildings with addition and restriction amount");
	   Log.info("Click on Assert Summary for structure and buildings with addition and restriction amount");
	
}

@Given("Click and Verify CT600 Computation for structure and buildings with addition and restriction amount")
public void click_and_verify_ct600_computation_for_structure_and_buildings_with_addition_and_restriction_amount() throws InterruptedException {
	capitalallowances.CT600ComputationforRestrictionandAdditionofstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for structure and buildings with addition and restriction amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for structure and buildings with addition and restriction amount");
	   Log.info("Click and Verify CT600 Computation for structure and buildings with addition and restriction amount");
	
}
@Given("Click on Assert Summary for structure and buildings with WDV and restriction")
public void click_on_assert_summary_for_structure_and_buildings_with_wdv_and_restriction() {
	capitalallowances.AssertSummaryforRestrictionandWDVofstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for structure and buildings with WDV and restriction");
	   StepTracker.setCurrentStep("Click on Assert Summary for structure and buildings with WDV and restriction");
	   Log.info("Click on Assert Summary for structure and buildings with WDV and restriction");
	
}

@Given("Click and Verify CT600 Computation for structure and buildings with WDV and restriction")
public void click_and_verify_ct600_computation_for_structure_and_buildings_with_wdv_and_restriction() throws InterruptedException {
	capitalallowances.CT600ComputationforRestrictionandWDVofstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for structure and buildings with WDV and restriction");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for structure and buildings with WDV and restriction");
	   Log.info("Click and Verify CT600 Computation for structure and buildings with WDV and restriction");
	

}
@Given("Select asset category as other charges and allowances")
public void select_asset_category_as_other_charges_and_allowances() throws InterruptedException {
	capitalallowances.SelectAssetCategoryOtherchargesandallowances();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as other charges and allowances");
	   StepTracker.setCurrentStep("Select asset category as other charges and allowances");
	   Log.info("Select asset category as other charges and allowances");
	
}

@Given("Click on first year allowance at {int} percent")
public void click_on_first_year_allowance_at_percent(Integer int1) throws InterruptedException {
	capitalallowances.firstYearAllowanceAtHundredPercent();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on first year allowance at {int} percent");
	   StepTracker.setCurrentStep("Click on first year allowance at {int} percent");
	   Log.info("Click on first year allowance at {int} percent");
	
}

@Given("Click on Assert Summary for other charges and allowances")
public void click_on_assert_summary_for_other_charges_and_allowances() {
	capitalallowances.AssertSummaryforOtherchargesandallowances();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for other charges and allowances");
	   StepTracker.setCurrentStep("Click on Assert Summary for other charges and allowances");
	   Log.info("Click on Assert Summary for other charges and allowances");
	
}

@Given("Click and Verify CT600 Computation for other charges and allowances")
public void click_and_verify_ct600_computation_for_other_charges_and_allowances() throws InterruptedException {
	capitalallowances.CT600ComputationforOtherChargesandallowances();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for other charges and allowances");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for other charges and allowances");
	   Log.info("Click and Verify CT600 Computation for other charges and allowances");
	
}

@Given("Click on Enhanced Expenditure and verify other charges and allowances")
public void click_on_enhanced_expenditure_and_verify_other_charges_and_allowances() throws InterruptedException {
	capitalallowances.EnhancedExpenditureForOtherChargesandallowances();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and verify other charges and allowances");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and verify other charges and allowances");
	   Log.info("Click on Enhanced Expenditure and verify other charges and allowances");
	
}
@Given("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points")
public void click_on_assert_summary_addition_and_disposal_with_business_closed_for_electric_charge_vehicle_points() {
	capitalallowances.AssertSummaryadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary addition and disposal with business closed for electric charge vehicle points");
	   StepTracker.setCurrentStep("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points");
	   Log.info("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points");
	
}

@Given("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points")
public void click_and_verify_ct600_computation_addition_and_disposed_with_business_closed_and_electric_charge_vehicle_points() throws InterruptedException {
	capitalallowances.CT600ComputationadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points");
	   Log.info("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points");
	
	
}
@Given("Click on Assert Summary for no claim electric charge vehicle points")
public void click_on_assert_summary_for_no_claim_electric_charge_vehicle_points() {
	capitalallowances.AssertSummaryfornoclaimelectricchargevehiclepoints();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for no claim electric charge vehicle points");
	   StepTracker.setCurrentStep("Click on Assert Summary for no claim electric charge vehicle points");
	   Log.info("Click on Assert Summary for no claim electric charge vehicle points");
	
}

@Given("Click and Verify CT600 Computation for no claim electric charge vehicle points")
public void click_and_verify_ct600_computation_for_no_claim_electric_charge_vehicle_points() throws InterruptedException {
	capitalallowances.CT600Computationfornoclaimelectricchargevehiclepoints();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for no claim electric charge vehicle points");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for no claim electric charge vehicle points");
	   Log.info("Click and Verify CT600 Computation for no claim electric charge vehicle points");
	
}
@Given("Click on No Claim Checkbox")
public void click_on_no_claim_checkbox1() throws InterruptedException {
	capitalallowances.Noclaimcheckbox1();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on No Claim Checkbox");
	   StepTracker.setCurrentStep("Click on No Claim Checkbox");
	   Log.info("Click on No Claim Checkbox");
	
}

@Given("Click on Capital allowances and Balancing charges in mainform for no claim")
public void click_on_capital_allowances_and_balancing_charges_in_mainform_for_no_claim() throws InterruptedException {
    capitalallowances.capitalallowancesandBalancingchargesInmainformfornoclaim();
    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in mainform for no claim");
	   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in mainform for no claim");
	   Log.info("Click on Capital allowances and Balancing charges in mainform for no claim");
	
}

@Given("Select asset category as Enterprise zone")
public void select_asset_category_as_enterprise_zone() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsEnterpisezone();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as Enterprise zone");
	   StepTracker.setCurrentStep("Select asset category as Enterprise zone");
	   Log.info("Select asset category as Enterprise zone");
	
}

@Given("Click on Capital allowances and Balancing charges in main for enterprise zone")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainformForEnterpriseZone();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for enterprise zone");
	   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for enterprise zone");
	   Log.info("Click on Capital allowances and Balancing charges in main for enterprise zone");
	
}

@Given("Select asset category as Zero emissions goods vehicle")
public void select_asset_category_as_zero_emissions_goods_vehicle() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsZeroemissionsgoodsvehicle();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as Zero emissions goods vehicle");
	   StepTracker.setCurrentStep("Select asset category as Zero emissions goods vehicle");
	   Log.info("Select asset category as Zero emissions goods vehicle");
	
}

@Given("Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainformForZeroemissionsGoodsvehicle();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle");
	   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle");
	   Log.info("Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle");
	
}

@Given("Select asset category as Zero emission cars")
public void select_asset_category_as_zero_emission_cars() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsZeroemissionsCars();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as Zero emission cars");
	   StepTracker.setCurrentStep("Select asset category as Zero emission cars");
	   Log.info("Select asset category as Zero emission cars");
	
}

@Given("Click on Capital allowances and Balancing charges in main for Zero emissions cars")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_cars() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainformForZeroemissionsCars();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for Zero emissions cars");
	   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for Zero emissions cars");
	   Log.info("Click on Capital allowances and Balancing charges in main for Zero emissions cars");
	
}

@Given("Select asset category as Designated enhnaced allowance")
public void select_asset_category_as_designated_enhnaced_allowance() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsDesignatedenhnacedallowance();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as Designated enhnaced allowance");
	   StepTracker.setCurrentStep("Select asset category as Designated enhnaced allowance");
	   Log.info("Select asset category as Designated enhnaced allowance");
	
}
@Given("Select Asset category as short life asset")
public void select_asset_category_as_short_life_asset() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsShortlifeasset();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset category as short life asset");
	   StepTracker.setCurrentStep("Select Asset category as short life asset");
	   Log.info("Select Asset category as short life asset");
	
}

@Given("Click on Assert Summary for shortlife asset with wdv amount")
public void click_on_assert_summary_for_shortlife_asset_with_wdv_amount() {
	capitalallowances.AssertSummaryforshortlifeassetofwdvamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for shortlife asset with wdv amount");
	   StepTracker.setCurrentStep("Click on Assert Summary for shortlife asset with wdv amount");
	   Log.info("Click on Assert Summary for shortlife asset with wdv amount");
	
    }

@Given("Click and Verify CT600 Computation for shortlife asset with wdv amount")
public void click_and_verify_ct600_computation_for_shortlife_asset_with_wdv_amount() throws InterruptedException {
	capitalallowances.CT600Computationforshortlifeassetofwdvamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with wdv amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with wdv amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with wdv amount");
	
}
@Given("Click on Assert Summary for shortlife asset with addition amount")
public void click_on_assert_summary_for_shortlife_asset_with_addition_amount() {
	capitalallowances.AssertSummaryforshortlifeassetofadditionamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click on Assert Summary for shortlife asset with addition amount");
	   Log.info("Click on Assert Summary for shortlife asset with addition amount");
	
}

@Given("Click and Verify CT600 Computation for shortlife asset with addition amount")
public void click_and_verify_ct600_computation_for_shortlife_asset_with_addition_amount() throws InterruptedException {
	capitalallowances.CT600Computationforshortlifeassetofadditionamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
	
}















//@Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition ana aia")
//public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_addition_ana_aia() throws InterruptedException {
//    capitalallowances.ct600claim
//}

//@Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition and  aia")
//public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_addition_and_aia() {
//    capitalallowances.CT600ComputationforClaimsmallPOOlAllowancewithAdditionandAIA();


//@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition and disposed")
//public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_addition_and_disposed() {
//    capitalallowances.
//}
//
//@Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition and  disposed")
//public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_addition_and_disposed() {
//    capitalallowances.ct6000
//}

@Given("Click on Assert Summary for WDV of specialrate")
public void click_on_assert_summary_for_wdv_of_specialrate() throws InterruptedException {
	 capitalallowances.AssertSummaryForWDVofSpecialrate();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for WDV of specialrate")
public void click_and_verify_ct600_computation_for_wdv_of_specialrate() throws InterruptedException {
	 capitalallowances.CT600ComputationForWDVoFspecialrate();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for WDV of specialrate")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_wdv_of_specialrate() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormFORwdvOfSpecialrate();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Assert Summary for additions of special rate")
public void click_on_assert_summary_for_additions_of_special_rate() throws InterruptedException {
	capitalallowances.AssertSummaryForAdditionofSpecialrate();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for additions of special rate")
public void click_and_verify_ct600_computation_for_additions_of_special_rate() throws InterruptedException {
	capitalallowances.CT600ComputationForAdditionspecialrate();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for additions of special rate")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_additions_of_special_rate() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormFORAdditionOfSpecialrate();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");

}
@Given("Click on Assert Summary for wdv b\\/fwd and addition amount Of specialratepool")
public void click_on_assert_summary_for_wdv_b_fwd_and_addition_amount_of_specialratepool() throws InterruptedException {
	capitalallowances.AssertSummaryForWDVandAdditionofSpecialrate();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click and Verify CT600 Computation for wdv fwd and addition amount of specialratepool")
public void click_and_verify_ct600_computation_for_wdv_fwd_and_addition_amount_of_specialratepool() throws InterruptedException {
	capitalallowances.CT600ComputationForWDVandAdditionspecialrate();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of specialratepool")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_specialratepool() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormFORWDVandAdditionOfSpecialrate();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Select designated enhanced allowance")
public void select_designated_enhanced_allowance1() throws InterruptedException {
	capitalallowances.DesignatedEnhancedAllowance();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Select asset category as Electric vehicle charge points")
public void select_asset_category_as_electric_vehicle_charge_points() throws InterruptedException {
	capitalallowances.SelectAssetCategoryElectricVehicleChargepoints();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Assert Summary for electric vehicle charge points")
public void click_on_assert_summary_for_electric_vehicle_charge_points() {
	capitalallowances.AssertSummaryforElectricVehicleChargePoints();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for electric vehicle charge points")
public void click_and_verify_ct600_computation_for_electric_vehicle_charge_points() throws InterruptedException {
	capitalallowances.CT600ComputationforElectricVehicleChargePoints();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Capital allowances and Balancing charges in main for electric vehicle charge points")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_electric_vehicle_charge_points() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainform();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Assert Summary for restriction amount")
public void click_on_assert_summary_for_restriction_amount() {
	capitalallowances.AssertSummaryforrestrictionandadditionamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for restriction amount")
public void click_and_verify_ct600_computation_for_restriction_amount() throws InterruptedException {
	capitalallowances.CT600Computationforrestrictionandadditionamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Assert Summary for restriction amount and addition amount for special rate pool")
public void click_on_assert_summary_for_restriction_amount_and_addition_amount_for_special_rate_pool() {
	capitalallowances.AssertSummaryforrestrictionandadditionamountforspecialratepool();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for restriction amount and addition amount for special rate pool")
public void click_and_verify_ct600_computation_for_restriction_amount_and_addition_amount_for_special_rate_pool() throws InterruptedException {
	capitalallowances.CT600Computationforrestrictionandadditionamountforspecialratepool();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Enhanced Expenditure for special rate pool")
public void click_on_enhanced_expenditure_for_special_rate_pool() throws InterruptedException {
	capitalallowances.EnhancedExpenditureforspecialratepool();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Assert Summary for restriction and wdv with special rate pool")
public void click_on_assert_summary_for_restriction_and_wdv_with_special_rate_pool() {
	capitalallowances.AssertSummaryforrestrictionandWDVamountforspecialratepool();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for restriction and wdv with special rate pool")
public void click_and_verify_ct600_computation_for_restriction_and_wdv_with_special_rate_pool() throws InterruptedException {
	capitalallowances.CT600ComputationforrestrictionandWDVwithspecialratepool();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Super deduction at ONETHIRTYPERCENT checkbox")
public void click_on_super_deduction_at_onethirtypercent_checkbox() throws InterruptedException {
	capitalallowances.SuperDeductionatOnethirtypercent();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Assert Summary for superdeduction")
public void click_on_assert_summary_for_superdeduction() throws InterruptedException {
	capitalallowances.AssertSummaryforsuperdeduction();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for superdeduction")
public void click_and_verify_ct600_computation_for_superdeduction() throws InterruptedException {
	capitalallowances.CT600ComputationforSuperdeduction();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Select CT600 Return2")
public void select_ct600_return2() {
	capitalallowances.CT600_Return2();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Select Asset acquisition date for superdeduction")
public void select_asset_acquisition_date_for_superdeduction() throws InterruptedException {
	capitalallowances.Assetacquisitiondateforsuperdeduction();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Select CT600 Return3")
public void select_ct600_return3() throws InterruptedException {
	capitalallowances.CT600_Return3();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Assert Summary for wdv and restriction")
public void click_on_assert_summary_for_wdv_and_restriction() throws InterruptedException {
	capitalallowances.AssertSummaryforwdvandrestrictionamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for wdv and restriction")
public void click_and_verify_ct600_computation_for_wdv_and_restriction() throws InterruptedException {
	capitalallowances.CT600ComputationforWDVandrestrictionamount();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Assert Summary for addition with no claim")
public void click_on_assert_summary_for_addition_with_no_claim() {
	capitalallowances.AssertSummaryforadditionandnoclaim();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation for addition with no claim")
public void click_and_verify_ct600_computation_for_addition_with_no_claim() throws InterruptedException {
	capitalallowances.CT600Computationforadditionandnoclaim();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}


@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value superdeduction")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_superdeduction() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforsuperdeduction();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Assert Summary addition amount with asset is car Between {int}-130g\\/Km")
public void click_on_assert_summary_addition_amount_with_asset_is_car_between_130g_km(Integer int1) throws InterruptedException {
	capitalallowances.AssertSummaryforassetisacar();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation addition amount with asset is car Between {int}-130g\\/Km")
public void click_and_verify_ct600_computation_addition_amount_with_asset_is_car_between_130g_km(Integer int1) throws InterruptedException {
	capitalallowances.CT600Computationforassetisacar();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between {int}-130g\\/Km")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_with_asset_is_car_between_130g_km(Integer int1) throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforassetisacar();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}
@Given("Click on Assert Summary addition amount with asset is car Between 75gkmorlesss")
public void click_on_assert_summary_addition_amount_with_asset_is_car_between_75gkmorlesss() {
	capitalallowances.AssertSummaryforassetisacarfor75g();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary addition amount with asset is car Between 75gkmorlesss");
	   StepTracker.setCurrentStep("Click on Assert Summary addition amount with asset is car Between 75gkmorlesss");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click and Verify CT600 Computation addition amount with asset is car Between 75gkmorlesss")
public void click_and_verify_ct600_computation_addition_amount_with_asset_is_car_between_75gkmorlesss() throws InterruptedException {
	capitalallowances.CT600Computationforassetisacarfor75g();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlife asset with addition amount");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlife asset with addition amount");
	   Log.info("Click and Verify CT600 Computation for shortlife asset with addition amount");
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between 75gkmorlesss")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_with_asset_is_car_between_75gkmorlesss() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforassetisacarfor75g();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between 75gkmorlesss");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between 75gkmorlesss");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between 75gkmorlesss");
}
@Given("Select Asset acquisition date for full expensing")
public void select_asset_acquisition_date_for_full_expensing() throws InterruptedException {
	capitalallowances.AssetacquisitiondateforFullexpensing();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date for full expensing");
	   StepTracker.setCurrentStep("Select Asset acquisition date for full expensing");
	   Log.info("Select Asset acquisition date for full expensing");
}

@Given("Click on Assert Summary for full expensing")
public void click_on_assert_summary_for_full_expensing() throws InterruptedException {
	capitalallowances.AssetacquisitiondateforFullexpensing();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for full expensing");
	   StepTracker.setCurrentStep("Click on Assert Summary for full expensing");
	   Log.info("Click on Assert Summary for full expensing");
}

@Given("Click and Verify CT600 Computation for full expensing")
public void click_and_verify_ct600_computation_for_full_expensing() throws InterruptedException {
	capitalallowances.CT600Computationforfullexpensing();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for full expensing");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation for full expensing");
	   Log.info("Click and Verify CT600 Computation for full expensing");
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value full expensing")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_full_expensing() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforfullexpensing();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value full expensing");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value full expensing");
	   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value full expensing");
	
}

@Given("Click on kebeb icon")
public void click_on_kebeb_icon() throws InterruptedException {
	capitalallowances.kebabiconforcapitalallowance();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on kebeb icon");
	   StepTracker.setCurrentStep("Click on kebeb icon");
	   Log.info("Click on kebeb icon");
}

@Given("Click on asset wise Details")
public void click_on_asset_wise_details() {
	capitalallowances.AssetwiseDetails();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on asset wise Details");
	   StepTracker.setCurrentStep("Click on asset wise Details");
	   Log.info("Click on asset wise Details");
}

@Given("Click on Pool wise Details")
public void click_on_pool_wise_details() {
	capitalallowances.PoolwiseDetails();Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Pool wise Details");
	   StepTracker.setCurrentStep("Click on Pool wise Details");
	   Log.info("Click on Pool wise Details");
}

@Given("Click on MainPoolOfSaveButton")
public void click_on_main_pool_of_save_button() {
	capitalallowances.MainpoolOFSaveButton();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on MainPoolOfSaveButton");
	   StepTracker.setCurrentStep("Click on MainPoolOfSaveButton");
	   Log.info("Click on MainPoolOfSaveButton");
}
@Given("Click on MainPoolOfCancelchanges")
public void click_on_main_pool_of_cancelchanges() {
	capitalallowances.MainpoolOFCancelchanges();Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on MainPoolOfCancelchanges");
	   StepTracker.setCurrentStep("Click on MainPoolOfCancelchanges");
	   Log.info("Click on MainPoolOfCancelchanges");
}
@Given("Click on Assert Summary Of structure and buildings")
public void click_on_assert_summary_of_structure_and_buildings() {
	capitalallowances.AssertSummaryforstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary Of structure and buildings");
	   StepTracker.setCurrentStep("Click on Assert Summary Of structure and buildings");
	   Log.info("Click on Assert Summary Of structure and buildings");
}

@Given("Click and Verify CT600 Computation of structure and buildings")
public void click_and_verify_ct600_computation_of_structure_and_buildings() throws InterruptedException {
	capitalallowances.CT600Computationforstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation of structure and buildings");
	   StepTracker.setCurrentStep("Click and Verify CT600 Computation of structure and buildings");
	   Log.info("Click and Verify CT600 Computation of structure and buildings");
}

@Given("Click on Enhanced Expenditure of strcutures and buildings")
public void click_on_enhanced_expenditure_of_strcutures_and_buildings() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforstructureandbuildings();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure of strcutures and buildings");
	   StepTracker.setCurrentStep("Click on Enhanced Expenditure of strcutures and buildings");
	   Log.info("Click on Enhanced Expenditure of strcutures and buildings");
}




}







