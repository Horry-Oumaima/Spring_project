package com.example.demo.enicarthage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "T_prof")
public class prof {

    private String name_p;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prof;

    private String email_p ;
    private String password_p ;
    @JsonIgnore
    @OneToMany ( mappedBy = "encadrant")
    private List<blogpost> blogposts;
}
