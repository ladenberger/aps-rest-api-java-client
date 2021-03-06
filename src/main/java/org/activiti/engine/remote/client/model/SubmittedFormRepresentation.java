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
import org.activiti.engine.remote.client.model.FormDefinitionRepresentation;
import org.activiti.engine.remote.client.model.LightUserRepresentation;
import org.threeten.bp.OffsetDateTime;

/**
 * SubmittedFormRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class SubmittedFormRepresentation {
  @SerializedName("form")
  private FormDefinitionRepresentation form = null;

  @SerializedName("formId")
  private Long formId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("processId")
  private String processId = null;

  @SerializedName("submitted")
  private OffsetDateTime submitted = null;

  @SerializedName("submittedBy")
  private LightUserRepresentation submittedBy = null;

  @SerializedName("taskId")
  private String taskId = null;

  public SubmittedFormRepresentation form(FormDefinitionRepresentation form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @ApiModelProperty(value = "")
  public FormDefinitionRepresentation getForm() {
    return form;
  }

  public void setForm(FormDefinitionRepresentation form) {
    this.form = form;
  }

  public SubmittedFormRepresentation formId(Long formId) {
    this.formId = formId;
    return this;
  }

   /**
   * Get formId
   * @return formId
  **/
  @ApiModelProperty(value = "")
  public Long getFormId() {
    return formId;
  }

  public void setFormId(Long formId) {
    this.formId = formId;
  }

  public SubmittedFormRepresentation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SubmittedFormRepresentation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubmittedFormRepresentation processId(String processId) {
    this.processId = processId;
    return this;
  }

   /**
   * Get processId
   * @return processId
  **/
  @ApiModelProperty(value = "")
  public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) {
    this.processId = processId;
  }

  public SubmittedFormRepresentation submitted(OffsetDateTime submitted) {
    this.submitted = submitted;
    return this;
  }

   /**
   * Get submitted
   * @return submitted
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSubmitted() {
    return submitted;
  }

  public void setSubmitted(OffsetDateTime submitted) {
    this.submitted = submitted;
  }

  public SubmittedFormRepresentation submittedBy(LightUserRepresentation submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }

   /**
   * Get submittedBy
   * @return submittedBy
  **/
  @ApiModelProperty(value = "")
  public LightUserRepresentation getSubmittedBy() {
    return submittedBy;
  }

  public void setSubmittedBy(LightUserRepresentation submittedBy) {
    this.submittedBy = submittedBy;
  }

  public SubmittedFormRepresentation taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmittedFormRepresentation submittedFormRepresentation = (SubmittedFormRepresentation) o;
    return Objects.equals(this.form, submittedFormRepresentation.form) &&
        Objects.equals(this.formId, submittedFormRepresentation.formId) &&
        Objects.equals(this.id, submittedFormRepresentation.id) &&
        Objects.equals(this.name, submittedFormRepresentation.name) &&
        Objects.equals(this.processId, submittedFormRepresentation.processId) &&
        Objects.equals(this.submitted, submittedFormRepresentation.submitted) &&
        Objects.equals(this.submittedBy, submittedFormRepresentation.submittedBy) &&
        Objects.equals(this.taskId, submittedFormRepresentation.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(form, formId, id, name, processId, submitted, submittedBy, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmittedFormRepresentation {\n");
    
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

