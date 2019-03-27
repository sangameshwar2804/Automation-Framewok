package com.wbl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverutil {

public static WebDriver getDiver(String browsername)
{
	WebDriver driver=null;
	try {
		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "\\resources\\drivers\\chromedriver.exe");
			driver=new FirefoxDriver();
		default:
			System.setProperty("webdriver.opera.driver", "\\resources\\drivers\\chromedriver.exe");
			driver=new OperaDriver();
		}
	}catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
	return driver;
}
}
