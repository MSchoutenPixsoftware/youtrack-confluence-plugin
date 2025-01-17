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

import java.util.List;

/**
 * Represents a change in the comments of an issue.
 */
@Schema(description = "Represents a change in the comments of an issue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")
public class CommentActivityItem extends CreatedDeletedActivityItem {
  @JsonProperty("target")
  private IssueComment target = null;

  @JsonProperty("removed")
  private List<IssueComment> removed = null;

  @JsonProperty("added")
  private List<IssueComment> added = null;

  @JsonProperty("authorGroup")
  private UserGroup authorGroup = null;

  public CommentActivityItem target(IssueComment target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @Schema(description = "")
  public IssueComment getTarget() {
    return target;
  }

  public void setTarget(IssueComment target) {
    this.target = target;
  }

   /**
   * Get removed
   * @return removed
  **/
  @Schema(description = "")
  public List<IssueComment> getRemoved() {
    return removed;
  }

   /**
   * Get added
   * @return added
  **/
  @Schema(description = "")
  public List<IssueComment> getAdded() {
    return added;
  }

  public CommentActivityItem authorGroup(UserGroup authorGroup) {
    this.authorGroup = authorGroup;
    return this;
  }

   /**
   * Get authorGroup
   * @return authorGroup
  **/
  @Schema(description = "")
  public UserGroup getAuthorGroup() {
    return authorGroup;
  }

  public void setAuthorGroup(UserGroup authorGroup) {
    this.authorGroup = authorGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentActivityItem commentActivityItem = (CommentActivityItem) o;
    return Objects.equals(this.target, commentActivityItem.target) &&
        Objects.equals(this.removed, commentActivityItem.removed) &&
        Objects.equals(this.added, commentActivityItem.added) &&
        Objects.equals(this.authorGroup, commentActivityItem.authorGroup) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, removed, added, authorGroup, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentActivityItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    authorGroup: ").append(toIndentedString(authorGroup)).append("\n");
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
