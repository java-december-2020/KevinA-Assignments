package com.example.demo.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank
    private String title;
    @Column
    @NotBlank
    private String description;
    @Column
    @NotBlank
    private String language;
    @Min(100)
    private int numberOfPages;
    @Column(updatable = false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updateAt;

    @PrePersist
    protected void getCreatedAtDate(){
      this.createdAt=new Date();
    }
    @PreUpdate
    protected void getUpdatedAtDate(){
        this.updateAt=new Date();
    }

    public Book() {
    }
    public Book(String title, String description, String language, int numberOfPages) {
        this.title=title;
        this.description=description;
        this.language=language;
        this.numberOfPages=numberOfPages;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
