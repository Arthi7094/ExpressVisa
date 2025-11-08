package com.ExpressVisa.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtilization {
	public String readdatafromproperty(String key) throws IOException {
	
FileInputStream fis=new FileInputStream(ipathconstants.propertypath);
Properties p=new Properties();
p.load(fis);
String data=p.getProperty(key);
return data;
}
	public void readdatafromexcel(String key) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(ipathconstants.Excelpath);
	}
}