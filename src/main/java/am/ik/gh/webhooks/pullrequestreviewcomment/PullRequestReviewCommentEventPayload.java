package am.ik.gh.webhooks.pullrequestreviewcomment;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.965")
@lombok.Data
public class PullRequestReviewCommentEventPayload {
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private String action;
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private Comment comment;
    @com.fasterxml.jackson.annotation.JsonProperty("pull_request")
    private PullRequest pullRequest;
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    private Repository repository;
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    private Sender sender;

    @lombok.Data
    public static class Comment {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("diff_hunk")
        private String diffHunk;
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Long position;
        @com.fasterxml.jackson.annotation.JsonProperty("original_position")
        private Long originalPosition;
        @com.fasterxml.jackson.annotation.JsonProperty("commit_id")
        private String commitId;
        @com.fasterxml.jackson.annotation.JsonProperty("original_commit_id")
        private String originalCommitId;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private CommentUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("pull_request_url")
        private String pullRequestUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("_links")
        private CommentLinks Links;
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
    public static class CommentLinks {
        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private CommentLinksSelf self;
        @com.fasterxml.jackson.annotation.JsonProperty("html")
        private CommentLinksHtml html;
        @com.fasterxml.jackson.annotation.JsonProperty("pull_request")
        private CommentLinksPullRequest pullRequest;
    }

    @lombok.Data
    public static class CommentLinksSelf {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class CommentLinksHtml {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class CommentLinksPullRequest {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequest {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("diff_url")
        private String diffUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("patch_url")
        private String patchUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_url")
        private String issueUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("number")
        private Long number;
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;
        @com.fasterxml.jackson.annotation.JsonProperty("locked")
        private Boolean locked;
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private PullRequestUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("closed_at")
        private String closedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("merged_at")
        private String mergedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("merge_commit_sha")
        private String mergeCommitSha;
        @com.fasterxml.jackson.annotation.JsonProperty("assignee")
        private String assignee;
        @com.fasterxml.jackson.annotation.JsonProperty("milestone")
        private String milestone;
        @com.fasterxml.jackson.annotation.JsonProperty("commits_url")
        private String commitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comments_url")
        private String reviewCommentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comment_url")
        private String reviewCommentUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("comments_url")
        private String commentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses_url")
        private String statusesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("head")
        private PullRequestHead head;
        @com.fasterxml.jackson.annotation.JsonProperty("base")
        private PullRequestBase base;
        @com.fasterxml.jackson.annotation.JsonProperty("_links")
        private PullRequestLinks Links;
    }

    @lombok.Data
    public static class PullRequestUser {
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
    public static class PullRequestHead {
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;
        @com.fasterxml.jackson.annotation.JsonProperty("ref")
        private String ref;
        @com.fasterxml.jackson.annotation.JsonProperty("sha")
        private String sha;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private PullRequestHeadUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("repo")
        private PullRequestHeadRepo repo;
    }

    @lombok.Data
    public static class PullRequestHeadUser {
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
    public static class PullRequestHeadRepo {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("full_name")
        private String fullName;
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private PullRequestHeadRepoOwner owner;
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
    public static class PullRequestHeadRepoOwner {
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
    public static class PullRequestBase {
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;
        @com.fasterxml.jackson.annotation.JsonProperty("ref")
        private String ref;
        @com.fasterxml.jackson.annotation.JsonProperty("sha")
        private String sha;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private PullRequestBaseUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("repo")
        private PullRequestBaseRepo repo;
    }

    @lombok.Data
    public static class PullRequestBaseUser {
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
    public static class PullRequestBaseRepo {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("full_name")
        private String fullName;
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private PullRequestBaseRepoOwner owner;
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
    public static class PullRequestBaseRepoOwner {
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
    public static class PullRequestLinks {
        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private PullRequestLinksSelf self;
        @com.fasterxml.jackson.annotation.JsonProperty("html")
        private PullRequestLinksHtml html;
        @com.fasterxml.jackson.annotation.JsonProperty("issue")
        private PullRequestLinksIssue issue;
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        private PullRequestLinksComments comments;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comments")
        private PullRequestLinksReviewComments reviewComments;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comment")
        private PullRequestLinksReviewComment reviewComment;
        @com.fasterxml.jackson.annotation.JsonProperty("commits")
        private PullRequestLinksCommits commits;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses")
        private PullRequestLinksStatuses statuses;
    }

    @lombok.Data
    public static class PullRequestLinksSelf {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequestLinksHtml {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequestLinksIssue {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequestLinksComments {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequestLinksReviewComments {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequestLinksReviewComment {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequestLinksCommits {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
    }

    @lombok.Data
    public static class PullRequestLinksStatuses {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        private String href;
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
