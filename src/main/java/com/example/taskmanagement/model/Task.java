package com.example.taskmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "landowner_id", insertable = false, updatable = false)
    private Long id ;
    //@ManyToOne
    //@JoinColumn(name = "user_id",nullable=false, updatable = false)
    //private User user;
    private Date datenewtask;
    private String newtask;
    private Date datechanges;
    private String status;


}
