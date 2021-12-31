package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelread{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File absPath=new File("./resorces/Book3.xlsx");
		FileInputStream fis=new FileInputStream(absPath);
		
		Workbook work = WorkbookFactory.create(fis);
		
		String a = work.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String b = work.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(a);
		System.out.println(b);

	}

}
