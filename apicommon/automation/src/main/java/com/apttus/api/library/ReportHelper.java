package com.apttus.api.library;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.apttus.helpers.JavaHelpers;
import com.apttus.restAssured.RestUtils;
import com.apttus.selenium.WebDriverUtils;
import com.apttus.utils.URLGenerator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import samplereport.CloneReportPOJO;
import samplereport.CreateReportPOJO;
import samplereport.ViewReportPOJO;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;;

public class ReportHelper {
	
	private String accessToken;
	private String priceListID;
	public static String driverPath = "C:/automation/";
	public static String productID;
	public String categoryID;
	public JSONObject matrixData;
	public JSONObject matrixObject;
	public String matrixAppURLID;
	public String jsonFilePath = "jsonData/cpqHelper.json";
	public String HierarchyId;
	public String OptionGroupId;
	WebDriverUtils webDriverUtils = new WebDriverUtils();
	WebDriver driver;
	URLGenerator urlGenerator;
	
	public ReportHelper(String baseURL, String tokenURL) {
		urlGenerator = new URLGenerator();
		urlGenerator.initializeURL(baseURL, tokenURL);
	}
	
	
	/*public static String getProductID() {
		return productID;
	}

	public static void setProductID(String productID) {
		CpqHelper.productID = productID;
	}*/

	public JSONArray getValueFromJSON(String body) throws JSONException{	
		JSONObject jsonObj = new JSONObject(body);
		return jsonObj.getJSONArray("result");
	 }
	
	public String getAccessToken() throws InterruptedException, IOException {
		WebDriverUtils webDriverUtil = new WebDriverUtils();
		webDriverUtil.initializeDriver("Chrome", "");
		driver = webDriverUtil.getDriver();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(urlGenerator.tokenURL);
		if(driver.findElement(By.id("uxOptOutLink")).isDisplayed()) {
			driver.findElement(By.id("uxOptOutLink")).click();

		}
		driver.findElement(By.id("cred_userid_inputtext")).sendKeys("globaladmin@plateng.apttuscloud.io\n"+ "");
		driver.findElement(By.id("cred_password_inputtext")).sendKeys("jakabrA6h#br");
		driver.findElement(By.id("cred_sign_in_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("cred_sign_in_button")).click();
		Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        this.accessToken = js.executeScript("return localStorage.access_token").toString();
        RestUtils.setAccessToken(accessToken);
        driver.close();
		return accessToken;
	}
	
	public Response generateReport(Map<String, String> testData) throws JSONException, FileNotFoundException, IOException {
		Gson gson = new Gson();
		String json = gson.toJson(new ViewReportPOJO().createReportFilter(testData));	
		return RestUtils.postData(urlGenerator.generateReportURL, urlGenerator.generateReportAppURL, json);		
	}
	
	public Response createReport(Map<String, String> createData) throws JsonIOException, IOException, FileNotFoundException {
		Gson gson = new Gson();
		String json = gson.toJson(new CreateReportPOJO().createReportDefinition(createData));
		return RestUtils.postData(urlGenerator.generateReportDefinitionUrl, urlGenerator.generateReportAppURL, json);
	}
	
	public Response cloneReport(Map<String, String> cloneData) {
		Gson gson = new Gson();
		String json = gson.toJson(new CloneReportPOJO().cloneReportDefinition(cloneData));
		return RestUtils.postData(urlGenerator.generateCloneReportUrl, urlGenerator.generateReportAppURL, json);
	}
}
	
	

