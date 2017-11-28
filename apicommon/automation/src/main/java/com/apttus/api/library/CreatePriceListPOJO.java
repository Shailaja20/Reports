package com.apttus.api.library;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

public class CreatePriceListPOJO {
	List<RequestModel> requestModel = new ArrayList<RequestModel>();

	public List<RequestModel> getRequestModel() {
		return requestModel;
	}

	public void setRequestModel(List<RequestModel> requestModel) {
		this.requestModel = requestModel;
	}

	public class RequestModel{
/*		List<PriceListSO> PriceListSO = new ArrayList<PriceListSO>();

		public List<PriceListSO> getPriceListSO() {
			return PriceListSO;
		}

		public void setPriceListSO(List<PriceListSO> priceListSO) {
			PriceListSO = priceListSO;
		}*/
		
		PriceListSO PriceListSO = new PriceListSO();

		public PriceListSO getPriceListSO() {
			return PriceListSO;
		}

		public void setPriceListSO(PriceListSO priceListSO) {
			PriceListSO = priceListSO;
		}
		

	}
	
	
	public class PriceListSO{
		private String Name;
		private boolean Apttus_Config2__Active__c;
		/*private String Apttus_Config2__EffectiveDate__c;
		private String Apttus_Config2__ExpirationDate__c;*/
		private String Apttus_Config2__Description__c;
		private String Apttus_Config2__BasedOnPriceListId__c;
		private String Apttus_Config2__BasedOnAdjustmentType__c;
		private String Apttus_Config2__BasedOnAdjustmentAmount__c;
		private String Apttus_Config2__Type__c;
		private String Apttus_Config2__GuidePage__c;
		private String Apttus_Config2__ContractNumber__c;
		private String Apttus_Config2__AccountId__c;
		private String Apttus_Config2__CostModelId__c;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public boolean getApttus_Config2__Active__c() {
			return Apttus_Config2__Active__c;
		}
		public void setApttus_Config2__Active__c(boolean apttus_Config2__Active__c) {
			Apttus_Config2__Active__c = apttus_Config2__Active__c;
		}
/*		public String getApttus_Config2__EffectiveDate__c() {
			return Apttus_Config2__EffectiveDate__c;
		}
		public void setApttus_Config2__EffectiveDate__c(String apttus_Config2__EffectiveDate__c) {
			Apttus_Config2__EffectiveDate__c = apttus_Config2__EffectiveDate__c;
		}
		public String getApttus_Config2__ExpirationDate__c() {
			return Apttus_Config2__ExpirationDate__c;
		}
		public void setApttus_Config2__ExpirationDate__c(String apttus_Config2__ExpirationDate__c) {
			Apttus_Config2__ExpirationDate__c = apttus_Config2__ExpirationDate__c;
		}*/
		public String getApttus_Config2__Description__c() {
			return Apttus_Config2__Description__c;
		}
		public void setApttus_Config2__Description__c(String apttus_Config2__Description__c) {
			Apttus_Config2__Description__c = apttus_Config2__Description__c;
		}
		public String getApttus_Config2__BasedOnPriceListId__c() {
			return Apttus_Config2__BasedOnPriceListId__c;
		}
		public void setApttus_Config2__BasedOnPriceListId__c(String apttus_Config2__BasedOnPriceListId__c) {
			Apttus_Config2__BasedOnPriceListId__c = apttus_Config2__BasedOnPriceListId__c;
		}
		public String getApttus_Config2__BasedOnAdjustmentType__c() {
			return Apttus_Config2__BasedOnAdjustmentType__c;
		}
		public void setApttus_Config2__BasedOnAdjustmentType__c(String apttus_Config2__BasedOnAdjustmentType__c) {
			Apttus_Config2__BasedOnAdjustmentType__c = apttus_Config2__BasedOnAdjustmentType__c;
		}
		public String getApttus_Config2__BasedOnAdjustmentAmount__c() {
			return Apttus_Config2__BasedOnAdjustmentAmount__c;
		}
		public void setApttus_Config2__BasedOnAdjustmentAmount__c(String apttus_Config2__BasedOnAdjustmentAmount__c) {
			Apttus_Config2__BasedOnAdjustmentAmount__c = apttus_Config2__BasedOnAdjustmentAmount__c;
		}
		public String getApttus_Config2__Type__c() {
			return Apttus_Config2__Type__c;
		}
		public void setApttus_Config2__Type__c(String apttus_Config2__Type__c) {
			Apttus_Config2__Type__c = apttus_Config2__Type__c;
		}
		public String getApttus_Config2__GuidePage__c() {
			return Apttus_Config2__GuidePage__c;
		}
		public void setApttus_Config2__GuidePage__c(String apttus_Config2__GuidePage__c) {
			Apttus_Config2__GuidePage__c = apttus_Config2__GuidePage__c;
		}
		public String getApttus_Config2__ContractNumber__c() {
			return Apttus_Config2__ContractNumber__c;
		}
		public void setApttus_Config2__ContractNumber__c(String apttus_Config2__ContractNumber__c) {
			Apttus_Config2__ContractNumber__c = apttus_Config2__ContractNumber__c;
		}
		public String getApttus_Config2__AccountId__c() {
			return Apttus_Config2__AccountId__c;
		}
		public void setApttus_Config2__AccountId__c(String apttus_Config2__AccountId__c) {
			Apttus_Config2__AccountId__c = apttus_Config2__AccountId__c;
		}
		public String getApttus_Config2__CostModelId__c() {
			return Apttus_Config2__CostModelId__c;
		}
		public void setApttus_Config2__CostModelId__c(String apttus_Config2__CostModelId__c) {
			Apttus_Config2__CostModelId__c = apttus_Config2__CostModelId__c;
		}
		
	}
	
	public CreatePriceListPOJO createPOJO(HashMap<String, String> testData) {
		CreatePriceListPOJO createPriceListPOJO = new CreatePriceListPOJO();
		CreatePriceListPOJO.PriceListSO priceListSO = createPriceListPOJO.new PriceListSO();
		CreatePriceListPOJO.RequestModel requestModel = createPriceListPOJO.new RequestModel();
		priceListSO.setName(testData.get("Name"));
		System.out.println("");
		priceListSO.setApttus_Config2__Active__c(Boolean.valueOf(testData.get("isActive")));
	//	priceListSO.setApttus_Config2__EffectiveDate__c("");
		//priceListSO.setApttus_Config2__ExpirationDate__c("");
		priceListSO.setApttus_Config2__Description__c(testData.get("Description"));
		priceListSO.setApttus_Config2__BasedOnPriceListId__c("");
		priceListSO.setApttus_Config2__BasedOnAdjustmentType__c("");
		priceListSO.setApttus_Config2__BasedOnAdjustmentAmount__c("");
		priceListSO.setApttus_Config2__Type__c(testData.get("Type"));
		priceListSO.setApttus_Config2__GuidePage__c("");
		priceListSO.setApttus_Config2__ContractNumber__c("");
		priceListSO.setApttus_Config2__AccountId__c("");
		priceListSO.setApttus_Config2__CostModelId__c("");		
		List<PriceListSO> priceListSOList = new ArrayList<PriceListSO>();
		priceListSOList.add(priceListSO);
	
		requestModel.setPriceListSO(priceListSO);
		List<RequestModel> requestModelList  = new ArrayList<RequestModel>();
		requestModelList.add(requestModel);
		createPriceListPOJO.setRequestModel(requestModelList);
		String json = new Gson().toJson(createPriceListPOJO);
				System.out.println("");
		
		return createPriceListPOJO;
	}
	
	
	
	
	
	/*
	 * {
  "requestModel": [
    {
      "PriceListSO": {
        "Name": "priceListTest",
        "Apttus_Config2__Active__c": true,
        "Apttus_Config2__EffectiveDate__c": 1503945000000,
        "Apttus_Config2__ExpirationDate__c": 1504031400000,
        "Apttus_Config2__Description__c": "priceListTest",
        "Apttus_Config2__BasedOnPriceListId__c": "",
        "Apttus_Config2__BasedOnAdjustmentType__c": "",
        "Apttus_Config2__BasedOnAdjustmentAmount__c": "",
        "Apttus_Config2__Type__c": "Standard",
        "Apttus_Config2__GuidePage__c": "",
        "Apttus_Config2__ContractNumber__c": "",
        "Apttus_Config2__AccountId__c": "",
        "Apttus_Config2__CostModelId__c": ""
      }
    }
  ]
}
	 */

}