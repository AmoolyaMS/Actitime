package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WebDriverUtils {
public int getLastrow(String sheet) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	int row=wb.getSheet(sheet).getLastRowNum();
	return row;
}
}
