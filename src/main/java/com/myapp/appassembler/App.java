package com.myapp.appassembler;

import java.util.LinkedHashMap;
import java.util.Properties;

import com.myapp.appassembler.tool.SortStringToken;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.myapp.appassembler.utils.LoadProperties;

public class App {

	final static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("E:\\javaworkspace\\AppTes\\src\\config\\log4j.properties");
		
		logger.info("Starting application ...");		
		Properties prop = LoadProperties.getProperties();
		String appName = prop.getProperty("app.Name");
		logger.info("Application Name = " + appName);
		int ranValue = (int)(Math.random()*100);
		
		logger.info("use unix command \"echo $?\" to retrieve exit code");
		logger.info("End application with exit code = " + ranValue);

		SortStringToken sortStringToken = new SortStringToken();
		LinkedHashMap<String, Integer> linkedHashMap = sortStringToken.sort("This is Thao and This is Thy");

		for (String key : linkedHashMap.keySet()) {
			System.out.println(key + "\t" + linkedHashMap.get(key));
		}
		System.exit(ranValue);

	}

}
