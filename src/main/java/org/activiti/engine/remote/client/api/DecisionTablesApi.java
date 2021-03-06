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


import org.activiti.engine.remote.client.model.JsonNode;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationRuntimeDecisionTableRepresentation;
import org.activiti.engine.remote.client.model.RuntimeDecisionTableRepresentation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecisionTablesApi {
    private ApiClient apiClient;

    public DecisionTablesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DecisionTablesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDecisionTableEditorJsonUsingGET
     * @param decisionTableId decisionTableId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDecisionTableEditorJsonUsingGETCall(Long decisionTableId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/decisions/decision-tables/{decisionTableId}/editorJson"
            .replaceAll("\\{" + "decisionTableId" + "\\}", apiClient.escapeString(decisionTableId.toString()));

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
    private com.squareup.okhttp.Call getDecisionTableEditorJsonUsingGETValidateBeforeCall(Long decisionTableId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'decisionTableId' is set
        if (decisionTableId == null) {
            throw new ApiException("Missing the required parameter 'decisionTableId' when calling getDecisionTableEditorJsonUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getDecisionTableEditorJsonUsingGETCall(decisionTableId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get definition for a decision table
     * 
     * @param decisionTableId decisionTableId (required)
     * @return JsonNode
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JsonNode getDecisionTableEditorJsonUsingGET(Long decisionTableId) throws ApiException {
        ApiResponse<JsonNode> resp = getDecisionTableEditorJsonUsingGETWithHttpInfo(decisionTableId);
        return resp.getData();
    }

    /**
     * Get definition for a decision table
     * 
     * @param decisionTableId decisionTableId (required)
     * @return ApiResponse&lt;JsonNode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JsonNode> getDecisionTableEditorJsonUsingGETWithHttpInfo(Long decisionTableId) throws ApiException {
        com.squareup.okhttp.Call call = getDecisionTableEditorJsonUsingGETValidateBeforeCall(decisionTableId, null, null);
        Type localVarReturnType = new TypeToken<JsonNode>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get definition for a decision table (asynchronously)
     * 
     * @param decisionTableId decisionTableId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDecisionTableEditorJsonUsingGETAsync(Long decisionTableId, final ApiCallback<JsonNode> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDecisionTableEditorJsonUsingGETValidateBeforeCall(decisionTableId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JsonNode>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDecisionTableUsingGET
     * @param decisionTableId decisionTableId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDecisionTableUsingGETCall(Long decisionTableId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/decisions/decision-tables/{decisionTableId}"
            .replaceAll("\\{" + "decisionTableId" + "\\}", apiClient.escapeString(decisionTableId.toString()));

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
    private com.squareup.okhttp.Call getDecisionTableUsingGETValidateBeforeCall(Long decisionTableId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'decisionTableId' is set
        if (decisionTableId == null) {
            throw new ApiException("Missing the required parameter 'decisionTableId' when calling getDecisionTableUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getDecisionTableUsingGETCall(decisionTableId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a decision table
     * 
     * @param decisionTableId decisionTableId (required)
     * @return RuntimeDecisionTableRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RuntimeDecisionTableRepresentation getDecisionTableUsingGET(Long decisionTableId) throws ApiException {
        ApiResponse<RuntimeDecisionTableRepresentation> resp = getDecisionTableUsingGETWithHttpInfo(decisionTableId);
        return resp.getData();
    }

    /**
     * Get a decision table
     * 
     * @param decisionTableId decisionTableId (required)
     * @return ApiResponse&lt;RuntimeDecisionTableRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RuntimeDecisionTableRepresentation> getDecisionTableUsingGETWithHttpInfo(Long decisionTableId) throws ApiException {
        com.squareup.okhttp.Call call = getDecisionTableUsingGETValidateBeforeCall(decisionTableId, null, null);
        Type localVarReturnType = new TypeToken<RuntimeDecisionTableRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a decision table (asynchronously)
     * 
     * @param decisionTableId decisionTableId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDecisionTableUsingGETAsync(Long decisionTableId, final ApiCallback<RuntimeDecisionTableRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDecisionTableUsingGETValidateBeforeCall(decisionTableId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RuntimeDecisionTableRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDecisionTablesUsingGET
     * @param nameLike nameLike (optional)
     * @param keyLike keyLike (optional)
     * @param tenantIdLike tenantIdLike (optional)
     * @param deploymentId deploymentId (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param start start (optional)
     * @param size size (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDecisionTablesUsingGETCall(String nameLike, String keyLike, String tenantIdLike, Long deploymentId, String sort, String order, Integer start, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/decisions/decision-tables";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nameLike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nameLike", nameLike));
        if (keyLike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyLike", keyLike));
        if (tenantIdLike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tenantIdLike", tenantIdLike));
        if (deploymentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deploymentId", deploymentId));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
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
    private com.squareup.okhttp.Call getDecisionTablesUsingGETValidateBeforeCall(String nameLike, String keyLike, String tenantIdLike, Long deploymentId, String sort, String order, Integer start, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDecisionTablesUsingGETCall(nameLike, keyLike, tenantIdLike, deploymentId, sort, order, start, size, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query decision tables
     * 
     * @param nameLike nameLike (optional)
     * @param keyLike keyLike (optional)
     * @param tenantIdLike tenantIdLike (optional)
     * @param deploymentId deploymentId (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param start start (optional)
     * @param size size (optional)
     * @return ResultListDataRepresentationRuntimeDecisionTableRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultListDataRepresentationRuntimeDecisionTableRepresentation getDecisionTablesUsingGET(String nameLike, String keyLike, String tenantIdLike, Long deploymentId, String sort, String order, Integer start, Integer size) throws ApiException {
        ApiResponse<ResultListDataRepresentationRuntimeDecisionTableRepresentation> resp = getDecisionTablesUsingGETWithHttpInfo(nameLike, keyLike, tenantIdLike, deploymentId, sort, order, start, size);
        return resp.getData();
    }

    /**
     * Query decision tables
     * 
     * @param nameLike nameLike (optional)
     * @param keyLike keyLike (optional)
     * @param tenantIdLike tenantIdLike (optional)
     * @param deploymentId deploymentId (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param start start (optional)
     * @param size size (optional)
     * @return ApiResponse&lt;ResultListDataRepresentationRuntimeDecisionTableRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultListDataRepresentationRuntimeDecisionTableRepresentation> getDecisionTablesUsingGETWithHttpInfo(String nameLike, String keyLike, String tenantIdLike, Long deploymentId, String sort, String order, Integer start, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = getDecisionTablesUsingGETValidateBeforeCall(nameLike, keyLike, tenantIdLike, deploymentId, sort, order, start, size, null, null);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationRuntimeDecisionTableRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query decision tables (asynchronously)
     * 
     * @param nameLike nameLike (optional)
     * @param keyLike keyLike (optional)
     * @param tenantIdLike tenantIdLike (optional)
     * @param deploymentId deploymentId (optional)
     * @param sort sort (optional)
     * @param order order (optional)
     * @param start start (optional)
     * @param size size (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDecisionTablesUsingGETAsync(String nameLike, String keyLike, String tenantIdLike, Long deploymentId, String sort, String order, Integer start, Integer size, final ApiCallback<ResultListDataRepresentationRuntimeDecisionTableRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDecisionTablesUsingGETValidateBeforeCall(nameLike, keyLike, tenantIdLike, deploymentId, sort, order, start, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationRuntimeDecisionTableRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
