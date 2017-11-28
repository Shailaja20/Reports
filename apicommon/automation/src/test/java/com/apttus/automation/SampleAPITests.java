package com.apttus.automation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.apttus.api.library.*;
import com.apttus.data.SampleAPITestsData;
import com.apttus.helpers.GetAccessToken;
import com.apttus.helpers.JavaHelpers;
import com.apttus.selenium.WebDriverUtils;
import com.apttus.utils.URLGenerator;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import samplereport.CloneReportPOJO;
import samplereport.CreateReportPOJO;



public class SampleAPITests {
	
	ReportHelper reportHelper;
	SampleAPITestsData testData = new SampleAPITestsData();
	WebDriverUtils webDriverUtils;
	URLGenerator urlGenerator = new URLGenerator();
	GetAccessToken accessTokenGenerator;
	
	
	@BeforeClass(alwaysRun = true)
    @Parameters({ "runParallel", "environment", "browser", "hubURL" })
    public void tokenGenerations(String runParallel, String environment,
                 String browser, String hubURL) throws Exception
    {            
          Properties property = JavaHelpers.loadPropertyFile(environment);
          urlGenerator.initializeURL(property.getProperty("baseURL"), property.getProperty("tokenBaseURL"));
          reportHelper = new ReportHelper(property.getProperty("baseURL"), property.getProperty("tokenBaseURL"));
          reportHelper.getAccessToken();
    }
	
	 /* @Test(description="Get the reports", groups="API", priority=0)
	   public void generateReport() throws FileNotFoundException, JSONException, IOException {
		   Map<String, String> testData = JavaHelpers.readJsonFile("SampleAPITests.json");
		   Assert.assertEquals(reportHelper.generateReport(testData).getStatusCode(), 200);
	   } 
	  
	  @Test(description="Create Reports Definition", groups="API", priority=1)
	  public void createReport() throws FileNotFoundException, JSONException, IOException {
		  Map<String, String> createData = JavaHelpers.readJsonFile("SampleAPITests.json");
		  createData.put("ReportQuery",new CreateReportPOJO().createReportQuery(createData));
		  Assert.assertEquals(reportHelper.createReport(createData).getStatusCode(), 200);
	  }
*/
	  @Test(description = "Clone Report Definition", groups="API", priority=2)
	  public void cloneReport() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		  Map<String, String> cloneData = JavaHelpers.readJsonFile("SampleAPITests.json");
		  cloneData.put("Query", new CloneReportPOJO().createCloneQuery(cloneData));
		  System.out.println(cloneData);
		  Assert.assertEquals(reportHelper.cloneReport(cloneData).getStatusCode(), 200);
	  }
	   
   
   

}

