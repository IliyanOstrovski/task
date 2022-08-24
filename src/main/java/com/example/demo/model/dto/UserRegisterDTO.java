package com.example.demo.model.dto;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
public class UserRegisterDTO {


    @NotEmpty
    @Size(min = 2, max = 20)
    private String firstName;
    @NotEmpty
    @Size(min = 2, max = 20)
    private String lastName;
    @NotEmpty
    @Size(min = 5)
    private String password;
}
