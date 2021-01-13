package com.example.demo.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dojos")
public class Dojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date updatedAt;
    @OneToMany(mappedBy = "dojo",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<Ninja> ninjas;

    public Dojo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    @PrePersist
    protected void getCreatedDate(){
        this.createdAt=new Date();
    }
    @PreUpdate
    protected void getUpdatedDate(){
        this.updatedAt=new Date();
    }

}
