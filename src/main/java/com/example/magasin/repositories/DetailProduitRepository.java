package com.example.magasin.repositories;

import com.example.magasin.entities.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailProduitRepository extends JpaRepository<DetailProduit, Integer> {
}
