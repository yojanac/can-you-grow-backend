package com.canyougrow.backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SignupReq {

    @NotBlank(message = "username is mandatory")
    private String username;

   @NotBlank(message = "password is mandatory")
    private String password;
    private String email;
}
