package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import paypalpages.HomePage;
import wdMethods.ProjectMethods;

public class TC006_PayPalLogin extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_PayPalLogin";
		testDescription="Login to PayPal";
		testNodes="Leads";
		category="Smoke";
		authors="Ameer";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String country,String email,String pass,String repass) {
		
		new HomePage()
		.clickSignUp()
		.clickRadioShopper()
		.clickNext()
		.SelectDropDown(country)
		.enterEmail(email)
		.enterPassword(pass)
		.enterPasswordAgain(repass)
		.clickContinue();
				
	}

}
