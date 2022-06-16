package com.grica.grica.services;

import com.grica.grica.entities.Catastrophe;

import java.util.List;

public interface CatastroheService {

    Catastrophe addNewCatastrophe(Catastrophe catastrophe);
    Catastrophe updateNewCatastrophe( Catastrophe catastrophe);
    List<Catastrophe> getAllCatastrophe();
    Catastrophe getCatastropheParId(Long id);
    void deleteCatastropheParId(Long id);
}
