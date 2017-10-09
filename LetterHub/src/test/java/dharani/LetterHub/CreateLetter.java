/*package dharani.LetterHub;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLetter extends PageObjects{
	@When("^User wants to select document via create letter online$")
	public void user_wants_to_select_document_via_create_letter_online() throws Throwable {
		Thread.sleep(5000);
		createLetterOnline.click();
		Thread.sleep(20000);
	}

	@Then("^application should navigate to Edit template$")
	public void application_should_navigate_to_Edit_template() throws Throwable {
	System.out.println("Edit template is successfull...");
	    
		
	}

	@Then("^User should be able to select custom field as per his wish & should be able to copy custom field\\.$")
	public void user_should_be_able_to_select_custom_field_as_per_his_wish_should_be_able_to_copy_custom_field() throws Throwable {
		Robot robot = new Robot();
		try {
			for (int i=1; i<=6; i++) {
				robot.keyPress(KeyEvent.VK_ENTER);
				selectCustomField.click();
				Thread.sleep(5000);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				InsertCustomFieldBtn.click();
				Thread.sleep(2000);
				
		    }
		}
		catch(Exception e) {System.out.println(e); }
		String text = "This is the sample automation test letter";
		StringSelection selection = new StringSelection(text);

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
	
	@When("^User clicks on save & preview application should display pop up to save/dont save template\"(.*?)\"$")
	public void user_clicks_on_save_preview_application_should_display_pop_up_to_save_dont_save_template(String tempName) throws Throwable {
		 Thread.sleep(2000);
		   editTemplateNextBtn.click();
		   Thread.sleep(1000);
		   templateName.sendKeys(tempName);
		  Thread.sleep(1000);
		   //saveBtn.click();
		  dontSaveTemplate.click();
		   Thread.sleep(5000);
	}

}
*/