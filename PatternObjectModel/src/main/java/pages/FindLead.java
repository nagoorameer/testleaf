package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{
	
	public FindLead() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhnButton;
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneCountryCode']")
	private WebElement eleCountryCode;
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneAreaCode']")
	private WebElement eleAreaCode;
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhnNo;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLead;
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstLead;

	
	public FindLead enterFName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	public FindLead enterCountryCode(String data) {
		type(eleCountryCode, data);
		return this;
	}
	
	public FindLead enterAreaCode(String data) {
		type(eleAreaCode, data);
		return this;
	}
	
	public FindLead enterPhnNo(String data) {
		type(elePhnNo, data);
		return this;
	}
	
	public FindLead clickPhnButton(String data) {
		click(elePhnButton);
		return this;
	}
	
	public FindLead clickFindLead(String data) {
		click(eleFindLead);
		return this;
	}
	
	public ViewLead clickFirstLead() {
		click(eleFirstLead);
		return new ViewLead();		
	}

	
	

}
