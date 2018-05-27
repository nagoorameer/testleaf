package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {
	
	public LoginPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleRadioShopper;
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNextButton;
	
	public LoginPage clickRadioShopper() {
		
		if(!verifySelected(eleRadioShopper))
			 click(eleRadioShopper);
		
		return this;
	}
	
	public SignUpPage clickNext() {
	
		click(eleNextButton);
		
		return new SignUpPage();		
	}

}
