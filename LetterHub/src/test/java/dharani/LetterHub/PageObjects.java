package dharani.LetterHub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	static WebDriver driver;

	public PageObjects() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ".//a[@href='/signup']")
	WebElement createAccount;
	@FindBy(id = "txtSignUpUserName")
	WebElement userName;
	@FindBy(id = "txtSignUpEmail")
	WebElement signUpEmail;
	@FindBy(id = "txtSignUpPwd")
	WebElement signUpPwd;
	@FindBy(id = "btnSignUp")
	WebElement signUp;
	@FindBy(xpath = ".//a[@href='/signin']")
	WebElement clickHereLink;
	@FindBy(id = "txtSignInEmail")
	WebElement signInEmail;
	@FindBy(id = "txtSignInPwd")
	WebElement signInPwd;
	@FindBy(xpath = ".//button[@type='submit']")
	WebElement signIn;
	@FindBy(xpath = ".//h4[@class='growl-title']")
	WebElement growlTitle;

	@FindBy(xpath = ".//h3[text()='How It Works']")
	WebElement howItWorks;
	@FindBy(xpath = ".//img[@src='../../assets/css/images/small_logo_letterhub.png']")
	WebElement letterHubimg;
	// contacts
	@FindBy(xpath = ".//span[text()='Contacts']")
	WebElement contactsMenu;
	@FindBy(xpath=".//a[@data-ng-click='mailSelectedContacts()']")
	WebElement mailSelectedContacts;
	// add new contact
	@FindBy(xpath = ".//a[text()='Add New Contact']")
	WebElement addNewContact;
	@FindBy(id = "txtFirstName")
	WebElement firstName;
	@FindBy(id = "txtLastName")
	WebElement LastName;
	@FindBy(id = "txtCompany")
	WebElement company;
	@FindBy(xpath = ".//button[@data-ng-click='saveContact()']")
	WebElement contactSave;
	@FindBy(id = "searchContacts")
	WebElement searchContacts;
	@FindBy(xpath = ".//label[@data-ng-click='hideAddressLess()']")
	WebElement hideAddress;
	@FindBy(xpath = ".//a[text()='Add New Address']")
	WebElement addNewAddress;
	@FindBy(xpath = ".//span[text()='Select a Label']")
	WebElement labelSelect;
	@FindBy(xpath = "//tbody/tr/td/label/span")
	WebElement selectContact;
	@FindBy(xpath = ".//a[text()='Tag']")
	WebElement selectTag;
	@FindBy(xpath = ".//button[@data-ng-click='addNewGroup()']")
	WebElement addNewTag;
	@FindBy(css = "#tagName")
	WebElement tName;
	@FindBy(xpath = ".//button[@uib-tooltip='Save']")
	WebElement saveTag;
	@FindBy(xpath = "//div[@class='spinner-container container3']")
	By loader;

	@FindBy(id = "txtAddressTitle")
	WebElement addresstitle;
	@FindBy(id = "txtAddressLine1")
	WebElement addressLine1;
	@FindBy(xpath = ".//input[@id='txtAddressCity']")
	WebElement addressCity;
	@FindBy(id = "txtAddressState")
	WebElement addressState;
	@FindBy(id = "txtAddressZip")
	WebElement addressZip;
	

	@FindBy(xpath = ".//a[@href='/dashboard']")
	WebElement dashboard;

	@FindBy(xpath = ".//a[@href='/mailings/mailing-list']")
	WebElement mailings;

	@FindBy(xpath = ".//button[text()='Start New Mailer']")
	WebElement startNewMailier;

	@FindBy(xpath = ".//button[contains(.,'Next')]")
	WebElement Next;

	@FindBy(xpath = ".//label[contains(.,' Upload a file')]")
	WebElement uploadfile;

	@FindBy(xpath = ".//a[text()='Select All']")
	WebElement selectall;

	@FindBy(xpath = ".//a[text()='Deselect All']")
	WebElement deSelectAll;

	@FindBy(xpath = ".//input[@data-ng-checked='hideContacts']/ancestor::i")
	WebElement hideContacts;

	@FindBy(xpath = ".//div[@class='multiselect-parent btn-group dropdown-multiselect open']/ul/li")
	List<WebElement> options;

	@FindBy(xpath = ".//span[text()='First Name A - Z']")
	WebElement sortby;

	@FindBy(xpath = ".//button[@ng-click='toggleDropdown()']")
	WebElement showalltags;

	/*
	 * @FindBy(xpath=".//button[contains(text(),'Next: Save & Preview')]")
	 * WebElement editTemplateNextBtn;
	 * 
	 * @FindBy(xpath=".//button[contains(text(),'Next')]") WebElement nextBtn;
	 * 
	 * @FindBy(xpath=".//button[text()='Use Default Address']") WebElement
	 * useDefaultAddress;
	 * 
	 * @FindBy(xpath=".//button[text()='Select from Address Book']") WebElement
	 * selectFromAddressBook;
	 * 
	 * @FindBy(xpath=".//span[@class='cb-inner']") List<WebElement>
	 * checkFromAddress;
	 * 
	 * @FindBy(xpath=".//span[@class='cb-inner']") WebElement
	 * checkDefaultFromAddress;
	 * 
	 * @FindBy(xpath=".//button[@data-ng-click='addFromAddress()']") WebElement
	 * fromAddressAdd;
	 * 
	 * @FindBy(xpath=".//button[text()='Save & Proceed']") WebElement
	 * fromAddressSave;
	 * 
	 * @FindBy(id="txtFileName") WebElement jobFileName;
	 * 
	 * @FindBy(xpath=".//button[text()='Pay With Credit']") WebElement
	 * payWithCredit;
	 * 
	 * @FindBy(xpath=".//button[text()='Save']") WebElement saveBtn;
	 */
	// mailings menu
	@FindBy(xpath = ".//span[text()='Mailings']")
	WebElement mailingsMenu;
	@FindBy(xpath = ".//button[text()='Start New Mailer']")
	WebElement newMailerJob;
	// select recipients
	@FindBy(xpath = ".//a[text()='Select All']")
	WebElement selectRecipients;
	// create letter online
	@FindBy(xpath = ".//button[text()='Create Letter Online']")
	WebElement createLetterOnline;

	@FindBy(xpath = ".//span[@class='k-input']")
	WebElement selectCustomField;

	@FindBy(xpath = ".//ul[@id='ddlCustomFiledGroups_listbox']/li")
	List<WebElement> selectCustomFieldValue;
	@FindBy(xpath = ".//button[text()='Insert Custom Field']")
	WebElement InsertCustomFieldBtn;

	@FindBy(id = "txtTemplateName")
	WebElement templateName;

	@FindBy(xpath = ".//button[@data-ng-click='dontSaveTemplate()']")
	WebElement dontSaveTemplate;
	// select existing letter.
	@FindBy(xpath = ".//a[text()='Automation Template']")
	WebElement selectExistingTemplate;

	// common
	@FindBy(xpath = ".//button[contains(text(),'Next: Save & Preview')]")
	WebElement editTemplateNextBtn;
	@FindBy(xpath = ".//button[contains(text(),'Next')]")
	WebElement nextBtn;
	@FindBy(xpath = ".//button[text()='Use Default Address']")
	WebElement useDefaultAddress;
	@FindBy(xpath = ".//button[text()='Select from Address Book']")
	WebElement selectFromAddressBook;
	@FindBy(xpath = ".//span[@class='cb-inner']")
	List<WebElement> checkFromAddress;
	@FindBy(xpath = ".//span[@class='cb-inner']")
	WebElement checkDefaultFromAddress;
	@FindBy(xpath = ".//button[@data-ng-click='addFromAddress()']")
	WebElement fromAddressAdd;
	@FindBy(xpath = ".//button[text()='Save & Proceed']")
	WebElement fromAddressSave;
	@FindBy(id = "txtFileName")
	WebElement jobFileName;
	@FindBy(xpath = ".//button[text()='Pay With Credit']")
	WebElement payWithCredit;
	@FindBy(xpath = ".//button[text()='Save']")
	WebElement saveBtn;
	// buy Credit.
	@FindBy(xpath = ".//span[text()='Buy Credit']")
	WebElement buyCredit;
	@FindBy(xpath = ".//span[@class='k-input']")
	WebElement selectPlan;
	@FindBy(xpath = ".//ul[@id='ddlCreditAmount_listbox']/li")
	List<WebElement> choosePlanToBuy;
	@FindBy(xpath = ".//label[@data-ng-click='addNewCreditCard()']")
	WebElement purchaseWithNewCard;
	@FindBy(id = "txtFirstName")
	WebElement CreditfirstName;
	@FindBy(id = "txtLastName")
	WebElement lastName;
	@FindBy(id = "txtCardNumber")
	WebElement cardNumber;
	@FindBy(id = "txtExpDate")
	WebElement expiryDate;
	@FindBy(id = "txtSecurityCode")
	WebElement securityCode;
	@FindBy(xpath = ".//label[@data-ng-click='saveCard()']")
	WebElement saveCard;
	@FindBy(xpath = ".//button[text()='Buy Credit']")
	WebElement buyCreditBtn;
	

	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

}
