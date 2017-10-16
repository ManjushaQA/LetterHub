package dharani.LetterHub;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;po
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends PageObjects {

	@Given("^valid URL in the mentioned browser$")
	public void valid_URL_in_the_mentioned_browser() throws Throwable {

		browser();
		PageFactory.initElements(driver, this);
		driver.get("https://secure.letterhub.com");
		System.out.println("LetterHub browser opened successfully");
		Thread.sleep(5000);
	}

	@Given("^Enter mandatory fields\"(.*?)\", \"(.*?)\", \"(.*?)\"click on create account$")
	public void enter_mandatory_fields_click_on_create_account(String UN, String UserEmail, String Password)
			throws Throwable {
		createAccount.click();
		Thread.sleep(2000);
		userName.sendKeys(UN);

		signUpEmail.sendKeys(UserEmail);
		signUpPwd.sendKeys(Password);
		signUp.click();
		Thread.sleep(10000);

	}

	@When("^clickHere link is displayed click on the link & try to login with credentials$")
	public void clickhere_link_is_displayed_click_on_the_link_try_to_login_with_credentials(DataTable arg1)
			throws Throwable {
		clickHereLink.click();
		List<List<String>> data = arg1.raw();
		for (int i = 1; i < data.size(); i++) {
			signInEmail.clear();
			signInPwd.clear();
			signInEmail.sendKeys(data.get(i).get(0));
			signInPwd.sendKeys(data.get(i).get(1));
			Thread.sleep(5000);
			signIn.click();

			Thread.sleep(10000);
		}

	}

	@When("^Application should display how it works page$")
	public void application_should_display_how_it_works_page() throws Throwable {
		if (letterHubimg.isDisplayed()) {
			System.out.println("Logged in successfully");
		} else {
			System.out.println("User unable to logged in");
		}
	}

	@When("^user clicks on forgot password application should ask user to enter email$")
	public void user_clicks_on_forgot_password_application_should_ask_user_to_enter_email() throws Throwable {

	}

	@When("^application should send a password through mail\\.$")
	public void application_should_send_a_password_through_mail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
