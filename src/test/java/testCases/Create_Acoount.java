package testCases;

import org.testng.annotations.Test;

import baseClass.Base_Class;
import pageObjectModel.Magento_CreateAccount;

public class Create_Acoount extends Base_Class {

	
	public static Magento_CreateAccount account;
	
	@Test
	public static void ClickcreateAccount() {
		account=new Magento_CreateAccount(driver);
		account.createa_ccount_link();
		String Actual ="Create an Account";
		
	
	}	
	
	@Test
	public static void EnterFirstName() {
		
		account.FirstName("Santosh");
	}
	
	@Test
	public static void EnterLastName() {
		
		account.LastName("Katiyar");
	}
	
	@Test
	public static void EnterEmail() {
		
		account.EmailAdress("santosh.katiyar2018@gmail.com");
	}
	
	@Test
	public static void EnterPassword() {
		
		account.Password("abc@12345");
	}	
	
	@Test
	public static void ConfirmPassword() {
		
		account.ConfirmPassword("abc@12345");
	}	
	
	@Test
	public static void ConfirmCreateAccount() {
		
		account.CreateAccountbutton();
	}	
	
}
