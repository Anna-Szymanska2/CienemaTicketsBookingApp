package com.example.cienematicketsbookingapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "room")
    private List<Seat> seats;
    @OneToOne(mappedBy = "room")
    private Screening screening;
}
