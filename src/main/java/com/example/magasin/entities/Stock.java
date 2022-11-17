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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idStock;

    private int qteStock;

    private int qteMin;

    private String libelleStock;

    @OneToMany(mappedBy="stock")
    private Set<Produit> produits;
}
