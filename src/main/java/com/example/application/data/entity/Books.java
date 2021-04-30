package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;

import javax.persistence.*;

@Table(name = "books")
@Entity
public class Books extends AbstractEntity {

    //TODO: Uppdatera vid ändringar av databasstruktur + kodgranskning.
    private String name;
    private String genre;
    private String author;
    private String for_ages;
    private int physical_amount;
    private int physical_active_borrowed;
    private boolean e_book;
    private int e_active_borrowed;
    private int total_amount_borrowed; //bryter inte detta mot 3e normalformen?
    private double price;
    private String shelf;
    private String section;
    private String date_added;
    //saknas: ISBN, förlag, sammanfattning

    protected Books() {}

    public Books(String name, String genre, String author, String for_ages, int physical_amount, boolean e_book, double price, String shelf, String section) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.for_ages = for_ages;
        this.physical_amount = physical_amount;
        this.e_book = e_book;
        this.price = price;
        this.shelf = shelf;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFor_ages() {
        return for_ages;
    }

    public void setFor_ages(String for_ages) {
        this.for_ages = for_ages;
    }

    public int getPhysical_amount() {
        return physical_amount;
    }

    public void setPhysical_amount(int physical_amount) {
        this.physical_amount = physical_amount;
    }

    public int getPhysical_active_borrowed() {
        return physical_active_borrowed;
    }

    public void setPhysical_active_borrowed(int physical_active_borrowed) {
        this.physical_active_borrowed = physical_active_borrowed;
    }

    public boolean isE_book() {
        return e_book;
    }

    public void setE_book(boolean e_book) {
        this.e_book = e_book;
    }

    public int getE_active_borrowed() {
        return e_active_borrowed;
    }

    public void setE_active_borrowed(int e_active_borrowed) {
        this.e_active_borrowed = e_active_borrowed;
    }

    public int getTotal_amount_borrowed() {
        return total_amount_borrowed;
    }

    public void setTotal_amount_borrowed(int total_amount_borrowed) {
        this.total_amount_borrowed = total_amount_borrowed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }


}
