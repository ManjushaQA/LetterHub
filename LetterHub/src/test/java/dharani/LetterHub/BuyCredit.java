/*package dharani.LetterHub;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyCredit extends PageObjects {
	@When("^user clicked on the buy credit menu$")
	public void user_clicked_on_the_buy_credit_menu() throws Throwable {
		Thread.sleep(2000);
		buyCredit.click();
		Thread.sleep(5000);
	}

	@Then("^application must navigate to the buy credit page$")
	public void application_must_navigate_to_the_buy_credit_page() throws Throwable {
		System.out.println("In Buy Credit page...");
	}


	@When("^user selected the corresponding plan and clicked on the buy credit$")
	public void user_selected_the_corresponding_plan_and_clicked_on_the_buy_credit(DataTable buyCredit) throws Throwable {
		List<List<String>> data = buyCredit.raw();
		selectPlan.click();
		Thread.sleep(2000);
		choosePlanToBuy.get(2).click();
		Thread.sleep(2000);
		purchaseWithNewCard.click();
		Thread.sleep(2000);
		CreditfirstName.sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		lastName.sendKeys(data.get(0).get(1));
		Thread.sleep(1000);
		cardNumber.sendKeys(data.get(0).get(2));
		Thread.sleep(1000);
		expiryDate.sendKeys(data.get(0).get(3));
		Thread.sleep(1000);
		securityCode.sendKeys(data.get(0).get(4));
		Thread.sleep(1000);
		saveCard.click();
		Thread.sleep(1000);
		buyCreditBtn.click();
		Thread.sleep(3000);
	   
	}
	@Then("^application must purchase the credits successfully$")
	public void application_must_purchase_the_credits_successfully() throws Throwable {
		System.out.println("purchase done and navigated to the purchase history page...");
	}

}
*/