package com.Avengers.sql_rocks.Entities;

import javax.persistence.*;

@Entity
@Table(name = "LibraryCard")
public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int issuedBook;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
//    Mapping between parent and child
    @OneToOne

//    defining the foreign key in child table and taking refernce from parent table column, by default primary key
    @JoinColumn
    User user;
}
