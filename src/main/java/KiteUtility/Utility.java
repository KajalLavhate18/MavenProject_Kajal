package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import KiteBase.Base;

public class Utility extends Base {
	
	
	public static String dataReadingFromExcel(int Row,int Cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\Users\\91860\\Desktop\\26March B batch\\xml\\Excel26MarchB.xlsx");
		Sheet MySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String value = MySheet.getRow(Row).getCell(Cell).getStringCellValue();
		return value;
	}
	public static void pickScreenshot(String SSID) throws IOException {
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\91860\\Desktop\\26March B batch\\ScreenshotMyScreenshot"+SSID+".png");
		FileHandler.copy(src, dest);
		
		
	}
	
	public static String dataReadFromPropertyFile(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream FIS=new FileInputStream("C:\\Users\\91860\\eclipse-workspace\\investment-banking\\seleniumProp.Properties");
		prop.load(FIS);
	    String value = prop.getProperty(key);
	    return value;
	}
	
	
	

}
