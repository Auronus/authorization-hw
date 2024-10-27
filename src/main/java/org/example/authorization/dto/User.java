package org.example.authorization.dto;

import lombok.Builder;
import lombok.Getter;
import org.example.authorization.enums.Authorities;

import java.util.List;

@Getter
@Builder
public class User {
    private String name;
    private String password;
    private List<Authorities> authoritiesList;
}
