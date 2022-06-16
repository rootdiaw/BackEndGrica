package com.grica.grica.services;

import com.grica.grica.entities.NiveauControle;

import java.util.List;

public interface NiveauControleService {
    NiveauControle addNewNiveauControle(NiveauControle niveauControle);
    NiveauControle updateNiveauControle(NiveauControle niveauControle);
    List<NiveauControle> getAllNiveauControle();
    NiveauControle getNiveauControleById(Long id);
    void deleteNiveauControleById(Long id);
    NiveauControle getNiveauControleByLibelle(String libelle);
}
