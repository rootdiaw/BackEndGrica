package com.grica.grica.services;

import com.grica.grica.entities.Catastrophe;
import com.grica.grica.repository.CatastropheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatastroheServiceImpl implements  CatastroheService {
    @Autowired
    private CatastropheRepository catastropheRepository;
    @Override
    public Catastrophe addNewCatastrophe(Catastrophe catastrophe) {
        return catastropheRepository.save(catastrophe);
    }

    @Override
    public Catastrophe updateNewCatastrophe(Catastrophe catastrophe) {
        return catastropheRepository.save(catastrophe);
    }

    @Override
    public List<Catastrophe> getAllCatastrophe() {
        return catastropheRepository.findAll();
    }

    @Override
    public Catastrophe getCatastropheParId(Long id) {
        return catastropheRepository.findById(id).get();
    }

    @Override
    public void deleteCatastropheParId(Long id) {
        catastropheRepository.deleteById(id);
    }
}
