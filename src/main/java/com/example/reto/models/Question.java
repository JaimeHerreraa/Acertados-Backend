package com.example.reto.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Question {

    @Id
    private Long id;
    @Column
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question", fetch = FetchType.LAZY)
    private List<Choice> choices;

    @Column
    private Long correctAnswerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "category_id")
    private Category category;

}