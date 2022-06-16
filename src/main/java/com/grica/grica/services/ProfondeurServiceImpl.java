package com.grica.grica.services;

import com.grica.grica.entities.Profondeur;
import com.grica.grica.repository.ProfondeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfondeurServiceImpl implements ProfondeurService {
    @Autowired
    private ProfondeurRepository profondeurRepository;
    @Override
    public Profondeur addNewProfondeur(Profondeur profondeur) {
        return profondeurRepository.save(profondeur);
    }

    @Override
    public Profondeur updateProfondeur(Profondeur profondeur) {
        return profondeurRepository.save(profondeur);
    }

    @Override
    public List<Profondeur> getAllProfondeur() {
        return profondeurRepository.findAll();
    }

    @Override
    public Profondeur getProfondeurById(Long id) {
        return profondeurRepository.findById(id).get();
    }

    @Override
    public void deleteProfondeurById(Long id) {
profondeurRepository.deleteById(id);
    }

    @Override
    public Profondeur getProfondeurByLibelle(String libelle) {
        return profondeurRepository.findByLibelle(libelle);
    }
}
