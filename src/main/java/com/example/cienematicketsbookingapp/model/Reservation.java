package com.example.cienematicketsbookingapp.model;

import jakarta.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seat_id", referencedColumnName = "id")
    private Seat seat;
    private String name;
    private String surname;

    @ManyToOne
    private Screening screening;
}
