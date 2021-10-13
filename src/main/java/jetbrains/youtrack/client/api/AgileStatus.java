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

import java.util.List;
/**
 * Shows if the board has any configuration problems.
 */
@Schema(description = "Shows if the board has any configuration problems.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type", visible = true )
@JsonSubTypes({
})

public class AgileStatus {
  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("hasJobs")
  private Boolean hasJobs = null;

  @JsonProperty("errors")
  private List<String> errors = null;

  @JsonProperty("warnings")
  private List<String> warnings = null;

  @JsonProperty("id")
  private String id = null;

  @JsonTypeId
  private String $type = null;

   /**
   * Get valid
   * @return valid
  **/
  @Schema(description = "")
  public Boolean isValid() {
    return valid;
  }

   /**
   * Get hasJobs
   * @return hasJobs
  **/
  @Schema(description = "")
  public Boolean isHasJobs() {
    return hasJobs;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<String> getErrors() {
    return errors;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @Schema(description = "")
  public List<String> getWarnings() {
    return warnings;
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
    AgileStatus agileStatus = (AgileStatus) o;
    return Objects.equals(this.valid, agileStatus.valid) &&
        Objects.equals(this.hasJobs, agileStatus.hasJobs) &&
        Objects.equals(this.errors, agileStatus.errors) &&
        Objects.equals(this.warnings, agileStatus.warnings) &&
        Objects.equals(this.id, agileStatus.id) &&
        Objects.equals(this.$type, agileStatus.$type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, hasJobs, errors, warnings, id, $type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgileStatus {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    hasJobs: ").append(toIndentedString(hasJobs)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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