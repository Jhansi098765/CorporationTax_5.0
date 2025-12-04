package com.Capium.StepDefination;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.Capium.Actions.ManageActions;
import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagesStepdefinations {
	ManageActions manageactions = new ManageActions();

@Given("Click on ManageDashboard")
public void click_on_manage_dashboard() throws InterruptedException, TimeoutException {
   manageactions.verifyandselectmanage();
   Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Verify and select manage");
   StepTracker.setCurrentStep("Verify and select manage");
   Log.info("Verify and select manage");
}

	@Then("verify and select client")
	public void verifyandSelectClient() throws InterruptedException {
		manageactions.verifyandSelectClient();  
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Verify and select Client");
		   StepTracker.setCurrentStep("Verify and select Client");
		   Log.info("Verify and select Client");
	}

	@Then("verify and select users")
	public void verify_and_select_users() throws InterruptedException, TimeoutException {
		manageactions.verifyandSelectUsers();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Verify and select Users");
		   StepTracker.setCurrentStep("Verify and select Users");
		   Log.info("Verify and select Users");
	}

	@Then("verify and select import")
	public void verify_and_select_import() throws InterruptedException {
		manageactions. verifyandSelectImport();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Verify and select import");
		   StepTracker.setCurrentStep("Verify and select import");
		   Log.info("Verify and select import");
	}

	@Then("verify and select export")
	public void verify_and_select_export() throws InterruptedException {
		manageactions.verifyandSelectExport();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Verify and select export");
		   StepTracker.setCurrentStep("Verify and select export");
		   Log.info("Verify and select export");
	}

	@Then("verify and select permission")
	public void verify_and_select_permission() throws InterruptedException {
		manageactions.verifyandSelectPermission();
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Verify and select permission");
		   StepTracker.setCurrentStep("Verify and select permission");
		   Log.info("Verify and select permission");
	}


//users creation

	@When("Click on users option")
	public void click_on_users_option() throws InterruptedException, TimeoutException {
		manageactions.verifyandSelectUsers();
	}

	@When("Click on Adduser")
	public void click_on_adduser() throws InterruptedException {
		manageactions.clickAdduser();
	}

//	@When("Enter name in first name textfield")
//	public void enter_name_in_first_name_textfield() throws InterruptedException, TimeoutException {
//		manageactions.verifyandSelectfirstname("divya");
//	}

	@When("Enter mail in email textfield")
	public void enter_mail_in_email_textfield() throws InterruptedException {
		manageactions.verifyandSelectEmail();
	}

	//user deletion
	@When("Click on Save and Invite")
	public void click_on_save_and_invite() throws InterruptedException {
		manageactions.clickSaveAndInvite();
	}
	@Given("Click on id checkbox")
	public void click_on_id_checkbox() throws InterruptedException {
	   manageactions.clickoncheckbox();
	}

	@Then("Click on delete")
	public void click_on_delete() throws InterruptedException {
	  manageactions.clickdelete();
	}

	@Then("Click on yes button")
	public void click_on_yes_button() throws InterruptedException {
	 manageactions.clickyes();
	}
	
	@When("Click on kebab icon")
	public void click_on_kebab_icon() throws InterruptedException {
		 manageactions.clickkebabicon();
	}

	@When("Click on export to excel")
	public void click_on_export_to_excel() throws InterruptedException {
		 manageactions.selectexporttoexcel();
	}
	@When("Click on export to CSV")
	public void click_on_export_to_csv() throws InterruptedException {
		manageactions.selectexporttoCSV();
	}
	@When("Click on export to PDF")
	public void click_on_export_to_pdf() throws InterruptedException {
		manageactions.selectexporttoPDF();
	}

	//user deletion using edit option 
	
	@Then("Click on checkbox of specific user")
	public void click_on_checkbox_of_specific_user() throws InterruptedException {
		manageactions.Clickoncheckbox();
	}

	@Then("Click on delete button")
	public void click_on_delete_button() throws InterruptedException {
		manageactions.mousehoverdelete();
	}
	// export as excel
	@Then("Click on Export as excel")
	public void click_on_export_as_excel() throws InterruptedException {
		manageactions.ExportasExcel();
	}
	@Then("Click on Export as CSV")
	public void click_on_export_as_csv() throws InterruptedException {
		manageactions.ExportasCSV();
	}

	@Then("Click on Export as PDF")
	public void click_on_export_as_pdf() throws InterruptedException {
	    manageactions.ExportasPDF();
	}
	@When("Click on search textfield and enter the text")
	public void click_on_search_textfield_and_enter_the_text() throws InterruptedException {
	   manageactions.verifySearchtextfield();
	}
	@Then("Click on checkbox of User")
	public void click_on_checkbox_of_user() throws InterruptedException {
	  manageactions.Clickoncheckbox();
	}
	@When("Enter name in Firstname textfield")
	public void enter_name_in_firstname_textfield() throws InterruptedException {
	  manageactions. FirstnameTextfield();
	}

	@When("Enter mail in Gmail textfield")
	public void enter_mail_in_gmail_textfield() throws InterruptedException {
	    manageactions.GmailTextfield();
	}

	@When("Click on Save")
	public void click_on_save() throws InterruptedException {
	  manageactions.Save();
	}

    @When("Click on Choose a file")
    public void click_on_choose_a_file() throws Exception {
	manageactions.uploadFileWithRobot();
}
//    @When("Click on DeletePhoto")
//    public void click_on_delete_photo() {
//    	manageactions.
    

    @Then("Click on options as Print")
    public void click_on_options_as_print() throws InterruptedException {
	manageactions.Print();
}
    @Then("Click on UserCheckbox")
    public void click_on_user_checkbox() throws InterruptedException {
    	manageactions.UsersCheckbox();
    }

    @When("Click on DeletePhoto")
    public void click_on_delete_photo() {
       manageactions.ClickonProfileDeletion();
    }
    @Then("Click on No button")
    public void click_on_no_button() {
       manageactions.AddUserNoDeleteButton();
    }
    @Then("Click on ExportAsExcelInAddUsers")
    public void click_on_export_as_excel_in_add_users() {
       manageactions.ExportAsExcelInAddUsers();
    }
    @Then("Click on ExportAsCSVInAddUsers")
    public void click_on_export_as_csv_in_add_users() {
       manageactions.ExportAsCSVInAddUsers();
    }
    @Then("Click on ExportAsPDFInAddUsers")
    public void click_on_export_as_pdf_in_add_users() {
        manageactions.ExportAsPDFInAddUsers();
    }
    @Then("Click on UserCheckboxInUsersTab")
    public void click_on_user_checkbox_in_users_tab() {
        manageactions.IdCheckBoxUsers();
    }

    @Then("Click on deleteInUsers button")
    public void click_on_delete_in_users_button() {
       manageactions.DeleteInUsers();
    }
    @Then("Click on YesInUsers Button")
    public void click_on_yes_in_users_button() {
       manageactions.YesButtonInUsers();
    }
    @Then("Click on NoInUsers button")
    public void click_on_no_in_users_button() {
       manageactions.NoButtonInUsers();
    }

    @Then("Click on ExportAsExcelInUsers")
    public void click_on_export_as_excel_in_users() {
       manageactions.ExportAsExcelInUsers();
    }
    
    @Then("Click on ExportAsCSVInUsers")
    public void click_on_export_as_csv_in_users() {
      manageactions.ExportAsCSVInUsers();
    }

    @Then("Click on ExportAsPDFInUsers")
    public void click_on_export_as_pdf_in_users() {
       manageactions.ExportAsPDFInUsers();
    }

    @Then("Click on Cross button in users tab")
    public void click_on_cross_button_in_users_tab() {
       manageactions.CrossButtonInUsers();
    }
    @Then("Click on Cancel Selection in users tab")
    public void click_on_cancel_selection_in_users_tab() {
        manageactions.CancelSelectionInUsers();
    }
    @Then("Click on Cancel Selection in Addusers tab")
    public void click_on_cancel_selection_in_addusers_tab() {
        manageactions.CancelSelectionInAddUsers();
    }

    @Then("Click on Cross button in Addusers tab")
    public void click_on_cross_button_in_addusers_tab() {
       manageactions.CrossButtonInAddUsers();
    }
    @When("Click on Edit Permissions")
    public void click_on_edit_permissions() {
       manageactions.EditPermissionsInAddUsers();
    }
    @When("Click on tax return arrow in add users")
    public void click_on_tax_return_arrow_in_add_users() {
        manageactions.TaxreturnArrowInAddUsers();
    }
    @When("Click on Quick return arrow in add users")
    public void click_on_quick_return_arrow_in_add_users() throws InterruptedException {
       manageactions.QuickreturnArrowInAddUsers();
    }
    @When("Click on Calculator arrow in quick entry")
    public void click_on_calculator_arrow_in_quick_entry() throws InterruptedException {
     manageactions.CalculatorArrowInQuickreturnArrowInAddUsers();
    }
    @When("Click on Attachment arrow in quick entry")
    public void click_on_attachment_arrow_in_quick_entry() throws InterruptedException {
        manageactions.AttachmentArrowInQuickreturnArrowInAddUsers();
    }

    @When("Click on Reports arrow in quick entry")
    public void click_on_reports_arrow_in_quick_entry() throws InterruptedException {
    manageactions.ReportsArrowInQuickreturnArrowInAddUsers();
    }
    @When("Click on Manage arrow in quick entry")
    public void click_on_manage_arrow_in_quick_entry() throws InterruptedException {
        manageactions.ManageArrowInAddUsers();
    }

    @When("Click on Calculator arrow in add users")
    public void click_on_calculator_arrow_in_add_users() {
    manageactions. CalculatorArrowInAddUsers();
    }

    @When("Click on View RadioButton Of Taxreturn")
    public void click_on_view_radio_button_of_taxreturn() {
       manageactions.ViewRadioButtonIneditPermissions();
    }

    @When("Click on Save Button")
    public void click_on_save_button() {
      manageactions.SaveButtonIneditPermissions();
    }
    @When("Click on CancelButton")
    public void click_on_cancel_button() {
        manageactions.CancelButtonIneditPermissions();
    }
    @When("Click on Reset to Default")
    public void click_on_reset_to_default() {
        manageactions.ResetToDefualtIneditPermissions();
    }
    @When("Click on Close icon")
    public void click_on_close_icon() {
       manageactions.CloseIconIneditPermissions();
    }
    @Then("Click on This day dropdown and Validate")
    public void click_on_this_day_dropdown_and_validate() throws IOException {
       manageactions.ThisDayDropdown();
    }

    @Then("Enter firstmiddleand lastname")
    public void enter_firstmiddleand_lastname() throws InterruptedException, TimeoutException {
    	manageactions.verifyAndEnterfirstmiddleandlastname("sre", "swathi", "devi", "swathi@gmail.com");
    }

@Then("Select Administrator from dropdown")
public void select_administrator_from_dropdown() throws InterruptedException {
	manageactions.selectadministratorfromdropdown();
}

@Then("Select business dropdown as postal")
public void select_business_dropdown_as_postal() throws InterruptedException {
	manageactions.SelectbusinessdropdownfromUsers();

}
@Then("Enter Addresss and city and country")
public void enter_addresss_and_city_and_country() throws InterruptedException {
	manageactions.verifyAndEnterAddressDetails("123 Maple Street","Springfield", "Clark County");
}

//@Then("Select country name")
//public void select_country_name() throws InterruptedException {
//	manageactions.SelectCountryFromUsers();
//}

@Then("Enter postal Zipcode")
public void enter_postal_zipcode() {
	manageactions.enterPostalCode("90210");
}

@Then("Click on SaveButtonInUsers")
public void click_on_save_button_in_users() {
	manageactions.clickSaveButtonInusers();
}

@Then("Click on Saveandexit button in users")
public void click_on_saveandexit_button_in_users() {
	manageactions.clickSaveAndExit();
}

@Then("Click on Cancel changes button in users")
public void click_on_cancel_changes_button_in_users() {
	manageactions.clickCancelchanges();
}

@Then("Select RegularUser from dropdown")
public void select_regular_user_from_dropdown() throws InterruptedException {
	manageactions.selectRegularUser();
}

@Then("Select Manager from dropdown")
public void select_manager_from_dropdown() throws InterruptedException {
	manageactions.selectManager();
}
@Then("select user and validate")
public void select_user_and_validate() {
	manageactions.validateFirstUserIsActive();
}


@Then("Enter firstname and email")
public void enter_firstname_and_email() throws InterruptedException, TimeoutException {
	manageactions.verifyAndEnterfirstnameandemail("Shivani","Shivani@gmail.com");
}

@When("click on status all dropdown")
public void click_on_status_all_dropdown() throws InterruptedException {
	manageactions.verifyStatusAlldropdown();
}

//@When("click on active")
//public void click_on_active() throws InterruptedException {
//	manageactions.
//}

@When("click on Resend invitation")
public void click_on_resend_invitation() throws InterruptedException {
	manageactions.Resendinvitation();
}

@When("click on invite")
public void click_on_invite() throws InterruptedException {
	manageactions.Invite();
}

@When("click on archieved")
public void click_on_archieved() throws InterruptedException {
	manageactions.Archieved();
}

@Then("Click on delete button for no option")
public void click_on_delete_button_for_no_option() throws InterruptedException {
	manageactions.mousehoverdeletefornooption();
}
@Then("Click on UserCheckboxinUsers")
public void click_on_user_checkboxin_users() throws InterruptedException {
	manageactions.UsersCheckboxInusers();
}


}
	



	// status all dropdown

//
//	@When("click on status all dropdown")
//	public void click_on_status_all_dropdown() {
//		manageactions.
//	}
//
//	@When("click on active")
//	public void click_on_active() {
//	    
//	}
//
//	@When("click on Resend invitation")
//	public void click_on_resend_invitation() {
//	    
//	}
//
//	@When("click on invite")
//	public void click_on_invite() {
//	  
//	}
//
//	@When("click on archieved")
//	public void click_on_archieved() {
//	    
//	}
//
//
//
//}




