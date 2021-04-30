package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Users extends AbstractEntity {

    //TODO: Uppdatera vid ändringar av databasstruktur + kodgranskning.
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String street;
    private String postal_code;
    private String city;
    private int active_borrowed_books;
    private int total_borrowed_books;
    //password;
    private Long role_id;
    //saknas: personnummer, låneblockering?

    protected Users() {}

    public Users(String first_name, String last_name, String email, String phone, String street, String postal_code, String city, Long role_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.street = street;
        this.postal_code = postal_code;
        this.city = city;
        this.role_id = role_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getActive_borrowed_books() {
        return active_borrowed_books;
    }

    public void setActive_borrowed_books(int active_borrowed_books) {
        this.active_borrowed_books = active_borrowed_books;
    }

    public int getTotal_borrowed_books() {
        return total_borrowed_books;
    }

    public void setTotal_borrowed_books(int total_borrowed_books) {
        this.total_borrowed_books = total_borrowed_books;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
}
