package com.grica.grica.services;

import com.grica.grica.entities.NiveauPerte;

import java.util.List;

public interface NiveauPerteService {
    NiveauPerte addNewNiveauPerte(NiveauPerte niveauPerte);
    NiveauPerte updateNiveauPerte(NiveauPerte niveauPerte);
    List<NiveauPerte> getAllNiveauPerte();
    NiveauPerte getNiveauPerteById(Long id);
    void deleteNiveauPerteById(Long id);
    NiveauPerte getNiveauPerteByLibelle(String libelle);
}
