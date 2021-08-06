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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents email settings for this YouTrack installation.
 */
@Schema(description = "Represents email settings for this YouTrack installation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-04T14:25:38.465627+03:00[Europe/Moscow]")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type", visible = true )
@JsonSubTypes({
})

public class EmailSettings {
  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("port")
  private Integer port = null;

  /**
   * Gets or Sets mailProtocol
   */
  public enum MailProtocolEnum {
    SMTP("SMTP"),
    SMTPS("SMTPS"),
    SMTP_TLS("SMTP_TLS");

    private String value;

    MailProtocolEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static MailProtocolEnum fromValue(String text) {
      for (MailProtocolEnum b : MailProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("mailProtocol")
  private MailProtocolEnum mailProtocol = null;

  @JsonProperty("anonymous")
  private Boolean anonymous = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("sslKey")
  private StorageEntry sslKey = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("replyTo")
  private String replyTo = null;

  @JsonProperty("id")
  private String id = null;

  @JsonTypeId
  private String $type = null;

  public EmailSettings isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public EmailSettings host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public EmailSettings port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public EmailSettings mailProtocol(MailProtocolEnum mailProtocol) {
    this.mailProtocol = mailProtocol;
    return this;
  }

   /**
   * Get mailProtocol
   * @return mailProtocol
  **/
  @Schema(description = "")
  public MailProtocolEnum getMailProtocol() {
    return mailProtocol;
  }

  public void setMailProtocol(MailProtocolEnum mailProtocol) {
    this.mailProtocol = mailProtocol;
  }

  public EmailSettings anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Get anonymous
   * @return anonymous
  **/
  @Schema(description = "")
  public Boolean isAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public EmailSettings login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @Schema(description = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public EmailSettings sslKey(StorageEntry sslKey) {
    this.sslKey = sslKey;
    return this;
  }

   /**
   * Get sslKey
   * @return sslKey
  **/
  @Schema(description = "")
  public StorageEntry getSslKey() {
    return sslKey;
  }

  public void setSslKey(StorageEntry sslKey) {
    this.sslKey = sslKey;
  }

  public EmailSettings from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(description = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public EmailSettings replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @Schema(description = "")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
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
    EmailSettings emailSettings = (EmailSettings) o;
    return Objects.equals(this.isEnabled, emailSettings.isEnabled) &&
        Objects.equals(this.host, emailSettings.host) &&
        Objects.equals(this.port, emailSettings.port) &&
        Objects.equals(this.mailProtocol, emailSettings.mailProtocol) &&
        Objects.equals(this.anonymous, emailSettings.anonymous) &&
        Objects.equals(this.login, emailSettings.login) &&
        Objects.equals(this.sslKey, emailSettings.sslKey) &&
        Objects.equals(this.from, emailSettings.from) &&
        Objects.equals(this.replyTo, emailSettings.replyTo) &&
        Objects.equals(this.id, emailSettings.id) &&
        Objects.equals(this.$type, emailSettings.$type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, host, port, mailProtocol, anonymous, login, sslKey, from, replyTo, id, $type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSettings {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    mailProtocol: ").append(toIndentedString(mailProtocol)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    sslKey: ").append(toIndentedString(sslKey)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
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