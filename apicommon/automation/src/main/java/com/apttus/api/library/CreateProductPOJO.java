package com.apttus.api.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CreateProductPOJO{
	List<RequestModel> requestModel = new ArrayList<RequestModel>();
	
	public List<RequestModel> getRequestModel() {
		return requestModel;
	}

	public void setRequestModel(List<RequestModel> requestModel) {
		this.requestModel = requestModel;
	}

	public class RequestModel {
		
		public String Name;
		public String ProductCode;
		public String Apttus_Config2__Uom__c;
		public String Apttus_Config2__ConfigurationType__c;
		public String Apttus_Config2__HasOptions__c;
		public String IsActive;
		public String Apttus_Config2__HasAttributes__c;
		public String Apttus_Config2__Customizable__c;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getProductCode() {
			return ProductCode;
		}
		public void setProductCode(String productCode) {
			ProductCode = productCode;
		}
		public String getApttus_Config2__Uom__c() {
			return Apttus_Config2__Uom__c;
		}
		public void setApttus_Config2__Uom__c(String apttus_Config2__Uom__c) {
			Apttus_Config2__Uom__c = apttus_Config2__Uom__c;
		}
		public String getApttus_Config2__ConfigurationType__c() {
			return Apttus_Config2__ConfigurationType__c;
		}
		public void setApttus_Config2__ConfigurationType__c(String apttus_Config2__ConfigurationType__c) {
			Apttus_Config2__ConfigurationType__c = apttus_Config2__ConfigurationType__c;
		}
		public String getApttus_Config2__HasOptions__c() {
			return Apttus_Config2__HasOptions__c;
		}
		public void setApttus_Config2__HasOptions__c(String apttus_Config2__HasOptions__c) {
			Apttus_Config2__HasOptions__c = apttus_Config2__HasOptions__c;
		}
		public String getIsActive() {
			return IsActive;
		}
		public void setIsActive(String isActive) {
			IsActive = isActive;
		}
		public String getApttus_Config2__HasAttributes__c() {
			return Apttus_Config2__HasAttributes__c;
		}
		public void setApttus_Config2__HasAttributes__c(String apttus_Config2__HasAttributes__c) {
			Apttus_Config2__HasAttributes__c = apttus_Config2__HasAttributes__c;
		}
		public String getApttus_Config2__Customizable__c() {
			return Apttus_Config2__Customizable__c;
		}
		public void setApttus_Config2__Customizable__c(String apttus_Config2__Customizable__c) {
			Apttus_Config2__Customizable__c = apttus_Config2__Customizable__c;
		}	
	
	}
	
	
	public CreateProductPOJO createPojo(Map<String, String> testData) {
		
		CreateProductPOJO createProduct = new CreateProductPOJO();
		CreateProductPOJO.RequestModel createProductData = createProduct.new RequestModel();
		createProductData.setName(testData.get("ProductName"));
		createProductData.setProductCode(testData.get("ProductCode"));
		createProductData.setApttus_Config2__Uom__c(testData.get("UOM"));
		createProductData.setApttus_Config2__ConfigurationType__c(testData.get("ConfigurationType"));
		createProductData.setApttus_Config2__HasOptions__c(testData.get("hasOptions"));
		createProductData.setIsActive(testData.get("IsActive"));
		createProductData.setApttus_Config2__HasAttributes__c(testData.get("hasAttribute"));
		createProductData.setApttus_Config2__Customizable__c(testData.get("customizable"));
		List<RequestModel> requestModelList = new ArrayList<CreateProductPOJO.RequestModel>();
		requestModelList.add(createProductData);
		createProduct.setRequestModel(requestModelList);
		return createProduct;
		
	}
}