package com.grica.grica.services;

import com.grica.grica.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AllOptionServiceImpl implements AllOptionService{
    @Autowired
    private  CatastropheRepository catastropheRepository;
    @Autowired
    private FreqenceRepository freqenceRepository;
    @Autowired
    private VitesseRepository vitesseRepository;
    @Autowired
    private ProfondeurRepository profondeurRepository;
    @Autowired
    private NiveauPerteRepository niveauPerteRepository;
    @Autowired
    private NiveauControleRepository niveauControleRepository;

    @Override
    public Map<String, Object> getAllOption() {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("catastrophe",catastropheRepository.findAll());
        map.put("vitesse",vitesseRepository.findAll());
        map.put("frequence",freqenceRepository.findAll() );
        map.put("profondeur",profondeurRepository.findAll());
        map.put("niveauControle",niveauControleRepository.findAll());
        map.put("niveauPerte",niveauPerteRepository.findAll());
        return map;
    }
}
