package com.seatech.Residents.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "residents")
public class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int resident_id;
    private String resident_name;
    @Column(length = 100)
    private String email;
    private String password;
}
