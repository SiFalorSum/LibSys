package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Seminars extends AbstractEntity {

    //TODO: Uppdatera vid ändringar av databasstruktur + kodgranskning.
    private String name;
    private String presenter;
    private String description;
    private String length;
    private int seats_booked;
    private String date_time;
    private boolean active;

    protected Seminars() {}

    public Seminars(String name, String presenter, String description, String length, int seats_booked, String date_time, boolean active) {
        this.name = name;
        this.presenter = presenter;
        this.description = description;
        this.length = length;
        this.seats_booked = seats_booked;
        this.date_time = date_time;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getSeats_booked() {
        return seats_booked;
    }

    public void setSeats_booked(int seats_booked) {
        this.seats_booked = seats_booked;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
