package com.example.magasin.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idFacture;

    private float montantRemise;

    private float montantFacture;

    @Temporal(TemporalType.DATE)
    private Date dateFacture;

    private Boolean active;

@ManyToOne
    private Client client;

@OneToMany(mappedBy="factures")
private Set<DetailFacture> detailFactures;






}
