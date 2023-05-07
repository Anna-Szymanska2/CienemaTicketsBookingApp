package com.example.cinematicketsbookingapp.dtos;

import java.util.List;

public class ScreeningDto {

    private Integer id;
    private String roomName;
    private List<SeatDto> seats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<SeatDto> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatDto> seats) {
        this.seats = seats;
    }

    public ScreeningDto(Integer id, String roomName, List<SeatDto> seats) {
        this.id = id;
        this.roomName = roomName;
        this.seats = seats;
    }
}
