package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhnNo;
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleCreateLead;

	@And("enter cname as (.*)")
	public CreateLead enterCName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@And("enter fname as (.*)")
	public CreateLead enterFName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@And("enter lname as (.*)")
	public CreateLead enterLName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	public CreateLead enterPhnNo(String data) {
		type(elePhnNo, data);
		return this;
	}
	
	public CreateLead enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	
	@When("click createlead")
	public ViewLead clickCreateLead() {
		click(eleCreateLead);
		return new ViewLead();		
	}

	   @Then("lead created sucessfully")
		public void afterCreate()
		{
			System.out.println("Lead created");
		}
	    
	    @But("lead created failed")
		public void afterCreateNegative()
		{
			System.out.println("Lead not created");
		}
	

}
