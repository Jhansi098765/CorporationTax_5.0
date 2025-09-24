package com.Capium.StepDefination;

import java.io.IOException;

import com.Capium.Actions.TradingandDormantAtions;

import io.cucumber.java.en.Given;

public class TradingandDormantStepdefination {
	TradingandDormantAtions TradingandDormant= new TradingandDormantAtions();
	
	@Given("Click on Tax Return and Verify Tax Return for trading and dormant period")
	public void click_on_tax_return_and_verify_tax_return_for_trading_and_dormant_period() {
		TradingandDormant.Tax_ReturnoftradingandDormantperiod();
	}

	@Given("Search a client and verify for trading and dormant period")
	public void search_a_client_and_verify_for_trading_and_dormant_period() {
		TradingandDormant.SearchTextfieldoftradingandDormantperiod();
	}

	@Given("Select particular client for trading and dormant period")
	public void select_particular_client_for_trading_and_dormant_period() {
		TradingandDormant.clientoftradingandDormantperiod();
	}
//
//	@Given("Select CT600 24Return for trading and dormant period")
//	public void select_ct600_24return_for_trading_and_dormant_period() {
//		TradingandDormant.Ct60024ReturnoftradingandDormantperiod();
	

	@Given("Click on Capital Allowances calculator screen for trading and dormant period")
	public void click_on_capital_allowances_calculator_screen_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.Capital_AllowancesCalculatoroftradingandDormantperiod();
	}

	@Given("Click on Add new asset for trading and dormant period")
	public void click_on_add_new_asset_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AddNewAssetoftradingandDormantperiod();
	}

	@Given("Enter Assert Description for trading and dormant period")
	public void enter_assert_description_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.assetdescriptionoftradinganddormantperiod();
	}

	@Given("Select asset category for trading and dormant period")
	public void select_asset_category_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryfortradinganddormantperiod();
	}

	@Given("Select Main pool Asset for trading and dormant period")
	public void select_main_pool_asset_for_trading_and_dormant_period() {
		TradingandDormant.SelectMainpoolfortradinganddormantperiod();
	}

	@Given("Select Asset acquisition date for trading and dormant period")
	public void select_asset_acquisition_date_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiod();
	}

	@Given("Enter WDV b\\/fwd amount for trading and dormant period")
	public void enter_wdv_b_fwd_amount_for_trading_and_dormant_period() throws InterruptedException, IOException {
		TradingandDormant.WDVbroughtFwdfortradinganddormantperiod();
	}

	@Given("Click on MainPoolOfSaveAndExitButton for trading and dormant period")
	public void click_on_main_pool_of_save_and_exit_button_for_trading_and_dormant_period() {
		TradingandDormant.MainpoolOFSaveAndExitButtonfortradinganddormantperiod();
	}

	@Given("Click on Assert Summary for trading and dormant period")
	public void click_on_assert_summary_for_trading_and_dormant_period() {
		TradingandDormant.AssertSummaryfortradinganddormantperiod();
	}

	@Given("Click and Verify CT600 Computation for trading and dormant period")
	public void click_and_verify_ct600_computation_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.CT600computationoftradingandDormantperiod();
	}

	@Given("Click on MainFormForCapitalAllowance for trading and dormant period")
	public void click_on_main_form_for_capital_allowance_for_trading_and_dormant_period() {
		TradingandDormant.MainformForCapitalallowanceoftradingandDormantperiod();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for trading and dormant period")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.EnhancedEXpenditureInMainformoftradingandDormantperiod();
	}

	@Given("Click on QuickEntry for trading and dormant period")
	public void click_on_quick_entry_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.QuicKEntryInMainFormoftradinganddormantperiod();
	}

	@Given("Delete Assert for trading and dormant period")
	public void delete_assert_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.mousehoverdeletefortradinganddormantperiod();
	}
	@Given("Enter addition amount for trading and dormant period")
	public void enter_addition_amount_for_trading_and_dormant_period() throws InterruptedException  {
		TradingandDormant.Additionsadditionoftradinganddormantperiod();
	}

	@Given("Click on Assert Summary for addition of trading and dormant period")
	public void click_on_assert_summary_for_addition_of_trading_and_dormant_period() {
		TradingandDormant.AssertSummaryforadditionoftradinganddormantperiod();
	}

	@Given("Click and Verify CT600 Computation for addition of trading and dormant period")
	public void click_and_verify_ct600_computation_for_addition_of_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.CT600Computationforadditionsoftradinganddormantperiod();
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
	}
	@Given("Enter AIA amount for trading and dormant period")
	public void enter_aia_amount_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AIAamountoftradingandDormantperiod();
	}

	@Given("Click on Assert Summary for addition and aia of trading and dormant period")
	public void click_on_assert_summary_for_addition_and_aia_of_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.AssertSummaryforAdditionandAIAamountoftradinganddormantperiod();
	}

	@Given("Click and Verify CT600 Computation for addition and aia of trading and dormant period")
	public void click_and_verify_ct600_computation_for_addition_and_aia_of_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.CT600ComputationforAdditionandAIAamountoftradinganddormantperiod();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of addition and aia amount for trading and dormant period")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_addition_and_aia_amount_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforAdditionandAIAamountfortradinganddormantperiod();
	}



}





