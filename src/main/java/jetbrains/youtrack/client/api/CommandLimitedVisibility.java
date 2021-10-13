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
 * Stores the restricted visibility settings for the command.
 */
@Schema(description = "Stores the restricted visibility settings for the command.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")
public class CommandLimitedVisibility extends CommandVisibility {
  @JsonProperty("permittedGroups")
  private List<UserGroup> permittedGroups = null;

  @JsonProperty("permittedUsers")
  private List<User> permittedUsers = null;

   /**
   * Get permittedGroups
   * @return permittedGroups
  **/
  @Schema(description = "")
  public List<UserGroup> getPermittedGroups() {
    return permittedGroups;
  }

   /**
   * Get permittedUsers
   * @return permittedUsers
  **/
  @Schema(description = "")
  public List<User> getPermittedUsers() {
    return permittedUsers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandLimitedVisibility commandLimitedVisibility = (CommandLimitedVisibility) o;
    return Objects.equals(this.permittedGroups, commandLimitedVisibility.permittedGroups) &&
        Objects.equals(this.permittedUsers, commandLimitedVisibility.permittedUsers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permittedGroups, permittedUsers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandLimitedVisibility {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    permittedGroups: ").append(toIndentedString(permittedGroups)).append("\n");
    sb.append("    permittedUsers: ").append(toIndentedString(permittedUsers)).append("\n");
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