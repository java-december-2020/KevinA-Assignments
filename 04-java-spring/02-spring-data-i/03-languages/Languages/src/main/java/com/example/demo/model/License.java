package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "licenses")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expirationDate;
    private  String state;
    @Column(updatable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createdDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date updatedDate;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private  Person person;

    public License() {
    }
    public String getNumberAsString() {
        int numZeros = 7 - String.valueOf(this.number).length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numZeros; i++)
            sb.append('0');
        return String.format("%s%d", sb, this.number);
    }
    public String getExpirationDateFormatted() {
        SimpleDateFormat fm = new SimpleDateFormat("MM/dd/yyyy");
        return fm.format(this.expirationDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @PrePersist
    protected void getCreationDate(){
        this.createdDate=new Date();
    }
    @PostPersist
    protected void updatedDate(){
        this.updatedDate=new Date();
    }

}
