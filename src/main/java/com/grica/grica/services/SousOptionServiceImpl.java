package com.grica.grica.services;

import com.grica.grica.entities.SousOption;
import com.grica.grica.repository.SousOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SousOptionServiceImpl implements SousOptionService{
    @Autowired
    private SousOptionRepository sousOptionRepository;
    @Override
    public SousOption addNewSousOption(SousOption sousOption) {
        return sousOptionRepository.save(sousOption);
    }

    @Override
    public SousOption updateSousOption(SousOption sousOption) {
        return sousOptionRepository.save(sousOption);
    }

    @Override
    public List<SousOption> getAllSousOption() {
        return sousOptionRepository.findAll();
    }

    @Override
    public SousOption getSousOptionParId(Long id) {
        return sousOptionRepository.findById(id).get();
    }

    @Override
    public void deleteSousOptionParId(Long id) {
        sousOptionRepository.deleteById(id);

    }

    @Override
    public List<SousOption> getSousOptionParLibelle(String libelle) {
        return sousOptionRepository.findByLibelle(libelle);
    }
}
