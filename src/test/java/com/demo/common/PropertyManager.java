package com.demo.common;

import com.demo.base.BasePage;

public class PropertyManager extends BasePage{
	
	public String getURL() {
		return properties.getProperty("url");
	}
	
	public String getFilePath() {
		return properties.getProperty("filepath");
	}
	
}
