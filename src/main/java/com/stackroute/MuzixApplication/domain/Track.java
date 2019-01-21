package com.stackroute.MuzixApplication.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


//@Document(collection = "Tracks")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Track {

    @Id
    private int id;
    private String name;
    private String comment;


}
