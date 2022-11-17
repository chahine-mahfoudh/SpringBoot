package com.example.magasin.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idFournisseur;

    private String codeFournisseur;

    private String libelleFournisseur;

    @ManyToMany(mappedBy = "produitsFournisseurs")
    private Set<Produit> produits;


}
