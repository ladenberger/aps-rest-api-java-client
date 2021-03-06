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
import org.activiti.engine.remote.client.model.AssigneeIdentifierRepresentation;
import org.activiti.engine.remote.client.model.FormIdentifierRepresentation;
import org.activiti.engine.remote.client.model.TaskRepresentation;
import org.activiti.engine.remote.client.model.UserIdentifierRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskActionsApi
 */
@Ignore
public class TaskActionsApiTest {

    private final TaskActionsApi api = new TaskActionsApi();

    
    /**
     * Assign a task to a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignTaskUsingPUTTest() throws ApiException {
        String taskId = null;
        AssigneeIdentifierRepresentation userIdentifier = null;
        TaskRepresentation response = api.assignTaskUsingPUT(taskId, userIdentifier);

        // TODO: test validations
    }
    
    /**
     * Attach a form to a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachFormUsingPUTTest() throws ApiException {
        String taskId = null;
        FormIdentifierRepresentation formIdentifier = null;
        api.attachFormUsingPUT(taskId, formIdentifier);

        // TODO: test validations
    }
    
    /**
     * Claim a task
     *
     * To claim a task (in case the task is assigned to a group)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void claimTaskUsingPUTTest() throws ApiException {
        String taskId = null;
        api.claimTaskUsingPUT(taskId);

        // TODO: test validations
    }
    
    /**
     * Complete a task
     *
     * Use this endpoint to complete a standalone task or task without a form
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeTaskUsingPUTTest() throws ApiException {
        String taskId = null;
        api.completeTaskUsingPUT(taskId);

        // TODO: test validations
    }
    
    /**
     * Delegate a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delegateTaskUsingPUTTest() throws ApiException {
        String taskId = null;
        UserIdentifierRepresentation userIdentifier = null;
        api.delegateTaskUsingPUT(taskId, userIdentifier);

        // TODO: test validations
    }
    
    /**
     * Involve a group with a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void involveGroupUsingPOSTTest() throws ApiException {
        String taskId = null;
        String groupId = null;
        api.involveGroupUsingPOST(taskId, groupId);

        // TODO: test validations
    }
    
    /**
     * Involve a user with a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void involveUserUsingPUTTest() throws ApiException {
        String taskId = null;
        UserIdentifierRepresentation userIdentifier = null;
        api.involveUserUsingPUT(taskId, userIdentifier);

        // TODO: test validations
    }
    
    /**
     * Remove a form from a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFormUsingDELETETest() throws ApiException {
        String taskId = null;
        api.removeFormUsingDELETE(taskId);

        // TODO: test validations
    }
    
    /**
     * Remove an involved group from a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeInvolvedUserUsingDELETETest() throws ApiException {
        String taskId = null;
        String groupId = null;
        api.removeInvolvedUserUsingDELETE(taskId, groupId);

        // TODO: test validations
    }
    
    /**
     * Remove an involved user from a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeInvolvedUserUsingPUTTest() throws ApiException {
        String taskId = null;
        UserIdentifierRepresentation userIdentifier = null;
        api.removeInvolvedUserUsingPUT(taskId, userIdentifier);

        // TODO: test validations
    }
    
    /**
     * Resolve a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resolveTaskUsingPUTTest() throws ApiException {
        String taskId = null;
        api.resolveTaskUsingPUT(taskId);

        // TODO: test validations
    }
    
    /**
     * Unclaim a task
     *
     * To unclaim a task (in case the task was assigned to a group)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unclaimTaskUsingPUTTest() throws ApiException {
        String taskId = null;
        api.unclaimTaskUsingPUT(taskId);

        // TODO: test validations
    }
    
}
