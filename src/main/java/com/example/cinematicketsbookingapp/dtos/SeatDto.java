package com.example.cinematicketsbookingapp.dtos;

public class SeatDto {
    private Integer id;
    private String rowName;
    private int columnName;
    private boolean isAvailable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public SeatDto(Integer id, String rowName, int columnName, boolean isAvailable) {
        this.id = id;
        this.rowName = rowName;
        this.columnName = columnName;
        this.isAvailable = isAvailable;
    }
}
