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
 * Represents custom field settings for the particular project.
 */
@Schema(description = "Represents custom field settings for the particular project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = TextProjectCustomField.class, name = "TextProjectCustomField"),
  @JsonSubTypes.Type(value = VersionProjectCustomField.class, name = "VersionProjectCustomField"),
  @JsonSubTypes.Type(value = OwnedProjectCustomField.class, name = "OwnedProjectCustomField"),
  @JsonSubTypes.Type(value = EnumProjectCustomField.class, name = "EnumProjectCustomField"),
  @JsonSubTypes.Type(value = BuildProjectCustomField.class, name = "BuildProjectCustomField"),
  @JsonSubTypes.Type(value = UserProjectCustomField.class, name = "UserProjectCustomField"),
  @JsonSubTypes.Type(value = BundleProjectCustomField.class, name = "BundleProjectCustomField"),
  @JsonSubTypes.Type(value = StateProjectCustomField.class, name = "StateProjectCustomField"),
  @JsonSubTypes.Type(value = PeriodProjectCustomField.class, name = "PeriodProjectCustomField"),
  @JsonSubTypes.Type(value = GroupProjectCustomField.class, name = "GroupProjectCustomField"),
  @JsonSubTypes.Type(value = SimpleProjectCustomField.class, name = "SimpleProjectCustomField"),
})

public class ProjectCustomField {
  @JsonProperty("field")
  private CustomField field = null;

  @JsonProperty("project")
  private Project project = null;

  @JsonProperty("canBeEmpty")
  private Boolean canBeEmpty = null;

  @JsonProperty("emptyFieldText")
  private String emptyFieldText = null;

  @JsonProperty("ordinal")
  private Integer ordinal = null;

  @JsonProperty("isPublic")
  private Boolean isPublic = null;

  @JsonProperty("hasRunningJob")
  private Boolean hasRunningJob = null;

  @JsonProperty("id")
  private String id = null;

  @JsonTypeId
  private String $type = null;

  public ProjectCustomField field(CustomField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(description = "")
  public CustomField getField() {
    return field;
  }

  public void setField(CustomField field) {
    this.field = field;
  }

  public ProjectCustomField project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public ProjectCustomField canBeEmpty(Boolean canBeEmpty) {
    this.canBeEmpty = canBeEmpty;
    return this;
  }

   /**
   * Get canBeEmpty
   * @return canBeEmpty
  **/
  @Schema(description = "")
  public Boolean isCanBeEmpty() {
    return canBeEmpty;
  }

  public void setCanBeEmpty(Boolean canBeEmpty) {
    this.canBeEmpty = canBeEmpty;
  }

  public ProjectCustomField emptyFieldText(String emptyFieldText) {
    this.emptyFieldText = emptyFieldText;
    return this;
  }

   /**
   * Get emptyFieldText
   * @return emptyFieldText
  **/
  @Schema(description = "")
  public String getEmptyFieldText() {
    return emptyFieldText;
  }

  public void setEmptyFieldText(String emptyFieldText) {
    this.emptyFieldText = emptyFieldText;
  }

  public ProjectCustomField ordinal(Integer ordinal) {
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

  public ProjectCustomField isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @Schema(description = "")
  public Boolean isIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
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
    ProjectCustomField projectCustomField = (ProjectCustomField) o;
    return Objects.equals(this.field, projectCustomField.field) &&
        Objects.equals(this.project, projectCustomField.project) &&
        Objects.equals(this.canBeEmpty, projectCustomField.canBeEmpty) &&
        Objects.equals(this.emptyFieldText, projectCustomField.emptyFieldText) &&
        Objects.equals(this.ordinal, projectCustomField.ordinal) &&
        Objects.equals(this.isPublic, projectCustomField.isPublic) &&
        Objects.equals(this.hasRunningJob, projectCustomField.hasRunningJob) &&
        Objects.equals(this.id, projectCustomField.id) &&
        Objects.equals(this.$type, projectCustomField.$type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, project, canBeEmpty, emptyFieldText, ordinal, isPublic, hasRunningJob, id, $type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCustomField {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    canBeEmpty: ").append(toIndentedString(canBeEmpty)).append("\n");
    sb.append("    emptyFieldText: ").append(toIndentedString(emptyFieldText)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
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
