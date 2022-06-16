package com.grica.grica.repository;

import com.grica.grica.entities.Frequence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreqenceRepository extends JpaRepository<Frequence, Long> {

    Frequence findByLibelle(String libelle);
}
