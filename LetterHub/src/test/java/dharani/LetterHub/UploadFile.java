package dharani.LetterHub;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadFile extends PageObjects {

	@When("^User clicks on start new mailer to send jobs, application should navigate to select receipients$")
	public void user_clicks_on_start_new_mailer_to_send_jobs_application_should_navigate_to_select_receipients()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		startNewMailier.click();
		Thread.sleep(20000);
		selectContact.click();
		Thread.sleep(500);
		mailSelectedContacts.click();
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-bar-container")));

	}

	@When("^User should be able to selct receipients by verifying the tags & search contacts$")
	public void user_should_be_able_to_selct_receipients_by_verifying_the_tags_search_contacts() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		hideContacts.click();
		Thread.sleep(1000);
		selectall.click();
		Thread.sleep(1000);
		deSelectAll.click();
		Thread.sleep(500);
		sortby.click();
		Thread.sleep(500);
		Robot robot = new Robot();
		for (int i = 1; i <= 5; i++) {
			// robot.keyPress(KeyEvent.VK_ENTER);
			// Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}
		Thread.sleep(5000);
		showalltags.click();
		Thread.sleep(1000);
		robot = new Robot();
		System.out.println(options.size());
		for (int i = 1; i <= options.size() - 2; i++) {

			String text = options.get(i).getText();
			System.out.println(text);

			options.get(i).click();

			Thread.sleep(2000);
		}
	}

	@Then("^application should be able to navigate to select document if he choose contact\"(.*?)\" via select all check box or individual contact$")
	public void application_should_be_able_to_navigate_to_select_document_if_he_choose_contact_via_select_all_check_box_or_individual_contact(
			String receipient) throws Throwable {
		searchContacts.sendKeys(receipient);
		Thread.sleep(10000);
		selectall.click();
		Thread.sleep(500);
		Next.click();
		Thread.sleep(5000);
	}

	@Then("^should throw error if he doesnot select any of contact$")
	public void should_throw_error_if_he_doesnot_select_any_of_contact() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^User Picks to select document via upload file\"(.*?)\"$")
	public void user_Picks_to_select_document_via_upload_file(String uploadPath) throws Throwable {
		uploadfile.click();
		Thread.sleep(500);
		Robot robot = new Robot();

		StringSelection selection = new StringSelection(uploadPath);

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
		try {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception ex) {
			System.out.println("In catch App" + ex);
		}

	}

	@Then("^User should be able to preview the file$")
	public void user_should_be_able_to_preview_the_file() throws Throwable {
		// Write code here that turns the phrase above into concrete action
		System.out.println("File Preview");
		Thread.sleep(10000);
		Next.click();
		Thread.sleep(1000);
	}

	@Then("^he can able to select address from addressbook or by default address$")
	public void he_can_able_to_select_address_from_addressbook_or_by_default_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// useDefaultAddress.click();
		selectFromAddressBook.click();
		Thread.sleep(5000);

	}

	@Then("^application should navigate to review & confirm page if he picks any address$")
	public void application_should_navigate_to_review_confirm_page_if_he_picks_any_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to the review page");
	}

	@Then("^should throw error if he does not select any address$")
	public void should_throw_error_if_he_does_not_select_any_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User should be able to rename the job in shown format \"(.*?)\"$")
	public void user_should_be_able_to_rename_the_job_in_shown_format(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		jobFileName.clear();
		jobFileName.sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^should be able to select page size, carrier & print options$")
	public void should_be_able_to_select_page_size_carrier_print_options() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User should be able to pay via credit If he has balance else Buycredit should be done to submit job\\.$")
	public void user_should_be_able_to_pay_via_credit_If_he_has_balance_else_Buycredit_should_be_done_to_submit_job()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// payWithCredit.click();
		Thread.sleep(2000);

	}
}
