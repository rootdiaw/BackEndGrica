package com.grica.grica.services;

import com.grica.grica.entities.Vitesse;
import com.grica.grica.repository.VitesseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VitesseServiceImpl implements VitesseService {


    @Autowired
    private VitesseRepository vitesseRepository;
    @Override
    public Vitesse addNewVitesse(Vitesse vitesse) {
        return vitesseRepository.save(vitesse);
    }

    @Override
    public Vitesse updateVitesse(Vitesse vitesse) {
        return vitesseRepository.save(vitesse);
    }

    @Override
    public List<Vitesse> getAllVitesse() {
        return vitesseRepository.findAll();
    }

    @Override
    public Vitesse getVitesseParId(Long id) {
        return vitesseRepository.findById(id).get();
    }

    @Override
    public void deleteVitesseParId(Long id) {
        vitesseRepository.deleteById(id);
    }

    @Override
    public Vitesse getVitesseByLibelle(String libelle) {
        return vitesseRepository.findByLibelle(libelle);
    }
}
