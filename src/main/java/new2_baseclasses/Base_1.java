package new2_baseclasses;

import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Base_1 {
	public static WebDriver driver;
	public void browserinitialize() {
		//===============Set properties of ChromeDriver and WeBdriver=============
				System.setProperty("webdriver.chrome.driver","F:\\Eclipse Projects\\Velocity Selenium\\Chrome Driver\\chromedriver.exe");
		//===============Initialize the Browser===================================
				driver= new ChromeDriver();
				String baseurl="https://kite.zerodha.com/";
				driver.manage().window().maximize();
				driver.get(baseurl);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.close();
				
	}

	public void captureScreenShot(String TCID) throws IOException {
		String str=RandomString.make(3);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Eclipse Projects\\Velocity Selenium\\ScreenShot\\TestCase"+TCID+str+".png");
		FileHandler.copy(src, dest);
		}
	
		

}
