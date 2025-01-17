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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * Swimlane settings for the case, when each swimlane is represented by an issue and contains this issue&#x27;s subtasks.
 */
@Schema(description = "Swimlane settings for the case, when each swimlane is represented by an issue and contains this issue's subtasks.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")
public class IssueBasedSwimlaneSettings extends SwimlaneSettings {
  @JsonProperty("field")
  private FilterField field = null;

  @JsonProperty("defaultCardType")
  private SwimlaneValue defaultCardType = null;

  @JsonProperty("values")
  private List<SwimlaneValue> values = null;

  public IssueBasedSwimlaneSettings field(FilterField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(description = "")
  public FilterField getField() {
    return field;
  }

  public void setField(FilterField field) {
    this.field = field;
  }

  public IssueBasedSwimlaneSettings defaultCardType(SwimlaneValue defaultCardType) {
    this.defaultCardType = defaultCardType;
    return this;
  }

   /**
   * Get defaultCardType
   * @return defaultCardType
  **/
  @Schema(description = "")
  public SwimlaneValue getDefaultCardType() {
    return defaultCardType;
  }

  public void setDefaultCardType(SwimlaneValue defaultCardType) {
    this.defaultCardType = defaultCardType;
  }

  public IssueBasedSwimlaneSettings values(List<SwimlaneValue> values) {
    this.values = values;
    return this;
  }

  public IssueBasedSwimlaneSettings addValuesItem(SwimlaneValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<SwimlaneValue>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<SwimlaneValue> getValues() {
    return values;
  }

  public void setValues(List<SwimlaneValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueBasedSwimlaneSettings issueBasedSwimlaneSettings = (IssueBasedSwimlaneSettings) o;
    return Objects.equals(this.field, issueBasedSwimlaneSettings.field) &&
        Objects.equals(this.defaultCardType, issueBasedSwimlaneSettings.defaultCardType) &&
        Objects.equals(this.values, issueBasedSwimlaneSettings.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, defaultCardType, values, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueBasedSwimlaneSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    defaultCardType: ").append(toIndentedString(defaultCardType)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
