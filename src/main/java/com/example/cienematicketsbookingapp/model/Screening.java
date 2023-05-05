package com.example.cienematicketsbookingapp.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Screening {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String movie;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "screening")
    private List<Reservation> reservations;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;
}
