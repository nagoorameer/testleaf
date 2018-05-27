package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;
import wdMethods.ProjectMethods;


public class SignUpPage extends ProjectMethods {
	
	public SignUpPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="country")
	private WebElement eleCountryDD;
	
	@FindBy(how=How.ID,using="email")
	private WebElement eleEmail;
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePass;
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement eleConfirmPass;
	
	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement eleContinueButton;
	
	public SignUpPage SelectDropDown(String data) {
		selectDropDownUsingText(eleCountryDD, data);
		return this;
	}
	
	public SignUpPage enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	
	public SignUpPage enterPassword(String data) {
		type(elePass, data);
		return this;
	}
	
	public SignUpPage enterPasswordAgain(String data) {
		type(eleConfirmPass, data);
		return this;
	}
	
	public SignUpPage clickContinue() {	
		 click(eleContinueButton);	
		return this;		
	}

}
