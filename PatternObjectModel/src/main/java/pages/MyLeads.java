package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	
	@FindBy(how=How.XPATH,using="//ul[@class='shortcuts']/li[3]")
	private WebElement eleFindLead;

	@And("click createlink")
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead();		
	}
	
	public FindLead clickFindLead() {
		click(eleFindLead);
		return new FindLead();		
	}


}
