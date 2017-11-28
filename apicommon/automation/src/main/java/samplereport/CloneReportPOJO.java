package samplereport;

import java.util.Map;

public class CloneReportPOJO {
	String ObjectId;
	String PackageId;
	String Query;
	boolean IsActive;
	String Type;
	String Name;
	
	public String getObjectId() {
		return ObjectId;
	}
	public void setObjectId(String objectId) {
		ObjectId = objectId;
	}
	public String getPackageId() {
		return PackageId;
	}
	public void setPackageId(String packageId) {
		PackageId = packageId;
	}
	public String getQuery() {
		return Query;
	}
	public void setQuery(String query) {
		Query = query;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public CloneReportPOJO cloneReportDefinition(Map<String, String> cloneData) {
		CloneReportPOJO cloneReportPOJO=new CloneReportPOJO();
		cloneReportPOJO.setObjectId(cloneData.get("ObjectId"));
		cloneReportPOJO.setPackageId(cloneData.get("PackageId"));
		cloneReportPOJO.setQuery(cloneData.get("Query"));
		cloneReportPOJO.setIsActive(Boolean.valueOf(cloneData.get("IsActive")));
		cloneReportPOJO.setType(cloneData.get("Type"));
		cloneReportPOJO.setName(cloneData.get("Name"));
		return cloneReportPOJO;
	}
	
	public String createCloneQuery(Map<String, String> testData) {
		return "{\"EntityName\":\"" + testData.get("EntityName") + "\" ,\"Distinct\":false,\"AutoExpandLookups\":false,\"TopRecords\":0,\"Columns\":[\"Id\",\"Name\",\"CreatedById\",\"Owner\",\"CreatedById.Owner\",\"AccountId.Owner\"],\"Criteria\":{\"ExpressionOperator\":0,\"Conditions\":[{\"EntityName\":null,\"FieldName\":\"Name\",\"FilterOperator\":6,\"Value\":\"%agreement%\",\"IsValueFieldName\":false}],\"Filters\":null},\"SortOrders\":null,\"PageInfo\":null,\"Joins\":null,\"AggregateFilter\":null}";
	}

}
