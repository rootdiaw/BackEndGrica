package com.grica.grica.services;

import com.grica.grica.entities.NiveauControle;
import com.grica.grica.repository.NiveauControleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NiveauControleServiceImpl implements NiveauControleService {
    @Autowired
    private NiveauControleRepository niveauControleRepository;
    @Override
    public NiveauControle addNewNiveauControle(NiveauControle niveauControle) {
        return niveauControleRepository.save(niveauControle);
    }

    @Override
    public NiveauControle updateNiveauControle(NiveauControle niveauControle) {
        return niveauControleRepository.save(niveauControle);
    }

    @Override
    public List<NiveauControle> getAllNiveauControle() {
        return niveauControleRepository.findAll();
    }

    @Override
    public NiveauControle getNiveauControleById(Long id) {
        return niveauControleRepository.findById(id).get();
    }

    @Override
    public void deleteNiveauControleById(Long id) {
        niveauControleRepository.deleteById(id);
    }

    @Override
    public NiveauControle getNiveauControleByLibelle(String libelle) {
        return niveauControleRepository.findByLibelle(libelle);
    }
}
