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
 * Represents a page object that wraps a list of issue activities. The main advantage of the page in comparision to a list of activities is cursors. The page provides boundary marks that allow continuous iteration over the activities from the place the page is finished.
 */
@Schema(description = "Represents a page object that wraps a list of issue activities. The main advantage of the page in comparision to a list of activities is cursors. The page provides boundary marks that allow continuous iteration over the activities from the place the page is finished.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type", visible = true )
@JsonSubTypes({
})

public class ActivityCursorPage {
  @JsonProperty("reverse")
  private Boolean reverse = null;

  @JsonProperty("beforeCursor")
  private String beforeCursor = null;

  @JsonProperty("afterCursor")
  private String afterCursor = null;

  @JsonProperty("hasBefore")
  private Boolean hasBefore = null;

  @JsonProperty("hasAfter")
  private Boolean hasAfter = null;

  @JsonProperty("activities")
  private List<ActivityItem> activities = null;

  @JsonProperty("id")
  private String id = null;

  @JsonTypeId
  private String $type = null;

   /**
   * Get reverse
   * @return reverse
  **/
  @Schema(description = "")
  public Boolean isReverse() {
    return reverse;
  }

   /**
   * Get beforeCursor
   * @return beforeCursor
  **/
  @Schema(description = "")
  public String getBeforeCursor() {
    return beforeCursor;
  }

   /**
   * Get afterCursor
   * @return afterCursor
  **/
  @Schema(description = "")
  public String getAfterCursor() {
    return afterCursor;
  }

   /**
   * Get hasBefore
   * @return hasBefore
  **/
  @Schema(description = "")
  public Boolean isHasBefore() {
    return hasBefore;
  }

   /**
   * Get hasAfter
   * @return hasAfter
  **/
  @Schema(description = "")
  public Boolean isHasAfter() {
    return hasAfter;
  }

   /**
   * Get activities
   * @return activities
  **/
  @Schema(description = "")
  public List<ActivityItem> getActivities() {
    return activities;
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
    ActivityCursorPage activityCursorPage = (ActivityCursorPage) o;
    return Objects.equals(this.reverse, activityCursorPage.reverse) &&
        Objects.equals(this.beforeCursor, activityCursorPage.beforeCursor) &&
        Objects.equals(this.afterCursor, activityCursorPage.afterCursor) &&
        Objects.equals(this.hasBefore, activityCursorPage.hasBefore) &&
        Objects.equals(this.hasAfter, activityCursorPage.hasAfter) &&
        Objects.equals(this.activities, activityCursorPage.activities) &&
        Objects.equals(this.id, activityCursorPage.id) &&
        Objects.equals(this.$type, activityCursorPage.$type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverse, beforeCursor, afterCursor, hasBefore, hasAfter, activities, id, $type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityCursorPage {\n");
    
    sb.append("    reverse: ").append(toIndentedString(reverse)).append("\n");
    sb.append("    beforeCursor: ").append(toIndentedString(beforeCursor)).append("\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
    sb.append("    hasBefore: ").append(toIndentedString(hasBefore)).append("\n");
    sb.append("    hasAfter: ").append(toIndentedString(hasAfter)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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