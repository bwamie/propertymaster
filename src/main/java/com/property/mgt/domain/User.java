package com.property.mgt.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @Column(name = "username")
    @NotEmpty(message = "{String.empty}")
    private String username;

    @Column(name = "password")
    @NotEmpty(message = "{String.empty}")
    private String password;

    @Column(name = "role")
    private String role;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Column(name = "enable")
    Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="username", referencedColumnName= "username")
    List<Authority> authorities;

    public User() {
        this.enabled = true;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
    public User(String username, String password) {
        this.enabled = true;
        this.username = username;
        this.password = password;
    }

}
