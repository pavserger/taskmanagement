package com.example.taskmanagement.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_role;

   // @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "idrole")
      //     foreignKey = @ForeignKey(name = "FK_lemma_site"))
   //  private Role role;

    private String role;



}
