package com.grica.grica.services;

import com.grica.grica.entities.Utilisateur;
import com.grica.grica.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;


    @Override
    public List<Utilisateur> getEmailAndPassword(String email, String password) {
        return utilisateurRepository.findByEmailAndPassword(email,password);
    }
}