package new2_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_2 {
	
	public static String getDatafromPropertiesFile(String Key) throws IOException{
		Properties obj=new Properties();
		FileInputStream MyFile=new FileInputStream("F:\\Eclipse Projects\\Velocity Selenium\\KiteCredential.properties");
		obj.load(MyFile);
		String value=obj.getProperty(Key);
		return value;
		
	}
	
//	public static void captureScreenShot(WebDriver driver, int TCID) throws IOException {
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("F:\\Eclipse Projects\\Velocity Selenium\\ScreenShot\\TestCaseID"+TCID+".png");
//		FileHandler.copy(src, dest);
//		}

}
