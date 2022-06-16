package com.grica.grica.repository;

import com.grica.grica.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {

    List<Utilisateur> findByEmailAndPassword(String email, String password);
}
