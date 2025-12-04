package com.Capium.StepDefination;

import com.Capium.Actions.Import_Export_PermissionsActions;
import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Import_Export_PermissionStepDefination {
	Import_Export_PermissionsActions importexportpermissions= new Import_Export_PermissionsActions();
	@Given("Click on ManageDashBoard")
	public void click_on_manage_dash_board() throws InterruptedException {
	    importexportpermissions.ManageDashBoard();
	    Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on ManageDashBoard");
		   StepTracker.setCurrentStep("Click on ManageDashBoard");
		   Log.info("Click on ManageDashBoard");
	}

	@When("Click on  Permissions")
	public void click_on_permissions() throws InterruptedException {
	   importexportpermissions.Permissions();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  Permissions");
	   StepTracker.setCurrentStep("Click on  Permissions");
	   Log.info("Click on  Permissions");
	}

	@When("Click on Tax Return arrow")
	public void click_on_tax_return_arrow() throws InterruptedException {
	 importexportpermissions.taxreturn_Arrow();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return arrow");
	   StepTracker.setCurrentStep("Click on Tax Return arrow");
	   Log.info("Click on Tax Return arrow");
	}
	@When("Click on  Quickentry arrow")
	public void click_on_quickentry_arrow() throws InterruptedException {
		importexportpermissions.Quickentry_Arrow();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  Quickentry arrow");
		   StepTracker.setCurrentStep("Click on  Quickentry arrow");
		   Log.info("Click on  Quickentry arrow");
	}
	@When("Click on Calculator arrow")
	public void click_on_calculator_arrow() throws InterruptedException {
	   importexportpermissions.Calculator_Arrow();
	   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Calculator arrow");
	   StepTracker.setCurrentStep("Click on Calculator arrow");
	   Log.info("Click on Calculator arrow");
	}
	@When("Click on  Attachments arrow")
	public void click_on_attachments_arrow() throws InterruptedException {
		  importexportpermissions.attachment_Arrow();
		  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  Attachments arrow");
		   StepTracker.setCurrentStep("Click on  Attachments arrow");
		   Log.info("Click on  Attachments arrow");
	}
	@When("Click on  Reports arrow")
	public void click_on_reports_arrow() throws InterruptedException {
		importexportpermissions.Reports_Arroww();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  Reports arrow");
		   StepTracker.setCurrentStep("Click on  Reports arrow");
		   Log.info("Click on  Reports arrow");
	}
	@When("Click on  managee")
	public void click_on_managee() throws InterruptedException {
		importexportpermissions.Manage_Arrow(); 
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  managee");
		   StepTracker.setCurrentStep("Click on  managee");
		   Log.info("Click on  managee");
	}
	@When("Click on  CalculatorArrow")
	public void click_on_calculator_arrow1() throws InterruptedException {
		importexportpermissions.CalculatorArroww();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  CalculatorArrow");
		   StepTracker.setCurrentStep("Click on  CalculatorArrow");
		   Log.info("Click on  CalculatorArrow");
	}

  @When("Click on  Reportss arrow")
   public void click_on_reportss_arrow() throws InterruptedException {
	importexportpermissions.Reportss_arrow();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  Reportss arrow");
	   StepTracker.setCurrentStep("Click on  Reportss arrow");
	   Log.info("Click on  Reportss arrow");
}

  @When("Click on  Manage_arrow")
  public void click_on_manage_arrow() throws InterruptedException {
	  importexportpermissions.Manage_Arrow();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on  Manage_arrow");
	   StepTracker.setCurrentStep("Click on  Manage_arrow");
	   Log.info("Click on  Manage_arrow");
  }
  @Then("Click on Search textfield and Enter the permission")
  public void click_on_search_textfield_and_enter_the_permission() throws InterruptedException {
	  importexportpermissions.verifySearchtextfield();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Search textfield and Enter the permission");
	   StepTracker.setCurrentStep("Click on Search textfield and Enter the permission");
	   Log.info("Click on Search textfield and Enter the permission");
  }
  @Then("give permission access as view for managerAccess in QuickEntry")
  public void give_permission_access_as_view_for_manager_access_in_quick_entry() throws InterruptedException {
	  importexportpermissions.View_Access();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "give permission access as view for managerAccess in QuickEntry");
	   StepTracker.setCurrentStep("give permission access as view for managerAccess in QuickEntry");
	   Log.info("give permission access as view for managerAccess in QuickEntry");
  }

  @Then("Click on SaveButtton")
  public void click_on_save_buttton() throws InterruptedException {
	  importexportpermissions.SaveButton();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on SaveButtton");
	   StepTracker.setCurrentStep("Click on SaveButtton");
	   Log.info("Click on SaveButtton");
  }
  @Then("Click on SaveAndExitButton")
  public void click_on_save_and_exit_button() throws InterruptedException {
	  importexportpermissions.SaveAndExitBUtton();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on SaveAndExitButton");
	   StepTracker.setCurrentStep("Click on SaveAndExitButton");
	   Log.info("Click on SaveAndExitButton");
  }
  @Then("Click on CancelChangesButton")
  public void click_on_cancel_changes_button() throws InterruptedException {
	  importexportpermissions.CancelChangesButton();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on CancelChangesButton");
	   StepTracker.setCurrentStep("Click on CancelChangesButton");
	   Log.info("Click on CancelChangesButton");
  }
  @Then("Click on import of manage screen")
  public void click_on_import_of_manage_screen() throws InterruptedException {
	  importexportpermissions.ClickOnImportOfManageScreen();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on import of manage screen");
	   StepTracker.setCurrentStep("Click on import of manage screen");
	   Log.info("Click on import of manage screen");
  }

  @Then("Click on clients radiobutton of import")
  public void click_on_clients_radiobutton_of_import() throws InterruptedException {
	  importexportpermissions.ClickClientRadioButtonInImport();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
  }

  @Then("Click on Next of import")
  public void click_on_next_of_import() throws Exception {
	  importexportpermissions.ClickNextofImport();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Next of import");
	   StepTracker.setCurrentStep("Click on Next of import");
	   Log.info("Click on Next of import");
	 // importexportpermissions.uploadFileWithRobot();
  }

//  @Given("Click on Browse of import")
//  public void click_on_browse_of_import() throws Exception {
//	  importexportpermissions.uploadFileWithRobot();
//	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Browse of import");
//	   StepTracker.setCurrentStep("Click on Browse of import");
//	   Log.info("Click on Browse of import");
//  }
  
  @Given("Click on Browse of import")
  public void click_on_next_button_after_browse() throws InterruptedException {
	  importexportpermissions.ClickOnNextButtonafterbrowse();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Browse of import");
	   StepTracker.setCurrentStep("Click on Browse of import");
	   Log.info("Click on Browse of import");
  }

  @Then("Click on save and Next of import")
  public void click_on_save_and_next_of_import() throws InterruptedException {
	  importexportpermissions.ClickOnSaveAndNextOfImport();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on save and Next of import");
	   StepTracker.setCurrentStep("Click on save and Next of import");
	   Log.info("Click on save and Next of import");
  }
  
  @Given("Click on Emport of manage screen")
  public void click_on_emport_of_manage_screen() throws InterruptedException {
	  importexportpermissions.ClickOnExportOfManageScreen();
	  Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Emport of manage screen");
	   StepTracker.setCurrentStep("Click on Emport of manage screen");
	   Log.info("Click on Emport of manage screen");
  }


@Given("Click on Export of manage screen")
public void click_on_export_of_manage_screen() throws InterruptedException {
	 importexportpermissions.ClickOnExportOfManageScreen();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Export of manage screen");
	   StepTracker.setCurrentStep("Click on Export of manage screen");
	   Log.info("Click on Export of manage screen");
}

@Given("Click on All dropdown from Export")
public void click_on_all_dropdown_from_export() {
	 importexportpermissions.ClickOnAllDropdownFromExport();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on All dropdown from Export");
	   StepTracker.setCurrentStep("Click on All dropdown from Export");
	   Log.info("Click on All dropdown from Export");
}

@Given("Select This week from dropdown from export")
public void select_this_week_from_dropdown_from_export() {
	 importexportpermissions.ClickOnThisWeekDropdownFromExport();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select This week from dropdown from export");
	   StepTracker.setCurrentStep("Select This week from dropdown from export");
	   Log.info("Select This week from dropdown from export");
}

@Given("Click on Excel of Export screen")
public void click_on_excel_of_export_screen() throws InterruptedException {
	 importexportpermissions.clickExcelInExport();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Excel of Export screen");
	   StepTracker.setCurrentStep("Click on Excel of Export screen");
	   Log.info("Click on Excel of Export screen");
}

@Given("Click on export button of Export Screen")
public void click_on_export_button_of_export_screen() throws InterruptedException {
	 importexportpermissions.exportForexcelInexport();
	 Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on export button of Export Screen");
	   StepTracker.setCurrentStep("Click on export button of Export Screen");
	   Log.info("Click on export button of Export Screen");
}
@Given("Select All  from dropdown from export")
public void select_all_from_dropdown_from_export() {
	importexportpermissions.ClickOnAllDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select All  from dropdown from export");
	   StepTracker.setCurrentStep("Select All  from dropdown from export");
	   Log.info("Select All  from dropdown from export");
}

@Given("Select Last week from dropdown from export")
public void select_last_week_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastWeekDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Last week from dropdown from export");
	   StepTracker.setCurrentStep("Select Last week from dropdown from export");
	   Log.info("Select Last week from dropdown from export");
}

@Given("Select This month from dropdown from export")
public void select_this_month_from_dropdown_from_export() {
	importexportpermissions.ClickOnThisMonthDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select This month from dropdown from export");
	   StepTracker.setCurrentStep("Select This month from dropdown from export");
	   Log.info("Select This month from dropdown from export");
}

@Given("Select Last month from dropdown from export")
public void select_last_month_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastMonthDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Select Last month from dropdown from export");
	   StepTracker.setCurrentStep("Select Last month from dropdown from export");
	   Log.info("Select Last month from dropdown from export");
}

@Given("Select This quarter from dropdown from export")
public void select_this_quarter_from_dropdown_from_export() {
	importexportpermissions.ClickOnThisQuarterDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}

@Given("Select Last quarter from dropdown from export")
public void select_last_quarter_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastQuarterDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}

@Given("Select This year from dropdown from export")
public void select_this_year_from_dropdown_from_export() {
	importexportpermissions.ClickOnThisYearDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}

@Given("Select Last year from dropdown from export")
public void select_last_year_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastYearDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}

@Given("Select custom from dropdown from export")
public void select_custom_from_dropdown_from_export() {
	importexportpermissions.ClickOnCustomDropdownFromExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}
@Given("Click on CSV of Export screen")
public void click_on_csv_of_export_screen() throws InterruptedException {
	importexportpermissions.exportForCSVInexport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}
@Given("Click on PDF of Export screen")
public void click_on_pdf_of_export_screen() throws InterruptedException {
	importexportpermissions.exportForPDFInexport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}
@Given("Click on USERS radiobutton of import")
public void click_on_users_radiobutton_of_import() throws InterruptedException {
	importexportpermissions.ClickUsersRadioButtonInImport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}
@Given("Click on clients radiobutton of export")
public void click_on_clients_radiobutton_of_export() {
	importexportpermissions.ClientsRadiobuttoninExport();
	Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Click on Tax Return and Verify Tax Return");
	   StepTracker.setCurrentStep("Click on Tax Return and Verify Tax Return");
	   Log.info("Click on Tax Return and Verify Tax Return");
}


}

