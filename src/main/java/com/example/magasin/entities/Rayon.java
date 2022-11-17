package com.example.magasin.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rayon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idRayon;

    private String  codeRayon;

    private String libelleRayon;

    @OneToMany(mappedBy="rayon")
    private Set<Produit> produits;
}
