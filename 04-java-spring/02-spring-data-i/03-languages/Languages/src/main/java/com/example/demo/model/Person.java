package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(updatable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createdDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date updatedDate;
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private License license;

    public Person() {
    }
    public Person(String firstName, String lastName, Date createdAt, Date updatedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = createdAt;
        this.updatedDate = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedDate() {
        return createdDate;
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

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    protected void getCreationDate(){
        this.createdDate=new Date();
    }

    protected void updatedDate(){
        this.updatedDate=new Date();
    }
}
