package com.gusmadev.adopt_dev.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    @NotBlank(message = "Name should not be blank")
    private String name;

    @NotBlank(message = "Username should not be blank")
    @Pattern(regexp = "\\S+", message = "Username should not contain spaces")
    private String username;

    @NotBlank(message = "Email should not be blank")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password should not be blank")
    @Length(min = 10, max = 100, message = "Password should be between 10 and 100 characters")
    private String password;
    private String description;
    private String curriculum;
}
