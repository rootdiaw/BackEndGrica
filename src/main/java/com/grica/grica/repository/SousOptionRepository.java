package com.grica.grica.repository;

import com.grica.grica.entities.SousOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SousOptionRepository extends JpaRepository<SousOption, Long > {

    List<SousOption> findByLibelle(String libelle);
}
