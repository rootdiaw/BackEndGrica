package com.grica.grica.repository;

import com.grica.grica.entities.Profondeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfondeurRepository extends JpaRepository<Profondeur, Long> {

    Profondeur findByLibelle(String libelle);
}
