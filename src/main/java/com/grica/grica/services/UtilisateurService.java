package com.grica.grica.services;

import com.grica.grica.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    List<Utilisateur> getEmailAndPassword(String email, String password);
}
