package utilities;

import java.util.Properties;

public class PropertyManager{
	Properties prop;
	
	public String getURL() {
		return prop.getProperty("url");
	}
	

}
