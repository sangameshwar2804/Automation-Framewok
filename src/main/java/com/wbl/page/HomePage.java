package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wbl.base.CommonClass;

public class HomePage extends CommonClass{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public int listOfImeages()
	{
		return driver.findElements(By.className("TempoCategoryTile-overlayLink u-focusTile")).size();
	}
public int sliderImages()
{
	return driver.findElements(By.className("carousel-paginator-item")).size();
}
}
