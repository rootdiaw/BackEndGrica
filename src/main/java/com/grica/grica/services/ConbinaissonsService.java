package com.grica.grica.services;

import com.grica.grica.entities.*;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ConbinaissonsService {
    Conbinaissons addNewConbinaissons(Conbinaissons conbinaissons);
    Conbinaissons updateNewConbinaissons( Conbinaissons conbinaissons);
    List<Conbinaissons> getAllConbinaissons( );
    Conbinaissons getConbinaissonsParId( Long id);
    void deleteConbinaissonsParId(Long id);
   // Conbinaissons getConbinaissons(Catastrophe catastrophe, List<SousOption> sousOptions );

    Conbinaissons getConbinaissonsNamefile(Long idcatastrophe, Long idvitesse, Long idfrequence,
                                                 Long idprofondeur,Long idniveauControle,Long idniveauPerte);

    Conbinaissons getConbinaissonsNamefileTest(String file);
}


