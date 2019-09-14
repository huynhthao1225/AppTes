package com.myapp.appassembler;

import java.util.LinkedHashMap;
import java.util.Properties;

import com.myapp.appassembler.challenge.FindTwoNumbersSumOfTarget;
import com.myapp.appassembler.challenge.SortStringToken;
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

		// challenge 1
		for (String key : linkedHashMap.keySet()) {
			System.out.println(key + "\t" + linkedHashMap.get(key));
		}

		// challenge 2

		FindTwoNumbersSumOfTarget findTwoNumbersSumOfTarget = new FindTwoNumbersSumOfTarget();
		int[] numbers = {3, 5, 4, 7};
		int[] foundThem = findTwoNumbersSumOfTarget.findThem(numbers, 7);

		System.exit(ranValue);

	}

}
