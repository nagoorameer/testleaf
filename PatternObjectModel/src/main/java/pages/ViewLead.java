package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleViewLead;
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditLead;
	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDeleteLead;

	public ViewLead verifyFirstName(String data) {
		verifyExactText(eleViewLead, data);
		return this;		
	}
	
	public EditLead clickEditLead() {
		click(eleEditLead);
		return clickEditLead();		
	}
	
	public MyLeads clickDeleteLead() {
		click(eleEditLead);
		return clickDeleteLead();		
	}
}
