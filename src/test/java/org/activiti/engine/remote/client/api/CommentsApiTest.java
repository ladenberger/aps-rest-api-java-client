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
import org.activiti.engine.remote.client.model.CommentRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationCommentRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentsApi
 */
@Ignore
public class CommentsApiTest {

    private final CommentsApi api = new CommentsApi();

    
    /**
     * Add a comment to a process instance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProcessInstanceCommentUsingPOSTTest() throws ApiException {
        CommentRepresentation commentRequest = null;
        String processInstanceId = null;
        CommentRepresentation response = api.addProcessInstanceCommentUsingPOST(commentRequest, processInstanceId);

        // TODO: test validations
    }
    
    /**
     * Add a comment to a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTaskCommentUsingPOSTTest() throws ApiException {
        CommentRepresentation commentRequest = null;
        String taskId = null;
        CommentRepresentation response = api.addTaskCommentUsingPOST(commentRequest, taskId);

        // TODO: test validations
    }
    
    /**
     * Get comments for a process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessInstanceCommentsUsingGETTest() throws ApiException {
        String processInstanceId = null;
        Boolean latestFirst = null;
        ResultListDataRepresentationCommentRepresentation response = api.getProcessInstanceCommentsUsingGET(processInstanceId, latestFirst);

        // TODO: test validations
    }
    
    /**
     * Get comments for a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskCommentsUsingGETTest() throws ApiException {
        String taskId = null;
        Boolean latestFirst = null;
        ResultListDataRepresentationCommentRepresentation response = api.getTaskCommentsUsingGET(taskId, latestFirst);

        // TODO: test validations
    }
    
}
