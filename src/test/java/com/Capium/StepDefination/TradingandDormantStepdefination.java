package com.Capium.StepDefination;

import java.io.IOException;

import com.Capium.Actions.TradingandDormantAtions;
import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TradingandDormantStepdefination {
	TradingandDormantAtions TradingandDormant= new TradingandDormantAtions();
	
	@Given("Click on Tax Return and Verify Tax Return for trading and dormant period")
	public void click_on_tax_return_and_verify_tax_return_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.Tax_ReturnoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Taxretur of trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Taxretur of trading and dormant period");
//		   Log.info("Click on Taxretur of trading and dormant period");							
	}

	@Given("Search a client and verify for trading and dormant period")
	public void search_a_client_and_verify_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.SearchTextfieldfortradinganddormant("vijith");
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on the Search textfield for trading and dormant");
//		   StepTracker.setCurrentStep("Click on the Search textfield for trading and dormant");
//		   Log.info("Click on the Search textfield for trading and dormant");
	}

	@Given("Select particular client for trading and dormant period")
	public void select_particular_client_for_trading_and_dormant_period() {
		TradingandDormant.Clientfortradinganddormant("vijith");
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on the particular client for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on the particular client for trading and dormant period");
//		   Log.info("Click on the particular client for trading and dormant period");
	}
//
//	@Given("Select CT600 24Return for trading and dormant period")
//	public void select_ct600_24return_for_trading_and_dormant_period() {
//		TradingandDormant.Ct60024ReturnoftradingandDormantperiod();
	

	@Given("Click on Capital Allowances calculator screen for trading and dormant period")
	public void click_on_capital_allowances_calculator_screen_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.Capital_AllowancesCalculatoroftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital Allowances calculator screen for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Capital Allowances calculator screen for trading and dormant period");
//		   Log.info("Click on Capital Allowances calculator screen for trading and dormant period");
	}

	@Given("Click on Add new asset for trading and dormant period")
	public void click_on_add_new_asset_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AddNewAssetoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Add new asset for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Add new asset for trading and dormant period");
//		   Log.info("Click on Add new asset for trading and dormant period");
	}

	@Given("Enter Assert Description for trading and dormant period")
	public void enter_assert_description_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.assetdescriptionoftradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on the Enter Assert Description for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on the Enter Assert Description for trading and dormant period");
//		   Log.info("Click on the Enter Assert Description for trading and dormant period");
	}

	@Given("Select asset category for trading and dormant period")
	public void select_asset_category_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryfortradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  asset category for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on  asset category for trading and dormant period");
//		   Log.info("Click on  asset category for trading and dormant period");
	}

	@Given("Select Main pool Asset for trading and dormant period")
	public void select_main_pool_asset_for_trading_and_dormant_period() {
		TradingandDormant.SelectMainpoolfortradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Main pool Asset for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Main pool Asset for trading and dormant period");
//		   Log.info("Click on Main pool Asset for trading and dormant period");
	}

	@Given("Select Asset acquisition date for trading and dormant period")
	public void select_asset_acquisition_date_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date for trading and dormant period");
//		   StepTracker.setCurrentStep("Select Asset acquisition date for trading and dormant period");
//		   Log.info("Select Asset acquisition date for trading and dormant period");
	}

	@Given("Enter WDV b\\/fwd amount for trading and dormant period")
	public void enter_wdv_b_fwd_amount_for_trading_and_dormant_period() throws InterruptedException, IOException {
		TradingandDormant.WDVbroughtFwdfortradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter WDV b\\\\/fwd amount for trading and dormant period");
//		   StepTracker.setCurrentStep("Enter WDV b\\\\/fwd amount for trading and dormant period");
//		   Log.info("Enter WDV b\\\\/fwd amount for trading and dormant period");
	}

	@Given("Click on MainPoolOfSaveAndExitButton for trading and dormant period")
	public void click_on_main_pool_of_save_and_exit_button_for_trading_and_dormant_period() {
		TradingandDormant.MainpoolOFSaveAndExitButtonfortradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on MainPoolOfSaveAndExitButton for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on MainPoolOfSaveAndExitButton for trading and dormant period");
//		   Log.info("Click on MainPoolOfSaveAndExitButton for trading and dormant period");
	}

	@Given("Click on Assert Summary for trading and dormant period")
	public void click_on_assert_summary_for_trading_and_dormant_period() {
		TradingandDormant.AssertSummaryfortradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Assert Summary for trading and dormant period");
//		   Log.info("Click on Assert Summary for trading and dormant period");
	}

	@Given("Click and Verify CT600 Computation for trading and dormant period")
	public void click_and_verify_ct600_computation_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.CT600computationoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for trading and dormant period");
//		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for trading and dormant period");
//		   Log.info("Click and Verify CT600 Computation for trading and dormant period");
	}

	@Given("Click on MainFormForCapitalAllowance for trading and dormant period")
	public void click_on_main_form_for_capital_allowance_for_trading_and_dormant_period() {
		TradingandDormant.MainformForCapitalallowanceoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on MainFormForCapitalAllowance for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on MainFormForCapitalAllowance for trading and dormant period");
//		   Log.info("Click on MainFormForCapitalAllowance for trading and dormant period");
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for trading and dormant period")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.EnhancedEXpenditureInMainformoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for trading and dormant period");
//		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for trading and dormant period");
	}

	@Given("Click on QuickEntry for trading and dormant period")
	public void click_on_quick_entry_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.QuicKEntryInMainFormoftradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on QuickEntry for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on QuickEntry for trading and dormant period");
//		   Log.info("Click on QuickEntry for trading and dormant period");
	}

	@Given("Delete Assert for trading and dormant period")
	public void delete_assert_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.mousehoverdeletefortradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "click on Delete Assert for trading and dormant period");
//		   StepTracker.setCurrentStep("click on Delete Assert for trading and dormant period");
//		   Log.info("click on Delete Assert for trading and dormant period");
	}
	@Given("Enter addition amount for trading and dormant period")
	public void enter_addition_amount_for_trading_and_dormant_period() throws InterruptedException  {
		TradingandDormant.Additionsadditionoftradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter addition amount for trading and dormant period");
//		   StepTracker.setCurrentStep("Enter addition amount for trading and dormant period");
//		   Log.info("Enter addition amount for trading and dormant period");
	}

	@Given("Click on Assert Summary for addition of trading and dormant period")
	public void click_on_assert_summary_for_addition_of_trading_and_dormant_period() {
		TradingandDormant.AssertSummaryforadditionoftradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for addition of trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Assert Summary for addition of trading and dormant period");
//		   Log.info("Click on Assert Summary for addition of trading and dormant period");
	}

	@Given("Click and Verify CT600 Computation for addition of trading and dormant period")
	public void click_and_verify_ct600_computation_for_addition_of_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.CT600Computationforadditionsoftradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for addition of trading and dormant period");
//		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for addition of trading and dormant period");
//		   Log.info("Click and Verify CT600 Computation for addition of trading and dormant period");
	}
	
	@Then("Click on first year allowance at {int} percent for trading")
	public void click_on_first_year_allowance_at_percent_for_trading(Integer int1) throws InterruptedException {
		TradingandDormant.firstYearAllowanceAtHundredPercentfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on first year allowance at {int} percent for trading");
//		   StepTracker.setCurrentStep("Click on first year allowance at {int} percent for trading");
//		   Log.info("Click on first year allowance at {int} percent for trading");
	}

	@Then("Enter  Additions for trading")
	public void enter_additions_for_trading() throws InterruptedException {
		TradingandDormant.Additionsfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter  Additions for trading");
//		   StepTracker.setCurrentStep("Enter  Additions for trading");
//		   Log.info("Enter  Additions for trading");
	}



//	@Given("Select specialrate pool Asset for trading and dormant period")
//	public void select_specialrate_pool_asset_for_trading_and_dormant_period() {
//		TradingandDormant.SpecialRatePoolfortradinganddormantperiod();
//	}
//
//	@Given("Click on Assert Summary for addition of trading and dormant period for special rate pool")
//	public void click_on_assert_summary_for_addition_of_trading_and_dormant_period_for_special_rate_pool() {
//		TradingandDormant.AssertSummaryforadditionoftradinganddormantperiod();
//	}
//
//	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for trading and dormant period for specil rate pool")
//	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_trading_and_dormant_period_for_specil_rate_pool() {
//		TradingandDormant.en
	
	@Given("Select CT600 26Return for trading and dormant period")
	public void select_ct600_26return_for_trading_and_dormant_period() {
		TradingandDormant.Ct60026ReturnoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on CT600 26Return for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on CT600 26Return for trading and dormant period");
//		   Log.info("Click on CT600 26Return for trading and dormant period");
	}
	@Given("Enter AIA amount for trading and dormant period")
	public void enter_aia_amount_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AIAamountoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Enter AIA amount for trading and dormant period");
//		   StepTracker.setCurrentStep("Enter AIA amount for trading and dormant period");
//		   Log.info("Enter AIA amount for trading and dormant period");
	}

	@Given("Click on Assert Summary for addition and aia of trading and dormant period")
	public void click_on_assert_summary_for_addition_and_aia_of_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AssertSummaryforAdditionandAIAamountoftradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for addition and aia of trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Assert Summary for addition and aia of trading and dormant period");
//		   Log.info("Click on Assert Summary for addition and aia of trading and dormant period");
	}

	@Given("Click and Verify CT600 Computation for addition and aia of trading and dormant period")
	public void click_and_verify_ct600_computation_for_addition_and_aia_of_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.CT600ComputationforAdditionandAIAamountoftradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for addition and aia of trading and dormant period");
//		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for addition and aia of trading and dormant period");
//		   Log.info("Click and Verify CT600 Computation for addition and aia of trading and dormant period");
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of addition and aia amount for trading and dormant period")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_addition_and_aia_amount_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforAdditionandAIAamountfortradinganddormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of addition and aia amount for trading and dormant period");
//		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of addition and aia amount for trading and dormant period");
//		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of addition and aia amount for trading and dormant period");
	}
	@Given("Select asset category as Electric vehicle charge points for trading and dormant")
	public void select_asset_category_as_electric_vehicle_charge_points_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryElectricVehicleChargepointsfortradingandormant();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Select asset category as Electric vehicle charge points for trading and dormant");
//		   StepTracker.setCurrentStep("Click on Select asset category as Electric vehicle charge points for trading and dormant");
//		   Log.info("Click on Select asset category as Electric vehicle charge points for trading and dormant");
	}
	
	@Given("Click on first year allowance at {int} percent for trading and dormant")
	public void click_on_first_year_allowance_at_percent_for_trading_and_dormant(Integer int1) throws InterruptedException {
		TradingandDormant.firstYearAllowanceAtHundredPercentfortradinganddormant();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on first year allowance at {int} percent for trading and dormant");
//		   StepTracker.setCurrentStep("Click on first year allowance at {int} percent for trading and dormant");
//		   Log.info("Click on first year allowance at {int} percent for trading and dormant");
	}
	
	@Given("Click on Assert Summary for electric vehicle charge points for trading")
	public void click_on_assert_summary_for_electric_vehicle_charge_points_for_trading() {
		TradingandDormant.AssertSummaryforElectricVehicleChargePointsfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for electric vehicle charge points for trading");
//		   StepTracker.setCurrentStep("Click on Assert Summary for electric vehicle charge points for trading");
//		   Log.info("Click on Assert Summary for electric vehicle charge points for trading");
	}
	
	@Given("Click and Verify CT600 Computation for electric vehicle charge points for trading")
	public void click_and_verify_ct600_computation_for_electric_vehicle_charge_points_for_trading() throws InterruptedException {
		TradingandDormant.CT600ComputationforElectricVehicleChargePointsfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for electric vehicle charge points for trading");
//		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for electric vehicle charge points for trading");
//		   Log.info("Click and Verify CT600 Computation for electric vehicle charge points for trading");
	}
	@Given("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_electric_vehicle_charge_points_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformfortradinganddormant();	
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading");
//		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading");
//		   Log.info("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading");
//		
	}
	
	@Given("Select Asset acquisition date of Dormant and trading period")
	public void select_asset_acquisition_date_of_dormant_and_trading_period() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiod();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Asset acquisition date of Dormant and trading period");
//		   StepTracker.setCurrentStep("Click on Asset acquisition date of Dormant and trading period");
//		   Log.info("Click on Asset acquisition date of Dormant and trading period");
	}

	
	@Given("Select Asset Disposed Date for trading")
	public void select_asset_disposed_date_for_trading() {
		TradingandDormant.AssetDisposedDatefortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Asset Disposed Date for trading");
//		   StepTracker.setCurrentStep("Click on Asset Disposed Date for trading");
//		   Log.info("Click on Asset Disposed Date for trading");
	}

	@Given("Enter disposal amount for trading")
	public void enter_disposal_date_for_trading() {
		TradingandDormant.DisposalAmountfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enter disposal amount for trading");
//		   StepTracker.setCurrentStep("Click on Enter disposal amount for trading");
//		   Log.info("Click on Enter disposal amount for trading");
	}

	@Given("Click on BusinessclosedCheckbox for trading")
	public void click_on_businessclosed_checkbox_for_trading() {
		TradingandDormant.BusinessClosedCheckboxfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on BusinessclosedCheckbox for trading");
//		   StepTracker.setCurrentStep("Click on BusinessclosedCheckbox for trading");
//		   Log.info("Click on BusinessclosedCheckbox for trading");
	}

	@Given("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points for trading")
	public void click_on_assert_summary_addition_and_disposal_with_business_closed_for_electric_charge_vehicle_points_for_trading() {
		TradingandDormant.AssertSummaryadditionalanddisposalwithbusinessclosedforElectricVehicleChargePointsfortrading();
		
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary addition and disposal with business closed for electric charge vehicle points for trading");
//		   StepTracker.setCurrentStep("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points for trading");
//		   Log.info("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points for trading");
	}

	@Given("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points for trading")
	public void click_and_verify_ct600_computation_addition_and_disposed_with_business_closed_and_electric_charge_vehicle_points_for_trading() throws InterruptedException {
		TradingandDormant.CT600ComputationadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points for trading");
//		   StepTracker.setCurrentStep("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points for trading");
//		   Log.info("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points for trading");
	}
	@Given("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_electric_vehicle_charge_points_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormant();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading for mainform2");
//		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading for mainform2");
//		   Log.info("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading for mainform2");
	}
	
	@Given("Click on No Claim Checkbox for trading")
	public void click_on_no_claim_checkbox_for_trading() throws InterruptedException {
		TradingandDormant.Noclaimcheckboxfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on No Claim Checkbox for trading");
//		   StepTracker.setCurrentStep("Click on No Claim Checkbox for trading");
//		   Log.info("Click on No Claim Checkbox for trading");
	}

	@Given("Click on Assert Summary for no claim electric charge vehicle points for trading")
	public void click_on_assert_summary_for_no_claim_electric_charge_vehicle_points_for_trading() {
		TradingandDormant.AssertSummaryfornoclaimelectricchargevehiclepointsfortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for no claim electric charge vehicle points for trading");
		   StepTracker.setCurrentStep("Click on Assert Summary for no claim electric charge vehicle points for trading");
		   Log.info("Click on Assert Summary for no claim electric charge vehicle points for trading");
	}

	@Given("Click and Verify CT600 Computation for no claim electric charge vehicle points for trading")
	public void click_and_verify_ct600_computation_for_no_claim_electric_charge_vehicle_points_for_trading() throws InterruptedException {
		TradingandDormant.CT600Computationfornoclaimelectricchargevehiclepointsfortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for no claim electric charge vehicle points for trading");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for no claim electric charge vehicle points for trading");
		   Log.info("Click and Verify CT600 Computation for no claim electric charge vehicle points for trading");
	}

	@Given("Click on Capital allowances and Balancing charges in mainform for no claim for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_mainform_for_no_claim_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformfornoclaimtradinganddormant();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in mainform for no claim for trading");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in mainform for no claim for trading");
		   Log.info("Click on Capital allowances and Balancing charges in mainform for no claim for trading");
	}

	@Given("Select asset category as Enterprise zone for trading and dormant")
	public void select_asset_category_as_enterprise_zone_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsEnterpisezonefortradinganddormant();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as Enterprise zone for trading and dormant");
		   StepTracker.setCurrentStep("Select asset category as Enterprise zone for trading and dormant");
		   Log.info("Select asset category as Enterprise zone for trading and dormant");
	}

	@Given("Click on Capital allowances and Balancing charges in main for enterprise zone for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformForEnterpriseZone();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for enterprise zone for trading");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for enterprise zone for trading");
		   Log.info("Click on Capital allowances and Balancing charges in main for enterprise zone for trading");
	}

	@Given("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormantforenterpirsezone();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform2");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform2");
		   Log.info("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform2");
	}

	@Given("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform3")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone_for_trading_for_mainform3() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformfornoclaimtradinganddormantforenterpisezone();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform3");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform3");
		   Log.info("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform3");
	}

	@Given("Select asset category as Zero emissions goods vehicle for trading and dormant")
	public void select_asset_category_as_zero_emissions_goods_vehicle_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsZeroemissionsgoodsvehiclefortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as Zero emissions goods vehicle for trading and dormant");
		   StepTracker.setCurrentStep("Select asset category as Zero emissions goods vehicle for trading and dormant");
		   Log.info("Select asset category as Zero emissions goods vehicle for trading and dormant");
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle  for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformForZeroemissionsGoodsvehiclefortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle  for trading");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle  for trading");
		   Log.info("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle  for trading");
	}



	@Given("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormantforzeroemmissionsgoodsvehicle();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform2");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform2");
		   Log.info("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform2");
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform3")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle_for_trading_for_mainform3() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform3fornoclaimtradinganddormantforzeroemisisonsgoodsvehicle();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform3");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform3");
		   Log.info("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform3");
	}
	@Given("Select asset category as Zero emissions Cars for trading and dormant")
	public void select_asset_category_as_zero_emissions_cars_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsZeroemissionsCarsfortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as Zero emissions Cars for trading and dormant");
		   StepTracker.setCurrentStep("Select asset category as Zero emissions Cars for trading and dormant");
		   Log.info("Select asset category as Zero emissions Cars for trading and dormant");
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions cars  for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_cars_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformForZeroemissionsCarsfortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for zero emissions cars  for trading");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for zero emissions cars  for trading");
		   Log.info("Click on Capital allowances and Balancing charges in main for zero emissions cars  for trading");
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions cars for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_cars_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormantforzeroemmissionsforcars();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for zero emissions cars for trading for mainform2");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for zero emissions cars for trading for mainform2");
		   Log.info("Click on Capital allowances and Balancing charges in main for zero emissions cars for trading for mainform2");
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emission cars for trading for mainform3")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emission_cars_for_trading_for_mainform3() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform3fornoclaimtradinganddormantforzeroemisisonsCars();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Capital allowances and Balancing charges in main for zero emission cars for trading for mainform3");
		   StepTracker.setCurrentStep("Click on Capital allowances and Balancing charges in main for zero emission cars for trading for mainform3");
		   Log.info("Click on Capital allowances and Balancing charges in main for zero emission cars for trading for mainform3");
	}
	@Given("Select Asset acquisition date of Dormant and trading period for electric charge and vehicles")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_electric_charge_and_vehicles() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiodforelectricchargevehiclechargepoints();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date of Dormant and trading period for electric charge and vehicles");
		   StepTracker.setCurrentStep("Select Asset acquisition date of Dormant and trading period for electric charge and vehicles");
		   Log.info("Select Asset acquisition date of Dormant and trading period for electric charge and vehicles");
	}
	@Given("Select asset category as shortlife asset for trading and dormant")
	public void select_asset_category_as_shortlife_asset_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsShortlifeassetfortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as shortlife asset for trading and dormant");
		   StepTracker.setCurrentStep("Select asset category as shortlife asset for trading and dormant");
		   Log.info("Select asset category as shortlife asset for trading and dormant");
	}

	@Given("Select Asset acquisition date of Dormant and trading period for shortlifeasset")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_shortlifeasset() throws InterruptedException {
		TradingandDormant.Assetacquisitiondateforshortlifeasset();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date of Dormant and trading period for shortlifeasset");
		   StepTracker.setCurrentStep("Select Asset acquisition date of Dormant and trading period for shortlifeasset");
		   Log.info("Select Asset acquisition date of Dormant and trading period for shortlifeasset");
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_dormant_and_trading_period() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforshortlifeassetoftrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period");
		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period");
	}

	@Given("Click on Assert Summary for shortlifeasset of additions")
	public void click_on_assert_summary_for_shortlifeasset_of_additions() {
		TradingandDormant.AssertSummaryforshortlifeassetofadditions();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary for shortlifeasset of additions");
		   StepTracker.setCurrentStep("Click on Assert Summary for shortlifeasset of additions");
		   Log.info("Click on Assert Summary for shortlifeasset of additions");
	}

	@Given("Click and Verify CT600 Computation for shortlifeasset of additions")
	public void click_and_verify_ct600_computation_for_shortlifeasset_of_additions() throws InterruptedException {
		TradingandDormant.CT600Computationforshortlifeassetofadditions();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for shortlifeasset of additions");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for shortlifeasset of additions");
		   Log.info("Click and Verify CT600 Computation for shortlifeasset of additions");
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period of additions")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_dormant_and_trading_period_of_additions() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforshortlifeassetoftrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period of additions");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period of additions");
		   Log.info("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period of additions");
	}

	@Given("Click on Claim small pool allowance of trading and dormant")
	public void click_on_claim_small_pool_allowance_of_trading_and_dormant() throws InterruptedException {
		TradingandDormant.ClaimSmallpoolAllowancheckboxfortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Claim small pool allowance of trading and dormant");
		   StepTracker.setCurrentStep("Click on Claim small pool allowance of trading and dormant");
		   Log.info("Click on Claim small pool allowance of trading and dormant");
	}

	@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition for trading")
	public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_addition_for_trading() {
		TradingandDormant.AssertSummaryforClaimsmallPOOlAllowanceforadditionsofshortlifeasset();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary Of ClaimsmallPOOlAllowance with addition for trading");
		   StepTracker.setCurrentStep("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition for trading");
		   Log.info("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition for trading");
	}

	@Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition for trading")
	public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_addition_for_trading() throws InterruptedException {
		TradingandDormant. CT600ComputationforClaimsmallPOOlAllowancewithadditionsoftrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition for trading");
		   StepTracker.setCurrentStep("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition for trading");
		   Log.info("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition for trading");
	}

	@Given("Click on Enhanced Expenditure main form for claimsmall pool allowance of shortlife asset")
	public void click_on_enhanced_expenditure_main_form_for_claimsmall_pool_allowance_of_shortlife_asset() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforClaimsmallpoolallowancefortrading();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure main form for claimsmall pool allowance of shortlife asset");
		   StepTracker.setCurrentStep("Click on Enhanced Expenditure main form for claimsmall pool allowance of shortlife asset");
		   Log.info("Click on Enhanced Expenditure main form for claimsmall pool allowance of shortlife asset");
	}
	@Given("Click on Assert Summary addition for business closed checkbox for trading")
	public void click_on_assert_summary_addition_for_business_closed_checkbox_for_trading() {
		TradingandDormant.AssertSummaryofbusinessclosedchcekboxfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Assert Summary addition for business closed checkbox for trading");
//		   StepTracker.setCurrentStep("Click on Assert Summary addition for business closed checkbox for trading");
//		   Log.info("Click on Assert Summary addition for business closed checkbox for trading");
	}
	@Given("Click and Verify CT600 Computation for business closed checkbox for trading")
	public void click_and_verify_ct600_computation_for_business_closed_checkbox_for_trading() throws InterruptedException {
		TradingandDormant.CT600computationofbusinessclosedcheckboxfortradingandadditions();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click and Verify CT600 Computation for business closed checkbox for trading");
//		   StepTracker.setCurrentStep("Click and Verify CT600 Computation for business closed checkbox for trading");
//		   Log.info("Click and Verify CT600 Computation for business closed checkbox for trading");
	}
	@Given("Click on Enhanced Expenditure mainform for business closed checkbox for trading")
	public void click_on_enhanced_expenditure_mainform_for_business_closed_checkbox_for_trading() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforbusinessclosedcheckboxforadditions();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Enhanced Expenditure mainform for business closed checkbox for trading");
//		   StepTracker.setCurrentStep("Click on Enhanced Expenditure mainform for business closed checkbox for trading");
//		   Log.info("Click on Enhanced Expenditure mainform for business closed checkbox for trading");
}
	@Given("Select asset category as othercharges and allowances for trading and dormant")
	public void select_asset_category_as_othercharges_and_allowances_for_trading_and_dormant() {
		TradingandDormant.SelectAssstcategoryasotherchargesandallowancesfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select asset category as othercharges and allowances for trading and dormant");
//		   StepTracker.setCurrentStep("Select asset category as othercharges and allowances for trading and dormant");
//		   Log.info("Select asset category as othercharges and allowances for trading and dormant");
	}

	@Given("Select Asset acquisition date of Dormant and trading period for other charges and allowances")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_other_charges_and_allowances() throws InterruptedException {
		TradingandDormant.Assetacquisitiondateforotherchargesandallowancesfortrading();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on the Accounts and compSelect Asset acquisition date of Dormant and trading period for other charges and allowancesutation included");
//		   StepTracker.setCurrentStep("Select Asset acquisition date of Dormant and trading period for other charges and allowances");
//		   Log.info("Select Asset acquisition date of Dormant and trading period for other charges and allowances");
	}

	@Given("Select Asset acquisition date of Dormant and trading period for electric vehicle charge points")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_electric_vehicle_charge_points() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiodforelectricchargevehiclechargepoints();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date of Dormant and trading period for electric vehicle charge points");
//		   StepTracker.setCurrentStep("Select Asset acquisition date of Dormant and trading period for electric vehicle charge points");
//		   Log.info("Select Asset acquisition date of Dormant and trading period for electric vehicle charge points");
	}

	@Given("Select Asset acquisition date of Dormant and trading period for enterprize zone")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_enterprize_zone() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiodforenterprizezone();
//		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Asset acquisition date of Dormant and trading period for enterprize zone");
//		   StepTracker.setCurrentStep("Select Asset acquisition date of Dormant and trading period for enterprize zone");
//		   Log.info("Select Asset acquisition date of Dormant and trading period for enterprize zone");
	}
//	
//	@Given("Click on Capital allowances and balancing charges in mainform for enterprisezone for trading for firstyearallowance")
//	public void click_on_capital_allowances_and_balancing_charges_in_mainform_for_enterprisezone_for_trading_for_firstyearallowance() {
//		TradingandDormant.
//	}
//
	
	
	
}
//	@Given("Click on Capital allowances and Balancing charges in main for other charges and allowances for trading for mainform2")
//	public void click_on_capital_allowances_and_balancing_charges_in_main_for_other_charges_and_allowances_for_trading_for_mainform2() throws InterruptedException {
//		TradingandDormant.capitalallowancesandBalancingchargesInmainf
//	}
//
//	@Given("Click on Capital allowances and Balancing charges in main for other charges and allowances for trading for mainform3")
//	public void click_on_capital_allowances_and_balancing_charges_in_main_for_other_charges_and_allowances_for_trading_for_mainform3() {
//		TradingandDormant.s
//	}
//
//}

	








