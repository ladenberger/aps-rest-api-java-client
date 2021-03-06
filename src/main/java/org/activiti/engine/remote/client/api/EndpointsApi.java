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


import org.activiti.engine.remote.client.model.EndpointConfigurationRepresentation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointsApi {
    private ApiClient apiClient;

    public EndpointsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EndpointsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEndpointConfigurationUsingGET
     * @param endpointConfigurationId endpointConfigurationId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointConfigurationUsingGETCall(Long endpointConfigurationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/editor/endpoints/{endpointConfigurationId}"
            .replaceAll("\\{" + "endpointConfigurationId" + "\\}", apiClient.escapeString(endpointConfigurationId.toString()));

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
    private com.squareup.okhttp.Call getEndpointConfigurationUsingGETValidateBeforeCall(Long endpointConfigurationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'endpointConfigurationId' is set
        if (endpointConfigurationId == null) {
            throw new ApiException("Missing the required parameter 'endpointConfigurationId' when calling getEndpointConfigurationUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getEndpointConfigurationUsingGETCall(endpointConfigurationId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an endpoint configuration
     * 
     * @param endpointConfigurationId endpointConfigurationId (required)
     * @return EndpointConfigurationRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EndpointConfigurationRepresentation getEndpointConfigurationUsingGET(Long endpointConfigurationId) throws ApiException {
        ApiResponse<EndpointConfigurationRepresentation> resp = getEndpointConfigurationUsingGETWithHttpInfo(endpointConfigurationId);
        return resp.getData();
    }

    /**
     * Get an endpoint configuration
     * 
     * @param endpointConfigurationId endpointConfigurationId (required)
     * @return ApiResponse&lt;EndpointConfigurationRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EndpointConfigurationRepresentation> getEndpointConfigurationUsingGETWithHttpInfo(Long endpointConfigurationId) throws ApiException {
        com.squareup.okhttp.Call call = getEndpointConfigurationUsingGETValidateBeforeCall(endpointConfigurationId, null, null);
        Type localVarReturnType = new TypeToken<EndpointConfigurationRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an endpoint configuration (asynchronously)
     * 
     * @param endpointConfigurationId endpointConfigurationId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointConfigurationUsingGETAsync(Long endpointConfigurationId, final ApiCallback<EndpointConfigurationRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEndpointConfigurationUsingGETValidateBeforeCall(endpointConfigurationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EndpointConfigurationRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEndpointConfigurationsUsingGET
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointConfigurationsUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/editor/endpoints";

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
    private com.squareup.okhttp.Call getEndpointConfigurationsUsingGETValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getEndpointConfigurationsUsingGETCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * List endpoint configurations
     * 
     * @return List&lt;EndpointConfigurationRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EndpointConfigurationRepresentation> getEndpointConfigurationsUsingGET() throws ApiException {
        ApiResponse<List<EndpointConfigurationRepresentation>> resp = getEndpointConfigurationsUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * List endpoint configurations
     * 
     * @return ApiResponse&lt;List&lt;EndpointConfigurationRepresentation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EndpointConfigurationRepresentation>> getEndpointConfigurationsUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEndpointConfigurationsUsingGETValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<EndpointConfigurationRepresentation>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List endpoint configurations (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointConfigurationsUsingGETAsync(final ApiCallback<List<EndpointConfigurationRepresentation>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEndpointConfigurationsUsingGETValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EndpointConfigurationRepresentation>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
