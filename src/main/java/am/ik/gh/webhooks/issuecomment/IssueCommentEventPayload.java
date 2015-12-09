package am.ik.gh.webhooks.issuecomment;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.863")
@lombok.Data
public class IssueCommentEventPayload {
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private String action;
    @com.fasterxml.jackson.annotation.JsonProperty("issue")
    private Issue issue;
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private Comment comment;
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    private Repository repository;
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    private Sender sender;

    @lombok.Data
    public static class Issue {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("labels_url")
        private String labelsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("comments_url")
        private String commentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("number")
        private Long number;
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private IssueUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<IssueLabel> labels;
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;
        @com.fasterxml.jackson.annotation.JsonProperty("locked")
        private Boolean locked;
        @com.fasterxml.jackson.annotation.JsonProperty("assignee")
        private String assignee;
        @com.fasterxml.jackson.annotation.JsonProperty("milestone")
        private String milestone;
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        private Long comments;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("closed_at")
        private String closedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;
    }

    @lombok.Data
    public static class IssueUser {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class IssueLabel {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("color")
        private String color;
    }

    @lombok.Data
    public static class Comment {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_url")
        private String issueUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private CommentUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;
    }

    @lombok.Data
    public static class CommentUser {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class Repository {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("full_name")
        private String fullName;
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private RepositoryOwner owner;
        @com.fasterxml.jackson.annotation.JsonProperty("private")
        private Boolean _private;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;
        @com.fasterxml.jackson.annotation.JsonProperty("fork")
        private Boolean fork;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_url")
        private String forksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("keys_url")
        private String keysUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("collaborators_url")
        private String collaboratorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("teams_url")
        private String teamsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("hooks_url")
        private String hooksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_events_url")
        private String issueEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("assignees_url")
        private String assigneesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("branches_url")
        private String branchesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("tags_url")
        private String tagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("blobs_url")
        private String blobsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_tags_url")
        private String gitTagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_refs_url")
        private String gitRefsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("trees_url")
        private String treesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses_url")
        private String statusesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("languages_url")
        private String languagesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_url")
        private String stargazersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contributors_url")
        private String contributorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscribers_url")
        private String subscribersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscription_url")
        private String subscriptionUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("commits_url")
        private String commitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_commits_url")
        private String gitCommitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("comments_url")
        private String commentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_comment_url")
        private String issueCommentUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contents_url")
        private String contentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("compare_url")
        private String compareUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("merges_url")
        private String mergesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("archive_url")
        private String archiveUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("downloads_url")
        private String downloadsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issues_url")
        private String issuesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("pulls_url")
        private String pullsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("milestones_url")
        private String milestonesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("notifications_url")
        private String notificationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("labels_url")
        private String labelsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("releases_url")
        private String releasesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("pushed_at")
        private String pushedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("git_url")
        private String gitUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("ssh_url")
        private String sshUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("clone_url")
        private String cloneUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("svn_url")
        private String svnUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("homepage")
        private String homepage;
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Long size;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_count")
        private Long stargazersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers_count")
        private Long watchersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private String language;
        @com.fasterxml.jackson.annotation.JsonProperty("has_issues")
        private Boolean hasIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("has_downloads")
        private Boolean hasDownloads;
        @com.fasterxml.jackson.annotation.JsonProperty("has_wiki")
        private Boolean hasWiki;
        @com.fasterxml.jackson.annotation.JsonProperty("has_pages")
        private Boolean hasPages;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_count")
        private Long forksCount;
        @com.fasterxml.jackson.annotation.JsonProperty("mirror_url")
        private String mirrorUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues_count")
        private Long openIssuesCount;
        @com.fasterxml.jackson.annotation.JsonProperty("forks")
        private Long forks;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues")
        private Long openIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers")
        private Long watchers;
        @com.fasterxml.jackson.annotation.JsonProperty("default_branch")
        private String defaultBranch;
    }

    @lombok.Data
    public static class RepositoryOwner {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class Sender {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        private Boolean siteAdmin;
    }
}
