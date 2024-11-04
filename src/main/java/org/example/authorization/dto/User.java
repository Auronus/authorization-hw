package org.example.authorization.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import org.example.authorization.enums.Authorities;

import java.util.List;

@Getter
@Builder
public class User {
    @NotBlank
    @Size(min = 3, max = 20)
    private String user;
    @NotBlank
    @Size(min = 3, max = 20)
    private String password;
    private List<Authorities> authoritiesList;
}
