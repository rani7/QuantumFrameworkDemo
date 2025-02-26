package com.demo.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	protected static WebDriver driver;
    protected static Properties properties;

    @Before
    public void setUp() {
        loadConfigProperties();
        initializeBrowser();
    }

    private void loadConfigProperties() {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("/QuantumFWDemo/src/test/resources/configuration/config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file");
        }
    }

    private void initializeBrowser() {
        String browser = properties.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
    }
    
}

