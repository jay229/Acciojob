package com.example.Hotel.Booking.System.DTO;

public class IssueRoomRequest {
    private String adharNo;
    private int roomNo;
    private int forNoOfDays;

    public IssueRoomRequest() {
    }

    public String getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getForNoOfDays() {
        return forNoOfDays;
    }

    public void setForNoOfDays(int forNoOfDays) {
        this.forNoOfDays = forNoOfDays;
    }
}
