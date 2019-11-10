package ca.pragra.learnng.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class UserDetails {
    private String login;
    private Long id;
    private String node_id;
    private String avatar_url;
    private String html_url;
    private String followers_url;
    private Long public_repos;
    private String name;
}
