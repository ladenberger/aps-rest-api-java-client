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


package org.activiti.engine.remote.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.activiti.engine.remote.client.model.AuditDecisionInfoRepresentation;
import org.activiti.engine.remote.client.model.AuditLogEntryRepresentation;

/**
 * ProcessInstanceAuditInfoRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class ProcessInstanceAuditInfoRepresentation {
  @SerializedName("decisionInfo")
  private AuditDecisionInfoRepresentation decisionInfo = null;

  @SerializedName("entries")
  private List<AuditLogEntryRepresentation> entries = null;

  @SerializedName("processDefinitionName")
  private String processDefinitionName = null;

  @SerializedName("processDefinitionVersion")
  private String processDefinitionVersion = null;

  @SerializedName("processInstanceDurationInMillis")
  private Long processInstanceDurationInMillis = null;

  @SerializedName("processInstanceEndTime")
  private String processInstanceEndTime = null;

  @SerializedName("processInstanceId")
  private String processInstanceId = null;

  @SerializedName("processInstanceInitiator")
  private String processInstanceInitiator = null;

  @SerializedName("processInstanceName")
  private String processInstanceName = null;

  @SerializedName("processInstanceStartTime")
  private String processInstanceStartTime = null;

  public ProcessInstanceAuditInfoRepresentation decisionInfo(AuditDecisionInfoRepresentation decisionInfo) {
    this.decisionInfo = decisionInfo;
    return this;
  }

   /**
   * Get decisionInfo
   * @return decisionInfo
  **/
  @ApiModelProperty(value = "")
  public AuditDecisionInfoRepresentation getDecisionInfo() {
    return decisionInfo;
  }

  public void setDecisionInfo(AuditDecisionInfoRepresentation decisionInfo) {
    this.decisionInfo = decisionInfo;
  }

  public ProcessInstanceAuditInfoRepresentation entries(List<AuditLogEntryRepresentation> entries) {
    this.entries = entries;
    return this;
  }

  public ProcessInstanceAuditInfoRepresentation addEntriesItem(AuditLogEntryRepresentation entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<AuditLogEntryRepresentation>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(value = "")
  public List<AuditLogEntryRepresentation> getEntries() {
    return entries;
  }

  public void setEntries(List<AuditLogEntryRepresentation> entries) {
    this.entries = entries;
  }

  public ProcessInstanceAuditInfoRepresentation processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

   /**
   * Get processDefinitionName
   * @return processDefinitionName
  **/
  @ApiModelProperty(value = "")
  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public ProcessInstanceAuditInfoRepresentation processDefinitionVersion(String processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
    return this;
  }

   /**
   * Get processDefinitionVersion
   * @return processDefinitionVersion
  **/
  @ApiModelProperty(value = "")
  public String getProcessDefinitionVersion() {
    return processDefinitionVersion;
  }

  public void setProcessDefinitionVersion(String processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
  }

  public ProcessInstanceAuditInfoRepresentation processInstanceDurationInMillis(Long processInstanceDurationInMillis) {
    this.processInstanceDurationInMillis = processInstanceDurationInMillis;
    return this;
  }

   /**
   * Get processInstanceDurationInMillis
   * @return processInstanceDurationInMillis
  **/
  @ApiModelProperty(value = "")
  public Long getProcessInstanceDurationInMillis() {
    return processInstanceDurationInMillis;
  }

  public void setProcessInstanceDurationInMillis(Long processInstanceDurationInMillis) {
    this.processInstanceDurationInMillis = processInstanceDurationInMillis;
  }

  public ProcessInstanceAuditInfoRepresentation processInstanceEndTime(String processInstanceEndTime) {
    this.processInstanceEndTime = processInstanceEndTime;
    return this;
  }

   /**
   * Get processInstanceEndTime
   * @return processInstanceEndTime
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceEndTime() {
    return processInstanceEndTime;
  }

  public void setProcessInstanceEndTime(String processInstanceEndTime) {
    this.processInstanceEndTime = processInstanceEndTime;
  }

  public ProcessInstanceAuditInfoRepresentation processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ProcessInstanceAuditInfoRepresentation processInstanceInitiator(String processInstanceInitiator) {
    this.processInstanceInitiator = processInstanceInitiator;
    return this;
  }

   /**
   * Get processInstanceInitiator
   * @return processInstanceInitiator
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceInitiator() {
    return processInstanceInitiator;
  }

  public void setProcessInstanceInitiator(String processInstanceInitiator) {
    this.processInstanceInitiator = processInstanceInitiator;
  }

  public ProcessInstanceAuditInfoRepresentation processInstanceName(String processInstanceName) {
    this.processInstanceName = processInstanceName;
    return this;
  }

   /**
   * Get processInstanceName
   * @return processInstanceName
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceName() {
    return processInstanceName;
  }

  public void setProcessInstanceName(String processInstanceName) {
    this.processInstanceName = processInstanceName;
  }

  public ProcessInstanceAuditInfoRepresentation processInstanceStartTime(String processInstanceStartTime) {
    this.processInstanceStartTime = processInstanceStartTime;
    return this;
  }

   /**
   * Get processInstanceStartTime
   * @return processInstanceStartTime
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceStartTime() {
    return processInstanceStartTime;
  }

  public void setProcessInstanceStartTime(String processInstanceStartTime) {
    this.processInstanceStartTime = processInstanceStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceAuditInfoRepresentation processInstanceAuditInfoRepresentation = (ProcessInstanceAuditInfoRepresentation) o;
    return Objects.equals(this.decisionInfo, processInstanceAuditInfoRepresentation.decisionInfo) &&
        Objects.equals(this.entries, processInstanceAuditInfoRepresentation.entries) &&
        Objects.equals(this.processDefinitionName, processInstanceAuditInfoRepresentation.processDefinitionName) &&
        Objects.equals(this.processDefinitionVersion, processInstanceAuditInfoRepresentation.processDefinitionVersion) &&
        Objects.equals(this.processInstanceDurationInMillis, processInstanceAuditInfoRepresentation.processInstanceDurationInMillis) &&
        Objects.equals(this.processInstanceEndTime, processInstanceAuditInfoRepresentation.processInstanceEndTime) &&
        Objects.equals(this.processInstanceId, processInstanceAuditInfoRepresentation.processInstanceId) &&
        Objects.equals(this.processInstanceInitiator, processInstanceAuditInfoRepresentation.processInstanceInitiator) &&
        Objects.equals(this.processInstanceName, processInstanceAuditInfoRepresentation.processInstanceName) &&
        Objects.equals(this.processInstanceStartTime, processInstanceAuditInfoRepresentation.processInstanceStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decisionInfo, entries, processDefinitionName, processDefinitionVersion, processInstanceDurationInMillis, processInstanceEndTime, processInstanceId, processInstanceInitiator, processInstanceName, processInstanceStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceAuditInfoRepresentation {\n");
    
    sb.append("    decisionInfo: ").append(toIndentedString(decisionInfo)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processInstanceDurationInMillis: ").append(toIndentedString(processInstanceDurationInMillis)).append("\n");
    sb.append("    processInstanceEndTime: ").append(toIndentedString(processInstanceEndTime)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceInitiator: ").append(toIndentedString(processInstanceInitiator)).append("\n");
    sb.append("    processInstanceName: ").append(toIndentedString(processInstanceName)).append("\n");
    sb.append("    processInstanceStartTime: ").append(toIndentedString(processInstanceStartTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

