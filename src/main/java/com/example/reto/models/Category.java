package com.example.reto.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    private Long id;
    @Column
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Question> questions;
}