package com.grica.grica.services;

import com.grica.grica.entities.Profondeur;

import java.util.List;

public interface ProfondeurService {
    Profondeur addNewProfondeur(Profondeur profondeur);
    Profondeur updateProfondeur(Profondeur profondeur);
    List<Profondeur> getAllProfondeur();
    Profondeur getProfondeurById(Long id);
    void deleteProfondeurById(Long id);
    Profondeur getProfondeurByLibelle(String libelle);
}
