package jetbrains.youtrack;

import org.apache.commons.lang3.StringUtils;

public class Strings {

    public static final String MAIN_KEY = "youtrack.integration.plugin.settings.storage#979";
    public static final String ALL = "all";
    public static final String STRIKE_THRU_PARAM = "strikethru-resolved";
    public static final String ISSUE = "issue";
    public static final String ISSUE_ID = "issue-id";
    public static final String BASE = "base";
    public static final String LINKBASE = "linkbase";
    public static final String EXTENDED_DEBUG = "extendedDebug";
    public static final String STRIKE_THRU = "<span style=\"text-decoration:{0};\">{1}</span>";
    public static final String UNASSIGNED = "Unassigned";
    public static final String PROJECT = "project";
    public static final String QUERY = "query";
    public static final String TEMPLATES_ROOT = "templates/";
    public static final String BODY_REPORT = TEMPLATES_ROOT + "body-report.vm";
    public static final String REPORT_COMMENT_HEAD = TEMPLATES_ROOT + "comment-head.vm";
    public static final String REPORT_COMMENT_BODY = TEMPLATES_ROOT + "comment-body.vm";
    public static final String REPORT_COMMENT_MORE = TEMPLATES_ROOT + "comment-more.vm";
    public static final String DETAILED = "detailed";
    public static final String SHORT = "short";
    public static final String BODY_LINK = TEMPLATES_ROOT + "body-link-";
    public static final String TEMPLATE_EXT = ".vm";
    public static final String ERROR = "error";
    public static final String HOST = "host";
    public static final String EMPTY = "";
    public static final String AUTH_KEY = "authKey";
    public static final String PAGE_SIZE = "pageSize";
    public static final String TOTAL_PAGES = "numPages";
    public static final String PAGINATION_SINGLE = TEMPLATES_ROOT + "pagination-report-single.vm";
    public static final String PAGINATION_PARAM = "youtrack-report-page";
    public static final String TEMPLATE_PARAM = "link-text-template";
    public static final String DEFAULT_TEMPLATE = "$issue";
    public static final String ISSUE_LINK_TEXT = "issueLinkText";
    public static final String ID_ONLY = "issueId";
    public static final String NORMAL = "normal";
    public static final String ALL_PROJECTS = "Everything";
    public static final String DEFAULT_REPORT_FIELD_LIST = "State:State,summary:Description,Assignee:Assigned to";
    public static final String TRUST_ALL = "trustall";
    public static final String REPORT_ISSUE_LINK = TEMPLATES_ROOT + "report-issue-link.vm";
    public static final String COMMENT_BODY = "body";
    public static final String COMMENT_AUTHOR = "author";
    public static final String COMMENT_DATE = "date";
    public static final String COMMENT_ID = "comment-id";
    public static final String UNKNOWN = "?";
    public static final String STYLE = "style";
    public static final String ID = "id";
    public static final String SUMMARY_FORMATTED = "summaryFormattedText";
    public static final String REPORT_FIELD_LIST = "reportFields";
    
    public static final String STATUS_COLOR_GREEN = "aui-lozenge-success";
    public static final String STATUS_COLOR_BLUE = "aui-lozenge-default";
    public static final String STATUS_COLOR_YELLOW = "aui-lozenge-current";
    
    public static final String STATUS_COLOR_GREEN_FIELD = "statusColorGreen";
    public static final String STATUS_COLOR_BLUE_FIELD = "statusColorBlue";
    public static final String STATUS_COLOR_YELLOW_FIELD = "statusColorYellow";
    
    public static final String STATUS_COLOR_GREEN_DEFAULT = "done,fixed,closed";
    public static final String STATUS_COLOR_BLUE_DEFAULT = "open,new";
    public static final String STATUS_COLOR_YELLOW_DEFAULT = "in progress";
    
    public static final String STATUS_COLOR_BODY = "<span class=\"aui-lozenge aui-lozenge-subtle {0}\">{1}</span>";

    public static String fixURL(String url) {
        if (url == null) {
            return null;
        }
        if (url.contains("/rest")) {
            return url.substring(0, url.indexOf("/rest"));
        }
        return StringUtils.removeEnd(url, "/");
    }
}