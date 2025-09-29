package com.Capium.StepDefination;

import java.io.IOException;

import com.Capium.Actions.DashboardActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepDefination {
	DashboardActions Dashboard= new DashboardActions();


@When("Click on  Quickadd icon")
public void click_on_quickadd_icon() throws InterruptedException {
	Dashboard.QuickAddOfDashBoard();
}

@Given("Click on DashBoard of Quickadd icon")
public void click_on_dash_board_of_quickadd_icon() {
	Dashboard. DashBoardOfQuickAdd();
}
@Given("Click on TaxReturn of Quickadd icon")
public void click_on_tax_return_of_quickadd_icon() {
	Dashboard.TaxReturnOfQuickAdd();
}

@Given("Click on Manage of Quickadd icon")
public void click_on_manage_of_quickadd_icon() {
	Dashboard.ManageOfQuickAdd();
}
@Given("Click on  settings icon")
public void click_on_settings_icon() throws InterruptedException {
	Dashboard.SettingsofDashboard();
}

@Given("Click on Email templates of settings")
public void click_on_email_templates_of_settings() throws InterruptedException {
	Dashboard.ClickonEmailTemplates();
}
@Given("Click on Save of email template")
public void click_on_save_of_email_template() throws InterruptedException {
	Dashboard.ClickonSaveOfEmailTemplates();
}
@Given("Click on keyboarddoublearrowdown of email templates")
public void click_on_keyboarddoublearrowdown_of_email_templates() throws InterruptedException {
	Dashboard.Clickonkeyboarddoublearrowdownofemailtemplates();
}
@Given("Click on Document templates of settings")
public void click_on_document_templates_of_settings() throws InterruptedException {
	Dashboard.ClickonDocumentTemplates();
}

@Given("Click on Save of document Template")
public void click_on_save_of_document_template() throws InterruptedException {
	Dashboard.ClickonSaveOFDocumentTemplate();
}
//@Given("Click on C_icon and validate")
//public void click_on_c_icon_and_validate() {
//	Dashboard.click
//}

//@Then("Validate the Cicon")
//public void validate_the_cicon() throws InterruptedException {
//	Dashboard.validateCiconfields();
//}

@Given("Click on Ticketicon")
public void click_on_ticketicon() throws InterruptedException {
	Dashboard.clickonTicket();
}

@Then("Validate the Ticket")
public void validate_the_ticket() throws InterruptedException {
	Dashboard.validateTicket();
}

@Given("Click on Helpicon")
public void click_on_helpicon() throws InterruptedException {
	Dashboard.clickonhelp();
}

@Then("Validate the Helpicon")
public void validate_the_helpicon() throws InterruptedException, IOException {
	Dashboard.validatetheHelp();
}
@Given("Click on This day dropdown and verify")
public void click_on_this_day_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifythisdaydropdown();
}

@Then("Click on Thirty days dropdown and verify")
public void click_on_thirty_days_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyThirtydays();
}

@Then("Click on Sixty days dropdown and verify")
public void click_on_sixty_days_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifySixetydays();
	}

@Then("Click on Ninety days dropdown and verify")
public void click_on_ninety_days_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyNinetydays();
}


@Then("Click on oneEighty days dropdown and verify")
public void click_on_one_eighty_days_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyOneEightydays();
}

@Then("Click on Threesixty days dropdown and verify")
public void click_on_threesixty_days_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyThreesixtydays();

}
@Then("Click on Custom day dropdown and verify")
public void click_on_custom_day_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyCustom();
}
@Given("Click on This financial year dropdown and verify")
public void click_on_this_financial_year_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifythisThisfinancailyeardropdown();
}

@Then("Click on Two thousand tewntyfour dropdown and verify")
public void click_on_two_thousand_tewntyfour_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandtwentyfour();
}

@Then("Click on Two thousand tewntythree dropdown and verify")
public void click_on_two_thousand_tewntythree_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandtwentythree();
}

@Then("Click on Two thousand tewntytwo dropdown and verify")
public void click_on_two_thousand_tewntytwo_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandtwentytwo();
}

@Then("Click on Two thousand tewntyone dropdown and verify")
public void click_on_two_thousand_tewntyone_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandtwentyone();
}

@Then("Click on Two thousand tewnty dropdown and verify")
public void click_on_two_thousand_tewnty_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandtwenty();
}

@Then("Click on Two thousand nineteen dropdown and verify")
public void click_on_two_thousand_nineteen_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandnineteen();
}

@Then("Click on Two thousand eighteen dropdown and verify")
public void click_on_two_thousand_eighteen_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandeighteen();
}

@Then("Click on Two thousand seventeen dropdown and verify")
public void click_on_two_thousand_seventeen_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandseventeen();
}

@Then("Click on Two thousand sixteen dropdown and verify")
public void click_on_two_thousand_sixteen_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandsixteen();
}

@Then("Click on Two thousand fifteen dropdown and verify")
public void click_on_two_thousand_fifteen_dropdown_and_verify() throws InterruptedException {
	Dashboard.verifyTwothousandfifteen();
}
//@Given("Click on Logo on Tax Document of settings")
//public void click_on_logo_on_tax_document_of_settings() {
//	Dashboard.
//}
//
//@Given("Click on Enable\\/Disable Report Logo checkbox")
//public void click_on_enable_disable_report_logo_checkbox() {
//	Dashboard.
//}
//
//@Given("Click on Save of Logo on Tax Document of settings")
//public void click_on_save_of_logo_on_tax_document_of_settings() {
//	Dashboard.
//}

@Given("Click on History icon")
public void click_on_history_icon() throws InterruptedException {
	Dashboard.history();
}
@Given("Click on Capiumlogo and validate")
public void click_on_capiumlogo_and_validate() throws InterruptedException, IOException {
	Dashboard.capiumlogo();
}

}















