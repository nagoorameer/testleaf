package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods {
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement eleSignUp;
	
	public LoginPage clickSignUp() {
		click(eleSignUp);
		return new LoginPage();		
	}

}
