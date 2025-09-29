package com.Capium.StepDefination;

import java.io.IOException;

import com.Capium.Actions.TradingandDormantAtions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TradingandDormantStepdefination {
	TradingandDormantAtions TradingandDormant= new TradingandDormantAtions();
	
	@Given("Click on Tax Return and Verify Tax Return for trading and dormant period")
	public void click_on_tax_return_and_verify_tax_return_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.Tax_ReturnoftradingandDormantperiod();
	}

	@Given("Search a client and verify for trading and dormant period")
	public void search_a_client_and_verify_for_trading_and_dormant_period() throws InterruptedException {
		TradingandDormant.SearchTextfieldfortradinganddormant("vijith");
	}

	@Given("Select particular client for trading and dormant period")
	public void select_particular_client_for_trading_and_dormant_period() {
		TradingandDormant.Clientfortradinganddormant("vijith");
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
	
	@Then("Click on first year allowance at {int} percent for trading")
	public void click_on_first_year_allowance_at_percent_for_trading(Integer int1) throws InterruptedException {
		TradingandDormant.firstYearAllowanceAtHundredPercentfortrading();
	}

	@Then("Enter  Additions for trading")
	public void enter_additions_for_trading() throws InterruptedException {
		TradingandDormant.Additionsfortrading();
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
	@Given("Select asset category as Electric vehicle charge points for trading and dormant")
	public void select_asset_category_as_electric_vehicle_charge_points_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryElectricVehicleChargepointsfortradingandormant();
	}
	
	@Given("Click on first year allowance at {int} percent for trading and dormant")
	public void click_on_first_year_allowance_at_percent_for_trading_and_dormant(Integer int1) throws InterruptedException {
		TradingandDormant.firstYearAllowanceAtHundredPercentfortradinganddormant();
	}
	
	@Given("Click on Assert Summary for electric vehicle charge points for trading")
	public void click_on_assert_summary_for_electric_vehicle_charge_points_for_trading() {
		TradingandDormant.AssertSummaryforElectricVehicleChargePointsfortrading();
	}
	
	@Given("Click and Verify CT600 Computation for electric vehicle charge points for trading")
	public void click_and_verify_ct600_computation_for_electric_vehicle_charge_points_for_trading() throws InterruptedException {
		TradingandDormant.CT600ComputationforElectricVehicleChargePointsfortrading();
	}
	@Given("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_electric_vehicle_charge_points_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformfortradinganddormant();	
		
	}
	
	@Given("Select Asset acquisition date of Dormant and trading period")
	public void select_asset_acquisition_date_of_dormant_and_trading_period() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiod();
	}

	
	@Given("Select Asset Disposed Date for trading")
	public void select_asset_disposed_date_for_trading() {
		TradingandDormant.AssetDisposedDatefortrading();
	}

	@Given("Enter disposal amount for trading")
	public void enter_disposal_date_for_trading() {
		TradingandDormant.DisposalAmountfortrading();
	}

	@Given("Click on BusinessclosedCheckbox for trading")
	public void click_on_businessclosed_checkbox_for_trading() {
		TradingandDormant.BusinessClosedCheckboxfortrading();
	}

	@Given("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points for trading")
	public void click_on_assert_summary_addition_and_disposal_with_business_closed_for_electric_charge_vehicle_points_for_trading() {
		TradingandDormant.AssertSummaryadditionalanddisposalwithbusinessclosedforElectricVehicleChargePointsfortrading();
	}

	@Given("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points for trading")
	public void click_and_verify_ct600_computation_addition_and_disposed_with_business_closed_and_electric_charge_vehicle_points_for_trading() throws InterruptedException {
		TradingandDormant.CT600ComputationadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints();
	}
	@Given("Click on Capital allowances and Balancing charges in main for electric vehicle charge points for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_electric_vehicle_charge_points_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormant();
	}
	
	@Given("Click on No Claim Checkbox for trading")
	public void click_on_no_claim_checkbox_for_trading() throws InterruptedException {
		TradingandDormant.Noclaimcheckboxfortrading();
	}

	@Given("Click on Assert Summary for no claim electric charge vehicle points for trading")
	public void click_on_assert_summary_for_no_claim_electric_charge_vehicle_points_for_trading() {
		TradingandDormant.AssertSummaryfornoclaimelectricchargevehiclepointsfortrading();
	}

	@Given("Click and Verify CT600 Computation for no claim electric charge vehicle points for trading")
	public void click_and_verify_ct600_computation_for_no_claim_electric_charge_vehicle_points_for_trading() throws InterruptedException {
		TradingandDormant.CT600Computationfornoclaimelectricchargevehiclepointsfortrading();
	}

	@Given("Click on Capital allowances and Balancing charges in mainform for no claim for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_mainform_for_no_claim_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformfornoclaimtradinganddormant();
	}

	@Given("Select asset category as Enterprise zone for trading and dormant")
	public void select_asset_category_as_enterprise_zone_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsEnterpisezonefortradinganddormant();
	}

	@Given("Click on Capital allowances and Balancing charges in main for enterprise zone for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformForEnterpriseZone();
	}

	@Given("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormantforenterpirsezone();
	}

	@Given("Click on Capital allowances and Balancing charges in main for enterprise zone for trading for mainform3")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone_for_trading_for_mainform3() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformfornoclaimtradinganddormantforenterpisezone();
	}

	@Given("Select asset category as Zero emissions goods vehicle for trading and dormant")
	public void select_asset_category_as_zero_emissions_goods_vehicle_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsZeroemissionsgoodsvehiclefortrading();
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle  for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformForZeroemissionsGoodsvehiclefortrading();
	}



	@Given("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormantforzeroemmissionsgoodsvehicle();
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions goods vehicle for trading for mainform3")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle_for_trading_for_mainform3() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform3fornoclaimtradinganddormantforzeroemisisonsgoodsvehicle();
	}
	@Given("Select asset category as Zero emissions Cars for trading and dormant")
	public void select_asset_category_as_zero_emissions_cars_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsZeroemissionsCarsfortrading();
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions cars  for trading")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_cars_for_trading() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainformForZeroemissionsCarsfortrading();
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emissions cars for trading for mainform2")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_cars_for_trading_for_mainform2() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform2fortradinganddormantforzeroemmissionsforcars();
	}

	@Given("Click on Capital allowances and Balancing charges in main for zero emission cars for trading for mainform3")
	public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emission_cars_for_trading_for_mainform3() throws InterruptedException {
		TradingandDormant.capitalallowancesandBalancingchargesInmainform3fornoclaimtradinganddormantforzeroemisisonsCars();
	}
	@Given("Select Asset acquisition date of Dormant and trading period for electric charge and vehicles")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_electric_charge_and_vehicles() throws InterruptedException {
		TradingandDormant.AssetacquisitiondateoftradingandDormantperiodforelectricchargevehiclechargepoints();
	}
	@Given("Select asset category as shortlife asset for trading and dormant")
	public void select_asset_category_as_shortlife_asset_for_trading_and_dormant() throws InterruptedException {
		TradingandDormant.SelectAssetCategoryAsShortlifeassetfortrading();
	}

	@Given("Select Asset acquisition date of Dormant and trading period for shortlifeasset")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_shortlifeasset() throws InterruptedException {
		TradingandDormant.Assetacquisitiondateforshortlifeasset();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_dormant_and_trading_period() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforshortlifeassetoftrading();
	}

	@Given("Click on Assert Summary for shortlifeasset of additions")
	public void click_on_assert_summary_for_shortlifeasset_of_additions() {
		TradingandDormant.AssertSummaryforshortlifeassetofadditions();
	}

	@Given("Click and Verify CT600 Computation for shortlifeasset of additions")
	public void click_and_verify_ct600_computation_for_shortlifeasset_of_additions() throws InterruptedException {
		TradingandDormant.CT600Computationforshortlifeassetofadditions();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  of Dormant and trading period of additions")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_dormant_and_trading_period_of_additions() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforshortlifeassetoftrading();
	}

	@Given("Click on Claim small pool allowance of trading and dormant")
	public void click_on_claim_small_pool_allowance_of_trading_and_dormant() throws InterruptedException {
		TradingandDormant.ClaimSmallpoolAllowancheckboxfortrading();
	}

	@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition for trading")
	public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_addition_for_trading() {
		TradingandDormant.AssertSummaryforClaimsmallPOOlAllowanceforadditionsofshortlifeasset();
	}

	@Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition for trading")
	public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_addition_for_trading() throws InterruptedException {
		TradingandDormant. CT600ComputationforClaimsmallPOOlAllowancewithadditionsoftrading();
	}

	@Given("Click on Enhanced Expenditure main form for claimsmall pool allowance of shortlife asset")
	public void click_on_enhanced_expenditure_main_form_for_claimsmall_pool_allowance_of_shortlife_asset() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforClaimsmallpoolallowancefortrading();
	}
	@Given("Click on Assert Summary addition for business closed checkbox for trading")
	public void click_on_assert_summary_addition_for_business_closed_checkbox_for_trading() {
		TradingandDormant.AssertSummaryofbusinessclosedchcekboxfortrading();
	}
	@Given("Click and Verify CT600 Computation for business closed checkbox for trading")
	public void click_and_verify_ct600_computation_for_business_closed_checkbox_for_trading() throws InterruptedException {
		TradingandDormant.CT600computationofbusinessclosedcheckboxfortradingandadditions();
	}
	@Given("Click on Enhanced Expenditure mainform for business closed checkbox for trading")
	public void click_on_enhanced_expenditure_mainform_for_business_closed_checkbox_for_trading() throws InterruptedException {
		TradingandDormant.EnhancedExpenditureInmainFormforbusinessclosedcheckboxforadditions();
}
	@Given("Select asset category as othercharges and allowances for trading and dormant")
	public void select_asset_category_as_othercharges_and_allowances_for_trading_and_dormant() {
		TradingandDormant.SelectAssstcategoryasotherchargesandallowancesfortrading();
	}

	@Given("Select Asset acquisition date of Dormant and trading period for other charges and allowances")
	public void select_asset_acquisition_date_of_dormant_and_trading_period_for_other_charges_and_allowances() throws InterruptedException {
		TradingandDormant.Assetacquisitiondateforotherchargesandallowancesfortrading();
	}

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

	








