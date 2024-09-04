package com.example.taskmanagement.model;

import lombok.Data;
import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;

@Entity
//@NoArgsConstructor

@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    private Role role;

//    private Long id_role;
    private String name;
    private String phone;
    private String post;
    private String pass;


}
