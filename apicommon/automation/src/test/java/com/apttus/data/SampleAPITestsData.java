package com.apttus.data;

import java.util.HashMap;
import com.apttus.helpers.*;

public class SampleAPITestsData {
	
	
	final long randomBundle = JavaHelpers.generateRandomNumber();
	final long randomPriceList = JavaHelpers.generateRandomNumber();
	
	
	public HashMap<String, String> createBundleData = new HashMap<String, String>(){{
	       put("Name","Pricing_Related_PC_DCT_Primary_Bundle_"+randomBundle);
	       put("ProductCode","004");
	       put("Apttus_Config2__Uom__c","Each");
	       put("Apttus_Config2__ConfigurationType__c","Bundle");
	       put("Apttus_Config2__HasOptions__c", "false");
	       put("IsActive", "true");
	       put("Apttus_Config2__HasAttributes__c", "false");
	       put("Apttus_Config2__Customizable__c","false");
	  }
	};
	
	public HashMap<String, String> createCategoryBundle = new HashMap<String, String>(){{
	       put("Name","Pricing_Related_PC_DCT_Primary_Category_"+randomBundle);
	       put("Description","For Rest Automation");
	       put("IsActive", "true");
	       put("Type", "Offering");
	  }
	};
	
	public HashMap<String, String> createPriceListData = new HashMap<String, String>(){{
	       put("Name","Pricing_Related_PC_DCT_PriceList_"+randomPriceList);
	       put("isActive","true");
	       put("Description","Each");
	       put("Type","Standard");	       
	  }
	};		
	
	
	public HashMap<String, String> updatePriceListItemData = new HashMap<String, String>(){{
		 put("PriceListID","");
	       put("ChargeType","Standard Price");
	       put("Apttus_Config2__Cost__c","");
	       put("ConfigSequenceNumber","1");
	       put("ListPrice","10");
	       put("PriceType","One Time");
	       put("PriceUOM", "");
	       put("Frequency", "");
	       put("Active", "true");
	       put("PriceMethod", "Per Unit");
	       put("ConfigCriteria", null);
	      
	  }
	};
	
	public HashMap<String, String> createPriceListItem = new HashMap<String, String>(){{
		put("Type", "Standard Price");
		put("Cost", "");
		put("Apttus_Config2__Sequence__c", "1");
		put("ListPrice", "10");
		put("PriceType", "One Time");
		put("Frequency", "");
		put("IsActive", "true");
		put("PriceListID", "");
		put("ProductID", "");
		
	}
	};
	
	
	
	
	public HashMap<String, String> createPrice = new HashMap<String, String>(){{
		put("Type", "Standard Price");
		put("Cost", "");
		put("Apttus_Config2__Sequence__c", "1");
		put("ListPrice", "0");
		put("PriceType", "One Time");
		put("Frequency", "");
		put("IsActive", "true");
		put("PriceListID", "");
		put("ProductID", "");
		
	}
	};
	
	
	public HashMap<String, String> priceListData = new HashMap<String, String>(){{
	       put("Apttus_Config2__ChargeType__c","Standard Price");
	       put("Apttus_Config2__Sequence__c", "1");
	       put("Apttus_Config2__ListPrice__c","33.33");
	       put("Apttus_Config2_s_PriceType__c", "One Time");
	       put("Apttus_Config2__Frequency__c", "");
	       put("Apttus_Config2__Active__c", "true");
	       put("Apttus_Config2__PriceMethod__c", "Per Unit");
	       put("Apttus_Config2__Criteria__c", "null");
	      
	  }
	};
	
	
	

}
