package com.marvel.lan.application.types.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserCreateData implements Serializable {

    @NotBlank(message = "username must be required")
    private String username;

    @NotBlank(message = "password must be required")
    @Size(min = 6, max = 20, message = "password must be between 6 and 20 characters")
    private String password;

    @Email(message = "email must be a email address")
    private String email;

}
