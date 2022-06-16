package com.grica.grica.repository;

import com.grica.grica.entities.NiveauControle;
import com.grica.grica.entities.Vitesse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NiveauControleRepository extends JpaRepository<NiveauControle, Long> {
    NiveauControle findByLibelle(String libelle);
}
