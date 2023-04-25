package com.example.demo.enicarthage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "T_field")
public class field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_field;
    private String nom_field;
    @JsonIgnore
    @OneToMany ( mappedBy = "cat")
    private List<blogpost> blogposts;

}
