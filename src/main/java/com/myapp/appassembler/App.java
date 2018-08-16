package com.myapp.appassembler;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.myapp.appassembler.utils.LoadProperties;

public class App {

	final static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		/*ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource("./conf/log4j.properties"); */
		PropertyConfigurator.configure("./conf/log4j.properties");
		
		logger.info("Starting application ...");
		
		Properties prop = LoadProperties.getProperties();
		String appName = prop.getProperty("app.Name");
		logger.info("Application Name = " + appName);
		int ranValue = (int)(Math.random()*100);
		
		logger.info("use unix command \"echo $?\" to retrieve exit code");
		logger.info("End application with exit code = " + ranValue);
		System.exit(ranValue);

	}

}
