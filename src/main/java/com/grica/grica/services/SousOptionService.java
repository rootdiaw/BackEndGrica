package com.grica.grica.services;

import com.grica.grica.entities.SousOption;

import java.util.List;

public interface SousOptionService {
    SousOption addNewSousOption(SousOption sousOption);
    SousOption updateSousOption( SousOption sousOption);
    List<SousOption> getAllSousOption( );
    SousOption getSousOptionParId( Long id);
    void deleteSousOptionParId(Long id);

    List<SousOption> getSousOptionParLibelle(String libelle);
}
