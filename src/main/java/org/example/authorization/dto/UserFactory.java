package org.example.authorization.dto;

import org.example.authorization.enums.Authorities;

import java.util.List;

public class UserFactory {
    public static User createUser(String username, String password, List<Authorities> authorities) {
        return User.builder()
                .user(username)
                .password(password)
                .authoritiesList(authorities)
                .build();
    }

    public static List<User> getGeneratedUsers() {
        return List.of(
                createUser("user1", "123", List.of(Authorities.READ)),
                createUser("user2", "456", List.of(Authorities.READ, Authorities.WRITE)),
                createUser("user3", "789", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE))
        );
    }

}
