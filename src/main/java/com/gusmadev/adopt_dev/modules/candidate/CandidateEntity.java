package com.gusmadev.adopt_dev.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "Username should not contain spaces")
    private String username;

    @Email(message = "Email should be valid")
    private String email;

    @Length(min = 10, max = 100, message = "Password should be between 10 and 100 characters")
    private String password;
    private String description;
    private String curriculum;
}
