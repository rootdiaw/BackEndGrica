package com.grica.grica.repository;

import com.grica.grica.entities.NiveauPerte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NiveauPerteRepository extends JpaRepository<NiveauPerte, Long> {

    NiveauPerte findByLibelle(String libelle);
}
