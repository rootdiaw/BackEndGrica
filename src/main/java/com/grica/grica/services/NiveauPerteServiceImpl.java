package com.grica.grica.services;

import com.grica.grica.entities.NiveauControle;
import com.grica.grica.entities.NiveauPerte;
import com.grica.grica.repository.NiveauPerteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NiveauPerteServiceImpl implements NiveauPerteService {
    @Autowired
    private NiveauPerteRepository niveauPerteRepository;

    @Override
    public NiveauPerte addNewNiveauPerte(NiveauPerte niveauPerte) {
        return niveauPerteRepository.save(niveauPerte);
    }

    @Override
    public NiveauPerte updateNiveauPerte(NiveauPerte niveauPerte) {
        return niveauPerteRepository.save(niveauPerte);
    }

    @Override
    public List<NiveauPerte> getAllNiveauPerte() {
        return  niveauPerteRepository.findAll();
    }

    @Override
    public NiveauPerte getNiveauPerteById(Long id) {
        return niveauPerteRepository.findById(id).get();
    }

    @Override
    public void deleteNiveauPerteById(Long id) {
        niveauPerteRepository.deleteById(id);
    }

    @Override
    public NiveauPerte getNiveauPerteByLibelle(String libelle) {
        return niveauPerteRepository.findByLibelle(libelle);
    }
}
