package com.example.demo.enicarthage.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "T_blogpost")
public class blogpost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private user student ;
    @ManyToOne
    private prof encadrant;


    private Date date_de_debut;
    private Date date_de_fin;
    private String feedback;
    @ManyToOne
    private field cat;

    @ManyToOne
    private entreprise entrep;


    }



