package com.example.Hotel.Booking.System.Model;

import com.example.Hotel.Booking.System.Enums.BedType;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomNo;
    private int roomCapacity;
    private int rate;
    @Enumerated(value = EnumType.STRING)
    private BedType bedType;
    private boolean available;

    @OneToOne(mappedBy = "room", cascade = CascadeType.ALL)
    private Booking booking;

    public Room() {
        available=true;
    }
}
