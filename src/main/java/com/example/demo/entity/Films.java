package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "films")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Films {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "genre")
    private String genre;
    @Column(name = "rating")
    private int rating;
}
