package com.Capium.StepDefination;

import java.io.IOException;
import java.sql.SQLException;

import com.Capium.Actions.CapitalAllowancesActions;
import com.Capium.Actions.Import_Export_PermissionsActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capital_AllowancesStepDefination {
	CapitalAllowancesActions capitalallowances= new CapitalAllowancesActions();

	@Given("Click on Tax Return and Verify Tax Return")
	public void click_on_tax_return_and_verify_tax_return() throws InterruptedException {
		capitalallowances.Tax_Return();
		
		}
	
	@Given("Search a client and verify")
	public void search_a_client_and_verify() throws InterruptedException {
		capitalallowances.SearchTextfield();
	}

	@Given("Select particular client")
	public void select_particular_client() {
		capitalallowances.Client();
	}

	@Given("Select CT600 Return")
	public void select_ct600_return() {
		capitalallowances.CT600_Return();
	}

	@Given("Click on Capital Allowances calculator screen")
	public void click_on_capital_allowances_calculator_screen() throws InterruptedException {
		capitalallowances.Capital_AllowancesCalculator();
	}
	@Given("Click on Add new asset")
	public void click_on_add_new_asset() throws InterruptedException {
		capitalallowances.AddnewAsset();
	}

	@Given("Enter Assert Description")
	public void enter_assert_description() throws InterruptedException {
		capitalallowances.Enter_description();
	}

	@Given("Select asset category")
	public void select_asset_category() throws InterruptedException {
		capitalallowances.SelectAssetCategory();
	}

	@Given("Select Main pool Asset")
	public void select_main_pool_asset() {
		capitalallowances.SelectMainpool();
	}

	@Given("Select Asset acquisition date")
	public void select_asset_acquisition_date() throws InterruptedException {
		capitalallowances.Assetacquisitiondate();
	}

	@Given("Enter WDV b\\/fwd amount")
	public void enter_wdv_b_fwd_amount() throws InterruptedException {
		capitalallowances.WDVbroughtFwd();
	}

	@Given("Click on Assert Summary")
	public void click_on_assert_summary() throws InterruptedException {
	   capitalallowances.AssertSummary();
	}
	@Given("Click and Verify CT600 Computation")
	public void click_and_verify_ct600_computation() throws InterruptedException {
	   capitalallowances.CT600Computation();
	}
	@Given("Click on MainFormForCapitalAllowance")
	public void click_on_main_form_for_capital_allowance() {
	  capitalallowances.MainFormForCapitalAllowance();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value() throws InterruptedException {
	   capitalallowances.EnhancedExpenditureInmainForm();
	}
	@Given("Click on QuickEntry")
	public void click_on_quick_entry() throws InterruptedException {
		capitalallowances.QuicKEntryInMainForm();
	}
	@Given("Delete Assert")
	public void delete_assert() throws InterruptedException {
		capitalallowances.mousehoverdelete();
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
	}
	@Given("Enter  Additions")
	public void enter_additions() throws InterruptedException {
		capitalallowances.Additions();
	}
	@Given("Enter AIA Amount")
	public void enter_aia_amount() throws InterruptedException {
		capitalallowances.AIAamount();
	}
	@Given("Enter  Restriction amount")
	public void enter_restriction_amount() {
	   capitalallowances.RestrictionAmount();
	}
	@Given("Select Asset Disposed Date")
	public void select_asset_disposed_date() {
	 capitalallowances.AssetDisposedDate();
	}

	@Given("Enter disposal date")
	public void enter_disposal_date() {
	  capitalallowances.DisposalAmount();
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
	}

	@Given("Click and Verify CT600 Computation1")
	public void click_and_verify_ct600_computation1() throws InterruptedException {
	   capitalallowances.CT600Computation1();
	}

	@Given("Click on Assert Summary2")
	public void click_on_assert_summary2() {
		capitalallowances.AssertSummary2();
	}

	@Given("Click and Verify CT600 Computation2")
	public void click_and_verify_ct600_computation2() throws InterruptedException {
		capitalallowances.CT600Computation2();
	}
	@Given("Select asset is a car category")
	public void select_asset_is_a_car_category() throws InterruptedException {
	    capitalallowances.AssetIsaCarBetween75to130gKm();
	}
	
	@Given("Select Asset category1")
	public void select_asset_category1() {
	    capitalallowances.AssertSummary1();
	}
	@Given("Select Othercharges and allowances")
	public void select_othercharges_and_allowances() {
	  capitalallowances.OtherChargesAndAllowances();
	}
	@Given("Select Designated Enhanced allowance")
	public void select_designated_enhanced_allowance() throws InterruptedException {
	 capitalallowances.DesignatedEnhancedAllowance();
	}
	@Given("Select First Year Allowance at Hundred Percent Checkbox")
	public void select_first_year_allowance_at_hundred_percent_checkbox() throws InterruptedException {
	   capitalallowances.firstYearAllowanceAtHundredPercent();
	}
	@Given("Click on No Claim checkbox")
	public void click_on_no_claim_checkbox() throws InterruptedException {
	   capitalallowances.NoClaimCheckbox();
	}
	@Given("Enter larger disposed amount")
	public void enter_larger_disposed_amount() {
		capitalallowances.LargerDisposalAmount();

	}
	@Given("Click on Assert Summary for wdv b\\/fwd and addition amount")
	public void click_on_assert_summary_for_wdv_b_fwd_and_addition_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandadditionamount();
	}

	@Given("Click and Verify CT600 Computation for wdv fwd and addition amount")
	public void click_and_verify_ct600_computation_for_wdv_fwd_and_addition_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandadditionamount();
	}

	@Given("Click on Assert Summary for wdv b\\/fwd amount adn disposed amount")
	public void click_on_assert_summary_for_wdv_b_fwd_amount_adn_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandDisposedamount();
	}

	@Given("Click and Verify CT600 Computation for wdv b\\/fwd amount adn disposed amount")
	public void click_and_verify_ct600_computation_for_wdv_b_fwd_amount_adn_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforWDVanddisposedamount();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv b\\/fwd amount adn disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_wdv_b_fwd_amount_adn_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforWDVanddisposedamount();
	}

	@Given("Click on Assert Summary wdv b\\/fwd and larger disposed amount")
	public void click_on_assert_summary_wdv_b_fwd_and_larger_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforwdvandlargerDisposedamount();
	}

	@Given("Click and Verify CT600 Computation wdv b\\/fwd and larger disposed amount")
	public void click_and_verify_ct600_computation_wdv_b_fwd_and_larger_disposed_amount() throws InterruptedException {
	  capitalallowances.CT600ComputationforWDVandLargerdisposedamount();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv b\\/fwd and larger disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_wdv_b_fwd_and_larger_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforWDVandLargerdisposedamount();
	}

	@Given("Click on Assert Summary with addition with larger disposed amount")
	public void click_on_assert_summary_with_addition_with_larger_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandlargerDisposedamount();
	}

	@Given("Click and Verify CT600 Computation addition with larger disposed amount")
	public void click_and_verify_ct600_computation_addition_with_larger_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandlargerDisposedamount();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition with larger disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_with_larger_disposed_amount() throws InterruptedException {
		capitalallowances.EnhancedExpenditureInmainFormforAdditionandLargerdisposedamont();
	}

	@Given("Click on Assert Summary addition and disposed amount")
	public void click_on_assert_summary_addition_and_disposed_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandDisposedamount();
	}

	@Given("Click and Verify CT600 Computation addition and disposed amount")
	public void click_and_verify_ct600_computation_addition_and_disposed_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforAdditionanddisposedamount();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and disposed amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_and_disposed_amount() throws InterruptedException {
		capitalallowances.EnhancedExpenditureInmainFormforAdditionanddisposedamont();
	}

	@Given("Click on Assert Summary addition and aia amount")
	public void click_on_assert_summary_addition_and_aia_amount() throws InterruptedException {
		capitalallowances.AssertSummaryforAdditionandAIAamount();
	}

	@Given("Click and Verify CT600 Computation addition and aia amount")
	public void click_and_verify_ct600_computation_addition_and_aia_amount() throws InterruptedException {
		capitalallowances.CT600ComputationforAdditionandAIAamount();
	}

	@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition and aia amount")
	public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_and_aia_amount() throws InterruptedException {
		capitalallowances.EnhancedExpenditureInmainFormforAdditionandAIAamount();
	}

@Given("Click on BusinessclosedCheckbox")
public void click_on_businessclosed_checkbox() {
	capitalallowances.BusinessClosedCheckbox();
}

@Given("Click on MainPoolOfSaveAndExitButton")
public void click_on_main_pool_of_save_and_exit_button() {
    capitalallowances.MainpoolOFSaveAndExitButton();
}
@Given("Click on Assert Summary for wdv b\\/fwd amount and disposed amount")
public void click_on_assert_summary_for_wdv_b_fwd_amount_and_disposed_amount() throws InterruptedException {
   capitalallowances.AssertSummaryforwdvandDisposedamount();
}
@Given("Click and Verify CT600 Computation for wdv b\\/fwd amount and disposed amount")
public void click_and_verify_ct600_computation_for_wdv_b_fwd_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.CT600ComputationforWDVanddisposedamount();
}
@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value  for wdv bfwd amount and disposed amount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_wdv_bfwd_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforwdvanddisposedamont();
}
@Given("Click on Assert Summary wdv bfwd and larger Disposed amount")
public void click_on_assert_summary_wdv_bfwd_and_larger_disposed_amount() throws InterruptedException {
   capitalallowances.AssertSummaryforwdvandlargerDisposedamount();
}

@Given("Click and Verify CT600 Computation wdv bfwd and larger Disposed amount")
public void click_and_verify_ct600_computation_wdv_bfwd_and_larger_disposed_amount() throws InterruptedException {
   capitalallowances.CT600ComputationforWDVandLargerdisposedamount();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value wdv bfwd and larger Disposed amount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_wdv_bfwd_and_larger_disposed_amount() throws InterruptedException {
  capitalallowances.EnhancedExpenditureInmainFormforwdvandLargerdisposedamont();
  
}

@Given("Click on Assert Summary with AdditionAmount with larger Disposed Amount")
public void click_on_assert_summary_with_addition_amount_with_larger_disposed_amount() throws InterruptedException {
	 capitalallowances.AssertSummaryforAdditionandlargerDisposedamount();
}

@Given("Click and Verify CT600 Computation AdditionAmount with larger Disposed Amount")
public void click_and_verify_ct600_computation_addition_amount_with_larger_disposed_amount() throws InterruptedException {
	 capitalallowances.CT600ComputationforAdditionandLargerdisposedamount();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount with largerDisposed Amount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_with_larger_disposed_amount() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforAdditionandLargerdisposedamont();
}

@Given("Click on Assert Summary additionAmount and DisposedAmount")
public void click_on_assert_summary_addition_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.AssertSummaryforAdditionandDisposedamount();
}

@Given("Click and Verify CT600 ComputationAddition and DisposedAmount")
public void click_and_verify_ct600_computation_Addition_and_disposed_amount() throws InterruptedException {
	 capitalallowances.CT600ComputationforAdditionanddisposedamount();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value AdditionAmount and DisposedAmount")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_and_disposed_amount() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforAdditionanddisposedamont();
}
@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value2")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value2() throws InterruptedException {
    capitalallowances.EnhancedExpenditureInmainFormforAdditionandAIAamount();
}

@Given("Click on Assert Summary WDV b\\/fwd amount with no claim")
public void click_on_assert_summary_wdv_b_fwd_amount_with_no_claim() throws InterruptedException {
	capitalallowances.AssertSummaryforwdvWithNoClaim();
}

@Given("Click and Verify CT600 Computation WDV b\\/fwd amount with no claim")
public void click_and_verify_ct600_computation_wdv_b_fwd_amount_with_no_claim() throws InterruptedException {
	capitalallowances.CT600ComputationforAdditionandNOClaims();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value WDV b\\/fwd amount with no claim")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_wdv_b_fwd_amount_with_no_claim() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforAdditionandNOClaim();
}
@Given("Click on Assert Summary addition and disposal with business closed")
public void click_on_assert_summary_addition_and_disposal_with_business_closed() {
	capitalallowances.AssertSummaryforadditionanadDisposedwithBusinessclosed();
}

@Given("Click and Verify CT600 Computation addition and disposed with business closed")
public void click_and_verify_ct600_computation_addition_and_disposed_with_business_closed() throws InterruptedException {
	capitalallowances.CT600ComputationforAdditionanddiposalsBusinessclosed();
}

@Given("Click on CT600 return from computation")
public void click_on_ct600_return_from_computation() throws InterruptedException {
	capitalallowances.CT600ReturnFromComputation();
}

@Given("Click on Claim small pool allowance")
public void click_on_claim_small_pool_allowance() throws InterruptedException {
  capitalallowances.ClaimSmallpoolAllowancheckbox();
}

@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with WDv")
public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_w_dv() {
    capitalallowances.AssertSummaryforClaimsmallPOOlAllowancewithWDv();
}

@Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with WDv")
public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_w_dv() throws InterruptedException {
   capitalallowances.CT600ComputationforClaimsmallPOOlAllowancewithWDv();
}

@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition")
public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_addition() {
   capitalallowances.AssertSummaryforClaimsmallPOOlAllowancewithAddition();
}

 @Given("Click and Verify CT600 Computation  Of ClaimsmallPOOlAllowance with addition")
public void click_and_verify_ct600_computation_of_claimsmall_po_ol_allowance_with_addition() throws InterruptedException {
    capitalallowances.CT600ComputationforClaimsmallPOOlAllowancewithAddition();
}

@Given("Click on Assert Summary Of ClaimsmallPOOlAllowance with addition and aia")
public void click_on_assert_summary_of_claimsmall_po_ol_allowance_with_addition_and_aia() {
    capitalallowances.AssertSummaryforClaimsmallPOOlAllowancewithAdditionandAIA();
}

@Given("Select structure and buildings Asset")
public void select_structure_and_buildings_asset() throws InterruptedException {
	  capitalallowances.structuresAndBuildingsAsset();
}
@Given("Select Asset acquisition date of previous year")
public void select_asset_acquisition_date_of_previous_year() throws InterruptedException {
	 capitalallowances.Assetacquisitiondateforpreviousyear();
}

@Given("Click on Assert Summary for structure and buildings")
public void click_on_assert_summary_for_structure_and_buildings() {
	 capitalallowances.AssertSummaryforStructureandBuildings();
}

@Given("Click and Verify CT600 Computation for structure and buildings")
public void click_and_verify_ct600_computation_for_structure_and_buildings() throws InterruptedException {
	 capitalallowances.CT600ComputationForstructureandbuildings();
}

@Given("Click on Enhanced Expenditure and Verify structure and buildings value")
public void click_on_enhanced_expenditure_and_verify_structure_and_buildings_value() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormforstructureandbuildings();
}
@Given("Click on Assert Summary for additions of structure and buildings")
public void click_on_assert_summary_for_additions_of_structure_and_buildings() {
	capitalallowances.AssertSummaryforadditionsofStructureandBuildings();
}
@Given("Click and Verify CT600 Computations for additions of structure and buildings")
public void click_and_verify_ct600_computations_for_additions_of_structure_and_buildings() throws InterruptedException {
	capitalallowances.CT600ComputationForadditionsofstructureandbuildings();
}
@Given("Select asset category for structure and buildings")
public void select_asset_category_for_structure_and_buildings() throws InterruptedException {
	capitalallowances.SelectAssetCategoryforstructureandbuildings();
}
@Given("Click on Assert Summary for wdv b\\/fwd and addition amount of structure and buildings")
public void click_on_assert_summary_for_wdv_b_fwd_and_addition_amount_of_structure_and_buildings() {
	capitalallowances.AssertSummaryforWDVandadditionofstructureandbuildings();
}

@Given("Click and Verify CT600 Computation for wdv fwd and addition amount of structure and buildings")
public void click_and_verify_ct600_computation_for_wdv_fwd_and_addition_amount_of_structure_and_buildings() throws InterruptedException {
	capitalallowances.CT600ComputationforWDVandAdditionofstructureandbuildings();
}
@Given("Click on Assert Summary for structure and buildings with addition and restriction amount")
public void click_on_assert_summary_for_structure_and_buildings_with_addition_and_restriction_amount() {
	capitalallowances.AssertSummaryforRestrictionandadditionofstructureandbuildings();
}

@Given("Click and Verify CT600 Computation for structure and buildings with addition and restriction amount")
public void click_and_verify_ct600_computation_for_structure_and_buildings_with_addition_and_restriction_amount() throws InterruptedException {
	capitalallowances.CT600ComputationforRestrictionandAdditionofstructureandbuildings();
}
@Given("Click on Assert Summary for structure and buildings with WDV and restriction")
public void click_on_assert_summary_for_structure_and_buildings_with_wdv_and_restriction() {
	capitalallowances.AssertSummaryforRestrictionandWDVofstructureandbuildings();
}

@Given("Click and Verify CT600 Computation for structure and buildings with WDV and restriction")
public void click_and_verify_ct600_computation_for_structure_and_buildings_with_wdv_and_restriction() throws InterruptedException {
	capitalallowances.CT600ComputationforRestrictionandWDVofstructureandbuildings();

}
@Given("Select asset category as other charges and allowances")
public void select_asset_category_as_other_charges_and_allowances() throws InterruptedException {
	capitalallowances.SelectAssetCategoryOtherchargesandallowances();
}

@Given("Click on first year allowance at {int} percent")
public void click_on_first_year_allowance_at_percent(Integer int1) throws InterruptedException {
	capitalallowances.firstYearAllowanceAtHundredPercent();
}

@Given("Click on Assert Summary for other charges and allowances")
public void click_on_assert_summary_for_other_charges_and_allowances() {
	capitalallowances.AssertSummaryforOtherchargesandallowances();
}

@Given("Click and Verify CT600 Computation for other charges and allowances")
public void click_and_verify_ct600_computation_for_other_charges_and_allowances() throws InterruptedException {
	capitalallowances.CT600ComputationforOtherChargesandallowances();
}

@Given("Click on Enhanced Expenditure and verify other charges and allowances")
public void click_on_enhanced_expenditure_and_verify_other_charges_and_allowances() throws InterruptedException {
	capitalallowances.EnhancedExpenditureForOtherChargesandallowances();
}
@Given("Click on Assert Summary addition and disposal with business closed for electric charge vehicle points")
public void click_on_assert_summary_addition_and_disposal_with_business_closed_for_electric_charge_vehicle_points() {
	capitalallowances.AssertSummaryadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints();
}

@Given("Click and Verify CT600 Computation addition and disposed with business closed and electric charge vehicle points")
public void click_and_verify_ct600_computation_addition_and_disposed_with_business_closed_and_electric_charge_vehicle_points() throws InterruptedException {
	capitalallowances.CT600ComputationadditionalanddisposalwithbusinessclosedforElectricVehicleChargePoints();
	
}
@Given("Click on Assert Summary for no claim electric charge vehicle points")
public void click_on_assert_summary_for_no_claim_electric_charge_vehicle_points() {
	capitalallowances.AssertSummaryfornoclaimelectricchargevehiclepoints();
}

@Given("Click and Verify CT600 Computation for no claim electric charge vehicle points")
public void click_and_verify_ct600_computation_for_no_claim_electric_charge_vehicle_points() throws InterruptedException {
	capitalallowances.CT600Computationfornoclaimelectricchargevehiclepoints();
}
@Given("Click on No Claim Checkbox")
public void click_on_no_claim_checkbox1() throws InterruptedException {
	capitalallowances.Noclaimcheckbox1();
}

@Given("Click on Capital allowances and Balancing charges in mainform for no claim")
public void click_on_capital_allowances_and_balancing_charges_in_mainform_for_no_claim() throws InterruptedException {
    capitalallowances.capitalallowancesandBalancingchargesInmainformfornoclaim();
}

@Given("Select asset category as Enterprise zone")
public void select_asset_category_as_enterprise_zone() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsEnterpisezone();
}

@Given("Click on Capital allowances and Balancing charges in main for enterprise zone")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_enterprise_zone() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainformForEnterpriseZone();
}

@Given("Select asset category as Zero emissions goods vehicle")
public void select_asset_category_as_zero_emissions_goods_vehicle() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsZeroemissionsgoodsvehicle();
}

@Given("Click on Capital allowances and Balancing charges in main for Zero emissions goods vehicle")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_goods_vehicle() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainformForZeroemissionsGoodsvehicle();
}

@Given("Select asset category as Zero emission cars")
public void select_asset_category_as_zero_emission_cars() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsZeroemissionsCars();
}

@Given("Click on Capital allowances and Balancing charges in main for Zero emissions cars")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_zero_emissions_cars() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainformForZeroemissionsCars();
}

@Given("Select asset category as Designated enhnaced allowance")
public void select_asset_category_as_designated_enhnaced_allowance() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsDesignatedenhnacedallowance();
}
@Given("Select Asset category as short life asset")
public void select_asset_category_as_short_life_asset() throws InterruptedException {
	capitalallowances.SelectAssetCategoryAsShortlifeasset();
}

@Given("Click on Assert Summary for shortlife asset with wdv amount")
public void click_on_assert_summary_for_shortlife_asset_with_wdv_amount() {
	capitalallowances.AssertSummaryforshortlifeassetofwdvamount();
    }

@Given("Click and Verify CT600 Computation for shortlife asset with wdv amount")
public void click_and_verify_ct600_computation_for_shortlife_asset_with_wdv_amount() throws InterruptedException {
	capitalallowances.CT600Computationforshortlifeassetofwdvamount();
}
@Given("Click on Assert Summary for shortlife asset with addition amount")
public void click_on_assert_summary_for_shortlife_asset_with_addition_amount() {
	capitalallowances.AssertSummaryforshortlifeassetofadditionamount();
}

@Given("Click and Verify CT600 Computation for shortlife asset with addition amount")
public void click_and_verify_ct600_computation_for_shortlife_asset_with_addition_amount() throws InterruptedException {
	capitalallowances.CT600Computationforshortlifeassetofadditionamount();
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
}

@Given("Click and Verify CT600 Computation for WDV of specialrate")
public void click_and_verify_ct600_computation_for_wdv_of_specialrate() throws InterruptedException {
	 capitalallowances.CT600ComputationForWDVoFspecialrate();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for WDV of specialrate")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_wdv_of_specialrate() throws InterruptedException {
	 capitalallowances.EnhancedExpenditureInmainFormFORwdvOfSpecialrate();
}
@Given("Click on Assert Summary for additions of special rate")
public void click_on_assert_summary_for_additions_of_special_rate() throws InterruptedException {
	capitalallowances.AssertSummaryForAdditionofSpecialrate();
}

@Given("Click and Verify CT600 Computation for additions of special rate")
public void click_and_verify_ct600_computation_for_additions_of_special_rate() throws InterruptedException {
	capitalallowances.CT600ComputationForAdditionspecialrate();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value for additions of special rate")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_for_additions_of_special_rate() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormFORAdditionOfSpecialrate();

}
@Given("Click on Assert Summary for wdv b\\/fwd and addition amount Of specialratepool")
public void click_on_assert_summary_for_wdv_b_fwd_and_addition_amount_of_specialratepool() throws InterruptedException {
	capitalallowances.AssertSummaryForWDVandAdditionofSpecialrate();
}
@Given("Click and Verify CT600 Computation for wdv fwd and addition amount of specialratepool")
public void click_and_verify_ct600_computation_for_wdv_fwd_and_addition_amount_of_specialratepool() throws InterruptedException {
	capitalallowances.CT600ComputationForWDVandAdditionspecialrate();
}
@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value of specialratepool")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_of_specialratepool() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormFORWDVandAdditionOfSpecialrate();
}

@Given("Select designated enhanced allowance")
public void select_designated_enhanced_allowance1() throws InterruptedException {
	capitalallowances.DesignatedEnhancedAllowance();
}

@Given("Select asset category as Electric vehicle charge points")
public void select_asset_category_as_electric_vehicle_charge_points() throws InterruptedException {
	capitalallowances.SelectAssetCategoryElectricVehicleChargepoints();
}

@Given("Click on Assert Summary for electric vehicle charge points")
public void click_on_assert_summary_for_electric_vehicle_charge_points() {
	capitalallowances.AssertSummaryforElectricVehicleChargePoints();
}

@Given("Click and Verify CT600 Computation for electric vehicle charge points")
public void click_and_verify_ct600_computation_for_electric_vehicle_charge_points() throws InterruptedException {
	capitalallowances.CT600ComputationforElectricVehicleChargePoints();
}

@Given("Click on Capital allowances and Balancing charges in main for electric vehicle charge points")
public void click_on_capital_allowances_and_balancing_charges_in_main_for_electric_vehicle_charge_points() throws InterruptedException {
	capitalallowances.capitalallowancesandBalancingchargesInmainform();
}
@Given("Click on Assert Summary for restriction amount")
public void click_on_assert_summary_for_restriction_amount() {
	capitalallowances.AssertSummaryforrestrictionandadditionamount();
}

@Given("Click and Verify CT600 Computation for restriction amount")
public void click_and_verify_ct600_computation_for_restriction_amount() throws InterruptedException {
	capitalallowances.CT600Computationforrestrictionandadditionamount();
}

@Given("Click on Assert Summary for restriction amount and addition amount for special rate pool")
public void click_on_assert_summary_for_restriction_amount_and_addition_amount_for_special_rate_pool() {
	capitalallowances.AssertSummaryforrestrictionandadditionamountforspecialratepool();
}

@Given("Click and Verify CT600 Computation for restriction amount and addition amount for special rate pool")
public void click_and_verify_ct600_computation_for_restriction_amount_and_addition_amount_for_special_rate_pool() throws InterruptedException {
	capitalallowances.CT600Computationforrestrictionandadditionamountforspecialratepool();
}

@Given("Click on Enhanced Expenditure for special rate pool")
public void click_on_enhanced_expenditure_for_special_rate_pool() throws InterruptedException {
	capitalallowances.EnhancedExpenditureforspecialratepool();
}
@Given("Click on Assert Summary for restriction and wdv with special rate pool")
public void click_on_assert_summary_for_restriction_and_wdv_with_special_rate_pool() {
	capitalallowances.AssertSummaryforrestrictionandWDVamountforspecialratepool();
}

@Given("Click and Verify CT600 Computation for restriction and wdv with special rate pool")
public void click_and_verify_ct600_computation_for_restriction_and_wdv_with_special_rate_pool() throws InterruptedException {
	capitalallowances.CT600ComputationforrestrictionandWDVwithspecialratepool();
}

@Given("Click on Super deduction at ONETHIRTYPERCENT checkbox")
public void click_on_super_deduction_at_onethirtypercent_checkbox() throws InterruptedException {
	capitalallowances.SuperDeductionatOnethirtypercent();
}

@Given("Click on Assert Summary for superdeduction")
public void click_on_assert_summary_for_superdeduction() throws InterruptedException {
	capitalallowances.AssertSummaryforsuperdeduction();
}

@Given("Click and Verify CT600 Computation for superdeduction")
public void click_and_verify_ct600_computation_for_superdeduction() throws InterruptedException {
	capitalallowances.CT600ComputationforSuperdeduction();
}
@Given("Select CT600 Return2")
public void select_ct600_return2() {
	capitalallowances.CT600_Return2();
}
@Given("Select Asset acquisition date for superdeduction")
public void select_asset_acquisition_date_for_superdeduction() throws InterruptedException {
	capitalallowances.Assetacquisitiondateforsuperdeduction();
}
@Given("Select CT600 Return3")
public void select_ct600_return3() throws InterruptedException {
	capitalallowances.CT600_Return3();
}
@Given("Click on Assert Summary for wdv and restriction")
public void click_on_assert_summary_for_wdv_and_restriction() throws InterruptedException {
	capitalallowances.AssertSummaryforwdvandrestrictionamount();
}

@Given("Click and Verify CT600 Computation for wdv and restriction")
public void click_and_verify_ct600_computation_for_wdv_and_restriction() throws InterruptedException {
	capitalallowances.CT600ComputationforWDVandrestrictionamount();
}
@Given("Click on Assert Summary for addition with no claim")
public void click_on_assert_summary_for_addition_with_no_claim() {
	capitalallowances.AssertSummaryforadditionandnoclaim();
}

@Given("Click and Verify CT600 Computation for addition with no claim")
public void click_and_verify_ct600_computation_for_addition_with_no_claim() throws InterruptedException {
	capitalallowances.CT600Computationforadditionandnoclaim();
}


@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value superdeduction")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_superdeduction() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforsuperdeduction();
}
@Given("Click on Assert Summary addition amount with asset is car Between {int}-130g\\/Km")
public void click_on_assert_summary_addition_amount_with_asset_is_car_between_130g_km(Integer int1) throws InterruptedException {
	capitalallowances.AssertSummaryforassetisacar();
}

@Given("Click and Verify CT600 Computation addition amount with asset is car Between {int}-130g\\/Km")
public void click_and_verify_ct600_computation_addition_amount_with_asset_is_car_between_130g_km(Integer int1) throws InterruptedException {
	capitalallowances.CT600Computationforassetisacar();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between {int}-130g\\/Km")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_with_asset_is_car_between_130g_km(Integer int1) throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforassetisacar();
}
@Given("Click on Assert Summary addition amount with asset is car Between 75gkmorlesss")
public void click_on_assert_summary_addition_amount_with_asset_is_car_between_75gkmorlesss() {
	capitalallowances.AssertSummaryforassetisacarfor75g();
}

@Given("Click and Verify CT600 Computation addition amount with asset is car Between 75gkmorlesss")
public void click_and_verify_ct600_computation_addition_amount_with_asset_is_car_between_75gkmorlesss() throws InterruptedException {
	capitalallowances.CT600Computationforassetisacarfor75g();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value addition amount with asset is car Between 75gkmorlesss")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_addition_amount_with_asset_is_car_between_75gkmorlesss() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforassetisacarfor75g();
}
@Given("Select Asset acquisition date for full expensing")
public void select_asset_acquisition_date_for_full_expensing() throws InterruptedException {
	capitalallowances.AssetacquisitiondateforFullexpensing();
}

@Given("Click on Assert Summary for full expensing")
public void click_on_assert_summary_for_full_expensing() throws InterruptedException {
	capitalallowances.AssetacquisitiondateforFullexpensing();
}

@Given("Click and Verify CT600 Computation for full expensing")
public void click_and_verify_ct600_computation_for_full_expensing() throws InterruptedException {
	capitalallowances.CT600Computationforfullexpensing();
}

@Given("Click on Enhanced Expenditure and Verify Machinery and plant Main pool value full expensing")
public void click_on_enhanced_expenditure_and_verify_machinery_and_plant_main_pool_value_full_expensing() throws InterruptedException {
	capitalallowances.EnhancedExpenditureInmainFormforfullexpensing();
}

@Given("Click on kebeb icon")
public void click_on_kebeb_icon() throws InterruptedException {
	capitalallowances.kebabiconforcapitalallowance();
}

@Given("Click on asset wise Details")
public void click_on_asset_wise_details() {
	capitalallowances.AssetwiseDetails();
}

@Given("Click on Pool wise Details")
public void click_on_pool_wise_details() {
	capitalallowances.PoolwiseDetails();
}

@Given("Click on MainPoolOfSaveButton")
public void click_on_main_pool_of_save_button() {
	capitalallowances.MainpoolOFSaveButton();
}
@Given("Click on MainPoolOfCancelchanges")
public void click_on_main_pool_of_cancelchanges() {
	capitalallowances.MainpoolOFCancelchanges();
}


}







