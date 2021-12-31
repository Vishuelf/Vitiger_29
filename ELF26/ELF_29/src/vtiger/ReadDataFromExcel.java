package vtiger;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataFromExcel {

	public String getDataFromExel(String path,int row,int col,String sheet) throws EncryptedDocumentException, IOException  {
		FileInputStream ip = new FileInputStream(path);
		Workbook w=WorkbookFactory.create(ip);
				
		Sheet s=w.getSheet(sheet);
		String data = s.getRow(row).getCell(col).toString();
		return data;
	}

}
