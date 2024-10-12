package com.example.itogpract.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import com.example.itogpract.entity.AppUser;

import java.util.Date;
import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private Date date;

    @ManyToMany
    private Set<AppUser> participants;

    @ManyToOne
    private ShootingRange shootingRange;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<AppUser> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<AppUser> participants) {
        this.participants = participants;
    }

    public ShootingRange getShootingRange() {
        return shootingRange;
    }

    public void setShootingRange(ShootingRange shootingRange) {
        this.shootingRange = shootingRange;
    }
}
