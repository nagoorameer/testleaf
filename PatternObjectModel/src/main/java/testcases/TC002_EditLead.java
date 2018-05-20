package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_EditLead";
		testDescription="EditLead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Ameer";
		browserName="chrome";
		dataSheetName="TC002";
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
