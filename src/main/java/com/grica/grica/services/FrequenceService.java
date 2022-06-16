package com.grica.grica.services;

import com.grica.grica.entities.Frequence;

import java.util.List;

public interface FrequenceService {
    Frequence addNewFrequence(Frequence frequence);
    Frequence updateFrequence(Frequence frequence);
    List<Frequence> getAllFrequence();
    Frequence getFrequenceById( Long id);
    void deleteFrequenceById(Long id);
    Frequence getFrquenceByLibelle(String libelle);
}
