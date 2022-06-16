package com.grica.grica.services;

import com.grica.grica.entities.Vitesse;

import java.util.List;

public interface VitesseService {
    Vitesse addNewVitesse(Vitesse vitesse);
    Vitesse updateVitesse( Vitesse vitesse);
    List<Vitesse> getAllVitesse( );
    Vitesse getVitesseParId( Long id);
    void deleteVitesseParId(Long id);
    Vitesse getVitesseByLibelle(String libelle);
}
