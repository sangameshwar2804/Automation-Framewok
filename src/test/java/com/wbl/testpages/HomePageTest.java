package com.wbl.testpages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.base.BaseClass;
import com.wbl.page.HomePage;

public class HomePageTest extends BaseClass{
HomePage hm;
@BeforeMethod
public void beforeMethod()

{
	hm=new HomePage(driver);
}
@Test
public void searchBoxTest()
{
	hm.serach("laptops");
	String actual=driver.getTitle();
	Assert.assertEquals(actual, "laptops - Walmart.com");
}
@Test
public void navigationsTest() {
	int actual =hm.navigationLinks();
	Assert.assertEquals(actual, "2");
}
@Test
public void footersTest()
{
	int actual=hm.footerLinks();
	Assert.assertEquals(actual, "5");
}
@Test
public void imagesTest()
{
	int actual =hm.listOfImeages();
	Assert.assertEquals(actual,"14");
}
}
