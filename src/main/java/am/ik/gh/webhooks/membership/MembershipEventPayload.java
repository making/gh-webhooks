package am.ik.gh.webhooks.membership;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T03:30:22.037")
@lombok.Data
public class MembershipEventPayload {
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private String action;
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private String scope;
    @com.fasterxml.jackson.annotation.JsonProperty("member")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private MembershipEventPayloadMember member;
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private MembershipEventPayloadSender sender;
    @com.fasterxml.jackson.annotation.JsonProperty("team")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private MembershipEventPayloadTeam team;
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    private MembershipEventPayloadOrganization organization;

    @lombok.Data
    public static class MembershipEventPayloadMember {
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
    public static class MembershipEventPayloadSender {
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
    public static class MembershipEventPayloadTeam {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String name;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("slug")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String slug;
        @com.fasterxml.jackson.annotation.JsonProperty("permission")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String permission;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("members_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String membersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("repositories_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String repositoriesUrl;
    }

    @lombok.Data
    public static class MembershipEventPayloadOrganization {
        @com.fasterxml.jackson.annotation.JsonProperty("login")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String login;
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private Long id;
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String url;
        @com.fasterxml.jackson.annotation.JsonProperty("repos_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String reposUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("events_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String eventsUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("members_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String membersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("public_members_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String publicMembersUrl;
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
        private String avatarUrl;
    }
}
