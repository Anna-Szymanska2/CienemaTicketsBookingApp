package com.example.cienematicketsbookingapp.model;

import jakarta.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String name;
    private String rowName;


    private int columnName;
    @ManyToOne
    private Room room;
    @OneToOne(mappedBy = "seat")
    private Reservation reservation;


}
