/*package dharani.LetterHub;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Then;

public class CommonClass extends PageObjects {
	@Then("^User should be able to preview the file$")
	public void user_should_be_able_to_preview_the_file() throws Throwable {
	    System.out.println("File Preview is success...");
	    Thread.sleep(5000);
	    nextBtn.click();
		   Thread.sleep(2000);
	}

	@Then("^he can able to select address from addressbook or by default address$")
	public void he_can_able_to_select_address_from_addressbook_or_by_default_address() throws Throwable {
		   //useDefaultAddress.click();
		selectFromAddressBook.click();
		   Thread.sleep(5000);
		   checkFromAddress.get(0).click();
		   Thread.sleep(2000);
		   fromAddressAdd.click();
		   Thread.sleep(2000);
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0,250)", "");
		   Thread.sleep(1000);
		   checkDefaultFromAddress.click();
		   Thread.sleep(1000);
		   fromAddressSave.click();
		   
	}

	@Then("^application should navigate to review & confirm page if he picks any address$")
	public void application_should_navigate_to_review_confirm_page_if_he_picks_any_address() throws Throwable {
		System.out.println("Navigated to the review page");
	}

	@Then("^should throw error if he does not select any address$")
	public void should_throw_error_if_he_does_not_select_any_address() throws Throwable {
	    
	}

	@Then("^User should be able to rename the job in shown format \"([^\"]*)\"$")
	public void user_should_be_able_to_rename_the_job_in_shown_format(String arg1) throws Throwable {
		Thread.sleep(2000);
		   jobFileName.clear();
		   jobFileName.sendKeys(arg1);
		   Thread.sleep(1000);
	}

	@Then("^should be able to select page size, carrier & print options$")
	public void should_be_able_to_select_page_size_carrier_print_options() throws Throwable {
	   System.out.println("Selected print and carrier options");
	}

	@Then("^User should be able to pay via credit If he has balance else Buycredit should be done to submit job\\.$")
	public void user_should_be_able_to_pay_via_credit_If_he_has_balance_else_Buycredit_should_be_done_to_submit_job() throws Throwable {
		 payWithCredit.click();
		 Thread.sleep(2000);
	} 

}
*/