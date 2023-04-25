package com.example.demo.enicarthage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "T_user")
public class user {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String email ;
    private String password ;
    @JsonIgnore
    @OneToMany ( mappedBy = "student")
    private List<blogpost> blogposts;



}
