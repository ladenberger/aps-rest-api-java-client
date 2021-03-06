/*
 * Process Services Enterprise API
 * Provides access to the complete features provided by Alfresco Process Services powered by Activiti.  You can use this API to integrate Alfresco Process Services with external applications.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.activiti.engine.remote.client.api;

import org.activiti.engine.remote.client.ApiCallback;
import org.activiti.engine.remote.client.ApiClient;
import org.activiti.engine.remote.client.ApiException;
import org.activiti.engine.remote.client.ApiResponse;
import org.activiti.engine.remote.client.Configuration;
import org.activiti.engine.remote.client.Pair;
import org.activiti.engine.remote.client.ProgressRequestBody;
import org.activiti.engine.remote.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.activiti.engine.remote.client.model.AppDeploymentRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationAppDeploymentRepresentation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuntimeAppDeploymentsApi {
    private ApiClient apiClient;

    public RuntimeAppDeploymentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RuntimeAppDeploymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteAppDeploymentUsingDELETE
     * @param appDeploymentId appDeploymentId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAppDeploymentUsingDELETECall(Long appDeploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/runtime-app-deployments/{appDeploymentId}"
            .replaceAll("\\{" + "appDeploymentId" + "\\}", apiClient.escapeString(appDeploymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAppDeploymentUsingDELETEValidateBeforeCall(Long appDeploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appDeploymentId' is set
        if (appDeploymentId == null) {
            throw new ApiException("Missing the required parameter 'appDeploymentId' when calling deleteAppDeploymentUsingDELETE(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteAppDeploymentUsingDELETECall(appDeploymentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove an app deployment
     * 
     * @param appDeploymentId appDeploymentId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAppDeploymentUsingDELETE(Long appDeploymentId) throws ApiException {
        deleteAppDeploymentUsingDELETEWithHttpInfo(appDeploymentId);
    }

    /**
     * Remove an app deployment
     * 
     * @param appDeploymentId appDeploymentId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAppDeploymentUsingDELETEWithHttpInfo(Long appDeploymentId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAppDeploymentUsingDELETEValidateBeforeCall(appDeploymentId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove an app deployment (asynchronously)
     * 
     * @param appDeploymentId appDeploymentId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAppDeploymentUsingDELETEAsync(Long appDeploymentId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteAppDeploymentUsingDELETEValidateBeforeCall(appDeploymentId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for exportAppDefinitionUsingGET1
     * @param deploymentId deploymentId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call exportAppDefinitionUsingGET1Call(String deploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/export-app-deployment/{deploymentId}"
            .replaceAll("\\{" + "deploymentId" + "\\}", apiClient.escapeString(deploymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call exportAppDefinitionUsingGET1ValidateBeforeCall(String deploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new ApiException("Missing the required parameter 'deploymentId' when calling exportAppDefinitionUsingGET1(Async)");
        }
        

        com.squareup.okhttp.Call call = exportAppDefinitionUsingGET1Call(deploymentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export the app archive for a deployment
     * 
     * @param deploymentId deploymentId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void exportAppDefinitionUsingGET1(String deploymentId) throws ApiException {
        exportAppDefinitionUsingGET1WithHttpInfo(deploymentId);
    }

    /**
     * Export the app archive for a deployment
     * 
     * @param deploymentId deploymentId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> exportAppDefinitionUsingGET1WithHttpInfo(String deploymentId) throws ApiException {
        com.squareup.okhttp.Call call = exportAppDefinitionUsingGET1ValidateBeforeCall(deploymentId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Export the app archive for a deployment (asynchronously)
     * 
     * @param deploymentId deploymentId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call exportAppDefinitionUsingGET1Async(String deploymentId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = exportAppDefinitionUsingGET1ValidateBeforeCall(deploymentId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAppDefinitionsUsingGET1
     * @param nameLike nameLike (optional)
     * @param tenantId tenantId (optional)
     * @param latest latest (optional)
     * @param start start (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param size size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAppDefinitionsUsingGET1Call(String nameLike, Long tenantId, Boolean latest, Integer start, String sort, String order, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/runtime-app-deployments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nameLike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nameLike", nameLike));
        if (tenantId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tenantId", tenantId));
        if (latest != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("latest", latest));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAppDefinitionsUsingGET1ValidateBeforeCall(String nameLike, Long tenantId, Boolean latest, Integer start, String sort, String order, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAppDefinitionsUsingGET1Call(nameLike, tenantId, latest, start, sort, order, size, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query app deployments
     * 
     * @param nameLike nameLike (optional)
     * @param tenantId tenantId (optional)
     * @param latest latest (optional)
     * @param start start (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param size size (optional)
     * @return ResultListDataRepresentationAppDeploymentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultListDataRepresentationAppDeploymentRepresentation getAppDefinitionsUsingGET1(String nameLike, Long tenantId, Boolean latest, Integer start, String sort, String order, Integer size) throws ApiException {
        ApiResponse<ResultListDataRepresentationAppDeploymentRepresentation> resp = getAppDefinitionsUsingGET1WithHttpInfo(nameLike, tenantId, latest, start, sort, order, size);
        return resp.getData();
    }

    /**
     * Query app deployments
     * 
     * @param nameLike nameLike (optional)
     * @param tenantId tenantId (optional)
     * @param latest latest (optional)
     * @param start start (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param size size (optional)
     * @return ApiResponse&lt;ResultListDataRepresentationAppDeploymentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultListDataRepresentationAppDeploymentRepresentation> getAppDefinitionsUsingGET1WithHttpInfo(String nameLike, Long tenantId, Boolean latest, Integer start, String sort, String order, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = getAppDefinitionsUsingGET1ValidateBeforeCall(nameLike, tenantId, latest, start, sort, order, size, null, null);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationAppDeploymentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query app deployments (asynchronously)
     * 
     * @param nameLike nameLike (optional)
     * @param tenantId tenantId (optional)
     * @param latest latest (optional)
     * @param start start (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param size size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAppDefinitionsUsingGET1Async(String nameLike, Long tenantId, Boolean latest, Integer start, String sort, String order, Integer size, final ApiCallback<ResultListDataRepresentationAppDeploymentRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAppDefinitionsUsingGET1ValidateBeforeCall(nameLike, tenantId, latest, start, sort, order, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationAppDeploymentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAppDeploymentUsingGET
     * @param appDeploymentId appDeploymentId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAppDeploymentUsingGETCall(Long appDeploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/runtime-app-deployments/{appDeploymentId}"
            .replaceAll("\\{" + "appDeploymentId" + "\\}", apiClient.escapeString(appDeploymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAppDeploymentUsingGETValidateBeforeCall(Long appDeploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appDeploymentId' is set
        if (appDeploymentId == null) {
            throw new ApiException("Missing the required parameter 'appDeploymentId' when calling getAppDeploymentUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getAppDeploymentUsingGETCall(appDeploymentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an app deployment
     * 
     * @param appDeploymentId appDeploymentId (required)
     * @return AppDeploymentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AppDeploymentRepresentation getAppDeploymentUsingGET(Long appDeploymentId) throws ApiException {
        ApiResponse<AppDeploymentRepresentation> resp = getAppDeploymentUsingGETWithHttpInfo(appDeploymentId);
        return resp.getData();
    }

    /**
     * Get an app deployment
     * 
     * @param appDeploymentId appDeploymentId (required)
     * @return ApiResponse&lt;AppDeploymentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AppDeploymentRepresentation> getAppDeploymentUsingGETWithHttpInfo(Long appDeploymentId) throws ApiException {
        com.squareup.okhttp.Call call = getAppDeploymentUsingGETValidateBeforeCall(appDeploymentId, null, null);
        Type localVarReturnType = new TypeToken<AppDeploymentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an app deployment (asynchronously)
     * 
     * @param appDeploymentId appDeploymentId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAppDeploymentUsingGETAsync(Long appDeploymentId, final ApiCallback<AppDeploymentRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAppDeploymentUsingGETValidateBeforeCall(appDeploymentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AppDeploymentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRuntimeAppDeploymentByDeploymentUsingGET
     * @param deploymentId deploymentId (optional)
     * @param dmnDeploymentId dmnDeploymentId (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRuntimeAppDeploymentByDeploymentUsingGETCall(String deploymentId, Long dmnDeploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/runtime-app-deployment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deploymentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deploymentId", deploymentId));
        if (dmnDeploymentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dmnDeploymentId", dmnDeploymentId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRuntimeAppDeploymentByDeploymentUsingGETValidateBeforeCall(String deploymentId, Long dmnDeploymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getRuntimeAppDeploymentByDeploymentUsingGETCall(deploymentId, dmnDeploymentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an app by deployment ID or DMN deployment ID
     * Either a deploymentId or a dmnDeploymentId must be provided
     * @param deploymentId deploymentId (optional)
     * @param dmnDeploymentId dmnDeploymentId (optional)
     * @return AppDeploymentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AppDeploymentRepresentation getRuntimeAppDeploymentByDeploymentUsingGET(String deploymentId, Long dmnDeploymentId) throws ApiException {
        ApiResponse<AppDeploymentRepresentation> resp = getRuntimeAppDeploymentByDeploymentUsingGETWithHttpInfo(deploymentId, dmnDeploymentId);
        return resp.getData();
    }

    /**
     * Get an app by deployment ID or DMN deployment ID
     * Either a deploymentId or a dmnDeploymentId must be provided
     * @param deploymentId deploymentId (optional)
     * @param dmnDeploymentId dmnDeploymentId (optional)
     * @return ApiResponse&lt;AppDeploymentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AppDeploymentRepresentation> getRuntimeAppDeploymentByDeploymentUsingGETWithHttpInfo(String deploymentId, Long dmnDeploymentId) throws ApiException {
        com.squareup.okhttp.Call call = getRuntimeAppDeploymentByDeploymentUsingGETValidateBeforeCall(deploymentId, dmnDeploymentId, null, null);
        Type localVarReturnType = new TypeToken<AppDeploymentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an app by deployment ID or DMN deployment ID (asynchronously)
     * Either a deploymentId or a dmnDeploymentId must be provided
     * @param deploymentId deploymentId (optional)
     * @param dmnDeploymentId dmnDeploymentId (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRuntimeAppDeploymentByDeploymentUsingGETAsync(String deploymentId, Long dmnDeploymentId, final ApiCallback<AppDeploymentRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRuntimeAppDeploymentByDeploymentUsingGETValidateBeforeCall(deploymentId, dmnDeploymentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AppDeploymentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
