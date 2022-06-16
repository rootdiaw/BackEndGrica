package com.grica.grica.repository;

import com.grica.grica.entities.Catastrophe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatastropheRepository  extends JpaRepository<Catastrophe, Long> {
}
