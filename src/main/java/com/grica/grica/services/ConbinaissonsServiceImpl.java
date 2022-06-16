package com.grica.grica.services;

import com.grica.grica.entities.*;
import com.grica.grica.repository.ConbinaissonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConbinaissonsServiceImpl implements  ConbinaissonsService{

    @Autowired
    private ConbinaissonsRepository conbinaissonsRepository;
    @Override
    public Conbinaissons addNewConbinaissons(Conbinaissons conbinaissons) {
        return conbinaissonsRepository.save(conbinaissons);
    }

    @Override
    public Conbinaissons updateNewConbinaissons(Conbinaissons conbinaissons) {
        return conbinaissonsRepository.save(conbinaissons);
    }

    @Override
    public List<Conbinaissons> getAllConbinaissons() {
        return conbinaissonsRepository.findAll();
    }

    @Override
    public Conbinaissons getConbinaissonsParId(Long id) {
        return conbinaissonsRepository.findById(id).get();
    }

    @Override
    public void deleteConbinaissonsParId(Long id) {
            conbinaissonsRepository.deleteById(id);
    }

    @Override
    public Conbinaissons getConbinaissonsNamefile(Long idcatastrophe, Long idvitesse, Long idfrequence,
                                                        Long idprofondeur, Long idniveauControle, Long idniveauPerte) {

        return conbinaissonsRepository.getConbinaissonNamefile(idcatastrophe,idvitesse,idfrequence,idprofondeur
                ,idniveauControle,idniveauPerte
        );
    }

    @Override
    public Conbinaissons getConbinaissonsNamefileTest(String file) {
        return conbinaissonsRepository.getConbinaissonNamefileTest(file);
    }


}
