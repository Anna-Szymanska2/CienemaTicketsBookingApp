package com.example.cinematicketsbookingapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @OneToMany(mappedBy = "room")
    private List<Screening> screening;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Screening> getScreening() {
        return screening;
    }

    public void setScreening(List<Screening> screening) {
        this.screening = screening;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
