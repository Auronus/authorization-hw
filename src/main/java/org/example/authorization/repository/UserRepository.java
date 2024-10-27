package org.example.authorization.repository;

import org.example.authorization.dto.User;
import org.example.authorization.enums.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.example.authorization.dto.UserFactory.getGeneratedUsers;

@Repository
public class UserRepository {
    private final List<User> users = getGeneratedUsers();

    public List<Authorities> getUserAuthorities(String user, String password) {
        System.out.println(users);
        System.out.println(user + " - " + password);

        Optional<User> optionalUser = users.stream()
                .filter(x -> user.equals(x.getName()) && password.equals(x.getPassword()))
                .findFirst();
        if (optionalUser.isPresent()) {
            return optionalUser.get().getAuthoritiesList();
        } else {
            return Collections.emptyList();
        }
    }
}
