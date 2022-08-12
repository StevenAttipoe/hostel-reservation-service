package com.seatech.Residents.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "residents")
public class ResidentEntity {
    @Id //done for every primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Automically generates ID with an increment of 1
    private long id;

    private int resident_id;
    private String resident_name;

    @Column(length = 100)
    private String email;

    private String password;
}
