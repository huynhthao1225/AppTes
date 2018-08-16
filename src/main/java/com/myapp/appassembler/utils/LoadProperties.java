package com.myapp.appassembler.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class LoadProperties {
	
	final static Logger logger = Logger.getLogger(LoadProperties.class);
	public static Properties getProperties() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("./conf/config.properties");

			// load a properties file
			prop.load(input);
				

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		logger.info("prop = " + prop);
		return prop;
	}

}
