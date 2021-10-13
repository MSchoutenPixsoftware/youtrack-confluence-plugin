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
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sprint that is associated with an agile board. Each sprint can include issues from one or more projects.
 */
@Schema(description = "Represents a sprint that is associated with an agile board. Each sprint can include issues from one or more projects.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type", visible = true )
@JsonSubTypes({
})

public class Sprint {
  @JsonProperty("agile")
  private Agile agile = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("goal")
  private String goal = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("finish")
  private Long finish = null;

  @JsonProperty("archived")
  private Boolean archived = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  @JsonProperty("issues")
  private List<Issue> issues = null;

  @JsonProperty("unresolvedIssuesCount")
  private Integer unresolvedIssuesCount = null;

  @JsonProperty("previousSprint")
  private Sprint previousSprint = null;

  @JsonProperty("id")
  private String id = null;

  @JsonTypeId
  private String $type = null;

  public Sprint agile(Agile agile) {
    this.agile = agile;
    return this;
  }

   /**
   * Get agile
   * @return agile
  **/
  @Schema(description = "")
  public Agile getAgile() {
    return agile;
  }

  public void setAgile(Agile agile) {
    this.agile = agile;
  }

  public Sprint name(String name) {
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

  public Sprint goal(String goal) {
    this.goal = goal;
    return this;
  }

   /**
   * Get goal
   * @return goal
  **/
  @Schema(description = "")
  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public Sprint start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public Sprint finish(Long finish) {
    this.finish = finish;
    return this;
  }

   /**
   * Get finish
   * @return finish
  **/
  @Schema(description = "")
  public Long getFinish() {
    return finish;
  }

  public void setFinish(Long finish) {
    this.finish = finish;
  }

  public Sprint archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @Schema(description = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Sprint isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @Schema(description = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public Sprint issues(List<Issue> issues) {
    this.issues = issues;
    return this;
  }

  public Sprint addIssuesItem(Issue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<Issue>();
    }
    this.issues.add(issuesItem);
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @Schema(description = "")
  public List<Issue> getIssues() {
    return issues;
  }

  public void setIssues(List<Issue> issues) {
    this.issues = issues;
  }

   /**
   * Get unresolvedIssuesCount
   * @return unresolvedIssuesCount
  **/
  @Schema(description = "")
  public Integer getUnresolvedIssuesCount() {
    return unresolvedIssuesCount;
  }

  public Sprint previousSprint(Sprint previousSprint) {
    this.previousSprint = previousSprint;
    return this;
  }

   /**
   * Get previousSprint
   * @return previousSprint
  **/
  @Schema(description = "")
  public Sprint getPreviousSprint() {
    return previousSprint;
  }

  public void setPreviousSprint(Sprint previousSprint) {
    this.previousSprint = previousSprint;
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
    Sprint sprint = (Sprint) o;
    return Objects.equals(this.agile, sprint.agile) &&
        Objects.equals(this.name, sprint.name) &&
        Objects.equals(this.goal, sprint.goal) &&
        Objects.equals(this.start, sprint.start) &&
        Objects.equals(this.finish, sprint.finish) &&
        Objects.equals(this.archived, sprint.archived) &&
        Objects.equals(this.isDefault, sprint.isDefault) &&
        Objects.equals(this.issues, sprint.issues) &&
        Objects.equals(this.unresolvedIssuesCount, sprint.unresolvedIssuesCount) &&
        Objects.equals(this.previousSprint, sprint.previousSprint) &&
        Objects.equals(this.id, sprint.id) &&
        Objects.equals(this.$type, sprint.$type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agile, name, goal, start, finish, archived, isDefault, issues, unresolvedIssuesCount, previousSprint, id, $type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sprint {\n");
    
    sb.append("    agile: ").append(toIndentedString(agile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    unresolvedIssuesCount: ").append(toIndentedString(unresolvedIssuesCount)).append("\n");
    sb.append("    previousSprint: ").append(toIndentedString(previousSprint)).append("\n");
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