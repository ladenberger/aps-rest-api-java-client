# GroupsApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGroupsUsingGET**](GroupsApi.md#getGroupsUsingGET) | **GET** /enterprise/groups | Query groups
[**getUsersForGroupUsingGET**](GroupsApi.md#getUsersForGroupUsingGET) | **GET** /enterprise/groups/{groupId}/users | List members of a group


<a name="getGroupsUsingGET"></a>
# **getGroupsUsingGET**
> ResultListDataRepresentationLightGroupRepresentation getGroupsUsingGET(filter, groupId, externalId, externalIdCaseInsensitive, tenantId)

Query groups

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String filter = "filter_example"; // String | filter
Long groupId = 789L; // Long | groupId
String externalId = "externalId_example"; // String | externalId
String externalIdCaseInsensitive = "externalIdCaseInsensitive_example"; // String | externalIdCaseInsensitive
Long tenantId = 789L; // Long | tenantId
try {
    ResultListDataRepresentationLightGroupRepresentation result = apiInstance.getGroupsUsingGET(filter, groupId, externalId, externalIdCaseInsensitive, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **groupId** | **Long**| groupId | [optional]
 **externalId** | **String**| externalId | [optional]
 **externalIdCaseInsensitive** | **String**| externalIdCaseInsensitive | [optional]
 **tenantId** | **Long**| tenantId | [optional]

### Return type

[**ResultListDataRepresentationLightGroupRepresentation**](ResultListDataRepresentationLightGroupRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsersForGroupUsingGET"></a>
# **getUsersForGroupUsingGET**
> ResultListDataRepresentationLightUserRepresentation getUsersForGroupUsingGET(groupId)

List members of a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | groupId
try {
    ResultListDataRepresentationLightUserRepresentation result = apiInstance.getUsersForGroupUsingGET(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getUsersForGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**ResultListDataRepresentationLightUserRepresentation**](ResultListDataRepresentationLightUserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

