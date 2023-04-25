package com.example.demo.enicarthage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "T_entreprise")
public class entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_entre;
    private String nom_entre;
    private String mail;
    private String site_web;
    @JsonIgnore
    @OneToMany ( mappedBy = "entrep")
    private List<blogpost> blogposts;


    public entreprise() {
    }

}
