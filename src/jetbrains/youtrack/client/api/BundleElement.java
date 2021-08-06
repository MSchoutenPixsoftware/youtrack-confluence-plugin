/*
 * YouTrack REST API
 * YouTrack issue tracking and project management system
 *
 * OpenAPI spec version: 2099.99
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package jetbrains.youtrack.client.api;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents a field value in YouTrack.
 */
@Schema(description = "Represents a field value in YouTrack.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = OwnedBundleElement.class, name = "OwnedBundleElement"),
  @JsonSubTypes.Type(value = StateBundleElement.class, name = "StateBundleElement"),
  @JsonSubTypes.Type(value = BuildBundleElement.class, name = "BuildBundleElement"),
  @JsonSubTypes.Type(value = EnumBundleElement.class, name = "EnumBundleElement"),
  @JsonSubTypes.Type(value = VersionBundleElement.class, name = "VersionBundleElement"),
  @JsonSubTypes.Type(value = LocalizableBundleElement.class, name = "LocalizableBundleElement"),
})

public class BundleElement {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("bundle")
  private Bundle bundle = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ordinal")
  private Integer ordinal = null;

  @JsonProperty("color")
  private FieldStyle color = null;

  @JsonProperty("hasRunningJob")
  private Boolean hasRunningJob = null;

  @JsonProperty("id")
  private String id = null;

  @JsonTypeId
  private String $type = null;

  public BundleElement name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundleElement bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/
  @Schema(description = "")
  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public BundleElement description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BundleElement ordinal(Integer ordinal) {
    this.ordinal = ordinal;
    return this;
  }

   /**
   * Get ordinal
   * @return ordinal
  **/
  @Schema(description = "")
  public Integer getOrdinal() {
    return ordinal;
  }

  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  public BundleElement color(FieldStyle color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @Schema(description = "")
  public FieldStyle getColor() {
    return color;
  }

  public void setColor(FieldStyle color) {
    this.color = color;
  }

   /**
   * Get hasRunningJob
   * @return hasRunningJob
  **/
  @Schema(description = "")
  public Boolean isHasRunningJob() {
    return hasRunningJob;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

   /**
   * Get $type
   * @return $type
  **/
  @Schema(description = "")
  public String get$Type() {
    return $type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleElement bundleElement = (BundleElement) o;
    return Objects.equals(this.name, bundleElement.name) &&
        Objects.equals(this.bundle, bundleElement.bundle) &&
        Objects.equals(this.description, bundleElement.description) &&
        Objects.equals(this.ordinal, bundleElement.ordinal) &&
        Objects.equals(this.color, bundleElement.color) &&
        Objects.equals(this.hasRunningJob, bundleElement.hasRunningJob) &&
        Objects.equals(this.id, bundleElement.id) &&
        Objects.equals(this.$type, bundleElement.$type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bundle, description, ordinal, color, hasRunningJob, id, $type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleElement {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    hasRunningJob: ").append(toIndentedString(hasRunningJob)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    $type: ").append(toIndentedString($type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}