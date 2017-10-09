package dharani.LetterHub;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class Contacts extends PageObjects {
	@When("^Add new account is clicked application should display a pop up screen$")
	public void add_new_account_is_clicked_application_should_display_a_pop_up_screen() throws Throwable {
		// PageFactory.initElements(driver, this);
		contactsMenu.click();
		Thread.sleep(20000);
		addNewContact.click();
		Thread.sleep(5000);

	}

	@When("^User should be able to enter all the fields$")
	public void user_should_be_able_to_enter_all_the_fields(DataTable contactDetails) throws Throwable {
		List<List<String>> data = contactDetails.raw();

		firstName.sendKeys(data.get(0).get(0));
		LastName.sendKeys(data.get(0).get(1));
		company.sendKeys(data.get(0).get(2));

		contactSave.click();

	}

	@When("^search \"(.*?)\" & try to update the contact$")
	public void search_try_to_update_the_contact(String searchContact, DataTable address) throws Throwable {

		Thread.sleep(5000);

		searchContacts.clear();
		searchContacts.sendKeys(searchContact);

		Thread.sleep(5000);
		hideAddress.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//span[text()='" + searchContact + "']")).click();
		Thread.sleep(5000);

		addNewAddress.click();
		
		

		Thread.sleep(5000);

		labelSelect.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		System.out.println("Home label selected");

		List<List<String>> data = address.raw();
		// ((JavascriptExecutor) driver).executeScript("scroll(0,250)");

		addresstitle.sendKeys(data.get(0).get(0));
		Thread.sleep(5000);

		addressLine1.sendKeys(data.get(0).get(1));
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		addressCity.sendKeys(data.get(0).get(2));
		Thread.sleep(1000);
		addressState.sendKeys(data.get(0).get(3));
		Thread.sleep(1000);
		addressZip.sendKeys(data.get(0).get(4));
		Thread.sleep(2000);
		contactSave.click();

	}

	@When("^User should be able to create a new tag \"(.*?)\"$")
	public void user_should_be_able_to_create_a_new_tag(String tag) throws Throwable {
		Thread.sleep(7000);

		selectContact.click();
		Thread.sleep(1000);
		selectTag.click();
		Thread.sleep(3000);
		addNewTag.click();
		Thread.sleep(1000);
		tName.sendKeys(addToTag);
		Thread.sleep(1000);
		saveTag.click();
		driver.findElement(By.xpath(".//span[text()='" +tag + "']")).click();
		Thread.sleep(3000);
		saveTag.click();
		Thread.sleep(2000);
		

	}

}
