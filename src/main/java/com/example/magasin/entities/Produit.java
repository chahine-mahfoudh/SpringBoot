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
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long idProduit;

    private String codeproduit;

    private String libelleProduit;

    private float prixUnitaire;

    @ManyToMany
    Set<Fournisseur> produitsFournisseurs;

    @OneToOne(mappedBy = "produit")
    private DetailProduit detailProduit;

    @OneToMany(mappedBy="produit")
    private Set<DetailFacture> detailFactures;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private Rayon rayon;

}
