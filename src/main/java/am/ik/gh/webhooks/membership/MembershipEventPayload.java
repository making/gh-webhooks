package am.ik.gh.webhooks.membership;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.879")
@lombok.Data
public class MembershipEventPayload {
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private String action;
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private String scope;
    @com.fasterxml.jackson.annotation.JsonProperty("member")
    private Member member;
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    private Sender sender;
    @com.fasterxml.jackson.annotation.JsonProperty("team")
    private Team team;
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private Organization organization;

    @lombok.Data
    public static class Member {
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

    @lombok.Data
    public static class Team {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("slug")
        private String slug;
        @com.fasterxml.jackson.annotation.JsonProperty("permission")
        private String permission;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("members_url")
        private String membersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repositories_url")
        private String repositoriesUrl;
    }

    @lombok.Data
    public static class Organization {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("members_url")
        private String membersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("public_members_url")
        private String publicMembersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        private String avatarUrl;
    }
}
