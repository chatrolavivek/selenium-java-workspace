package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write_PropertiesFile {

	public static void main(String[] args) throws IOException {

//		PropertiesFile is a Key-Value pair file
		// browser='Firefox' tool='Selenium' (no space should be there)
		// Most companies use this

//		To Create - Create text file and save it as a properties file using name = "anyName.properties"
		// Select All Files when using save as in notepad

//		To Read from Properties File
		FileInputStream fs = new FileInputStream(
				"E:\\Computer Science\\Software Testing\\Projects\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);

		String browser = prop.getProperty("browser");
		System.out.println(browser);

		System.out.println(prop.getProperty("environment"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("currectEmail"));
		System.out.println(prop.getProperty("wrongPassword"));

//		To write in properties file
		// This Changes are in java memory only, not updated in our local file
		prop.setProperty("tool", "Selenium");
		System.out.println(prop.getProperty("tool"));

		prop.setProperty("automation", "web");
		System.out.println(prop.getProperty("automation"));

//		To make these changes visible in our local file on computer
		FileOutputStream fo = new FileOutputStream(
				"E:\\Computer Science\\Software Testing\\Projects\\testing\\prop.properties");
		// To save and add comment
		prop.store(fo, "Adding to Properties list");

	}

}
