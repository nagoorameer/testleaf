package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="MergeLead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Ameer";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String cName,String fName,String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.clickCreateLead()
		.verifyFirstName(fName);
		
				
	}

}
