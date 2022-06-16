package com.grica.grica.services;

import com.grica.grica.entities.Frequence;
import com.grica.grica.repository.FreqenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrequenceServiceImpl implements FrequenceService {
    @Autowired
    private FreqenceRepository freqenceRepository;
    @Override
    public Frequence addNewFrequence(Frequence frequence) {
        return freqenceRepository.save(frequence);
    }

    @Override
    public Frequence updateFrequence(Frequence frequence) {
        return freqenceRepository.save(frequence);
    }

    @Override
    public List<Frequence> getAllFrequence() {
        return freqenceRepository.findAll();
    }

    @Override
    public Frequence getFrequenceById(Long id) {
        return freqenceRepository.findById(id).get();
    }

    @Override
    public void deleteFrequenceById(Long id) {
        freqenceRepository.deleteById(id);

    }

    @Override
    public Frequence getFrquenceByLibelle(String libelle) {
        return freqenceRepository.findByLibelle(libelle);
    }
}
