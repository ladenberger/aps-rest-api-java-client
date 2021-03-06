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
import org.activiti.engine.remote.client.model.LightUserRepresentation;
import org.threeten.bp.OffsetDateTime;

/**
 * RelatedContentRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class RelatedContentRepresentation {
  @SerializedName("contentAvailable")
  private Boolean contentAvailable = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("createdBy")
  private LightUserRepresentation createdBy = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("link")
  private Boolean link = null;

  @SerializedName("linkUrl")
  private String linkUrl = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("previewStatus")
  private String previewStatus = null;

  @SerializedName("relatedContent")
  private Boolean relatedContent = null;

  @SerializedName("simpleType")
  private String simpleType = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("thumbnailStatus")
  private String thumbnailStatus = null;

  public RelatedContentRepresentation contentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
    return this;
  }

   /**
   * Get contentAvailable
   * @return contentAvailable
  **/
  @ApiModelProperty(value = "")
  public Boolean isContentAvailable() {
    return contentAvailable;
  }

  public void setContentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
  }

  public RelatedContentRepresentation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public RelatedContentRepresentation createdBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public LightUserRepresentation getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
  }

  public RelatedContentRepresentation id(Long id) {
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

  public RelatedContentRepresentation link(Boolean link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Boolean isLink() {
    return link;
  }

  public void setLink(Boolean link) {
    this.link = link;
  }

  public RelatedContentRepresentation linkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * Get linkUrl
   * @return linkUrl
  **/
  @ApiModelProperty(value = "")
  public String getLinkUrl() {
    return linkUrl;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }

  public RelatedContentRepresentation mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @ApiModelProperty(value = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public RelatedContentRepresentation name(String name) {
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

  public RelatedContentRepresentation previewStatus(String previewStatus) {
    this.previewStatus = previewStatus;
    return this;
  }

   /**
   * Get previewStatus
   * @return previewStatus
  **/
  @ApiModelProperty(value = "")
  public String getPreviewStatus() {
    return previewStatus;
  }

  public void setPreviewStatus(String previewStatus) {
    this.previewStatus = previewStatus;
  }

  public RelatedContentRepresentation relatedContent(Boolean relatedContent) {
    this.relatedContent = relatedContent;
    return this;
  }

   /**
   * Get relatedContent
   * @return relatedContent
  **/
  @ApiModelProperty(value = "")
  public Boolean isRelatedContent() {
    return relatedContent;
  }

  public void setRelatedContent(Boolean relatedContent) {
    this.relatedContent = relatedContent;
  }

  public RelatedContentRepresentation simpleType(String simpleType) {
    this.simpleType = simpleType;
    return this;
  }

   /**
   * Get simpleType
   * @return simpleType
  **/
  @ApiModelProperty(value = "")
  public String getSimpleType() {
    return simpleType;
  }

  public void setSimpleType(String simpleType) {
    this.simpleType = simpleType;
  }

  public RelatedContentRepresentation source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public RelatedContentRepresentation sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(value = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public RelatedContentRepresentation thumbnailStatus(String thumbnailStatus) {
    this.thumbnailStatus = thumbnailStatus;
    return this;
  }

   /**
   * Get thumbnailStatus
   * @return thumbnailStatus
  **/
  @ApiModelProperty(value = "")
  public String getThumbnailStatus() {
    return thumbnailStatus;
  }

  public void setThumbnailStatus(String thumbnailStatus) {
    this.thumbnailStatus = thumbnailStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedContentRepresentation relatedContentRepresentation = (RelatedContentRepresentation) o;
    return Objects.equals(this.contentAvailable, relatedContentRepresentation.contentAvailable) &&
        Objects.equals(this.created, relatedContentRepresentation.created) &&
        Objects.equals(this.createdBy, relatedContentRepresentation.createdBy) &&
        Objects.equals(this.id, relatedContentRepresentation.id) &&
        Objects.equals(this.link, relatedContentRepresentation.link) &&
        Objects.equals(this.linkUrl, relatedContentRepresentation.linkUrl) &&
        Objects.equals(this.mimeType, relatedContentRepresentation.mimeType) &&
        Objects.equals(this.name, relatedContentRepresentation.name) &&
        Objects.equals(this.previewStatus, relatedContentRepresentation.previewStatus) &&
        Objects.equals(this.relatedContent, relatedContentRepresentation.relatedContent) &&
        Objects.equals(this.simpleType, relatedContentRepresentation.simpleType) &&
        Objects.equals(this.source, relatedContentRepresentation.source) &&
        Objects.equals(this.sourceId, relatedContentRepresentation.sourceId) &&
        Objects.equals(this.thumbnailStatus, relatedContentRepresentation.thumbnailStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentAvailable, created, createdBy, id, link, linkUrl, mimeType, name, previewStatus, relatedContent, simpleType, source, sourceId, thumbnailStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedContentRepresentation {\n");
    
    sb.append("    contentAvailable: ").append(toIndentedString(contentAvailable)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previewStatus: ").append(toIndentedString(previewStatus)).append("\n");
    sb.append("    relatedContent: ").append(toIndentedString(relatedContent)).append("\n");
    sb.append("    simpleType: ").append(toIndentedString(simpleType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    thumbnailStatus: ").append(toIndentedString(thumbnailStatus)).append("\n");
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

