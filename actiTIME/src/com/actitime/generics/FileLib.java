package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * Generic class to read the data from property file or excel
 * @author Supriya
 */
public class FileLib {
	/**
	 * used to read the data from the property file
	 * @param key
	 * @return the string value of the key
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * used to read the data from the excel
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @return String value of the excel
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * @throws EncryptedDocumnnet Exception
	 * @throws IOExcpetion
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscriptdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return value;
		
	}
	
}
