package com.vtiger.genericUtilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
	
public class propertyfileUtiity {

		public String readDataFromPropertyFile(String key) throws IOException {
			FileInputStream fis=new FileInputStream("C:\\Users\\DELL 5290\\eclipse-workspace\\hybrid\\src\\test\\resources\\swaglabs.properties");
			Properties ps=new Properties();
			ps.load(fis);
			return ps.getProperty(key);
		}
}
