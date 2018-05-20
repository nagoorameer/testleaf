package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleEditLead;

	
	public EditLead updateCName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	public ViewLead clickEditLead() {
		click(eleEditLead);
		return new ViewLead();		
	}

	
	

}
