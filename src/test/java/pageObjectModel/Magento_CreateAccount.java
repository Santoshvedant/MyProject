package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Magento_CreateAccount  {

	//Locators ................

	public WebDriver driver;
	@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
	private static WebElement CreateAccount;

	@FindBy(id="firstname")
	private static WebElement FirstName;

	@FindBy(id="lastname")
	private static WebElement LastName;

	@FindBy(id="email_address")
	private static WebElement EmaiAdress;

	@FindBy(id="password")
	private static WebElement Password;

	@FindBy(id="password-confirmation")
	private static WebElement Password_confirm;

	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	private static WebElement CreateAccountButton;

	// Create account Webelements methods ....

	public static void createa_ccount_link() {
		try {

			CreateAccount.click();
			String actual=	CreateAccount.getText();
			System.out.println("Actual result: "+ actual);
			Assert.assertEquals(actual, "Create an Account");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void FirstName(String firstName) {
		FirstName.sendKeys(firstName);

	}
	public static void LastName(String lastName) {
		LastName.sendKeys(lastName);

	}
	public static void Password(String password) {
		Password.sendKeys(password);

	}

	public static void ConfirmPassword(String Cnfpassword) {
		Password_confirm.sendKeys(Cnfpassword);

	}

	public static void EmailAdress(String Email_id) {
		EmaiAdress.sendKeys(Email_id);

	}

	public static void CreateAccountbutton() {

		CreateAccountButton.click();
	}


	//Constructor

	public Magento_CreateAccount(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
