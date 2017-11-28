package samplereport;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateReportPOJO {
	
	String ObjectId;
	String PackageId;
	String Name;
	String Type;
	boolean Active;
	boolean IsSystem;
	boolean IsTemplate;
	boolean IsAQLQuery;
	String ReportQuery;
	String Id;
	boolean IsActive;

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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public boolean isActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}

	public boolean isIsSystem() {
		return IsSystem;
	}

	public void setIsSystem(boolean isSystem) {
		IsSystem = isSystem;
	}

	public boolean isIsTemplate() {
		return IsTemplate;
	}

	public void setIsTemplate(boolean isTemplate) {
		IsTemplate = isTemplate;
	}

	public boolean isIsAQLQuery() {
		return IsAQLQuery;
	}

	public void setIsAQLQuery(boolean isAQLQuery) {
		IsAQLQuery = isAQLQuery;
	}
	
	public String getReportQuery() {
		return ReportQuery;
	}

	public void setReportQuery(String reportQuery) {
		ReportQuery = reportQuery;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	
	public CreateReportPOJO createReportDefinition (Map<String, String> createData)
	{
		CreateReportPOJO createReportPOJO=new CreateReportPOJO();
		createReportPOJO.setObjectId(createData.get("ObjectId"));
		createReportPOJO.setPackageId(createData.get("PackageId"));
		createReportPOJO.setName(createData.get("Name"));
		createReportPOJO.setType(createData.get("Type"));
		createReportPOJO.setActive(Boolean.valueOf(createData.get("Active")));
		createReportPOJO.setIsActive(Boolean.valueOf(createData.get("IsActive")));
		createReportPOJO.setIsTemplate(Boolean.valueOf(createData.get("IsTemplate")));
		createReportPOJO.setIsAQLQuery(Boolean.valueOf(createData.get("IsAQLQuery")));
		
		createReportPOJO.setReportQuery(createData.get("ReportQuery"));
		createReportPOJO.setId(createData.get("Id"));
		createReportPOJO.setIsActive(Boolean.valueOf(createData.get("IsActive")));
		
		return createReportPOJO;
	}
	
	public String createReportQuery (Map<String, String> testData) {
        return "{\"EntityName\":\""+testData.get("EntityName")+"\",\"Distinct\":false,\"AutoExpandLookups\":false,\"TopRecords\":0,\"Columns\":[\"Id\",\"Name\",\"CreatedById\",\"Owner\",\"CreatedById.Owner\",\"AccountId.Owner\"],\"Criteria\":{\"ExpressionOperator\":0,\"Conditions\":[{\"EntityName\":null,\"FieldName\":\"Name\",\"FilterOperator\":6,\"Value\":\"%agreement%\",\"IsValueFieldName\":false}],\"Filters\":null},\"SortOrders\":null,\"PageInfo\":null,\"Joins\":null,\"AggregateFilter\":null}";	
	}
	
	public static void main(String[] args) {
	}

}
