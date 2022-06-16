package com.grica.grica.repository;

import com.grica.grica.entities.Vitesse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VitesseRepository extends JpaRepository<Vitesse, Long> {

    Vitesse findByLibelle(String libelle);
}
