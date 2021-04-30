package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Immutable??
@Table(name = "user_role")
@Entity
public class UserRole extends AbstractEntity {

    private String role;
    private String description;

    protected UserRole() {}

    public UserRole(String role, String description) {
        this.role = role;
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
