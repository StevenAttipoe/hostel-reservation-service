package com.seatech.Residents.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resident {
    private long id;
    private int resident_id;
    private String resident_name;
    private String email;
    private String password;
}
