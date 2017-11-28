package com.apttus.utils;

public class URLGenerator {
	public String tokenURL;
	public String generateReportURL;
	public String generateReportAppURL;
	public String generateReportDefinitionUrl;
	public String generateCloneReportUrl;
	
	
	public void initializeURL(String baseURL, String tokenURL) {
		this.tokenURL= tokenURL;
		generateReportURL = baseURL + "api/generic/v1/search/advance/cmn_ReportDefinition";
		generateReportAppURL = baseURL + "/ui/operationalReport/operationalReport/home";
		generateReportDefinitionUrl = baseURL + "/api/generic/v1/ReportEngine/";
		generateCloneReportUrl = baseURL + "api/generic/v1/ReportEngine/clone/0fe328b4-a5ce-e711-80c2-0004ffb07817";
	}

}
