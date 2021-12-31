package vtiger;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	public String getDataFromProperty(String path,String key) throws Throwable{
		FileInputStream ip =new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(ip);
		return prop.getProperty(key);
	}

}
