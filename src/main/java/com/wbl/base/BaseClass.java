package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.wbl.utils.WebDriverutil;

public class BaseClass {
protected WebDriver driver;
@BeforeClass
public void befoeClass()
{
	driver=new ChromeDriver();
	driver.get("https://www.walmart.com/");
}
@AfterClass
public void  afterClass()
{
	driver.quit();
}
}
