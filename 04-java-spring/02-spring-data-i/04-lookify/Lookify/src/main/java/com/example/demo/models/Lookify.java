package com.example.demo.models;

import org.aspectj.bridge.IMessage;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;


@Entity
@Table(name = "lookify")
public class Lookify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank(message = "Title is mandatory")
    @Size(min = 5, message = "Enter five characters")
    private String title;

    @Column
    @NotBlank(message = "Artist is mandatory")
    @Size(min = 5,message = "Enter five characters")
    private String artist;

    @Column
    @Min(value = 1)
    @Max(value = 10,message = "Number must be between 1 and 10")
    private int rating;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date createdDate;

    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date updatedDate;


    protected void getCreatedDate() {
        this.createdDate = new Date();
    }

    protected void getupDatedDate() {
        this.updatedDate = new Date();
    }

    public Lookify() {
    }

    public Lookify(String title, String artist, int rating){
        this.title=title;
        this.artist=artist;
        this.rating=rating;
    }

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
