package test_Kite_UserID;

import new2_Utility.Utility_1;
import new2_baseclasses.Base_1;
import pom.HomePage;
import pom.LoginPage;
import pom.PinPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest extends Base_1 {

	LoginPage page1;
	PinPage page2;
	HomePage page3;

	@BeforeClass
	public void launchBrowser() {
		Reporter.log("Launching Browser",true);
		browserinitialize();
		page1=new LoginPage(driver);
		page2=new PinPage(driver);
		page3=new HomePage(driver);		
	}

	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Logging in to Application",true);
		Thread.sleep(2000);
		page1.EnterUserID(Utility_1.getDatafromExcel(0, 0));
		page1.EnterPassword(Utility_1.getDatafromExcel(0, 1));
		page1.ClickLoginButton();
		
		Thread.sleep(2000);
		page2.EnterPin(Utility_1.getDatafromExcel(0, 2));
		page2.ClickContinue();		
	}

	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException, InterruptedException {
		int TCID=556;
		Reporter.log("TC Running",true);
		String ActualID = page3.GetTextOfID();
		Reporter.log("ActulalID"+ActualID,true);
		String ExpectedID = Utility_1.getDatafromExcel(0, 0);
		Reporter.log("ExpectedID"+ExpectedID,true);
		Thread.sleep(2000);
		Utility_1.captureScreenShot(driver, TCID);
		Assert.assertEquals(ActualID, ExpectedID,"UserID not Matching TC Failed");
		Reporter.log("User ID Matching TC Passed",true);		
	}

	@AfterMethod
	public void logoutfromApplication() throws InterruptedException {
		Reporter.log("Log Out",true);
		Thread.sleep(2000);
		page3.clickOnID();
		Thread.sleep(2000);
		page3.clickOnSignout();
	}

	@AfterClass
	public void closingBrowser() throws InterruptedException {
		Reporter.log("Closing Browser",true);
		Thread.sleep(2000);
		driver.close();		
	}
}
