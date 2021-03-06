package steps;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {

	@Before
	public void before(Scenario sc)
	{
		
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("Ameer");
		startApp("chrome");
	}
	
	@After
	public void after(Scenario sc)
	{
		System.out.println(sc.getStatus());
		closeAllBrowsers();
		endResult();
		
	}
	
}
