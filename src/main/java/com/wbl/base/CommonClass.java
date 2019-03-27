package com.wbl.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonClass {
protected WebDriver driver;
public CommonClass(WebDriver driver)
{
	this.driver=driver;
}
public String serach(String searchdata)
{
driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys(searchdata);;
driver.findElement(By.xpath("//*[@id=\"global-search-submit\"]/span/span")).click();
return driver.getTitle();
	
}
public int navigationLinks() {
	return driver.findElements(By.className("zhEWD a3FfKb")).size();
}
public int footerLinks()
{
	return driver.findElements(By.className("a1qZfv a3zIHx")).size();
}
}
