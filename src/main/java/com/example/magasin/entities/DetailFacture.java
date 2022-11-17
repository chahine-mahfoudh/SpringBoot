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
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idDetailFacture;

    private int qte;

    private float prixTotal;

    private int pourcentageRemise;

    private int montantRemise;

    @ManyToOne
    private Facture factures;

    @ManyToOne
    private Produit produit;





}
