package com.Galaksiya.ws.model;


import com.Galaksiya.ws.unique_username.UniqueUsername;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue
    private long id;

//Show errors to user, errors comes with Jakarta validation dependency
    @NotBlank (message = "{Galaksiya.constraints.username.NotBlank.message}")

    @Size(min=4, max=255, message = "{Galaksiya.constraints.displayName.size.message}")
    @UniqueUsername
    private String username;

    @NotBlank (message = "{Galaksiya.constraints.displayName.NotBlank.message}")
    @Size(min=4, max=255, message = "{Galaksiya.constraints.displayName.size.message}")
    private String displayName;

    @NotBlank (message = "{Galaksiya.constraints.username.NotBlank.message}")
    @Size(min=8, max=255, message = "{Galaksiya.constraints.password.pattern.message}")
//Password should contain at least 1 capital letter 1 small letter and one number
    @Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "{staj2023backend.constraints.password.pattern.message}")
    private String password;


    public Users() {

    }
}
