package com.example.mylibrary.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private LocalDate publicationDate;
    private String genre;
    private String description;
    private int pageCount;
    private float customerRatings;  // A float for ratings, between 0 and 5

    public Book() {}

    public Book(String title, Author author, LocalDate publicationDate, String genre, String description, int pageCount, String coverImage, float customerRatings) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.description = description;
        this.pageCount = pageCount;
        this.customerRatings = customerRatings;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public float getCustomerRatings() {
        return customerRatings;
    }

    public void setCustomerRatings(float customerRatings) {
        this.customerRatings = customerRatings;
    }
}
