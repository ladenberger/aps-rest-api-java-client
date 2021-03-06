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

import org.activiti.engine.remote.client.ApiException;
import org.activiti.engine.remote.client.model.DecisionAuditRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationDecisionAuditRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DecisionAuditsApi
 */
@Ignore
public class DecisionAuditsApiTest {

    private final DecisionAuditsApi api = new DecisionAuditsApi();

    
    /**
     * Get an audit trail
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditTrailUsingGETTest() throws ApiException {
        Long auditTrailId = null;
        DecisionAuditRepresentation response = api.getAuditTrailUsingGET(auditTrailId);

        // TODO: test validations
    }
    
    /**
     * Query decision table audit trails
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditTrailsUsingGETTest() throws ApiException {
        String decisionKey = null;
        Long dmnDeploymentId = null;
        ResultListDataRepresentationDecisionAuditRepresentation response = api.getAuditTrailsUsingGET(decisionKey, dmnDeploymentId);

        // TODO: test validations
    }
    
}
