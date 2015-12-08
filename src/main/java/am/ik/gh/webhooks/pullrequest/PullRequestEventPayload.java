package am.ik.gh.webhooks.pullrequest;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T03:30:22.05")
@lombok.Data
public class PullRequestEventPayload {
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private String action;
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private Long number;
    @com.fasterxml.jackson.annotation.JsonProperty("pull_request")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private PullRequestEventPayloadPullRequest pullRequest;
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private PullRequestEventPayloadRepository repository;
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private PullRequestEventPayloadSender sender;

    @lombok.Data
    public static class PullRequestEventPayloadPullRequest {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("diff_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String diffUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("patch_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String patchUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issueUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("number")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long number;
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String state;
        @com.fasterxml.jackson.annotation.JsonProperty("locked")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean locked;
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String title;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String body;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("closed_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String closedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("merged_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("merge_commit_sha")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergeCommitSha;
        @com.fasterxml.jackson.annotation.JsonProperty("assignee")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String assignee;
        @com.fasterxml.jackson.annotation.JsonProperty("milestone")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String milestone;
        @com.fasterxml.jackson.annotation.JsonProperty("commits_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comments_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reviewCommentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comment_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reviewCommentUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("comments_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String statusesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("head")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestHead head;
        @com.fasterxml.jackson.annotation.JsonProperty("base")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestBase base;
        @com.fasterxml.jackson.annotation.JsonProperty("_links")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinks Links;
        @com.fasterxml.jackson.annotation.JsonProperty("merged")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean merged;
        @com.fasterxml.jackson.annotation.JsonProperty("mergeable")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergeable;
        @com.fasterxml.jackson.annotation.JsonProperty("mergeable_state")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergeableState;
        @com.fasterxml.jackson.annotation.JsonProperty("merged_by")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergedBy;
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long comments;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comments")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long reviewComments;
        @com.fasterxml.jackson.annotation.JsonProperty("commits")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long commits;
        @com.fasterxml.jackson.annotation.JsonProperty("additions")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long additions;
        @com.fasterxml.jackson.annotation.JsonProperty("deletions")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long deletions;
        @com.fasterxml.jackson.annotation.JsonProperty("changed_files")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long changedFiles;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestUser {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestHead {
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String label;
        @com.fasterxml.jackson.annotation.JsonProperty("ref")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String ref;
        @com.fasterxml.jackson.annotation.JsonProperty("sha")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String sha;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestHeadUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("repo")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestHeadRepo repo;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestHeadUser {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestHeadRepo {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("full_name")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String fullName;
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestHeadRepoOwner owner;
        @com.fasterxml.jackson.annotation.JsonProperty("private")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean _private;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String description;
        @com.fasterxml.jackson.annotation.JsonProperty("fork")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean fork;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String forksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("keys_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String keysUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("collaborators_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String collaboratorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("teams_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String teamsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("hooks_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String hooksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issueEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("assignees_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String assigneesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("branches_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String branchesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("tags_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String tagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("blobs_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String blobsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_tags_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitTagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_refs_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitRefsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("trees_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String treesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String statusesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("languages_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String languagesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String stargazersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contributors_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String contributorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscribers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscribersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscription_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("commits_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_commits_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitCommitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("comments_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_comment_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issueCommentUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contents_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String contentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("compare_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String compareUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("merges_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("archive_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String archiveUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("downloads_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String downloadsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issues_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issuesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("pulls_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String pullsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("milestones_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String milestonesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("notifications_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String notificationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("labels_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String labelsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("releases_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String releasesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("pushed_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String pushedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("git_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("ssh_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String sshUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("clone_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String cloneUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("svn_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String svnUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("homepage")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String homepage;
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long size;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long stargazersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long watchersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String language;
        @com.fasterxml.jackson.annotation.JsonProperty("has_issues")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("has_downloads")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasDownloads;
        @com.fasterxml.jackson.annotation.JsonProperty("has_wiki")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasWiki;
        @com.fasterxml.jackson.annotation.JsonProperty("has_pages")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasPages;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long forksCount;
        @com.fasterxml.jackson.annotation.JsonProperty("mirror_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mirrorUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long openIssuesCount;
        @com.fasterxml.jackson.annotation.JsonProperty("forks")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long forks;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long openIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long watchers;
        @com.fasterxml.jackson.annotation.JsonProperty("default_branch")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String defaultBranch;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestHeadRepoOwner {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestBase {
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String label;
        @com.fasterxml.jackson.annotation.JsonProperty("ref")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String ref;
        @com.fasterxml.jackson.annotation.JsonProperty("sha")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String sha;
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestBaseUser user;
        @com.fasterxml.jackson.annotation.JsonProperty("repo")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestBaseRepo repo;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestBaseUser {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestBaseRepo {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("full_name")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String fullName;
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestBaseRepoOwner owner;
        @com.fasterxml.jackson.annotation.JsonProperty("private")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean _private;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String description;
        @com.fasterxml.jackson.annotation.JsonProperty("fork")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean fork;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String forksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("keys_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String keysUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("collaborators_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String collaboratorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("teams_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String teamsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("hooks_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String hooksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issueEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("assignees_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String assigneesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("branches_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String branchesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("tags_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String tagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("blobs_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String blobsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_tags_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitTagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_refs_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitRefsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("trees_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String treesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String statusesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("languages_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String languagesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String stargazersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contributors_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String contributorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscribers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscribersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscription_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("commits_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_commits_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitCommitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("comments_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_comment_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issueCommentUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contents_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String contentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("compare_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String compareUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("merges_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("archive_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String archiveUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("downloads_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String downloadsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issues_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issuesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("pulls_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String pullsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("milestones_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String milestonesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("notifications_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String notificationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("labels_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String labelsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("releases_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String releasesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("pushed_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String pushedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("git_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("ssh_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String sshUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("clone_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String cloneUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("svn_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String svnUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("homepage")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String homepage;
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long size;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long stargazersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long watchersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String language;
        @com.fasterxml.jackson.annotation.JsonProperty("has_issues")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("has_downloads")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasDownloads;
        @com.fasterxml.jackson.annotation.JsonProperty("has_wiki")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasWiki;
        @com.fasterxml.jackson.annotation.JsonProperty("has_pages")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasPages;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long forksCount;
        @com.fasterxml.jackson.annotation.JsonProperty("mirror_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mirrorUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long openIssuesCount;
        @com.fasterxml.jackson.annotation.JsonProperty("forks")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long forks;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long openIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long watchers;
        @com.fasterxml.jackson.annotation.JsonProperty("default_branch")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String defaultBranch;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestBaseRepoOwner {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinks {
        @com.fasterxml.jackson.annotation.JsonProperty("self")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksSelf self;
        @com.fasterxml.jackson.annotation.JsonProperty("html")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksHtml html;
        @com.fasterxml.jackson.annotation.JsonProperty("issue")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksIssue issue;
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksComments comments;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comments")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksReviewComments reviewComments;
        @com.fasterxml.jackson.annotation.JsonProperty("review_comment")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksReviewComment reviewComment;
        @com.fasterxml.jackson.annotation.JsonProperty("commits")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksCommits commits;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadPullRequestLinksStatuses statuses;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksSelf {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksHtml {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksIssue {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksComments {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksReviewComments {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksReviewComment {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksCommits {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadPullRequestLinksStatuses {
        @com.fasterxml.jackson.annotation.JsonProperty("href")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String href;
    }

    @lombok.Data
    public static class PullRequestEventPayloadRepository {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("full_name")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String fullName;
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private PullRequestEventPayloadRepositoryOwner owner;
        @com.fasterxml.jackson.annotation.JsonProperty("private")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean _private;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String description;
        @com.fasterxml.jackson.annotation.JsonProperty("fork")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean fork;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String forksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("keys_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String keysUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("collaborators_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String collaboratorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("teams_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String teamsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("hooks_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String hooksUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issueEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("assignees_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String assigneesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("branches_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String branchesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("tags_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String tagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("blobs_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String blobsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_tags_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitTagsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_refs_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitRefsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("trees_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String treesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("statuses_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String statusesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("languages_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String languagesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String stargazersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contributors_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String contributorsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscribers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscribersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscription_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("commits_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("git_commits_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitCommitsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("comments_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String commentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issue_comment_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issueCommentUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("contents_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String contentsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("compare_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String compareUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("merges_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mergesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("archive_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String archiveUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("downloads_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String downloadsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("issues_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String issuesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("pulls_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String pullsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("milestones_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String milestonesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("notifications_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String notificationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("labels_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String labelsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("releases_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String releasesUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String createdAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updated_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("pushed_at")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String pushedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("git_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gitUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("ssh_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String sshUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("clone_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String cloneUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("svn_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String svnUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("homepage")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String homepage;
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long size;
        @com.fasterxml.jackson.annotation.JsonProperty("stargazers_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long stargazersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long watchersCount;
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String language;
        @com.fasterxml.jackson.annotation.JsonProperty("has_issues")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("has_downloads")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasDownloads;
        @com.fasterxml.jackson.annotation.JsonProperty("has_wiki")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasWiki;
        @com.fasterxml.jackson.annotation.JsonProperty("has_pages")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean hasPages;
        @com.fasterxml.jackson.annotation.JsonProperty("forks_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long forksCount;
        @com.fasterxml.jackson.annotation.JsonProperty("mirror_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String mirrorUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues_count")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long openIssuesCount;
        @com.fasterxml.jackson.annotation.JsonProperty("forks")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long forks;
        @com.fasterxml.jackson.annotation.JsonProperty("open_issues")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long openIssues;
        @com.fasterxml.jackson.annotation.JsonProperty("watchers")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long watchers;
        @com.fasterxml.jackson.annotation.JsonProperty("default_branch")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String defaultBranch;
    }

    @lombok.Data
    public static class PullRequestEventPayloadRepositoryOwner {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean siteAdmin;
    }

    @lombok.Data
    public static class PullRequestEventPayloadSender {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gravatar_id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gravatarId;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("html_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String htmlUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("followers_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("following_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String followingUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("gists_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String gistsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("starred_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String starredUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String subscriptionsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("organizations_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String organizationsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("received_events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String receivedEventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String type;
        @com.fasterxml.jackson.annotation.JsonProperty("site_admin")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Boolean siteAdmin;
    }
}
