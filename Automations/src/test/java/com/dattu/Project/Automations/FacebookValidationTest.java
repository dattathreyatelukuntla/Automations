package com.dattu.Project.Automations;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookValidationTest extends DriverUtility{

	@Test
	public void Facebooklogin() throws IOException, InvalidFormatException
	{
		propertiesUtility pu=new propertiesUtility("C:\\Users\\dattu\\git\\repository2\\mahesh\\Automations\\src\\main\\java\\com\\dattu\\Project\\Automations\\obejectRepository\\config.properties");
		getdriver().get(pu.getPropertyValue("FacebookUrl"));
		ExtentReportsUtility.ExtentReport("Facebook Application Successfully opend");
		logReportsUtility.logMsg("Facebook Application Successfully opend");
		ExcelUtility eu=new ExcelUtility("C:\\Users\\dattu\\git\\repository2\\mahesh\\Automations\\src\\main\\java\\com\\dattu\\Project\\Automations\\obejectRepository\\Book1.xlsx");
		propertiesUtility p= new propertiesUtility("C:\\Users\\dattu\\git\\repository2\\mahesh\\Automations\\src\\main\\java\\com\\dattu\\Project\\Automations\\obejectRepository\\oR.properties");
		
		getdriver().findElement(By.id(p.getPropertyValue("Uname"))).sendKeys(eu.getcelldata("Sheet2", 0, 0));
		ExtentReportsUtility.ExtentReport("Facebook Application Successfully opend");
		logReportsUtility.logMsg("Facebook Application Successfully opend");
		ExtentReportsUtility.ExtentReport("Username Enterd Successfully ");
		logReportsUtility.logMsg("Username Enterd Successfully ");
		getdriver().findElement(By.id(p.getPropertyValue("pwd"))).sendKeys(eu.getcelldata("Sheet2", 1, 0));
		ExtentReportsUtility.ExtentReport("Facebook pwd Successfully Successfully Entered");
		logReportsUtility.logMsg("Facebook pwd Successfully Successfully Entered");
		getdriver().findElement(By.id(p.getPropertyValue("login"))).click();;
		ExtentReportsUtility.ExtentReport("Facebook Application Login Successfully entered");
		logReportsUtility.logMsg("Facebook Application Login Successfully entered");
		
	}
}
