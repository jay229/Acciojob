package com.example.Hotel.Booking.System.DTO;

public class UserResponseDto {
    private String name;
    private String mobile;
    private String email;
    private String city;
    private String state;

    public UserResponseDto() {
    }

    public UserResponseDto(String name, String mobile, String email, String city, String state) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
