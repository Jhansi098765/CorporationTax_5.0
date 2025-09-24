package com.Capium.StepDefination;

import com.Capium.Actions.Import_Export_PermissionsActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Import_Export_PermissionStepDefination {
	Import_Export_PermissionsActions importexportpermissions= new Import_Export_PermissionsActions();
	@Given("Click on ManageDashBoard")
	public void click_on_manage_dash_board() throws InterruptedException {
	    importexportpermissions.ManageDashBoard();
	}

	@When("Click on  Permissions")
	public void click_on_permissions() throws InterruptedException {
	   importexportpermissions.Permissions();
	}

	@When("Click on Tax Return arrow")
	public void click_on_tax_return_arrow() throws InterruptedException {
	 importexportpermissions.taxreturn_Arrow();
	}
	@When("Click on  Quickentry arrow")
	public void click_on_quickentry_arrow() throws InterruptedException {
		importexportpermissions.Quickentry_Arrow();
	}
	@When("Click on Calculator arrow")
	public void click_on_calculator_arrow() throws InterruptedException {
	   importexportpermissions.Calculator_Arrow();
	}
	@When("Click on  Attachments arrow")
	public void click_on_attachments_arrow() throws InterruptedException {
		  importexportpermissions.attachment_Arrow();
	}
	@When("Click on  Reports arrow")
	public void click_on_reports_arrow() throws InterruptedException {
		importexportpermissions.Reports_Arroww();
	}
	@When("Click on  managee")
	public void click_on_managee() throws InterruptedException {
		importexportpermissions.Manage_Arrow(); 
	}
	@When("Click on  CalculatorArrow")
	public void click_on_calculator_arrow1() throws InterruptedException {
		importexportpermissions.CalculatorArroww();
	}

  @When("Click on  Reportss arrow")
   public void click_on_reportss_arrow() throws InterruptedException {
	importexportpermissions.Reportss_arrow();
}

  @When("Click on  Manage_arrow")
  public void click_on_manage_arrow() throws InterruptedException {
	  importexportpermissions.Manage_Arrow();
  }
  @Then("Click on Search textfield and Enter the permission")
  public void click_on_search_textfield_and_enter_the_permission() throws InterruptedException {
	  importexportpermissions.verifySearchtextfield(); 
  }
  @Then("give permission access as view for managerAccess in QuickEntry")
  public void give_permission_access_as_view_for_manager_access_in_quick_entry() throws InterruptedException {
	  importexportpermissions.View_Access();
  }

  @Then("Click on SaveButtton")
  public void click_on_save_buttton() throws InterruptedException {
	  importexportpermissions.SaveButton();
  }
  @Then("Click on SaveAndExitButton")
  public void click_on_save_and_exit_button() throws InterruptedException {
	  importexportpermissions.SaveAndExitBUtton();
  }
  @Then("Click on CancelChangesButton")
  public void click_on_cancel_changes_button() throws InterruptedException {
	  importexportpermissions.CancelChangesButton();
  }
  @Then("Click on import of manage screen")
  public void click_on_import_of_manage_screen() throws InterruptedException {
	  importexportpermissions.ClickOnImportOfManageScreen();
  }

  @Then("Click on clients radiobutton of import")
  public void click_on_clients_radiobutton_of_import() throws InterruptedException {
	  importexportpermissions.ClickClientRadioButtonInImport();
  }

  @Then("Click on Next of import")
  public void click_on_next_of_import() throws Exception {
	  importexportpermissions.ClickNextofImport();
	 // importexportpermissions.uploadFileWithRobot();
  }

  @Given("Click on Browse of import")
  public void click_on_browse_of_import() throws Exception {
	  importexportpermissions.uploadFileWithRobot();
  }
  @Given("Click on NextButton after browse")
  public void click_on_next_button_after_browse() throws InterruptedException {
	  importexportpermissions.ClickOnNextButtonafterbrowse();
  }

  @Then("Click on save and Next of import")
  public void click_on_save_and_next_of_import() throws InterruptedException {
	  importexportpermissions.ClickOnSaveAndNextOfImport();
  }
  
  @Given("Click on Emport of manage screen")
  public void click_on_emport_of_manage_screen() throws InterruptedException {
	  importexportpermissions.ClickOnExportOfManageScreen();
  }


@Given("Click on Export of manage screen")
public void click_on_export_of_manage_screen() throws InterruptedException {
	 importexportpermissions.ClickOnExportOfManageScreen();
}

@Given("Click on All dropdown from Export")
public void click_on_all_dropdown_from_export() {
	 importexportpermissions.ClickOnAllDropdownFromExport();
}

@Given("Select This week from dropdown from export")
public void select_this_week_from_dropdown_from_export() {
	 importexportpermissions.ClickOnThisWeekDropdownFromExport();
}

@Given("Click on Excel of Export screen")
public void click_on_excel_of_export_screen() throws InterruptedException {
	 importexportpermissions.mousehoverExcel();
}

@Given("Click on export button of Export Screen")
public void click_on_export_button_of_export_screen() throws InterruptedException {
	 importexportpermissions.exportForexcelInexport();
}
@Given("Select All  from dropdown from export")
public void select_all_from_dropdown_from_export() {
	importexportpermissions.ClickOnAllDropdownFromExport();
}

@Given("Select Last week from dropdown from export")
public void select_last_week_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastWeekDropdownFromExport();
}

@Given("Select This month from dropdown from export")
public void select_this_month_from_dropdown_from_export() {
	importexportpermissions.ClickOnThisMonthDropdownFromExport();
}

@Given("Select Last month from dropdown from export")
public void select_last_month_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastMonthDropdownFromExport();
}

@Given("Select This quarter from dropdown from export")
public void select_this_quarter_from_dropdown_from_export() {
	importexportpermissions.ClickOnThisQuarterDropdownFromExport();
}

@Given("Select Last quarter from dropdown from export")
public void select_last_quarter_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastQuarterDropdownFromExport();
}

@Given("Select This year from dropdown from export")
public void select_this_year_from_dropdown_from_export() {
	importexportpermissions.ClickOnThisYearDropdownFromExport();
}

@Given("Select Last year from dropdown from export")
public void select_last_year_from_dropdown_from_export() {
	importexportpermissions.ClickOnLastYearDropdownFromExport();
}

@Given("Select custom from dropdown from export")
public void select_custom_from_dropdown_from_export() {
	importexportpermissions.ClickOnCustomDropdownFromExport();
}
@Given("Click on CSV of Export screen")
public void click_on_csv_of_export_screen() throws InterruptedException {
	importexportpermissions.exportForCSVInexport();
}
@Given("Click on PDF of Export screen")
public void click_on_pdf_of_export_screen() throws InterruptedException {
	importexportpermissions.exportForPDFInexport();
}
@Given("Click on USERS radiobutton of import")
public void click_on_users_radiobutton_of_import() throws InterruptedException {
	importexportpermissions.ClickUsersRadioButtonInImport();
}


}

