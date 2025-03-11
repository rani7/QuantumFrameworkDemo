package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	protected static Properties prop;

	public Properties init_prop() {
		prop = new Properties();

		try {
			FileInputStream input = new FileInputStream("/QuantumFWDemo/src/test/resources/configuration/config.properties");
			prop.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return prop;
		}

	}
