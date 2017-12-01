package com.wbl.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExcel {
	
	public static void main(String args[]) throws AWTException, IOException, InterruptedException{
		//new DataDrivenExcel().excelWrite();
		//new DataDrivenExcel().excelRead();
		//new DataDrivenExcel().fileUploadWithRobot();
		new DataDrivenExcel().fileUploadWithAutoIT();
	}
	
	public void excelRead() throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\WBL\\Desktop\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh1 = wb.getSheet("Employee");
		XSSFRow row1 = sh1.getRow(0);
		XSSFCell cell = row1.getCell(0);
		String s = cell.getStringCellValue();
		System.out.println("First cell value "+ s);
		System.out.println("No of rows:"+sh1.getLastRowNum());
		
		
	}
	
	public void excelWrite() throws IOException{
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet1 = wb.createSheet("Employee");
		XSSFRow sh1row = sheet1.createRow(0);
		XSSFCell sh1cell = sh1row.createCell(0);
		sh1cell.setCellValue("Enter Employee Details");
				
		
		XSSFSheet sheet2 = wb.createSheet("Department");
		XSSFRow sh2row = sheet2.createRow(0);
		XSSFCell sh2cell = sh2row.createCell(0);
		sh2cell.setCellValue("Enter Department Details");
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\WBL\\Desktop\\Data.xlsx");
		wb.write(file);
		
		System.out.println("successfully written file ");
			
	}
	
	public void fileUploadWithRobot() throws AWTException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpg2pdf.com/");
		StringSelection path = new StringSelection("C:\\Users\\WBL\\Documents\\webdriver8.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		driver.findElement(By.cssSelector("#pick-files > span.ui-button-text")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		System.out.println("..1");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("..2");
		
	}
	public void fileUploadWithAutoIT() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jpg2pdf.com/");
		driver.findElement(By.cssSelector("#pick-files > span.ui-button-text")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//resources//Test.exe");
		//Process pro = new ProcessBuilder(System.getProperty(System.getProperty("user.dir")+"//resources//Test.exe"),"", "Open").start();  
		
}
}
