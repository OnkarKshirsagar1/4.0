package new2_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_1 {
	
	public static String getDatafromExcel(int rowindex, int columnindex) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("F:\\Testing\\TestData\\Kite ID.xlsx");
		Sheet MySheet=WorkbookFactory.create(MyFile).getSheetAt(4);
		
		String value = MySheet.getRow(rowindex).getCell(columnindex).getStringCellValue();
		return value;		
	}
	
	public static void captureScreenShot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Eclipse Projects\\Velocity Selenium\\ScreenShot\\TestCaseID"+TCID+".png");
		FileHandler.copy(src, dest);
	}

}
