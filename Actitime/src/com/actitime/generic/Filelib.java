package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	public String readdatafromproperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	public String readdatafromexcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		String data = w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public void writedataintoecxel(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		w.write(fos);

	}
}
