package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Cannot be blank!")
    @Size(min=5, max=15)
    private String username;

    @Email
    private String email;

    @NotBlank(message= "Password is required.")
    @Size(min=6, message = "Must be at least 6 characters.")
    private String password;

    private String passwordVerify;

    public User() { }

    public User(String username, String email, String password, String passwordVerify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordVerify = passwordVerify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordVerify() {
        return passwordVerify;
    }

    public void setPasswordVerify(String passwordVerify) {
        this.passwordVerify = passwordVerify;
    }
}
