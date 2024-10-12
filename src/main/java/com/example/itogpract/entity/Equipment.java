package com.example.itogpract.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShootingRange getShootingRange() {
        return shootingRange;
    }

    public void setShootingRange(ShootingRange shootingRange) {
        this.shootingRange = shootingRange;
    }
}
