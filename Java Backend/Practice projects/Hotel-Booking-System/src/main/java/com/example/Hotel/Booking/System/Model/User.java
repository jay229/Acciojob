package com.example.Hotel.Booking.System.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String adharNo;
    private String name;
    @Column(unique = true)
    private String email;
    private String mobileNo;
    private String city;
    private String state;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Booking booking;


}
