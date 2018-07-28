package com.dattu.Project.Automations;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewToures  {
	@Test
	public void test() throws IOException, InvalidFormatException
	{
		WebDriver d=new FirefoxDriver();
	d.get("https://demo.openmrs.org/openmrs/login.htm");
	d.findElement(By.id("username")).sendKeys("Admin");
	d.findElement(By.id("password")).sendKeys("Admin123");
	}

}
