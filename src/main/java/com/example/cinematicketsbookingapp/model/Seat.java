package com.example.cinematicketsbookingapp.model;

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

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public int getColumnName() {
        return columnName;
    }

    public void setColumnName(int columnName) {
        this.columnName = columnName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rowName='" + rowName + '\'' +
                ", columnName=" + columnName +
                '}';
    }
}
